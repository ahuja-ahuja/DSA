package LinkedList;

import static LinkedList.Traversing.createNode;
import static LinkedList.Traversing.traversal;

public class Deletion_SinglyLL {
    public static void main(String[] args) {
        Node head = createNode();
        Node newNode = deleteFirstNode(head);
        traversal(newNode);
    }

    public static Node deleteFirstNode(Node head) {
        //if there's only one head node then head.nextNode would be null returned
        if (head == null) {
            return null;
        }
        return head.nextNode;

    }

    public static Node deleteLastNode(Node head) {
        if (head == null || head.nextNode == null) {
            return null;
        }
        Node curr = head;
        while (curr.nextNode.nextNode != null) { // you need to stop at the 2nd last node
            curr = curr.nextNode;
        }
        curr.nextNode = null;

        return head;

    }

    public static int searchLinkedListPosition(Node head, int x){
        int position = 1;
        Node curr = head;
        while (curr != null){
            if(curr.data == x)
                return position;
            curr = curr.nextNode;
            position++;
        }
        return -1;

    }
}
