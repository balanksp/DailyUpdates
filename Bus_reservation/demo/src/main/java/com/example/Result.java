package Bus_reservation.demo.src.main.java.com.example;

import java.util.*;

public class Result {
    public static void main(String[] args) {
        ArrayList<Students> std = new ArrayList<Students>();
       std.add(new Students("mani", "tamil", 88));
       std.add(new Students("joti", "tamil", 50));
       std.add(new Students("gouda", "tamil", 99));
       std.add(new Students("kumar", "tamil", 75));
       std.add(new Students("rajan", "tamil", 20));
       std.add(new Students("saro", "tamil", 65));
   

for (Students person : std) {
   person.student_status();
   // need extra classes for failed students
    person.fail_students();
    // student details
    person.particular_student_details();
}
// above 75% are approved for games activities
for (Students game : std) {
     game.Above_75_percent();
}      





    }
}
