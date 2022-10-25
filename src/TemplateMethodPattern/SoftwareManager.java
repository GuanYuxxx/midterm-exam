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
public class SoftwareManager extends BossMethod {
    @Override
    String UI_Design() {
        System.out.println("找一個UI Design做");
        return "UI成果";
    }

    @Override
    String systemAnalysis() {
        System.out.println("找一個軟體分析師做");
        return "軟體分析成果";
    }

    @Override
    String systemDesign() {
        System.out.println("找一個系統設計師做");
        return "系統設計成果";
    }

    @Override
    String programming() {
        System.out.println("找一個軟體工程師做");
        return "程式成果";
    }

    @Override
    String test() {
        System.out.println("找一個測試工程師做");
        return "測試成果";
    }
}