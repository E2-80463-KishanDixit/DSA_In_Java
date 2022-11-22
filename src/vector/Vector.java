package vector;

public class Vector<T> {
	int cs;
	int ms;
	T[] arr;
	
	public  Vector(int MAX_SIZE){
		cs=0;
		ms=MAX_SIZE;
		arr =(T[]) new Object [ms];
	}
	
	public void push_back(T d) {
		if(cs==ms) {
			T[] oldArr = arr;
			ms = 2*ms;
			arr = (T[]) new Object [ms];
			
			for(int i=0;i<cs;i++) {
				arr[i] = oldArr[i];
			}
		}
		arr[cs] = d;
		cs++;
	}
	
	void pop_back() {
		if(cs>=0) {
			cs--;
		}
	}
	
	boolean  isEmpty() {
		return cs==0;
	}
	
	T front() {
	 return	arr[0];
	}
	
	T back() {
		return arr[cs-1];
	}
	
	T at(int i) {
		return arr[i];
	}

	int size() {
		return cs;
	}
	
	int capacity() {
		return ms;
	}
	
	T get(int i) {
		return arr[i];
	}
}
