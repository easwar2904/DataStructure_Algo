package D2Revision_Day2;

import java.util.HashSet;

// https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
public class Removeduplicatesfromanunsortedlinkedlist {
    public Node removeDuplicates(Node head) 
    {
        HashSet<Integer> set = new HashSet<Integer>();
        Node dummy = new Node(-1);
        
        Node prev = dummy;
        Node curr = head;
        
        while(curr!=null){
            if(!set.contains(curr.data)){
                set.add(curr.data);
                prev.next = curr;
                prev = prev.next;
                curr = curr.next;
            }
            else {
                curr = curr.next;
            }
        }
        prev.next = null;
        return dummy.next;
    }
}


