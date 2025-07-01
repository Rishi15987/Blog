package LinkedList.Med;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class taskexecution {
    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println(leastInterval(tasks, n));
    }
    static class Task implements Comparable<Task> {
        int frequency;
        int executionTime;

        public Task(int f, int t) {
            frequency = f;
            executionTime = t;
        }

        @Override
        public int compareTo(Task that) {
            return that.frequency - this.frequency;
        }
    }

    public static int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> freqmap = new HashMap<>();
        for (Character ch : tasks) {
            freqmap.put(ch, freqmap.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Task> pq = new PriorityQueue<>(); 

        for (Character ch : freqmap.keySet()) {
            int freq = freqmap.get(ch);
            pq.offer(new Task(freq, 0)); 
        }

        Queue<Task> queue = new LinkedList<>();
        int time = 0;

        while (!pq.isEmpty() || !queue.isEmpty()) {
            time++;

            if (!pq.isEmpty()) {
                Task task = pq.poll();
                task.frequency--;
                if (task.frequency > 0) {
                    task.executionTime = time + n;
                    queue.offer(task);
                }
            }

            if (!queue.isEmpty() && queue.peek().executionTime == time) {
                pq.offer(queue.poll());
            }
        }

        return time;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
//Man this is something
Step 1: You need something that can store frequency wirh key obvious its map
Step 2: you need a data sturcture which gices you high frequency element each time to execute
        as for this you need a Task which carries freq and executionTime
        Create a priority queue of max heap or add comparator in Task use .compareTo
Step 3: Now you need a queue which will store the tasks which are waiting to be executed with its frequency and at what time it will be avaiable
Step 4: Now you need a loop that checks if either of the pq or queue is empty then increase time
        and specifically if pq is empty then pool task from pq this means executed once and reduce its frequency
        still if freq>0 means after some cooling time it can be reused so update the execution time and add in queue
Step 5: So until then pq will execute with that if condition queue is non empty and available after cooling time then push it back to pq
Done



"What I learned"
that's a heck of a question. A lot

“When to apply”*/