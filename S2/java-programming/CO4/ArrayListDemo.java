package CO4;

import java.util.*;

public class ArrayListDemo {
    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<String>();

        int ch;
        int pos;
        String str;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n1.Add");
            System.out.println("2.Remove by String");
            System.out.println("3.Size");
            System.out.println("4.Contains");
            System.out.println("5.Display String at Index");
            System.out.println("6.Remove by Index");
            System.out.println("7.Display List");
            System.out.println("8.Clear List");
            System.out.println("9.Exit");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            

            switch (ch) {

                case 1:
                    System.out.print("Enter the string to add: ");
                    str = sc.nextLine();
                    list.add(str);
                    System.out.println("String added.");
                    break;

                case 2:
                    System.out.print("Enter the string to remove: ");
                    str = sc.nextLine();
                    list.remove(str);
                    System.out.println("String removed if present.");
                    break;

                case 3:
                    System.out.println("Size = " + list.size());
                    break;

                case 4:
                    System.out.print("Enter the string to search: ");
                    str = sc.nextLine();

                    boolean contains = list.contains(str);

                    System.out.println(str + " present in list: " + contains);
                    break;

                case 5:
                    System.out.print("Enter the index: ");
                    pos = sc.nextInt();

                    if (pos >= 0 && pos < list.size()) {
                        System.out.println("Element = " + list.get(pos));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case 6:
                    System.out.print("Enter index to remove: ");
                    pos = sc.nextInt();

                    if (pos >= 0 && pos < list.size()) {
                        list.remove(pos);
                        System.out.println("Element removed.");
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case 7:
                    System.out.println("ArrayList = " + list);
                    break;

                case 8:
                    list.clear();
                    System.out.println("List cleared.");
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (ch != 9);

        sc.close();
    }
}