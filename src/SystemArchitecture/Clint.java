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
public class Clint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     DrinkShop drinkShop = new DrinkShop();
        //點一杯烏龍茶
        Tea tea = (Tea) drinkShop.order("Tea", Drink.SugarType.FREE, Drink.IceType.EASY);
        tea.setTeaType(Tea.TeaType.OOLONG);

        //點一杯美式
        Coffee coffee = (Coffee) drinkShop.order("Coffee", Drink.SugarType.QUARTER, Drink.IceType.HOT);
        coffee.setCoffeeType(Coffee.CoffeeType.AMERICANO);
 
    }
    }
    

