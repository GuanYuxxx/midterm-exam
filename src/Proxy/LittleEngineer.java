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
public class LittleEngineer implements IBuyHouse{
     @Override
    public void findHouse() {
//  小小工程師想找在民生社區的房子
        System.out.println("民生社區機能特好！當然找那邊的房子！");
    }

    @Override
    public void priceTooHigh() {
//   價錢實在太貴
        System.out.println("現在台灣薪水那麼低，屋主開那麼高賣不掉啦！");
    }

    @Override
    public void defendPrice() {
//   屋主反擊說價錢已經很便宜
        System.out.println("未來人口越來越少，我們也是自住而已！打我五折吧！");
    }

    @Override
    public void finish() {
//   沒想到屋主同意買到了
        System.out.println("辛苦還房貸幾十年");
    }
}
