/**
 * Info: A list element node for a double linked list
 * 2015-10-20
 * @author Similoluwa Falaye
 */
 import java.util.*;
  
 public class ListElement {
	 private ListElement next; // = new ListElement();
	 private ListElement previous; // = new ListElement();
	 private int data;
	 
	 public ListElement()
	 {
		this.data = 0;
		this.next = null;
		this.previous = null;
	 }
	 
	 public void setData(int data){
		this.data = data;
	 }
	 
	 public int getData(){
		return this.data;
	 }
	 
	 public void setNext(ListElement next){
		this.next = next;
	 }
	 
	 public ListElement getNext(){
		return this.next;
	 }
	 
	 public void setPrev(ListElement prev){
		this.previous = prev;
	 }
	 
	 public ListElement getPrev(){
		return this.previous;
	 }
 }