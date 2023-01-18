/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queen8;

/**
 *
 * @author User
 */
public class Queen8 {
    int max = 8;
    int[] array = new int[max];
    int count = 0; // 統計有多少個結果

    public static void main(String[] args) {
        Queen8 queen8 = new Queen8();
        queen8.check(0); // 從第 1 行開始放置
    }

    private void check(int n) {
        if (n == max) {
            count++;
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            array[n] = i;
            if (judge(n)) {
                check(n + 1);
            }
        }
    }
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if ( array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }
    private void print() {
        System.out.printf("第 %02d 個結果 ：", count);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void judgeTest() {
        Queen8 queen8 = new Queen8();
        queen8.array[0] = 0;
        queen8.array[1] = 0; // 從第一列開始放置
        System.out.println("同一列，是否通過：" + queen8.judge(1));
        queen8.array[1] = 1;
        System.out.println("同一斜列，是否通過：" + queen8.judge(1));
        queen8.array[1] = 2;
        System.out.println("同一列或同一斜列，是否通過：" + queen8.judge(1));
        queen8.array[2] = 0;
        System.out.println("同一列，是否通過：" + queen8.judge(2));
        queen8.array[2] = 1;
        System.out.println("同一斜列，是否通過：" + queen8.judge(2));
    }
}

