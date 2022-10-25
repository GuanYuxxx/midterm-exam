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
public abstract class Drink {
    SugarType sugar;
     IceType ice;
    private Drink(){}
    public Drink(SugarType sugar, IceType ice) {
        this.sugar = sugar;
        this.ice = ice;
    }

    public SugarType getSugar() {
        return sugar;
    }

    public void setSugar(SugarType sugar) {
        this.sugar = sugar;
    }

    public IceType getIce() {
        return ice;
    }

    public void setIce(IceType ice) {
        this.ice = ice;
    }

    enum SugarType{
        REGULAR,LESS,HALF,QUARTER,FREE
    }

    enum IceType{
        REGULAR,EASY,FREE,HOT
    }    
}
