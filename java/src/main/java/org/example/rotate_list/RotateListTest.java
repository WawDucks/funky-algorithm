package org.example.rotate_list;

import org.junit.Assert;
import org.junit.Test;

public class RotateListTest {
    @Test
    public void testRotateRight() {
        // Test case 1: Rotate the list by 0 positions
        ListNode head1 = new ListNode(1);
        RotateList solution = new RotateList();
        ListNode rotated1 = solution.rotateRight(head1, 0);
        Assert.assertEquals(1, rotated1.val);
        Assert.assertNull(rotated1.next);

        // Test case 2: Rotate an empty list
        ListNode head2 = null;
        ListNode rotated2 = solution.rotateRight(head2, 3);
        Assert.assertNull(rotated2);

        // Test case 3: Rotate a list with a single node by 1 position
        ListNode head3 = new ListNode(2);
        ListNode rotated3 = solution.rotateRight(head3, 1);
        Assert.assertEquals(2, rotated3.val);
        Assert.assertNull(rotated3.next);

        // Test case 4: Rotate a list with multiple nodes by 3 positions
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode rotated4 = solution.rotateRight(node1, 3);
        Assert.assertEquals(3, rotated4.val);
        Assert.assertEquals(4, rotated4.next.val);
        Assert.assertEquals(5, rotated4.next.next.val);
        Assert.assertEquals(1, rotated4.next.next.next.val);
        Assert.assertEquals(2, rotated4.next.next.next.next.val);
        Assert.assertNull(rotated4.next.next.next.next.next);
    }
}