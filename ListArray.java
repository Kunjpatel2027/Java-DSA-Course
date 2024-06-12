import java.util.ArrayList;
import java.util.Collections;

public class ListArray {
    public static void swapList(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(temp, list.get(idx2));
    }

    public static void main(String[] args) {
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(2); // O(1) time complexity
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        // Sorting the above list by using Collections.sort function
        // System.out.println(list);

        // // Collections.sort(list); // this will sort the list in ascending order
        // System.out.println(list);

        // Sorting list in decending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // list.add(1, 9); // O(n) linear time complexity
        // System.out.println(list.size());
        // printing the array list using size()
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + " ");
        // }
        // Question 1 : Printing array list in reverse
        // for (int i = list.size() - 1; i >= 0; i--) {
        // System.out.print(list.get(i) + " ");
        // }

        // Question 2 Find Maximum in the list
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < list.size(); i++) {
        // // if (list.get(i) > max) {
        // // max = list.get(i);
        // // Alternate method
        // max = Math.max(max, list.get(i));
        // // System.out.println(max);
        // }
        // System.out.println("Maximum element = " + max);
        // Question 3 : Swapping 2 Numbers
        int idx1 = 1;
        int idx2 = 3;

        // // Get Operation
        // int element = list.get(2);
        // System.out.println(element);

        // Delete Operation
        // list.remove(2);
        // System.out.println(list);
        // // Set operation
        // list.set(1, 10);
        // System.out.println(list);
        // // Contains Operation
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(6));
    }

}
