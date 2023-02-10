package com.zaga;

public class Player02 extends Player01 {
    private int health; 
    private boolean armour; 
    
    public Player02(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
         
        if (health > 100 || health < 0) { 
            this.health = 100; 
        } 
        this.armour = armour;
    } 

    @Override
    public void damageByGun1() {
        if (armour) {
            this.health -= 20;
            if (this.health <= 0) this.health = 0;
                System.out.println("Armour is on. Got hit by Gun-01. health is reduced by 20.New health is   "+ this.health);
 
                       
        } 
        if (!armour) {
            this.health -= 30;
            if (this.health <= 0)  this.health = 0;
                System.out.println("Armour is off. Got hit by Gun-01. health is reduced by 30.New health is   "+this.health);
            
        }

        if (this.health == 0) {
            System.out.println(getName()+" is dead");
        }
    } 

    @Override
    public void damageByGun2() {
        if (armour) {
            this.health -= 40;
            if (this.health <= 0) 
                this.health = 0;
                System.out.println("Armour is on. Got hit by Gun-01. health is reduced by 40.New health is "+this.health);
 
            
            
        }
        if (!armour) {
            this.health -= 50; 
            if (this.health <= 0)  
                this.health = 0; 
                System.out.println("Armour is off. Got hit by Gun-01. health is reduced by 50.New health is "+this.health);

            
        }
 
        if (this.health == 0) { 
            System.out.println(getName()+ " is dead");
        }


    }

    public void Heal(){
        if (this.health <= 0) { 
            System.out.println("Player is dead. heal is not possible");
            
        } else {
            this.health = 100 ;
            System.out.println("Player is healed");
        }
    }
    

    






}
