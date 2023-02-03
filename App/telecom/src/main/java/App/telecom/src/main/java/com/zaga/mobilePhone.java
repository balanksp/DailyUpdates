package App.telecom.src.main.java.com.zaga;

public class mobilePhone implements Telephone {
   private String myNumber; 
   private boolean isRinging;
   private boolean isPowerOn;

// constructor used to initialize variables
public mobilePhone(String myNumbers){
    this.myNumber=myNumbers;
   }




 // this method is used for whether the phone is on or off status
@Override
public void powerOn() {
    isPowerOn=true;
    System.out.println("phone is powered on");
}

// others dialing the phone number 
@Override
public void dial(String phone_no) {
    System.out.println("Now ringing "+ phone_no+" on phone");
}


// connected to other phone either on or off status
@Override
public boolean callPhone(String phone_no) {
    if (phone_no == myNumber && isPowerOn) {
        isRinging=true;
        System.out.println("phone is ringing");
    }
    else {
           System.out.println("wrong number or phone is switched off");
          isRinging = false;
    }
    return isRinging;
}


// pick up the call
@Override
public void answer() {
    if (isRinging && isPowerOn) {
        System.out.println("attendant phone call");
        isRinging=false; // after that disconnect call
    } else {
       
    }
}


@Override
public boolean isRinging() {
    return false;
}





}