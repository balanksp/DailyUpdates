package com.zaga;


public class Result {
    public static void main(String[] args) {
   
       LandlinePhone my = new LandlinePhone("12345678");
      //   my.powerOn();
      //   my.callPhone("12345678");
      //   my.answer(); 


        mobilePhone my_mobile = new mobilePhone("12345678");
        // my_mobile.powerOn();
        // my_mobile.dial("123");
        // my_mobile.callPhone("123");
        // my_mobile.isRinging();
        // my_mobile.answer(); 
     
        System.out.println(my_mobile.equals(my));
        
        
    }
}
