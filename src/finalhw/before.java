/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalhw;

/**
 *
 * @author User
 */
import java.util.*;
public class before
{
 public static void main(String[] args) {
     int max=0;                    //最大值儲存
     int n=0;                      //陣列長度
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();            //輸入n
     int input[] = new int[n];     //要找最大值的陣列
  for(int i = 0; i < n; i++){
            input[i] = sc.nextInt();        //輸入陣列
        }
        for(int i=0;i<n;i++){
            if(input[i]>max){         //如果陣列的這個值大於max，就讓max等於他
                max = input[i];
            }
        }
        System.out.println(max);
 }
}
