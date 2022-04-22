// { Driver Code Starts
// driver code

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}

class GFG
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t--> 0)
        {
            int n = sc.nextInt();
            
            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }
            
            int pos = sc.nextInt();
            makeLoop(head, tail, pos);
            
            Solution x = new Solution();
            System.out.println( x.countNodesinLoop(head) );
        }
    }
}
// } Driver Code Ends


/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

//Function should return the length of the loop in LL.

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {

        Node slow=head;
        Node fast=head.next;
        return countNodes(slow,fast);
     
    }
    static int countNodes(Node slow,Node fast){
   /*Move fast pointer by two nodes and slow pointer
   by single node if they meet that is the loop existing
   once loop exist traverse again with slow pointer and once
   you reach same point again count the nodes that will be our result
   
   */
        while(fast!=null && fast.next!=null){
            if(slow==fast)
             return countNodes(slow);
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return 0;
        
    }
    
    static int countNodes(Node count){
        Node temp=count;
        int counter=1;
        
        while(temp.next!=count){
            temp=temp.next;
            counter++;
        }
        return counter;
    }
}
