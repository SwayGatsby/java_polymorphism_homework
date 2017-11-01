package Kaiju;

/**
 * Created by user on 01/11/2017.
 */

public class Muto extends Kaiju {

    public Muto(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }


    public String move(){
        return "Moving forward, slowly and methodically.";
    }

}

