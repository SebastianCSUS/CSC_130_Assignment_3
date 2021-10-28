public class Main {

    public static void main(String[] args) {
	// write your code here
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
        String returnVal = null;

        return returnVal;
    }
}

class BinarySearchTree {
    private Node root;

    public String about() {
        return "Author: Sebastian Jones";
    }

    public void print() {

    }

    public void add(int key, String value) {

    }

    public String find(int key) {
        String returnVal = null;

        return returnVal;
    }
}
