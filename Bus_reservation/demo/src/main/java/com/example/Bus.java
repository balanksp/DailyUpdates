package Bus_reservation.demo.src.main.java.com.example;

public class Bus {
  private  int busNo;
  private  boolean ac;
  private  int capacity;

    Bus(int no , boolean ac,int cap){
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }
   
    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
// displaying bus information about
public void displayBusInfo(){
  System.out.println("Bus No: " + busNo + "  AC:  "+ ac +"  Total Capacity:  "+ capacity );

}

public int getBusNo() {
    return busNo;
}

public void setBusNo(int busNo) {
    this.busNo = busNo;
}

    
}
