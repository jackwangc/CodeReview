import java.util.Scanner;

class Second {

    public void removeDuplicates(ListNode head) {
        // 在这里编写代码
        if (head.next == null){
            return;
        }
        ListNode node = new ListNode(0);
        node.next = head;
        while (head.next != null && head != null) {
            if(head.next.val == head.val) {
                head = head.next;
                int val = head.val;
                while (head.next.val == val && head.next != null) {
                    head.next = head.next.next;
                    head = head.next;
                }
            }else{
                head = head.next;
            }

        }
        while (node.next != null){
            System.out.print(node.next.val + " ");
            node = node.next;
        }
    }
}