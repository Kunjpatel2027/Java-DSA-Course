public class BitManipulation {

    public static void isOddorEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even number
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is an odd number");
        }
    }

    public static int getIthBit(int n, int i) {
        if ((n & (1 << i)) == 0) {
            return 0;

        }
        return 1;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;

    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
        // n = clearIthBit(n, i);
        // int bitMask = newBit << i;
        // return n | bitMask;
    }

    public static int clearIbits(int n, int i) {
        int bitMask = ((-1) << i);
        return n & bitMask;
    }

    public static int clearRangeofBits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = (a | b);
        return n & bitMask;

    }

    public static boolean checkTwosPowerorNot(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;

            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        // isOddorEven(101);
        System.out.println(countSetBits(12));
    }
}
