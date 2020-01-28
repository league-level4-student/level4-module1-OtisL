package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T[] objects;
	
	public ArrayList() {
		objects = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return objects[loc];
	}
	
	public void add(T val) {
		T[] newArray = (T[])new Object[objects.length+1];
		for(int i=0; i<objects.length; i++) {
			newArray[i]=objects[i];
		}
		newArray[newArray.length-1]=val;
		objects=newArray;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newArray = (T[])new Object[objects.length+1];
		for(int i=0; i<objects.length+1; i++) {
			if(i==loc) {
				newArray[i]=val;
			}else if(i<loc){
				newArray[i]=objects[i];
			}else {
				newArray[i]=objects[i-1];
			}
		}
		objects=newArray;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		objects[loc]=val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] newArray = (T[])new Object[objects.length-1];
		for(int i=0; i<objects.length; i++) {
			if(i!=loc) {
				if(i<loc){
					newArray[i]=objects[i];
				}else {
					newArray[i-1]=objects[i];
				}
			}
		}
		objects=newArray;
	}
	
	public boolean contains(T val) {
		for(int i=0; i<objects.length; i++) {
			if(objects[i]==val) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		return objects.length;
	}
}