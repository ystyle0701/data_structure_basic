package queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
	private List<Integer> data;
	private int p_start;
	
	public MyQueue() {
		data = new ArrayList<Integer>();
		p_start = 0;
	}
	
	//キューに追加する
	public boolean enQueue(int x) {
		data.add(x);
		return true;
	}
	
	//
	public boolean deQueue() {
		if(isEmpty() == true) {
			return false;
		}
		p_start++;
		return true;
	}
	
	//先頭を取り出す
	public int front() {
		return data.get(p_start);
	}
	
	//空かどうか
	public boolean isEmpty() {
		return p_start >= data.size();
	}
	
	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.enQueue(5);
		q.enQueue(3);
		if(q.isEmpty() == false) {
			System.out.println(q.front());
		}
		
		q.deQueue();
		if(q.isEmpty() == false) {
			System.out.println(q.front());
		}
		
		q.deQueue();
		if(q.isEmpty() == false) {
			System.out.println(q.front());
		}
	}
}
