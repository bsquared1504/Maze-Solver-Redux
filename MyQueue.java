import java.util.LinkedList;

public class MyQueue<T> implements Frontier<T>{
	private LinkedList<T> queue;

	public MyQueue(){
		queue = new LinkedList<T>();
	}

	public void add(T newItem){
		queue.addLast(newItem);
	}

	public T remove(){
		T result = queue.removeFirst();
		return result;
	}

	public int size(){
		return queue.size();
	}

	public boolean contains(T newItem){
		return false;
	}
}
