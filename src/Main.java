

public class Main {

        public static void main(String[] args) {
            Exercise_1.main(args);
            Exercise_2.main(args);
            Exercise_3.main(args);
            Exercise_4.main(args);

        }
}

class Exercise_1 {
    public static void main(String[] args) {
        double radius = 5.0;
        double area = calculateCircleArea(radius);
        System.out.println("Площа кола з радіусом " + radius + " дорівнює: " + area);
    }
    public static double calculateCircleArea(double radius) {

        return Math.PI * radius * radius;
    }
}


 class Exercise_2 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        int min = findMinimum(number1, number2, number3);
        System.out.println("Найменше число: " + min);
    }
    public static int findMinimum(int a, int b, int c) {
        int min1 = a;
        if (b < min1) {
            min1 = b;
        }
        if (c < min1) {
            min1 = c;
        }
        return min1;
    }
}


 class Exercise_3 {
    public static void main(String[] args) {
        int[] a = {1,4,11,21,-2,32,43,3,34,56,23,41,5};
        printArray(a);
    }
    public static void printArray(int[] array) {
        System.out.print("Елементи масиву: {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}


 class Exercise_4 {
    public static void main(String[] args) {
        int[] a = {1,4,11,21,2,32,43,3,34,56,23,41,5};
        int max = findMaxNumber(a);
        System.out.println("Найбільше число в масиві: " + max);
    }
    public static int findMaxNumber(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int max1 = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max1) {
                max1 = array[i];
            }
        }
        return max1;
    }
}
