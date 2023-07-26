public class AVLTree {
    public class Node{
        Node left;
        Node right;
        int data;
        int height;
        Node(int data){
            this.data = data;
            this.height = 1;
            this.left = this.right = null;
        }
    }
    public Node createBST(Node root, int data){
        if(root == null)[
            return new Node(data);
        ]
        if(data<root.data){
            root.left = createBST(root.left,data);
        }
        else if(data >root.data){
            root.right = createBST(root.right, data);
        }else{
            return root;
        }
        
        root.height = Math.max(root.left.height,root.right.height)+1;
        int balancefactor = findBalanceFactor(root);
        //LL
        if(balancefactor>1 && data<root.left.data){
            return rightRotate(root);
        }
        //LR
        if(balancefactor>1 && data>root.left.data){
            root.left = leftRotate(root.left);  //if the tree is 10 20 30 then the rotation is applied on the basis of 20 an then 3- becomes root.left
            return rightRotate(root);
        }
        //RR
        if(balancefactor<-1 && data<root.right.data){
            return leftRotate(root);
        }
        //RL
        if(balancefactor<-1 && data>root.left.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
    }
    public  Node rightRotate(Node y){
        Node x = y.left; // x vaneko 80 y vaneko 100
        Node T2 = x.right; //t2 vaneko 90
        x.right = y; 
        y.left = T2;
        y.height = Math.max(y.left.height,y.right.height)+1;
        
        return x;
    }
    public Node leftRotate(Node x){ // x vaneko 
        Node y = x.right; // setting y to what is in the left of node x
        Node t2 = y.left;
        y.left = x; // y ko left ma x Node rakhyo
        x.right = t2; // previously x ko right ma y cha so tyo remove garera t2 halne
        return y;
    }
    int findBalanceFactor(Node root){
        if(root == null){
            return 0;
        }
        return root.left.height - root.right.height;
    }
}
