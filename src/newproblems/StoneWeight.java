package newproblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class StoneWeight {
	
	public static int remainingStone(int[] arr) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(Integer stone:arr) {
			pq.add(stone);
		}
		while(pq.size()>1) {
			pq.add(pq.poll()-pq.poll());
		}
		return pq.poll();
	}

	public static void main(String[] args) {
		int[] intArr= {1,4,6,7,3,1,4,8};
		System.out.println(remainingStone(intArr));

	}

}
