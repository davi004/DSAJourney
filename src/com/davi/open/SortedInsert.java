class Solution
{
	public static Node sortedInsert(Node head,int data)
         {
            //add code here.
            
            Node curr=head;
            boolean insertionComplete=false;
            boolean isBefHead=false;
            if(curr.data>data)
                isBefHead=true;
            
            while(!insertionComplete){
                if(isBefHead){
                    if(curr.next==head){
                        Node insertNode=new Node(data);
                        Node tempNode=curr.next;
                        insertNode.next=tempNode;
                        curr.next=insertNode;
                        head=insertNode;
                        insertionComplete=true;
                    }else{
                        curr=curr.next;
                    }
                }else{
                    
                    if(curr.next.data>=data){
                        Node insertNode=new Node(data);
                        Node tempNode=curr.next;
                        insertNode.next=tempNode;
                        curr.next=insertNode;
                        insertionComplete=true;
                        
                    }else{
                        curr=curr.next;
                    }
                    
                    
                    
                    
                }
                
                
            }
            return head;
            
         }
}
