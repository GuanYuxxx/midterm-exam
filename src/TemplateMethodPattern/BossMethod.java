/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethodPattern;

/**
 *
 * @author User
 */
public abstract  class BossMethod {
    	//老闆有老闆的想法
    private String bossThink(){
        return "我覺得呢，這個東西應該要這樣做這樣做。 ： ";
    }
	//老闆說你們這個不好重新做
    private String bossRedo(){
        return "你們這個跟我想做得不一樣重新做。";
    }
    abstract String UI_Design();
    abstract String systemAnalysis();
    abstract String systemDesign();
    abstract String programming();
    abstract String test();
    public void completeSoftware(){

        System.out.println(
                bossThink() + UI_Design() + "\n" +
                bossThink() + systemAnalysis() + "\n" +
                bossThink() + systemDesign() + "\n" +
                bossThink() + programming() + "\n" +
                bossThink() + test()
        );
    }
    public void redoSoftware(){
        System.out.println(bossRedo());
        completeSoftware();
    }
    
}