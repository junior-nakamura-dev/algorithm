package nakamura.dev.algorithm.medium;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode previous = head;
        int rest = 0;
        while (l1 != null || l2 != null || rest != 0) {
            int digitNumber1 = 0;
            int digitNumber2 = 0;

            if (l1 != null) {
                digitNumber1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                digitNumber2 = l2.val;
                l2 = l2.next;
            }

            int sum = digitNumber1 + digitNumber2 + rest;
            rest = sum / 10;

            ListNode digitResult = new ListNode(sum - (rest * 10));
            previous.next = digitResult;
            previous = digitResult;
        }
        return head.next;

    }

}
