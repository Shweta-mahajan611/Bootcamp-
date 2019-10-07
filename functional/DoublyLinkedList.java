

public class DoublyLinkedList
{
 
	static class Node 
	{
		int data;
		Node next;
		Node prev;

		Node(int d)
		{
			this.prev = null;
			this.data = d;
			this.next = null;
		}
	}
		Node head,tail = null;
		
	  
		//add node to list
		 public void addNode(int data) 
		 {  
		        Node newNode = new Node(data);  
		  
		        //If list is empty  
		        if(head == null)
		        {  
		            //Both head and tail will point to newNode  
		            head = tail = newNode; 
		            head.prev = null;  
		            tail.next = null;  
		        }  
		        else 
		        {  
		            //newNode will be added after tail so tail's next will point to newNode  
		            tail.next = newNode;  
		            //newNode's previous will point to tail  
		            newNode.prev = tail;  
		            //newNode will become new tail  
		            tail = newNode;  
		            //it is last node, tail's next will point to null  
		            tail.next = null;  
		        }  

		 }

		public void printList() {
			Node n = head;
			 if(head == null) 
			 {    
		            System.out.println("List is empty");    
		            return;    
		       }    
		        System.out.println("Nodes of singly linked list: ");    
			while (n != null)
			{
				System.out.println(n.data + " ");
				n = n.next;
			}
		}
		
	public static void main(String[] args) 
	{
		DoublyLinkedList dlist = new DoublyLinkedList();
		
		dlist.addNode(10);
		dlist.printList();


	}

}
	

