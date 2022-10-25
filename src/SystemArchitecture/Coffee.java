/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemArchitecture;

/**
 *
 * @author User
 */
public class Coffee extends Drink{
    private CoffeeType coffeeType;
    public Coffee(SugarType sugar, IceType ice) {
        super(sugar, ice);
    }
    public CoffeeType getCoffeeType() {
        return coffeeType;
    }
    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }
     enum CoffeeType{
        LATTE,MOCHA,WHITE,BLUE_MOUNTAIN,AMERICANO,ESPRESSO
    }

}
