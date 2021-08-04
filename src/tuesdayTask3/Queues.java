package tuesdayTask3;


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import sun.security.provider.NativePRNG.NonBlocking;


//3)Work on Queue interface, do research and get the difference between LinkedList and PriorityQueue with code example
public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Queue q1 = new LinkedList<>();
         
         q1.add(123);
         q1.add("abcd");
         q1.add(null);
         q1.add(2222222);
         
         System.out.println(q1);
         
         q1.poll(); // Removes the head
         
         System.out.println(q1);
         
         
         Queue<Integer> q2 = new LinkedList<>();
         
         q2.add(21);
         q2.add(39);
         q2.add(15);
         q2.add(16);
         q2.add(45);
         q2.add(46);
         q2.add(44);
         
         
         
       
         System.out.println("at first q2 : "+q2);
         System.out.println(q2.peek());// Prints Head
        
         q2.remove(); //Removes head
         
        
         
         System.out.println("After remove: " +q2);
         
         System.out.println("Size of q2 is : " +q2.size());
         
         System.out.println(q2.element());
         
         
       //  BlockingQueue<Integer> bq = new LinkedBlockingQueue<>(20);
         BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(20);
         bq.add(21);
         bq.add(39);
         bq.add(15);
         bq.add(16);
         bq.add(45);
         bq.add(46);
         bq.add(44);
         
         System.out.println(bq.remainingCapacity());
         
         
       
         System.out.println("at first bq : "+bq);
         System.out.println(bq.peek());// Prints Head
         
         
      
	}

}
