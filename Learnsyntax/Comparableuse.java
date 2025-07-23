package Learnsyntax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparableuse {
    public static void main(String[] args) {
        List<Student> stud= new ArrayList<>();
        stud.add(new Student(21, "Rajesh"));
        stud.add(new Student(23, "Ravi"));
        stud.add(new Student(18, "veronica"));
        stud.add(new Student(29, "Ravindar"));
        Collections.sort(stud);
        System.out.println(stud);
    }
}
class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "Student [age=" + age + ", name=" + name + "]";
    }
    public int compareTo(Student that){
        if(this.age > that.age){
            return 1;
        }else{
            return -1;
        }
    }
}
