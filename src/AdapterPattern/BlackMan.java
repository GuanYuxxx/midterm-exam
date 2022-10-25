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
public class BlackMan {
    String name;
    public BlackMan(String name){
        this.name = name;
    }
    public void helloEnglish(){
        System.out.println("yo~!niga~");
    }
    public void selfIntroEnglish(){
        System.out.println("hello, I living in taipei. " +
                "my name is " + this.name + ".");
    }

}
