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
public abstract class People {
    String name;

    public People(String name){
        this.name = name;
    }

    public abstract void hello();

    public abstract void selfIntro();

    public String getName() {
        return name;
    }
}
