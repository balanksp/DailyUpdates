package Bus_reservation.demo.src.main.java.com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) {
        /*
         * here using the arraylist replacing the DataBase        
         */

             ArrayList<Bus> buses = new ArrayList<Bus>();
       ArrayList<Booking>bookings = new ArrayList<Booking>();

             buses.add(new Bus(1, true, 2));
             buses.add(new Bus(2, false,50));
             buses.add(new Bus(3, true,48));

        int userOpt=1;
        Scanner scanner = new Scanner(System.in);

/* the loop are use for how to 
*  read the data inside the arraylist objects
*/
 for (Bus b : buses) {
    b.displayBusInfo();
 }
  

        while(userOpt==1){
        System.out.println("Enter 1 to Book and 2 to Exit");


         userOpt = scanner.nextInt();
        if(userOpt==1){
            Booking booking = new Booking();
            if (booking.isAvailable(bookings,buses)) {
                bookings.add(booking);
                System.out.println("your booking is confirmed");
            } 
            else
             {
                System.out.println("sorry , bus is full .try another bus or date");

            }
        }
        }
           
        scanner.close(); }
}
