package LinkedList;

public class Simple_LinkedList_Implementation {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node twenty = new Node(20);
        Node thirty = new Node(30);
        head.nextNode = twenty;
        twenty.nextNode = thirty;
    }
}
class Node{
    int data;
    Node nextNode;
    public Node(int data){
        this.data = data;
        nextNode = null;
    }
}