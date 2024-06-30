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
        list.add("Sam");
        list.add("Jolo");
        list.add("Edgar");
        list.add("Lei");
        
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void demonstrateTreeSet() {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Chloe");
        set.add("Kuki");
        set.add("Waki");
        set.add("Eli");
        
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void demonstrateArrayDeque() {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Awit");
        deque.add("Jaybee");
        deque.add("Sucal");
        
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
