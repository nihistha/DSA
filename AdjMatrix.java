import java.util.*;

public class AdjMatrix {
  public static class Edge implements Comparable<Edge>{ 
    int u;
    int v;
    int w;

    Edge(int u , int v,int w){//u vaneko source v vaneko destination
      this.u = u;
      this.v = v;
      this.w = w;
    }
    public int compareTo(Edge o){
      return this.w-o.w;  //if 
    }
  } 
  int vertices;
  int[][] matrix; // this is used to declare the matrix
  Edge edges[]; //array of object edgeweight
  int count = 0; 

  public AdjMatrix(int vertices) {
    this.vertices = vertices;
    matrix = new int[vertices][vertices]; // this is creating the matrix as per the no. of given   vertices
    edges = new Edge[vertices*(vertices-1)/2]; // size is the total amount of graph that can be created
  }

  public void addEdge(int source, int destination,int weight){
    matrix[source][destination] = weight;
    matrix[destination][source] = weight;
    edges[count++] = new Edge(source,destination,weight);
  } 
  
  void kruskal(){
    int size[] = new int[vertices]; //Rank of the vertices
    int parent[] = new int[vertices];
    for(int i = 0;i<vertices;i++){
      parent[i] = -1;
    }
    Arrays.sort(edges);
    int mst[][] = new int[vertices][vertices];
    int edgeTaken = 0; 
    int edgecounter =0; //represents the pointer index
    while(edgeTaken <= vertices-1){ //not using th for loop because the edge array can be not full
      edgeTaken++;
      Edge e = edges[edgecounter++];
      int uabsroot = find(e.u,parent); 
      int vabsroot = find(e.v,parent);
      if(uabsroot==vabsroot){
        continue;
      }
      mst[e.v][e.u] = e.w;
      edgeTaken++;
      union(uabsroot,vabsroot,size,parent); 
    }
  }
      void union (int uabsroot,int vabsroot,int size[],int parent[]){ //union of two abs root
        if(size [vabsroot]>size[uabsroot]){ 
            parent[uabsroot] = vabsroot; //the parent os uabs will now be vabs
        }else if(size[uabsroot]>size[vabsroot]){
            parent [vabsroot] = uabsroot;
        }else{
            parent[vabsroot] = uabsroot;
            size[uabsroot]++;
        }
    }
  int find(int rootnode,int[] parent){
    if(parent[rootnode]==-1){
      return rootnode;
    }
    return parent[rootnode] = find(parent[rootnode],parent);
  }

  public void printGraph(){
    for(int i = 0; i < matrix.length; ++i){

      System.out.print(i+" is connected to = ");

      for(int j = 0; j < matrix.length; ++j){
        if(matrix[i][j] != 0){
          System.out.print(j+",");
        }
      }

      System.out.println();

    }
  }

  public List<Integer> getAdjacentNodes(int vertex){
    List<Integer> list = new ArrayList<>();

    for(int j = 0; j < matrix.length; ++j ){
      if(matrix[vertex][j] != 0){
        list.add(j);
      }
    }

    return list;
  }

  public void BFS(int root){
    System.out.println("BFS traversing");
    Queue<Integer> q = new LinkedList<>();
    boolean[] visited = new boolean[vertices];
    q.add(root); // adding the root to the queue
    visited[root] = true;
    while(!q.isEmpty()){
      int x = q.poll(); // dequeuing or taking out the element from the queue
      System.out.println(x);
      Iterator<Integer> it = this.getAdjacentNodes(x).iterator(); 
      while(it.hasNext()){
        int val = it.next();
        if(!visited[val]){
          q.add(val);
          visited[val] = true;
        }
      }
    }
  }

  public void DFS(int root){
    System.out.println("DFS traversal");
    boolean[] visited = new boolean[vertices];
    dfs(root,visited);
  }

  void dfs(int root, boolean[] visited){
    visited[root] = true;
    System.out.print(root);
    Iterator<Integer> it = this.getAdjacentNodes(root).iterator(); 
    while(it.hasNext()){
      int val = it.next();
      if(!visited[val]){
        dfs(val,visited);
      }
    }
  }

  public void iterativeDfs(int root){
    Stack<Integer> cs = new Stack<>();
    boolean[] visited = new boolean[vertices];
    cs.push(root);
    visited[root] = true;

    while(!cs.isEmpty()){
      int curr = (int)cs.pop();
      System.out.print(curr);
      Iterator<Integer> it = getAdjacentNodes(curr).iterator();
      while(it.hasNext()){
        int val = it.next();
        while(!visited[val]){
          visited[val] = true;
          cs.push(val);
        }
      }
    }

  }
  int dijakstra(int source,int destination){
    int dist[]=new int[vertices];
    boolean visited[]=new boolean[vertices];
    int prevpath[]=new int [vertices];

    for(int i=0;i<vertices;i++) {
        dist[i] = Integer.MAX_VALUE;
        prevpath[i] = -1;
    }
    dist[source]=0;
        for (int i=0;i<vertices;i++) {
            int minvertex = findMinimumVertex(dist, visited);
            visited[minvertex] = true;
            Iterator<Integer> iterator = getAdjacentNodes(minvertex).iterator();
            while (iterator.hasNext()) {
                int v = iterator.next();
                if (!visited[v] && dist[minvertex] + matrix[minvertex][v] < dist[v]) {
                    dist[v] = dist[minvertex] + matrix[minvertex][v];
                }                
            }
        }
//        print path using prevpath[] array
     return dist[destination];
    }


  int prims(int source,int destination){
    int dist[]=new int[vertices];
    boolean visited[]=new boolean[vertices];
    int parent[]=new int [vertices];

    for(int i=0;i<vertices;i++) {
        dist[i] = Integer.MAX_VALUE;
        parent[i] = -1;
    }
    dist[source]=0;
        
        

        for (int i=0;i<vertices;i++) {
            int minvertex = findMinimumVertex(dist, visited);
            visited[minvertex] = true;
            Iterator<Integer> iterator = getAdjacentNodes(minvertex).iterator();
            while (iterator.hasNext()) {
                int v = iterator.next();
                if (!visited[v] && dist[minvertex] + matrix[minvertex][v] < dist[v]) {
                    dist[v] = dist[minvertex] + matrix[minvertex][v];
                    parent[v] = minvertex;
                }
            }
        }
//        print path using prevpath[] array
     return dist[destination];
    }
    // public void toposort(){
    //   Queues q = new Queues[vertices];
    //   `
    // }

    int findMinimumVertex(int[] dist,boolean[] visited){
      int minvertex=-1;
      for(int i=0;i<vertices;i++){
          if(!visited[i] && (minvertex==-1 || dist[minvertex]>dist[i])){
              minvertex=1;
          }
      }
      return minvertex;
  }

}

  public static void main(String[] args) {
    AdjMatrix adj = new AdjMatrix(6);
    adj.addEdge(0,1);
    adj.addEdge(0,2);
    adj.addEdge(1,3);
    adj.addEdge(1,2);
    adj.addEdge(2,4);
    adj.addEdge(2,5);
    adj.printGraph();
    List<Integer> adjNodes = adj.getAdjacentNodes(0);
    System.out.println(adjNodes);
    // adj.BFS(0);
    adj.DFS(0);
    System.out.println("Iterative");
    adj.iterativeDfs(0);
  }

}