using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using NUnit.Framework;

namespace CEM.Desktop.IT.GITHUB.funky_algorithm.csharp.Tests
{
    [TestFixture]
    public class DeleteDuplicatesTests
    {
        [Test]
        public void TestDeleteDuplicates()
        {
            // Create a linked list: 1 -> 1 -> 2 -> 3 -> 3 -> null
            ListNode node5 = new ListNode(3);
            ListNode node4 = new ListNode(3, node5);
            ListNode node3 = new ListNode(2, node4);
            ListNode node2 = new ListNode(1, node3);
            ListNode head = new ListNode(1, node2);

            DeleteDuplicates solution = new DeleteDuplicates();

            // Call the DeleteDuplicates method
            ListNode result = solution.DeleteDuplicates(head);

            // Assert the expected linked list: 1 -> 2 -> 3 -> null
            Assert.AreEqual(1, result.val);
            Assert.AreEqual(2, result.next.val);
            Assert.AreEqual(3, result.next.next.val);
            Assert.IsNull(result.next.next.next); // Make sure the list ends with null
        }

        [Test]
        public void TestDeleteDuplicates_EmptyList()
        {
            // Test with an empty list
            ListNode head = null;

            DeleteDuplicates solution = new DeleteDuplicates();

            // Call the DeleteDuplicates method with an empty list
            ListNode result = solution.DeleteDuplicates(head);

            // Assert that the result is still null (empty list)
            Assert.IsNull(result);
        }

        [Test]
        public void TestDeleteDuplicates_NoDuplicates()
        {
            // Create a linked list with no duplicates: 1 -> 2 -> 3 -> null
            ListNode node3 = new ListNode(3);
            ListNode node2 = new ListNode(2, node3);
            ListNode head = new ListNode(1, node2);

            DeleteDuplicates solution = new DeleteDuplicates();

            // Call the DeleteDuplicates method
            ListNode result = solution.DeleteDuplicates(head);

            // Assert the expected linked list: 1 -> 2 -> 3 -> null
            Assert.AreEqual(1, result.val);
            Assert.AreEqual(2, result.next.val);
            Assert.AreEqual(3, result.next.next.val);
            Assert.IsNull(result.next.next.next); // Make sure the list ends with null
        }
    }
}