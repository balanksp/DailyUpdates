package Bus_reservation.demo.src.main.java.com.example;

import java.util.*;

public class orderMain {
    public static void main(String[] args) {
        
       Scanner scanner = new  Scanner(System.in);
       
      
            System.out.println("item01:- ");
           int item01 = scanner.nextInt();

           System.out.println("item02:- ");
           int item02 = scanner.nextInt();
        
        double it1 = item01 * 10 ;
        double it2 = item02 * 20 ;

        double total = it1 + it2 ;
     

if (total > 100) {
    System.out.println("above 100 Rs so 5% discount");
    System.out.println(total/100*2);
}
else if(total >= 1000){
    System.out.println("above 100 Rs so 5% discount");
    System.out.println(total/100*5);
}
        scanner.close();}
}
