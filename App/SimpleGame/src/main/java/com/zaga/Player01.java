package com.zaga;

public class Player01 {
    private String name;
    private String weapon;
    private int health;

    public Player01(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if (health < 0 || health > 100) {
            this.health = 100;
        }
        else 
        this.health = health;
    }      

public void damageByGun1(){
    this.health -= 30;
    if(this.health <= 0){
        this.health = 0;
    }
System.out.println("Got hit by gun-01.health is reduced by 30. new health is "+ this.health);
if (this.health == 0){
    System.out.println(getName()+" is dead");
}

}

public void damageByGun2(){
    this.health -= 50;
    if(this.health <= 0){
       this.health = 0;
    }
System.out.println("Got hit by gun-02 // health is reduced by 50 // new health is  "+ this.health);
if (this.health == 0){
    System.out.println(getName()+" is dead");
}

}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getWeapon() {
    return weapon;
}
public void setWeapon(String weapon) {
    this.weapon = weapon;
}
public int getHealth() {
    return health;
}
public void setHealth(int health) {
    this.health = health;
}



}