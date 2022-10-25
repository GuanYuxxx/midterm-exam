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
public class DrinkShop {
    
    
    public Drink order(String drink,Drink.SugarType sugarType, Drink.IceType iceType){
        drink.toLowerCase();
        switch (drink){
            case "coffee":
                return new Coffee(sugarType,iceType);
            case "tea":
                return new Tea(sugarType,iceType);
            default:
                return null;
        }
    }
}
