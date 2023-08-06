using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CEM.Desktop.IT.GITHUB.funky-algorithm.csharp
{
public class ListNode
{
    public int val;
    public ListNode next;
    public ListNode(int val = 0, ListNode next = null)
    {
        this.val = val;
        this.next = next;
    }
 * }
public class DeleteDuplicates
{
    public ListNode DeleteDuplicates(ListNode head)
    {

        ListNode currentItem = head;

        while (currentItem != null && currentItem.next != null)
        {
            if (currentItem.val == currentItem.next.val)
                currentItem.next = currentItem.next.next;

            else
                currentItem = currentItem.next;

        }
        return head;
    }
}
}