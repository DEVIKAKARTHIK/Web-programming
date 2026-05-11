import java.util.*;

public class LinkedHashSetDemo {

    public static void main(String args[]) {

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        Scanner sc = new Scanner(System.in);

        int ch, val;

        do {

            System.out.println("\n1.Add 2.Remove 3.Search 4.Display 5.Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter value to add: ");
                    val = sc.nextInt();
                    set.add(val);
                    System.out.println(val + " is added!");
                    break;

                case 2:
                    System.out.print("Enter value to remove: ");
                    val = sc.nextInt();
                    set.remove(val);
                    System.out.println(val + " is removed!");
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    val = sc.nextInt();

                    if (set.contains(val)) {
                        System.out.println(val + " is present in the set!");
                    } else {
                        System.out.println(val + " is not present!");
                    }
                    break;

                case 4:
                    System.out.println("Set elements are:");
                    System.out.println(set);
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
