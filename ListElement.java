/**
 * Info:
 * 2015-10-20
 * @author Similoluwa Falaye
 */
 import java.util.*;
  
 public class ListElement {
	 private ListElement next;
	 private ListElement previous;
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
 }