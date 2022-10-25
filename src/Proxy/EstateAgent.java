/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author User
 */
public class EstateAgent implements IBuyHouse{
    private IBuyHouse iBuyHouse;

    public EstateAgent(IBuyHouse iBuyHouse){
        this.iBuyHouse = iBuyHouse;
    }

    @Override
    public void findHouse() {
        iBuyHouse.findHouse();
        System.out.println("#房仲幫忙找房子");
    }

    @Override
    public void priceTooHigh() {
        iBuyHouse.priceTooHigh();
        System.out.println("#房仲幫忙喬價錢");
    }

    @Override
    public void defendPrice() {
        iBuyHouse.defendPrice();
        System.out.println("#房仲強力喬價錢");
    }

    @Override
    public void finish() {
        System.out.println("#成交的話房仲幫忙付訂、簽約、用印、完稅、交屋");
        iBuyHouse.finish();
    }
}
