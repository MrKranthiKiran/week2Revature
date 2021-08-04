package tuesdayTask3;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority {
	
	public static void main(String[] args) {
	
		Queue<Integer> pq1 = new PriorityQueue<>();
		
		pq1.add(1);
		pq1.add(50);
		pq1.add(40);
		pq1.add(30);
		pq1.add(20);
		pq1.add(10);
		
		System.out.println("PQ1 : "+pq1); //Priority Queue sorts for itself
		
		Queue<String> pq2 = new PriorityQueue<>();
		
		pq2.add("Abcd");
		pq2.add("Kranthi");
		pq2.add("Kiran");
		pq2.add("abcd");
		pq2.add("aBcd");
		pq2.add("Stranger things");
		pq2.add("Abcd");
		pq2.add(" Breaking Bad");
		pq2.add("Dhoni");
		pq2.add("Dexter");
		
		
		System.out.println("PQ2 : "+pq2);
		
		
}
}
