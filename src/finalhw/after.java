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
public class after
{   
    
 public static void main(String[] args) {
     int max=0;
     int n=0;
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     int input[] = new int[n];
  for(int i = 0; i < n; i++){
            input[i] = sc.nextInt();
        }
        //開始遞迴
        max = find_max(0,n,0,input);    
        System.out.println(max);
        return ;
 }
 static int find_max(int max,int n,int index,int array[]){ //max儲存最大值，n是陣列長度,index用來記錄位置,array就是陣列
     if(index==n){      //如果位置跑到n了就回傳最大值
            return max;
        }
        else{
            if(array[index]>max){     //如果array目前位置大於目前最大值，就把array目前位置放進去跑
                return find_max(array[index],n,index+1,array);
            
            }
            else{                 //不然就照原來的跑
                return find_max(max,n,index+1,array);
            }
        }
    }
}
