/**
 * Info: Double linked list Interface class to run the program and make the list
 * 2015-10-20
 * @author Similoluwa Falaye
 */
import java.util.*;
import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

 public class Interface
 {
	 private ListElement head = new ListElement();
	 private ListElement tail = new ListElement();
	 private ListElement p = new ListElement();
	 int firstitem = 0;
	 private int numNodes = 0;
	 
	 Interface()
	 {
		 p = null;
	 }
	 public void addElement(ListElement le){
		ListElement q = new ListElement();
		ListElement prevptr = new ListElement();
		p = head;
		q.setData(le.getData());
		q.setNext(null);
		prevptr = head;
		while(p != null)
		{
			prevptr = p;
			p = p.getNext();
		}
		if(numNodes == 0)
		{
			head = q;
		}
		else
		{
			prevptr.setNext(q);
			q.setPrev(prevptr);
			tail = q;
		}
		numNodes++;
	 }
	 
	 public ListElement getElement(int index){
		p = head;
		for(int i = 0; i < index; i++)
		{
			p = p.getNext();
		}
		return p;
	 }
	 
	 public ListElement deleteElement(int index){
		ListElement prevptr = new ListElement();
		p = head;
		prevptr = p;
		if(index == 0)
		{
			head = p.getNext();
			p.getNext().setPrev(null);
			numNodes--;
		}
		else
		{
			for(int i = 0; i < index; i++)
			{
				prevptr = p;
				p = p.getNext();
			}
			prevptr.setNext(p.getNext());
			p.getNext().setPrev(prevptr);
			numNodes--;
		}
		return p;
	 }
	 
	 public void printLinkedListTail(){
		p = tail;
		while(p != null)
		{
			if(p.getPrev() == null)
			{
				System.out.println(p.getData());
			}
			else
			{
				System.out.print(p.getData() + ", ");
			}
			p = p.getPrev();
		}
	 }
	 
	 public void printLinkedListHead(){
		p = head;
		while(p != null)
		{
			if(p.getNext() == null)
			{
				System.out.println(p.getData());
			}
			else
			{
				System.out.print(p.getData() + ", ");
			}
			p = p.getNext();
		}
	 }
	 
	 public int getNumNodes()
	 {
		 return numNodes;
	 }
	 
	 public int getHead()
	 {
		 return head.getData();
	 }
	 // Start main function
	 public static void main(String[] args)
	{
		ListElement le = new ListElement();
		Interface list = new Interface();
		Scanner indata = new Scanner(System.in);
		System.out.println("Welcome to my linked list creation.");
		System.out.println("a = add element");
		System.out.println("g = get element");
		System.out.println("d = delete element");
		System.out.println("ph = print list");
		System.out.println("pt = print list");
		System.out.println("q = quit");
	
		String choice = "";
		while(!(choice.equals("q")))
		{
			System.out.print("Enter a command: ");
			String t = indata.next();
			choice = t;
			int value = 0;
			if(choice.equals("a"))
			{
				System.out.print("Enter value: ");
				value = indata.nextInt();
				le.setData(value);
				list.addElement(le);
			}
			else if(choice.equals("g"))
			{
				System.out.print("Enter index to get: ");
				value = indata.nextInt();
				if(value >= list.getNumNodes())
				{
					System.out.println("Node does not exist");
				}
				else
				{
					System.out.println("The element data is " + list.getElement(value).getData());
				}
			}
			else if(choice.equals("d"))
			{
				System.out.print("Enter index to delete: ");
				value = indata.nextInt();
				if(value >= list.getNumNodes())
				{
					System.out.println("Node does not exist");
				}
				else
				{
					list.deleteElement(value);
				}
			}
			else if(choice.equals("ph"))
			{
				list.printLinkedListHead();
			}
			else if(choice.equals("pt"))
			{
				list.printLinkedListTail();
			}
			else if(!(choice.equals("q")))
			{
				System.out.println("Wrong command. Try again");
			}
		}
	}
 }