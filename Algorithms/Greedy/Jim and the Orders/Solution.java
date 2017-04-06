import java.util.*;

/**
 * https://www.hackerrank.com/challenges/jim-and-the-orders
 *
 * @author Darpan Dodiya
 */
public class Solution {

    static class Order {

        Integer orderId;
        Integer totalTime;

        public Order(int orderId, int totalTime) {
            this.orderId = orderId;
            this.totalTime = totalTime;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Order> ordersList = new ArrayList();

        for (int i = 0; i < n; i++) {
            ordersList.add(new Order(i, in.nextInt() + in.nextInt()));
        }

        Collections.sort(ordersList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return (o1.totalTime).compareTo(o2.totalTime);
            }
        });
        
        for(Order order : ordersList) {
            System.out.print((order.orderId+1) + " ");
        }
    }

}
