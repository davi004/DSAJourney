// { Driver Code Starts
import java.io.*;
import java.util.*;
class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
class GfG
{
    static Scanner sc = new Scanner(System.in);
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
        {
            
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n , m;
                    
                    n = sc.nextInt();
                    m = sc.nextInt();
                    
                    Node head1 = inputList(n);
                    Node head2 = inputList(m);
                    
                    Sol obj = new Sol();
                    
                    Node result = obj.findIntersection(head1, head2);
	    
	                printList(result);
	                System.out.println();
                }
        }
}// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Sol
{
    /*
     Create a set traversing the first set and then traverse the 
     second list and add what data we have in the set.
     We need to ensure we are not duplicating the elements in new list
     
    */
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Set<Integer> nodeSet=new HashSet<Integer>();
        while(head1!=null){
            
            if(!nodeSet.contains(head1.data)){
                nodeSet.add(head1.data);
            }
            head1=head1.next;
            
        }
        Node result=new Node(-1);
        Node temp=result;
        while(head2!=null){
           if(nodeSet.contains(head2.data) && temp.data!=head2.data){
               temp.next=new Node(head2.data);
               temp=temp.next;
           }   
           head2=head2.next;
            
        }
        
        return result.next;
        
    }
}
