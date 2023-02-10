package com.zaga;

public class Result {
    public static void main(String[] args) {

         Player01 player = new Player01("kumar", "sword", -10);
         
         player.damageByGun1(); 
        player.damageByGun2(); 
        player.damageByGun1(); 

 
        Player02 better_player = new Player02("bala", "AK-47 gun", -100, false);

        better_player.damageByGun1();
       better_player.Heal();
       better_player.damageByGun1();
       
    }
}
 




