package Practice.dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();

    Graph(int v){
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<Integer>());
        }
    }
    public void addEdge(int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    public void printAdjList(){
        for(int i=0;i<adjList.size();i++){
            System.out.println("\nAdjacent list of vertex "+i);
            for(int j=0;j<adjList.get(i).size();j++){
                System.out.print(" "+adjList.get(i).get(j)+" ");
            }
        }
    }

    public void bfs(int v){
        int n=adjList.size();
        boolean []visited=new boolean[n];
        visited[v]=true;

        Queue<Integer> q=new LinkedList<>();
        q.add(v);

        while(q.size()!=0){
            //dequeue
            int vertex=q.remove();
            System.out.print(vertex+" ");
            for(int i=0;i<adjList.get(vertex).size();i++){
                int av=adjList.get(vertex).get(i);
                if(!(visited[av])){
                    q.add(av);
                    visited[av]=true;
                }
            }
        }
    }
    public void dfs(int v){
        int n=adjList.size();
        boolean []visited=new boolean[n];
        dfs(visited, v);
    }
    public void dfs(boolean []visited, int v){
        visited[v]=true;
        System.out.println(v+" ");
        for(int i=0;i<adjList.get(v).size();i++){
            int av=adjList.get(v).get(i);
            if(!visited[av]){
                dfs(visited, av);
            }
        }
    }
}
