package nakamura.dev.algorithm.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void shouldAddTwoNumbersWithSuccess() {
        ListNode two = new ListNode(2, null);
        ListNode one = new ListNode(4, two);
        ListNode l1 = new ListNode(3, one);

        ListNode twoB = new ListNode(5, null);
        ListNode oneB = new ListNode(6, twoB);
        ListNode l2 = new ListNode(4, oneB);

        final ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(7, result.val);
        Assertions.assertEquals(0, result.next.val);
        Assertions.assertEquals(8, result.next.next.val);
    }


    @Test
    public void shouldAddTwoNumbersAndTheSumWillBeZeroWithSuccess() {
        ListNode l1 = new ListNode(0, null);

        ListNode twoB = new ListNode(0, null);
        ListNode oneB = new ListNode(0, twoB);
        ListNode l2 = new ListNode(0, oneB);

        final ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(0, result.val);
        Assertions.assertEquals(0, result.next.val);
        Assertions.assertEquals(0, result.next.next.val);
    }


}