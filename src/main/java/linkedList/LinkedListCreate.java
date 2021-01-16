package linkedList;

public class LinkedListCreate 
{
	Node head=null;
	// static class so that main can access it
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static LinkedListCreate insert(LinkedListCreate ls,int data)
	{
		Node newNode=new Node(data);
		if(ls.head==null)
		{
			//if head is null then assign new node to head
			ls.head=newNode;
			return ls;
		}
		else 
		{//traverse and insert to end;
			newNode.next=null;
			Node last=ls.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return ls;
	}
	public static  void printList(LinkedListCreate ls)
	{
		Node currNode=ls.head;
		
		while(currNode!=null)
		{
			System.out.println(currNode.data);
			currNode=currNode.next;
		}
	}
	public static  void deleteKey(LinkedListCreate ls,int key)
	{
		Node currNode=ls.head,temp=null;
		
		if (ls.head.data==key)
		{
			ls.head=currNode.next;
			return;
		}
		while(currNode!=null && currNode.data!=key)
		{
			currNode=currNode.next;
			if(currNode.data==key)
			{
				temp=currNode;
				currNode=currNode.next;
				
			}
		}
		if(currNode==null)
			return;
		
		temp.next=currNode.next;
	}
	public static  int length(LinkedListCreate ls)
	{
		Node currNode=ls.head,temp=null;
		int counter=0;
		while(currNode!=null)
		{
			currNode=currNode.next;
			counter++;
		}
		return counter;
	}
	public static  int findNode(LinkedListCreate ls,int value)
	{
		Node currNode=ls.head,temp=null;

int counter=0;
		while(currNode!=null && currNode.data!=value)
		{
			currNode=currNode.next;
			counter++;
		}
		return counter+1;
	}
	public static  int findMiddle(LinkedListCreate ls)
	{
		Node currNode=ls.head;
		
		int counter=0;
		while(currNode!=null)
		{
			currNode=currNode.next;
			currNode=currNode.next.next;
			counter++;
		}
		return counter+1;
	}
	public static void main(String...s)
	{
		LinkedListCreate ls=new  LinkedListCreate();
		ls.insert(ls,5);
		ls.insert(ls,10);
		ls.insert(ls,15);
		ls.insert(ls,52);
		ls.insert(ls,51);
		
		ls.deleteKey(ls, 5);
		ls.printList(ls);
		System.out.println(ls.length(ls));
		System.out.println(ls.findNode(ls,52));
		
	}
}