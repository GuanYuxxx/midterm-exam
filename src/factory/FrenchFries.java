/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author user
 */
public class FrenchFries implements Product {
    
    //預設有鹽巴的
    String state = "有鹽巴";
    //預設的建構
    protected FrenchFries(){}
    //帶入狀態的建構
    protected FrenchFries(String state){
        this.state = state;
    }

    @Override
    public void describe() {
        System.out.println("我是"+ state +"薯條");
    }
}
