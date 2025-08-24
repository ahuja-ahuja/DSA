package LinkedList;

import static LinkedList.Traversing.createNode;
import static LinkedList.Traversing.traversal;

public class Insertion {
    public static void main(String[] args) {
      /*  Node head = createNode();
        Node insertion = insertionBeginning(head, 40);
        Node insertion1 = insertionBeginning(insertion, 50);
        Node insertion2 = insertionBeginning(insertion1, 60);
        traversal(insertion2);*/

        Node head = createNode();
        Node insertion = insertionBeginning(head, 40);
        Node insertion1 = insertionBeginning(insertion, 50);
        Node insertion2 = insertionBeginning(insertion1, 60);
        traversal(insertion2);

        System.out.println("verify insertion at new position \\n");
        Node newNode = insertionAtPosition(insertion2, 3, 33);
        traversal(newNode);


    }

    public static Node insertionBeginning(Node head, int n) {
        Node tmp = new Node(n);
        tmp.nextNode = head;
        return tmp;
    }

   /* So remember the login -> for insertion at the end we need to traver tot he end node until node.next == null,
    once you are there just simple assign*/
    public static Node insertionEnd(Node head, int n) {
        Node tmp = new Node(n);
        if (head == null) {
            head = tmp;
        }
        Node curr = head;

        //go to the end node
        while (curr.nextNode != null) {
            curr = curr.nextNode;
        }
        curr.nextNode = tmp;
        tmp.nextNode = null;
        return head;
    }

    public static Node insertionAtPosition(Node head, int pos, int n) {
        Node tmp = new Node(n);

        //if we just have
        if(head.nextNode == null){
            head.nextNode = tmp;
        }
        Node curr = head;
        //go to the end node
        for (int i = 0; i < pos-2 && curr !=null; i++) {
            curr = curr.nextNode;
            if(curr==null){
                return head;
            }
        }
        tmp.nextNode = curr.nextNode;
        curr.nextNode = tmp;
        return head;
    }
}
