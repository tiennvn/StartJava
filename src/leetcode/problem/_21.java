/*
21. Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.

*/
package leetcode.problem;

public class _21 {
    public static void main(String[] args) {
        var firstList1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        var firstList2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        var result = Solution.mergeTwoLists(firstList1, firstList2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    class Solution {
        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            if (list1 == null) {
                return list2;
            }

            if (list2 == null) {
                return list1;
            }

            var fistElement = new ListNode();
            if (list1.val <= list2.val) {
                fistElement = list1;
                list1 = list1.next;
            } else {
                fistElement = list2;
                list2 = list2.next;
            }

            var lastElement = fistElement;
            while (true) {
                if (list1 == null && list2 == null) {
                    break;
                }

                if (list1 == null) {
                    lastElement.next = list2;
                    list2 = list2.next;
                    lastElement = lastElement.next;
                    continue;
                }
                if (list2 == null) {
                    lastElement.next = list1;
                    list1 = list1.next;
                    lastElement = lastElement.next;
                    continue;
                }

                if (list1.val <= list2.val) {
                    lastElement.next = list1;
                    lastElement = lastElement.next;
                    list1 = list1.next;
                    continue;
                } else {
                    lastElement.next = list2;
                    list2 = list2.next;
                    lastElement = lastElement.next;
                    continue;
                }

            }

            return fistElement;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
