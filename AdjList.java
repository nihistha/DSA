import java.util.Iterator;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class AdjList {
    int vertices;
    SinglyLinkedList list[];

    AdjList(int vertices) {
        this.vertices = vertices;
        list = new SinglyLinkedList[vertices];

        for (int i = 0; i < vertices; i++) {

            list[i] = new SinglyLinkedList();
        }

    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + "is connected to=");
            SinglyLinkedList.Node current = list[i].head;
            while (current != null) {
                System.out.println(current.data + ",");
                current = current.next;
            }
            System.out.println();
        }


    }
    public void BFS(int roootnode){
        System.out.print("BFS traversing");
      Queue q =new Queue(vertices);
        boolean visited[]=new boolean[vertices];
        q.enqueue(roootnode);
        visited[roootnode]=true;
        while (!q.isEmpty()){
            int x=q.dequeue();
            System.out.println(x);;

            Iterator<Integer>iterator=getadjNodes(x).iterator();
            while (iterator.hasNext()){
                int val=iterator.next();
                if (!visited[val]){
                    q.enqueue(val);
                    visited[val]=true;
                }
            }
        }
    }
    public void depthFirstSearch(int rootnode){
        boolean visited[] = new boolean[vertices];
        dfs(rootnode,visited);

    }
    void dfs(int rootnode,boolean[] visited){
        visited[rootnode] = true; //sets the first node to true
        System.out.println(rootnode);
        Iterator<Integer> interator = getadjNodes(rootnode).iterator();
        while (interator.hasNext()){
            int val = interator.next();
            if (!visited[val]){ // runs when the visited[3 ] is false
                dfs(val,visited); //send the value 3 and new unpated visited array
            }
        }

    }
    public List<Integer> getadjNodes(int i) {
        ArrayList<Integer> adjlist = new ArrayList<>();
        SinglyLinkedList.Node current = list[i].head;
        while (current != null) {
            System.out.println(current.data + ",");
            current = current.next;
        }

return adjlist;
    }

    public void addEdge(int source, int destination){
        list[source].insert(destination);
        list[destination].insert(source);

    }
}
