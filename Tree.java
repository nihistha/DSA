public class Tree{
    public static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    void preorder(Node root){
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    void inorder(Node root){
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    void postorder(Node root){
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.postorder(root);
    }
}