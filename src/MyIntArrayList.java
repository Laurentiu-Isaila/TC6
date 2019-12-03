import java.util.Arrays;
public class MyIntArrayList {
	
	private int[] elements;
	  private int size;
	 
	  public MyIntArrayList() {
	    this(10);
	  }
	 
	  public MyIntArrayList(int initialCapacity) {
	    this.elements = new int[initialCapacity];
	  }
	  
	  public boolean add(int e) {
		    if (this.size == this.elements.length) {
		      this.elements = Arrays.copyOf(this.elements, this.size * 2);
		    }
		 
		    this.elements[size] = e;
		    this.size++;
		 
		    return true;
		  }
	  
	  public int size() {
		    return this.size;
		  }
		 
	  public int indexOf(int e) {
		    for (int i=0; i<this.size; i++) {
		      if (this.elements[i] == e) {
		        return i;
		      }
		    }
		    return -1;
		  }
		  
	  public int removeElementAtIndex(int index) {
			    if (index < 0 || index >= this.size) {			     
			      System.out.println("Throwing IndexOutOfBoundsException when trying to" +
			                         " remove element at position " + index);
			      return -1;
			    }
			 
			    int removedElement = this.elements[index];
			    for (int i=index; i<this.size; i++) {
			      this.elements[i] = this.elements[i+1];
			    }
			    this.size--;
			 
			    return removedElement;
			  }
		  
	  public void clear() {
			    this.size = 0;
			  }
			 
	  public int set(int index, int e) {
			    if (index < 0 || index >= this.size) {			      
			      System.out.println("Throwing IndexOutOfBoundsException when trying to set" +
			                         " the element " + e + " at position " + index);
			      return -1;
			    }
			 
			    int replacedElement = this.elements[index];
			    this.elements[index] = e;
			    return replacedElement;
			  }
	  
	  public void add(int index, int element) {
		  if (index < 0 || index >= this.size) {			      
		      System.out.println("Throwing IndexOutOfBoundsException when trying to set" +
		                         " the element " + element + " at position " + index);
		      
		  } else {
			  this.add(element);
			  for(int i = this.size - 1; i > index; i--) {
				  int temp = this.elements[i - 1];
				  this.elements[i - 1] = this.elements[i];
				  this.elements[i] = temp;
		  
			  }
		  }
		  
	  }
	  
	  public int get(int index) {
		  int elem = this.elements[index];
		  return elem;
	  }
	  
	  public boolean contains(int e) {
		  for(int i = 0; i < this.size; i++) {
			  if(this.elements[i] == e) {
				  return true;
			  }
		  }
		  return false;
	  }
	  
	  public boolean removeElement(int element) {		    
		    for (int i=0; i <= this.size; i++) {
		    	if(this.elements[i] == element) {	    	
		           this.removeElementAtIndex(i);		           
		    	}		    	
		    }
		    return true;		   
		  }
	  
	  public int lastIndex(int e) {		  
		  for(int i = this.size(); i >= 0; i--) {
			  if(this.elements[i] == e) {
				  return i;
			  }
		  }
		  return -1;
	  }
	   public void ensureCapacity(int minCap) {
		   this.size = minCap;
	   }
	   
	   boolean addAll(MyIntArrayList c) {
		   for(int i = 0; i < c.size(); i++) {
			   this.add(c.get(i));			   
		   }
		   return true;
	   }
	   
	   public int[] toArray() {
		   return this.elements;
	   }
	   
	   
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
