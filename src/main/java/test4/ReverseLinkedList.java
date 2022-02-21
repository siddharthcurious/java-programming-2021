package test4;

class LinkedNode {
    public int val;
    public LinkedNode next;
    public LinkedNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {

        LinkedNode head = new LinkedNode(1);
        head.next = new LinkedNode(2);

        LinkedNode h = head;
        while(h != null){
            System.out.print(h.val+"->");
            h = h.next;
        }
        System.out.print("null");
        System.out.println();

        LinkedNode head2 = reverseLinkedList(head);

        while(head2 != null){
            System.out.print(head2.val+"->");
            head2 = head2.next;
        }
        System.out.print("null");
    }

    public static LinkedNode reverseLinkedList(LinkedNode head){
        if(head == null){
            return head;
        }
        else if(head.next == null){
            return head;
        }
        else if(head.next.next == null){
            LinkedNode temp = head.next;
            temp.next = head;
            head.next = null;
            return temp;
        }

        return null;
    }
}
