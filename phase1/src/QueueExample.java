import java.util.*;
public class QueueExample {

	
		private static Queue<String> LinkedList() {
		Queue<String> locationsQueue =  (Queue<String>)LinkedList();
		
		
		locationsQueue.add("Kolkata");
		
		        		locationsQueue.add("Patna");
		        		
		        		locationsQueue.add("Delhi");
		        		
		        		locationsQueue.add("Gurgaon");
		        		
		        		locationsQueue.add("Noida");
		        		
		System.out.println("Queue is : " + locationsQueue);
		
		        		System.out.println("Head of Queue : " + locationsQueue.peek());
		        		
		        		locationsQueue.remove();
		        		
		        		System.out.println("After removing Head of Queue : " + locationsQueue);
		        		
		        		System.out.println("Size of Queue : " + locationsQueue.size());
		        		return locationsQueue;
		        		
	}

}
