public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);

        if (position <= 0 || head == null) {
            newNode.next = head;
            return newNode;
        }

        ListNode current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            ListNode tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = newNode;
        }
        return head;
    }
}
