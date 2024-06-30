import java.util.*;

public class TestJavaCollections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a collection to demonstrate:");
        System.out.println("1. ArrayList");
        System.out.println("2. TreeSet");
        System.out.println("3. ArrayDeque");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                demonstrateArrayList();
                break;
            case 2:
                demonstrateTreeSet();
                break;
            case 3:
                demonstrateArrayDeque();
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }

        scanner.close();
    }

    public static void demonstrateArrayList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void demonstrateTreeSet() {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void demonstrateArrayDeque() {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
