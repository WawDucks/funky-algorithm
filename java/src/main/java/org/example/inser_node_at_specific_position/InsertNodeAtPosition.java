package org.example.inser_node_at_specific_position;

public class InsertNodeAtPosition {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        SinglyLinkedListNode newSinglyLinkedListNode = new SinglyLinkedListNode(data);

        if (llist == null) {
            return newSinglyLinkedListNode;
        }

        if (position == 0) {
            newSinglyLinkedListNode.next = llist;
            llist = newSinglyLinkedListNode;
        } else {
            SinglyLinkedListNode current = llist;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newSinglyLinkedListNode.next = current.next;
            current.next = newSinglyLinkedListNode;
        }
        return llist;
    }

}

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data) {
        this.data = data;
    }
}
