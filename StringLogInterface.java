
public interface StringLogInterface {
//interface implements a log of strings
	//log remembers the elements 
	//log must have a name
	void insert (String element);
	//precondition: stringlog is not full
	//places element into stringlog
	
	boolean delete(String element);
	//delete one instance of element from the string log
	//returns true if element is deleted, otherwise returns false
	
	boolean isFull();
	//returns true if stringlog full, otherwise returns false
	
	int size();
	//returns number of strings in stringlog
	
	boolean contains(String element);
	//returns true if element is in stringlog
	//otherwise returns false
	//ignores case when comparing
	
	void clear();
	//makes stringlog empty
	
	String getName();
	//returns name of stringlog
	
	String toString();
	//returns a formatted string representing stringlog

	
	
}
