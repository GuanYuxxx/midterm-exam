/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BFS;

/**
 *
 * @author User
 */
import java.util.LinkedList;
import java.util.Queue;

// 此類別代表圖中的節點
class Node {
 int data;
 boolean visited;

 Node(int data) {
     this.data=data;
     this.visited=false;
 }
}

// 此類別以陣列形式定義圖
class Graph {
 int MAX_VERTICES = 30;
 Node[] nodes; // 園裡的節點
 int[][] adjMatrix; // 鄰接矩陣
 int nVertices;

// Constructor
Graph()
{
    nodes = new Node[MAX_VERTICES];
    // 鄰接矩陣初始化為0
    adjMatrix = new int[MAX_VERTICES][MAX_VERTICES];
    nVertices = 0;
    for (int i = 0; i < MAX_VERTICES; i++)
        for (int j = 0; j < MAX_VERTICES; j++)
            adjMatrix[i][j] = 0;
}

// 將新的節點插入圖
public void addNode(int data)
{
    nodes[nVertices++] = new Node(data);
}

// 在圖中加入新的边
public void addEdge(int start, int end)
{
    adjMatrix[start][end] = 1;
    adjMatrix[end][start] = 1;
}

// 返回第N個節點
public int getUnvisitedNode(int n)
{
    int i;
    for (i = 0; i < nVertices; i++)
        if (i != n && nodes[i].visited == false)
            return i;
    return -1;
}

// 處理BFS算法
public void BFS(int start)
{
    nodes[start].visited = true;
    System.out.print(nodes[start].data + " ");
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(start);
    int v2;
    while (!q.isEmpty()) {
        int v1 = q.remove();
        while ((v2 = getUnvisitedNode(v1)) != -1) {
            nodes[v2].visited = true;
            System.out.print(nodes[v2].data + " ");
            q.add(v2);
        }
    }
}
}

public class BFS {
 public static void main(String[] args)
 {
    Graph g = new Graph();
    g.addNode(0);
    g.addNode(1);
    g.addNode(2);
    g.addNode(3);
    g.addNode(4);
    g.addNode(5);

// 加入边
    g.addEdge(0, 1);
    g.addEdge(1, 2);
    g.addEdge(2, 3);
    g.addEdge(3, 4);
    g.addEdge(4, 5);
    g.addEdge(5, 0);

    g.BFS(0);
 }
}
