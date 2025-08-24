package LinkedList;

public class Traversing {
    public static void main(String[] args) {
        Node node = createNode();
        recursiveTraversal(node);
    }

    public static Node createNode() {
        Node head = new Node(10);
        Node twenty = new Node(20);
        Node thirty = new Node(30);
        head.nextNode = twenty;
        twenty.nextNode = thirty;

        return head;
    }

    public static void traversal(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.nextNode;
        }
    }

    public static void recursiveTraversal(Node head) {
        //note always check head condititon for null not on head.nextNode , otherwise you will lose the last element
        if (!(head == null)) {
            System.out.println(head.data);
            recursiveTraversal(head.nextNode);
        }
    }
}
