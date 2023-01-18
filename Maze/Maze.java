/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze;

/**
 *
 * @author User
 */
public class Maze {

    static int[][] maze = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 1, 0, 1, 0, 0, 0, 0, 1},
        {1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
        {1, 0, 1, 0, 1, 1, 1, 0, 0, 1},
        {1, 0, 1, 0, 0, 0, 0, 0, 1, 1},
        {1, 0, 0, 0, 1, 1, 1, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

    static boolean findPath(int x, int y) {
        if (x == 2 && y == 2) { // 是否是迷宮出口
            maze[x][y] = 2; // 走過的路
            return true;
        } else if (maze[x][y] == 0) { // 是不是可以走的路
            maze[x][y] = 2; // 走過的路
            if (findPath(x - 1, y)|| // 往上
                findPath(x + 1, y) || // 往下
                findPath(x, y - 1)|| // 往左
                findPath(x, y + 1)) // 往右
            {
                return true;
            } else {
                maze[x][y] =4 ; // 此路不通取消記號
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        findPath(1, 1); // 呼叫遞迴
        System.out.println("Maze (右下到左上):");
        for (int i = 0; i <= 6; i++) {  
            for (int j = 0; j <= 9; j++) 
            {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("數字 1: 牆");
        System.out.println("數字 2: 走過的路");
    }
}

