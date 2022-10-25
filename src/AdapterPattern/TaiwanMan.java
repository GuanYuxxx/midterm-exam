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
public class TaiwanMan {
    private People people;
    public TaiwanMan(People people){
        this.people = people;
    }
    public void hello(){
        people.hello();
    }
    public void selfIntro(){
        people.selfIntro();
    }
}
