import java.util.*;
// import java.util.AbstractList;

public class Matrix {
    int vertices;
    int matrix[][];
    Matrix(int vertices){
        this.vertices = vertices;
        matrix = new int [vertices][vertices];
    }
    public void addEdge(int source, int destination){ //function called when their we need to add edges
        matrix[source][destination] = 1; //setting the relation to 1 in source, detinaiton and also destination , source
        matrix [destination ][source] = 1;
    }


    public void printGraph(){
        for (int i = 0 ;i<vertices;i++){ //vertices = 5
            System.out.println(i +" is connected to: ");
            for (int j = 0; j<vertices;j++){
                if (matrix[i][j] !=0){
                    System.out.println(j);
                }
            }
        }
    }
    public ArrayList<Integer> getAdjNode(int vertex){
        ArrayList<Integer> l = new ArrayList<>();
            for (int j = 0; j<vertices;j++){
                if (matrix[vertex][j] !=0){
                    l.add(j);
                }
            }
        return l;
        
    }

    public static void main(String[] args) {
        Matrix m = new Matrix(5);
        m.addEdge(0,1);
        m.addEdge(0,2);
        m.addEdge(0,4);
        m.addEdge(2,3);
        m.addEdge(2,4);
        m.addEdge(1,4);
        m.addEdge(3,4);
        m.printGraph();
    }
}
