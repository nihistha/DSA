import javax.sound.midi.Soundbank;

public class DetectCycle { //union by rank
    int vertices;
    int size[]; //Rank of the vertices
    int parent[];
    DetectCycle(int vertices){
        this.vertices = vertices;
        size = new int[vertices];
        parent = new int[vertices];
        for(int i = 0;i<vertices;i++){// initially the parent array is set to -1 because no union has been made
        parent[i] =-1;
    }
    }
    int find(int node){
        if(parent[node] == -1){
            return node;  //if the parent node is the absolute node then the condition becomes true hence it returns itself
        }
        return parent[node] = find(parent[node]); //if this runs then the parent of the node isnt -1 so the function calls itself till it finds the parent node ie, the node which has -1 as its parent
    }
    void union (int vabsroot,int uabsroot){ //union of two abs root
        if(size [vabsroot]>size[uabsroot]){ 
            parent[uabsroot] = vabsroot; //the parent os uabs will now be vabs
        }else if(size[uabsroot]>size[vabsroot]){
            parent [vabsroot] = uabsroot;
        }else{
            parent[vabsroot] = uabsroot;
            size[uabsroot]++;
        }
    }
    public boolean isCycleDetected(int u,int v){ //u = source v = destination
        int uabsroot = find(u);
        int vabsroot = find(v);
        if(uabsroot == vabsroot){
            System.out.println("cycle detected");
            return true;
        }
        union(vabsroot,uabsroot);
        return false;

    }
    public static void main(String[] args) {
        DetectCycle d = new DetectCycle(4);

    }
    
}
