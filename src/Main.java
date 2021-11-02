/** Assignment 3 - Binary Search Tree - 11/4/2021
 *  Sebastian Jones - Sacramento State University - CSC 130 - Professor Cooke
 */
public class Main {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.add(10, "Buffalo Wings");
        tree.add(43, "Cheez Whiz");
        tree.add(18, "Root beer");
        tree.add(6, "Pringles");
        tree.add(50, "Ice cream");
        tree.add(8, "Chocolate");

        tree.print();

        System.out.print("Finding value of key 18: \t");
        System.out.println(tree.find(18));
        System.out.print("Finding value of key 8: \t");
        System.out.println(tree.find(8));
        System.out.print("Finding value of key 5: \t");
        System.out.println(tree.find(5));
    }
}

class Node {
    private Node left;
    private Node right;
    private int key;
    private String value;

    //Constructors
    public Node(Node left, Node right, int key, String value) {
        this.left = left;
        this.right = right;
        this.key = key;
        this.value = value;
    }
    public Node(int key, String value) {
        this.left = null;
        this.right = null;
        this.key = key;
        this.value = value;
    }

    //getters and setters
    public Node getLeft() {
        return left;
    }
    public Node getRight() {
        return right;
    }
    public int getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public void setRight(Node right) {
        this.right = right;
    }

    //Other functions
    public void print(int indent){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < indent; i++) {
            sb.append(" ");
        }
        sb.append("+--").append(this.getKey()).append(" - ").append(this.getValue());
        System.out.println(sb);
        if(this.getLeft() != null) {
            this.getLeft().print(indent + 2);
        }
        if(this.getRight() != null) {
            this.getRight().print(indent + 2);
        }
    }

    public void add(int key, String value) {
        if(this.key < key) {
            if(this.right == null) {
                this.right = new Node(key, value);
                return;
            }
            this.right.add(key, value);
        } else if(this.key > key) {
            if(this.left == null) {
                this.left = new Node(key, value);
                return;
            }
            this.left.add(key, value);
        }
    }

    public String find(int key) {
        if(this.getKey() < key) {
            if(this.getRight()==null) { return null;}
            return this.getRight().find(key);
        } else if(this.getKey() > key) {
            if(this.getLeft()==null) {return null;}
            return this.getLeft().find(key);
        }
        return this.getValue();
    }
}

//Uses the root value to begin recursion
class BinarySearchTree {
    private Node root;

    public String about() {
        return "Author: Sebastian Jones";
    }

    public void print() {
        root.print(0);
    }

    public void add(int key, String value) {
        if(root == null) {
            root = new Node(key, value);
            return;
        }
        root.add(key, value);
    }

    public String find(int key) {
        return root.find(key);
    }
}
