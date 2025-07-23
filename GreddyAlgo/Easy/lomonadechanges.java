package GreddyAlgo.Easy;

public class lomonadechanges {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        lomonadechanges l = new lomonadechanges();
        System.out.println(l.lemonadeChange(bills)); 
    }
    public boolean lemonadeChange(int[] bills) {
        int five_dollars = 0, ten_dollars = 0;

        for (int x : bills) {
            if (x == 5) {
                five_dollars++;
            } else if (x == 10) {
                if (five_dollars > 0) {
                    five_dollars--;
                    ten_dollars++;
                } else {
                    return false;
                }
            } else {
                if (five_dollars > 0 && ten_dollars > 0) {
                    five_dollars--;
                    ten_dollars--;
                } else if (five_dollars > 2) {
                    five_dollars -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
simple if u think take a list store or check if u have good if u dont false but this will take space using constant space as 5's 10's keeping count can 
also work now easy if 5 keep / +1 if 10 5-- 10++ if >10 then redcue by 5 if u have 5 and 10 then 5-- 10-- if no then 5 count should be 3 
as only max 20 dollars are possbile

"What I learned"


“When to apply”*/