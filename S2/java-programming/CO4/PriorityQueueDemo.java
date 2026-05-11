
import java.util.*;

public class PriorityQueueDemo {

    public static void main(String args[]) {

        PriorityQueue<Integer> q = new PriorityQueue<Integer>();

        Scanner sc = new Scanner(System.in);

        int ch, val;

        do {

            System.out.println("\n1.Add 2.Remove 3.Peek 4.Display 5.Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter value to add: ");
                    val = sc.nextInt();
                    q.add(val);
                    System.out.println(val + " is added!");
                    break;

                case 2:
                    q.remove();
                    break;

                case 3:
                    if (q.isEmpty()) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.println("Front element is: " + q.peek());
                    }
                    break;

                case 4:
                    System.out.println("Queue elements are:");
                    System.out.println(q);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (ch != 5);

        sc.close();
    }
}
