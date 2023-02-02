package Bus_reservation.demo.src.main.java.com.example;

import java.util.Scanner;

public class Students {
    String student_name;
    String subject;
    int Marks;
    

    public Students (String student_name, String subject , int Marks){
        this.student_name = student_name;
        this.subject = subject;
        this.Marks = Marks;
    }

public void student_status(){
   
    System.out.println("student Name:- "+student_name +"  Subject Name:-" +subject+"  Mark:-"+ Marks);
}

public void fail_students(){

    if (Marks < 35){
        System.out.println("Below avg student Name:   "+student_name +"  Subject Name:  " +subject);
    }

}

public void Above_75_percent(){
if (Marks >= 75 ) {     
    System.out.println("above 75% students : " + student_name);
}
}

public void particular_student_details(){
    Scanner scan = new Scanner(System.in);
    String std_name = scan.next();
   if (student_name.equals(std_name)) {
    System.out.println("student name:    "+student_name +"  Subject Name:      " +subject+"   Mark:   " + Marks);
   }
   scan.close();}

}