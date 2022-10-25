/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Startegy;

/**
 *
 * @author user
 */
public class PriceCalculator {

    IStrategy1 strategy;

    public PriceCalculator(IStrategy1 strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IStrategy1 strategy) {
        this.strategy = strategy;
    }

    public int calculate(int km) {
        return this.calculate(km, strategy);
    }

    public int calculate(int km, IStrategy1 strategy) {
        this.strategy = strategy;
        return strategy.calculate(km);
    }
}
