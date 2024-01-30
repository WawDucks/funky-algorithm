package org.example.inser_node_at_specific_position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertNodeAtPositionTest {
    @Test
    public void testInsertNodeAtPosition() {
        SinglyLinkedListNode head = new SinglyLinkedListNode(1);
        head.next = new SinglyLinkedListNode(2);
        head.next.next = new SinglyLinkedListNode(3);

        head = InsertNodeAtPosition.insertNodeAtPosition(head, 4, 2);
        assertEquals(1, head.data);
        assertEquals(2, head.next.data);
        assertEquals(4, head.next.next.data);
        assertEquals(3, head.next.next.next.data);
    }

}