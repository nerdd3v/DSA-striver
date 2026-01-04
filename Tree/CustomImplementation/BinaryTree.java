package Tree.CustomImplementation;
import java.util.Scanner;


public class BinaryTree {
    class Node{
        Node left;
        Node right;
        int value;

        public Node(int val){
            this.value = val;
            this.left = null;
            this.right = null;
        }
    }
    Node root;
    int level;

    public void populate(Scanner sc){
        System.out.println("Enter the value of root node");
        int rootVal = sc.nextInt();
        root = new Node(rootVal);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node){
        System.out.println("Would you like to enter the left to the root Node: (true/ false) ? ");
        boolean leftBool = sc.nextBoolean();

        if(leftBool){
            System.out.println("Enter the value of the left Node: "+ node.value + " ");
            int leftVal = sc.nextInt();
            Node leftNode = new Node(leftVal);
            node.left = leftNode;
            populate(sc, leftNode);
        }

        //else part will run automatically once the leftBool becomes false;

        System.out.println("Would you like to enter the node right to the root Node: (true/ false) ? ");
        boolean rightBool = sc.nextBoolean();
        if(rightBool){
            System.out.println("Enter the value of the right Node: "+ node.value + " ");
            int rightVal = sc.nextInt();
            Node rightNode = new Node(rightVal);
            node.right = rightNode;
            populate(sc, rightNode);
        }
    }

    public void display(){
        display(root);
    }

    private void display(Node node){
        //left first and then rights;

        if(node == null){
            return;
        }

        System.out.println(node.value + " ");
        display(node.left);// node 9 waiting here
        System.out.println();
        display(node.right);
    }


    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        t.populate(sc);
        t.display();
    }
}
