import java.util.Scanner;

public class Strings {

    // public static void printLetters(String str) {

    // for (int i = 0; i < str.length(); i++) {
    // System.out.print(str.charAt(i) + " ");
    // }
    // }

    public static boolean checkPalindrome(String str) {
        // int n = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // System.out.println(str + " is a Palindrome");
                return false;

            }

        }
        return true;

        // System.out.println(str + " is not a Palindrome");

    }

    public static int getShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;

            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }

        }
        int X2 = x * x;
        int Y2 = y * y;
        return (int) Math.sqrt(X2 + Y2);
    }

    public static String subString(String string, int si, int ei) {
        String subString = "";
        for (int i = si; i < ei; i++) {
            subString += string.charAt(i);
        }
        return subString;
    }

    // question for converting string to upper case
    public static String toUppercase(String str) {
        // initializing the stringbuilder with an empty string
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            // here we have given second condition that i should be less than str.length -1
            // bcoz we do not want to run the loop after the end of the sentence which has
            // an empty space
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String toCompress(String compress) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < compress.length(); i++) {
            Integer count = 1;

            while (i < compress.length() - 1 && compress.charAt(i) == compress.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(compress.charAt(i));

            if (count > 1) {
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String compress = "aaabbccddd";
        System.out.println(toCompress(compress));

        String str = "hi, my name is kunj patel";
        // System.out.println(toUppercase(str));
        // char arr[] = { 'a', 'b', 'c', 'd' };

        // String[] fruits = { "apple", "banana", "mango" };
        // String largest = fruits[0];
        // for (int i = 1; i <= fruits.length; i++) {
        // if (largest.compareTo(fruits[i]) < 0) {
        // largest = fruits[i];
        // }
        // System.out.println(largest);
        // }

        // String builder

        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // sb.append(ch);
        // }
        // System.out.println(sb.length());

        // SubString
        // String string = "Hello World";
        // System.out.println(subString(string, 0, 5));

        // System.out.println(string.substring(3, 5));

        // String str = "madam";
        String path = "WNEENESENNNEWSNWWENSNWES";
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        // if (s1 == s2) {
        // System.out.println("Strings are Equal");

        // } else {
        // System.out.println("Strings are not equal");
        // }
        // if (s1 == s3) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // if (s1.equals(s3)) {
        // System.out.println("Strings are not equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }
        // System.out.println(checkPalindrome(str));
        // String str2 = new String("xyz");

        // // Strings are IMMUTABLE
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String name = "Kunj PAtel";
        // System.out.println(getShortestPath(path));

        // System.out.println(name.length());
        // printLetters(str);

        // concatanation of string
        // String firstName = " Kunj";
        // String lastName = "Patel";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName.charAt(3));

    }

}
