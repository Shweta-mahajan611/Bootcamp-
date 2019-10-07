package singlylinkedlist;

import java.util.Scanner;

public class SLinkedList
{
	
	private static Node middle;
	private static int pos = 0;
	public static Scanner sc = new Scanner(System.in);
	Node head;

	class Node 
	{
		int data;
		Node next;

		Node(int d)
		{
			this.data = d;
			this.next = null;
		}

		
	}
	// add nodes

	public Node tail = null;
  
	//add node to list
	public void addNode(int data)
	{
		Node new_node = new Node(data);
		if (head == null)
		{
			head = new_node;
			tail = new_node;
	    } 
		else 
		{
			tail.next = new_node;
			tail = new_node;
		}
	}

	public void printList() 
	{
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
	 //insert at first
	  public void insertAtFirst(int data) 
	  {  
	     
	        Node newNode = new Node(data);  
	  
	        //Checks if the list is empty  
	        if(head == null)
	        {  
	            head = newNode;  
	            tail = newNode;  
	        }  
	        else
	        {  
	            Node temp = head;  
	            //newNode become head of the list  
	            head = newNode;  
	            //Node temp(previous head) will be added after new head  
	            head.next = temp;  
	        }  
	    }  
	  //insert at last
	  public void insertAtLast(int data)
	  {  
	        Node newNode = new Node(data);  
	  
	        if(head == null) 
	        {  
	            head = newNode;  
	            tail = newNode;  
	        }  
	        else 
	        {  
	            //newNode will be added after tail so tail's next will point to newNode  
	            tail.next = newNode;  
	            //newNode will become new tail of the list  
	            tail = newNode;  
	        }  
	    } 
	  //insert at position
	  public void insertAtPosition(int data,int pos)
	  {
		  Node newNode = new Node(data);  
		 
		  Node temp = head;
		  for(int i=0;i<pos-2;i++)
		  {
			  
			  temp = temp.next;
		  }
		  if(temp.next != null)
		  {
			  newNode.next = temp.next;
			  temp.next = newNode;
		  }
		  else
		  {
			  temp.next = newNode;
		  }
		 
	  }
	  
	  public void removeFromStart()
	  {
		  if(head == null)
			{
				return;
			}
		  else
			{
				if(head != tail)
				{
					//head points to next node
	                head = head.next;  
	               
	             }
				else
				{
					head = tail =null;
				}
			}
	  }
	  public void removeFromEnd()
	  {
		  if(head == null)
		  {  
	            System.out.println("List is empty");  
	            return;  
	      }  
          else 
          {  
	            //Checks whether the list contains only one element  
	            if(head != tail ) 
	            {  
	                Node current = head;  
	                //till the second last element such that current.next is pointing to tail  
	                while(current.next != tail) 
	                {  
	                    current = current.next;  
	                }  
	                //Second last element will become new tail of the list  
	                tail = current;  
	                tail.next = null;  
	            }  
	            //If the list contains only one element then it will remove it 
	            else
	            {  
	                head = tail = null;  
	            }  
	   	 }
     }
	 public void findMiddle()
	 {
			  Node ptr1 = head;
			  Node ptr2 = head;
			  
		
			if(head != null)
			{
				while(ptr1 !=null && ptr2.next != null)
				{
					ptr2 = ptr2.next.next;
					ptr1 = ptr1.next;
				}
				System.out.println("The middle element is " +ptr1.data);
			}
	 }
		
		public void middle1()
		{
			Node current = head;
			Node prev = null;
			int counter=0;
			while(current != null)
			{
				counter++;
				prev =current;
				current = current.next;
			}
			
			int mid = counter / 2;
			int serchMid(int m)
			{
				current = this.head;
				prev = null;
				counter =0;
				
				while(current != null)
				{
					if(counter == mid)
					{
						System.out.println(current.data);
					}
					counter++;
					prev = current;
					current = current.next;
				}
			}
		}
		
		public void removeDouplicates()
		{
			Node ptr1 = head;
			Node ptr2 = null;
			//Node dup = null;
			while(ptr1 != null && ptr1.next != null)
			{
				ptr2 = ptr1;
			while(ptr2.next != null)
			{
				
				if(ptr1.data == ptr2.next.data)
				{
					
					ptr2.next =ptr2.next.next;
					System.gc();
				}
				else
				{
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}
	}
	
	public static void main(String[] args)
	{
		SLinkedList list = new SLinkedList();
		
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		
		list.insertAtFirst(70);
		list.insertAtLast(30);
		list.printList();
		list.insertAtPosition(40,4);
		System.out.println("New node inserted at position " +pos);
		list.printList();
		
		list.insertAtPosition(30,2);
		System.out.println("New node inserted at position " +pos);
		list.printList();
		
		list.removeFromStart();
		list.printList();
		
		list.removeFromEnd();
		list.printList();
		
		list.findMiddle();
		
		list.removeDouplicates();
		list.printList();
		
		list.middle1();
		list.printList();
		
	}
}
