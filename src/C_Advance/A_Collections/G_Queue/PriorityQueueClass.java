package C_Advance.A_Collections.G_Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {

	/*
	 * PriorityQueue Class in Java
	 */
	
	/*
	 * The PriorityQueue class provides the facility of using queue. 
	 * But it does not orders the elements in FIFO manner. It inherits AbstractQueue class.
	 * 
	 * public class PriorityQueue<E> extends AbstractQueue<E> implements Serializable 
	 * 
	 * For ex: 
	 * Priority queues help consumers consume the higher priority messages first followed by the lower priority messages.
	 */
	
	public void priorityQueue() {
		
		/*
		 * For Integer, Priority Queue is promoting high priority smallest value 
		 * and then second smallest value, so on...
		 * For String, Priority Queue is promoting high priority first letters
		 * alphabetically. 
		 */
		
		/*
		 * Priority queues with natural ordering
		 * Here is some code showing how to create a simple priority queue for strings:
		 */
		
		Queue<String> pq1 = new PriorityQueue<>();
		pq1.add("abcd");
		pq1.add("1234");
		pq1.add("23bc");
		pq1.add("zzxx");
		pq1.add("abxy");

        System.out.println("Strings Stored in Natural Ordering in a Priority Queue\n");
        while (!pq1.isEmpty()) {
            System.out.println(pq1.poll());
        }
        System.out.println("********************************************************");
        
        /*
         * What about having a custom ordering?
         * This is possible as well, and we can do it with the help of a comparator.
         * Let's create an integer priority queue now. 
         * But this time let's get the result in descending order of value.
         * In order to achieve this, first we need to create an integer comparator
         * In order to create a comparator, we implement the comparator interface and override the compare method.
         * By using o1 < o2 ? 1 : -1 we will get the result in descending order. 
         * If we had used o1 > o2 ? 1 : -1, then we would have gotten the result in ascending order
         * Now that we have the comparator, we need to add this comparator to the priority queue. 
         * We can do this like this:
         */
        Queue<Integer> pq2 = new PriorityQueue<>(new CustomIntegerComparator());
        
        pq2.add(11);
        pq2.add(5);
        pq2.add(-1);
        pq2.add(12);
        pq2.add(6);

        System.out.println("Integers stored in reverse order of priority in a Priority Queue\n");
        while (!pq2.isEmpty()) {
            System.out.println(pq2.poll());
        }
        System.out.println("********************************************************");
        
        /*
         * We can see that the comparator has done its job well. 
         * Now the priority queue is giving us the integers in descending order.
         */
        
        /*
         * Priority queue with Java object
         * Up to this point, we've seen how we can use strings and integers with priority queues.
         * In real life applications we would generally be using priority queues with custom Java objects.
         * Let's first create a class called CustomerOrder which is used to store customer order details.
         * This is a simple Java class to store customer orders. This class implements comparable interface, 
         * so that we can decide on what basis this object needs to be ordered in the priority queue.
         * The ordering is decided by the compareTo function in the above code. 
         * The line o.orderId > this.orderId ? 1 : -1 instructs that the orders 
         * should be sorted based on descending order of the orderId field
         * Below is the code which creates a priority queue for the CustomerOrder object:
         */
        CustomerOrder c1 = new CustomerOrder(1, 100.0, "customer1");
        CustomerOrder c2 = new CustomerOrder(3, 50.0, "customer3");
        CustomerOrder c3 = new CustomerOrder(2, 300.0, "customer2");

        Queue<CustomerOrder> customerOrders1 = new PriorityQueue<>();
        customerOrders1.add(c1);
        customerOrders1.add(c2);
        customerOrders1.add(c3);
        while (!customerOrders1.isEmpty()) {
        	System.out.println(customerOrders1.poll());
        }      
        System.out.println("********************************************************");
        
        /*
         * In the above code three customer orders have been created and added to the priority queue.
         * As expected, the result comes in descending order of the orderId.
         */
        
        /*
         * What if we want to prioritize based on orderAmount?
         * This is again a real life scenario. Let's say that by default the CustomerOrder 
         * object is prioritized by the orderId. But then we need a way in which we can prioritize based on orderAmount.
         * You may immediately think that we can modify the compareTo function in the CustomerOrder class to order based on orderAmount.
         * But the CustomerOrder class may be used in multiple places in the application, 
         * and it would interfere with the rest of the application if we modify the compareTo function directly.
         * The solution to this is pretty simple: we can create a new custom comparator for the CustomerOrder 
         * class and use that along with the priority queue.
         * This is very similar to the custom integer comparator we saw earlier. 
         * The line o1.getOrderAmount() < o2.getOrderAmount() ? 1 : -1; indicates 
         * that we need to prioritize based on descending order of orderAmount.
         * Below is the code which creates the priority queue:
         */
        CustomerOrder c4 = new CustomerOrder(1, 100.0, "customer1");
        CustomerOrder c5 = new CustomerOrder(3, 50.0, "customer3");
        CustomerOrder c6 = new CustomerOrder(2, 300.0, "customer2");
        Queue<CustomerOrder> customerOrders2 = new PriorityQueue<>(new CustomerOrderComparator());
        customerOrders2.add(c1);
        customerOrders2.add(c2);
        customerOrders2.add(c3);
        while (!customerOrders2.isEmpty()) {
            System.out.println(customerOrders2.poll());
        }
        System.out.println("********************************************************");
        
        /*
         * We can see that the data comes in descending order of the orderAmount.
         */
	}
	
	public class CustomerOrder implements Comparable<CustomerOrder> {
	    private int orderId;
	    private double orderAmount;
	    private String customerName;

	    public CustomerOrder(int orderId, double orderAmount, String customerName) {
	        this.orderId = orderId;
	        this.orderAmount = orderAmount;
	        this.customerName = customerName;
	    }

	    @Override
	    public int compareTo(CustomerOrder o) {
	        return o.orderId > this.orderId ? 1 : -1;
	    }

	    @Override
	    public String toString() {
	        return "orderId:" + this.orderId + ", orderAmount:" + this.orderAmount + ", customerName:" + customerName;
	    }

	    public double getOrderAmount() {
	        return orderAmount;
	    }
	}
	
	class CustomerOrderComparator implements Comparator<CustomerOrder> {
        @Override
        public int compare(CustomerOrder o1, CustomerOrder o2)
        {
            return o1.getOrderAmount() < o2.getOrderAmount() ? 1 : -1;
        }
    }
	
	class CustomIntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 < o2 ? 1 : -1;
        }
    }
}
