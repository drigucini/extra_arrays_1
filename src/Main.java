import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static int[] generateRandomArray( int min, int max, int size) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[size];
        int diff = max - min;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(diff + 1);
            arr[i] += min;
        }
        return arr;
    }

    public static int calculateAverage(int[] arr) {
        int sum = 0;
        for (int index: arr ) {
             sum += index;
        }
        return sum/arr.length;
    }
    public static void task1 () {
        System.out.println("\nTask 1");

        int[] arr = generateRandomArray(0, 99, 15);
        System.out.println(Arrays.toString(arr));

            int evenQuantity = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                evenQuantity++;
            }
        }
        System.out.println("The number of the even elements in the array is " + evenQuantity);
    }

    public static void task2 () {
        System.out.println("\nTask 2");
        int[] arr = generateRandomArray(1, 10, 8);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i%2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println("New array is " + Arrays.toString(arr));
    }

    public static void task3 () {
        System.out.println("\nTask 3");
        int[] arr1 = generateRandomArray(0, 5, 5);
        int[] arr2 = generateRandomArray(0, 5, 5);
        int average1 = calculateAverage(arr1);
        int average2 = calculateAverage(arr2);
        if (average1 > average2) {
            System.out.println("The average of the first array (" + average1 + ") is bigger than that of the second (" + average2 + ")");
        } else if (average1 == average2) {
            System.out.println("The average of the first array (" + average1 + ") is equal to the average of the second (" + average2 + ")");
        } else {
            System.out.println("The average of the first array (" + average1 + ") is smaller than the average of the second (" + average2 + ")");

        }
    }

    public static void task4 () {
        System.out.println("\nTask 4");
        int[] arr = generateRandomArray(10, 99, 4);
        System.out.println(Arrays.toString(arr));
        /* if (arr[3] > arr[2] && arr[2] > arr[1] && arr[1] > arr[0]) {
            System.out.println("Each following index of the array is bigger than the previous one");
        } else {
            System.out.println("Each following index of the array is not necessarily bigger than the previous one");
        }*/

        boolean sequantial = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i + 1]) {
                sequantial = false;
                break;
            }
        }
        if (sequantial) {
            System.out.println("Each following index of the array is bigger than the previous one");
        } else {
            System.out.println("Each following index of the array is not necessarily bigger than the previous one");
        }

    }

    public static void task5 () {
        System.out.println("\nTask 5");
        int[] fibonacci = new int[20];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println(Arrays.toString(fibonacci));
    }

    public static void task6 () {
        System.out.println("\nTask 6");
        int[] arr1 = new int[10];
        for (int i = 1; i < arr1.length + 1; i++) {
            arr1[i-1] = i*i;
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[10];
        for (int i = 1; i < arr2.length + 1; i++) {
            if (i % 2 != 0) {
                arr2[i - 1] = i * i;
            } else {
                arr2[i - 1] = -i * i;
            }
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[10];
        for (int i = 1; i < arr3.length + 1; i++) {
            if (i % 2 != 0) {
                arr3[i - 1] = 1;
            } else {
                arr3[i - 1] = -1;
            }
        }
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = new int[10];
        int number = 0;
        for (int i = 1; i < arr4.length + 1; i++) {
            if (i % 2 != 0) {
                number++;
                arr4[i - 1] = number;
            } else {
                arr4[i - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(arr4));
    }
}