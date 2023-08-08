package algo01;

import java.util.Random;

public class LoopArray {

    public static final int ARRAY_SIZE = 100;

    public int[] arrayCreate(int arraySize) {
        int[] newArray = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(ARRAY_SIZE);
        }

        return newArray;
    }

    public int getMin(int[] array) {
        int min = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    public int getMax(int[] array) {
        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        LoopArray la = new LoopArray();

        int[] newArray = la.arrayCreate(ARRAY_SIZE);

        System.out.print("Array: [");
        for (int num : newArray) {
            System.out.print(num + "/");
        }
        System.out.println("]");

        int min = la.getMin(newArray);
        int max = la.getMax(newArray);

        System.out.println("Min: " + min + " // Max: " + max);
    }
}
