package com.zaga;

public class LandlinePhone implements Telephone {
   private String  myNumber;
    private boolean isRinging;
    
public LandlinePhone(String myNumber){
    this.myNumber = myNumber;
}

@Override
public void answer() {
    if (isRinging) {
        System.out.println("attendant phone call");
        isRinging=false; // after that disconnect call
    } else {
        System.out.println("phone is not ringing");
    }
}

@Override
public boolean callPhone(String phone_no) {
    if (phone_no == myNumber) {
        isRinging=true;
        System.out.println("phone is ringing");
    }
    else {
    //            System.out.println("");
                isRinging = false;
    }
    return isRinging;
}

@Override
public void dial(String phone_no) {
    System.out.println("Now ringing "+ phone_no+" on phone");
}

@Override
public boolean isRinging() {
    return false;
}

@Override
public void powerOn() {
    System.out.println("phone is always powered on");
}


}
