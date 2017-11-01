package Kaiju;

/**
 * Created by user on 01/11/2017.
 */

public abstract class Kaiju {
     String name;
     int healthValue;
     int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }


    public String getName(){
        return this.name;
    }

    public int getHealthValue(){
        return  this.healthValue;
    }

    public int getAttackValue(){
        return this.attackValue;
    }

    public String roar(){
        return "ROOOOOAR!";
    }

//    public void attack(Vehicle vehicle){
//        vehicle.healthValue -= this.attackValue;
//    }


    public abstract String move();

}


// 1. Create an abstract class - Kaiju which has 3 params: name, healthValue, attackValue.
// 2. Give the Kaiju class a roar method which returns a string.
// 3. give teh Kaiju class an abstract attack method.
// 4. give the kaiju class an abstract move method.
//
// TODO 5. Create an abstract class - vehicle which has 2 params: type and healthValue.
// TODO 6. Create 2 subclasses of vehicle.

