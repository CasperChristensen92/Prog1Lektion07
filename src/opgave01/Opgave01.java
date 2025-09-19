package opgave01;

public class Opgave01 {
    public static void main(String[] args) {
        int[] integerArray = getIntegerArray();
        System.out.println(crossSum(9));
        System.out.println(crossSum(123));
        System.out.println("The numbers in the array of integers is: ");
        printNumbers(integerArray);
        System.out.println("The sum of the numbers in the array of integers is: ");
        System.out.print(sumNumber(integerArray));
        System.out.println(" ");
        System.out.println("The array of the crossSums in an array");
        printNumbers(crossSums(integerArray));
        System.out.println("The array of how many times the 10 possible single digit crosssum appears in an array");
        printNumbers(crossSumNumbers(integerArray));
    }

    public static int crossSum(int number) {
        int crossSum = 0;
        while (number > 9) {
            crossSum += number % 10;
            number = number / 10;
        }
        return crossSum + number;
    }

    private static int[] getIntegerArray() {
        int[] integerArray = {1095, 12, 9065, 387, 700, 20, 5, 2065, 97654, 103, 789, 50, 1972, 200, 35, 98, 1002};
        return integerArray;
    }

    // opgave a
    public static void printNumbers(int[] integerArray) {
        for (int number : integerArray) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }

    //opgave b
    public static int sumNumber(int[] integerArray) {
        int sum = 0;
        for (int number : integerArray) {
            sum = sum + number;
        }
        return sum;
    }
    //opgave c
    public static double averageNumber(int[] integerArray) {
        System.out.println("The average of the numbers in the array of integers is: ");
        int sum = sumNumber(integerArray);
        double average = sum / integerArray.length;
        return average;
    }

    //opgave d
    public static int[] crossSums(int[] integerArray) {
        int[] crossSumArray = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            crossSumArray[i] = crossSum(integerArray[i]);
        }
        return crossSumArray;
    }
    //opgave e
    public static int[] crossSumNumbers(int[] integerArray){
        int[] crossSumNumbers = new int[10];
        for (int i = 0; i < integerArray.length; i++) {
            int x = integerArray[i];
            while (x != crossSum(x)){
                x = crossSum(x);
            }
            crossSumNumbers[x] +=1;
        }
        return crossSumNumbers;
    }
}
