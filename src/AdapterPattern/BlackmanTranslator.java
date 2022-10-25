/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern;

/**
 *
 * @author User
 */
public class BlackmanTranslator extends People{
    public BlackmanTranslator(String name) {
        super(name);
    }
    @Override
    public void hello() {
        System.out.println(getName() + ":你好嗎?");
    }
    @Override
    public void selfIntro() {
        System.out.println("大家好我是" + getName() +
                "，現在台北工作。");
    }
}
