package Bus_reservation.demo.src.main.java.com.example;

import java.text.SimpleDateFormat;
import java.util.*;
// store booking data 
public class Booking {

    
    String passengerName;
    int busNo;
    Date date;  // date object => then only easy to compare the date 

    Booking(){

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the passengerName:   ");
       passengerName = scanner.next();

       System.out.println("Enter the Bus No:   ");
       busNo = scanner.nextInt();

       // date string convert to Date object so use the simple date format 
       System.out.println("Enter the date:");

       String dateInput = scanner.next();
       SimpleDateFormat  dateFormat = new SimpleDateFormat("dd-MM-yyyy");
     
       try 
       {
            date = dateFormat.parse(dateInput);
           } 
       catch (Exception e) 
       {
            e.printStackTrace();
       }

    scanner.close();}
    public boolean  isAvailable(ArrayList<Booking>bookings,ArrayList<Bus> buses){
int capacity = 0;
for (Bus bus : buses) {
    if (bus.getBusNo() == busNo ) {
        capacity = bus.getCapacity();
        
    }
}
    int booked=0; 
    for (Booking b : bookings) {
        if (b.busNo == busNo && b.date.equals(date)) {
            booked++;
        }
    }
    return booked<capacity?true:false;
}
    }


