package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T[] objects;
	
	public ArrayList() {
		objects = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return null;
	}
	
	public void add(T val) {
		T[] newArray = (T[])new Object[objects.length+1];
		newArray[newArray.length-1]=val;
		objects=newArray;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newArray = (T[])new Object[objects.length+1];
		newArray[loc]=val;
		objects=newArray;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}