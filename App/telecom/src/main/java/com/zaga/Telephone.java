package com.zaga;

public interface Telephone {
    void powerOn();
    void dial(String phone_no);
    void answer();
    boolean callPhone(String phone_no);
    boolean isRinging();

    
}
