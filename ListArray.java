import java.util.ArrayList;

public class ListArray {
    public static void swapList(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(temp, list.get(idx2));
    }

    // Brute force for Pair sum Question
    // public static boolean pairSum1(ArrayList<Integer> list, int target) {
    // // int sum = 0;
    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i + 1; j < list.size(); j++) {

    // if (list.get(i) + list.get(j) == target) {
    // return true;
    // }
    // }

    // }
    // return false;
    // }
    // 2 Pointer Approach for Pair Sum Question
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {

            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }

            // case 3
            else {
                rp--;
            }

        }

        return false;
    }

    // Pair 2 sum : Sorted and Rotated Array
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        // breaking point of the array
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            // case 1
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;
        int rp = bp;
        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % list.size();
            }

            // case 3
            else {
                rp = (list.size() + rp - 1) % list.size();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // question 2 : Pair Sum : 1
        // question 3 : Pair sum :2

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 60;
        System.out.println(pairSum2(list, target));

        // 2D ArrayList
        // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        // // list 1
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(1);
        // arr.add(2);
        // mainlist.add(arr);
        // // List 2
        // ArrayList<Integer> arr2 = new ArrayList<>();
        // arr2.add(3);
        // arr2.add(4);
        // mainlist.add(arr2);

        // for (int i = 0; i < mainlist.size(); i++) {
        // ArrayList<Integer> currList = mainlist.get(i);
        // for (int j = 0; j < currList.size(); j++) {
        // System.out.print(currList.get(j) + " ");
        // }
        // System.out.println();
        // }

        // System.out.println(mainlist);

        // Question for 2D Array List
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // ClassName objectName = new ClassName();
        // ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // for (int i = 1; i <= 5; i++) {
        // list.add(i * 1);
        // list2.add(i * 2);
        // list3.add(i * 3);
        // }

        // mainList.add(list);
        // mainList.add(list2);
        // mainList.add(list3);
        // System.out.println(mainList);

        // // nested loop
        // for (int i = 0; i < mainList.size(); i++) {
        // ArrayList<Integer> currList = mainList.get(i);
        // for (int j = 0; j < currList.size(); j++) {
        // System.out.print(currList.get(j) + " ");
        // }
        // System.out.println();
        // }

        // Sorting the above list by using Collections.sort function
        // System.out.println(list);

        // // Collections.sort(list); // this will sort the list in ascending order
        // System.out.println(list);

        // Sorting list in decending order
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);

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
        // int idx1 = 1;
        // int idx2 = 3;

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
