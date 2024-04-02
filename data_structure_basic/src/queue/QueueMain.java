package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
	public static void main(String[] args) {
		//キューの初期化
		Queue<Integer> q = new LinkedList<Integer>();
		
		//先頭の要素を表示する
		System.out.println("先頭の要素：" + q.peek());
		
		//順番に入れる
		q.offer(5);
		q.offer(13);
		q.offer(8);
		q.offer(6);
		
		//削除する
		q.poll();
		
		//先頭の要素を表示する
		System.out.println("先頭の要素：" + q.peek());
		
		//キューのサイズ
		System.out.println("サイズ：" + q.size());
	}

}
