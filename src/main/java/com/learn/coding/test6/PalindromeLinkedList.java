package com.learn.coding.test6;

class Node {
    int val;
    Node next;

    public Node(int val){
        this.val = val;
        this.next = null;
    }
}

class LinkedList {

    public boolean isPalindrome(Node head){
        if(head.next == null){
            return true;
        }
        else if(head.next.next == null) {
            if (head.val != head.next.val) {
                return false;
            } else if (head.val == head.next.val) {
                return true;
            }
        }

        int len = getLengthOfList(head);

        if(len == 3){
            if(head.val == head.next.next.val){
                return true;
            }
            return false;
        }

        // 1->2-> 2->1 ;
        // 1->2->3->2->1;

        int mid = 0;
        if(len%2 == 0){
            mid = len/2;
        }
        else {
            mid = (len/2) + 1;
        }

        Node start = head;
        Node h = start;
        while(mid > 0){
            h = start;
            start = start.next;
            mid--;
        }

        reverseList(h, start, len/2);

        return false;
    }

    public void reverseList(Node head, Node prev, int len){
        if(len == 2){
            Node fow = prev.next;
            prev.next = null;
            fow.next = prev;
            head = fow;
        }
        else {
            Node fow = prev.next;
            Node lead = prev.next.next;
            prev.next = null;
            while(lead.next != null){
                fow.next = prev;
                prev = fow;
                fow = lead;
                lead = lead.next;
            }

        }
    }

    public int getLengthOfList(Node head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}

public class PalindromeLinkedList {

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(5);

        LinkedList linkedList = new LinkedList();
        boolean ans = linkedList.isPalindrome(head);
        System.out.println(ans);
    }
}
