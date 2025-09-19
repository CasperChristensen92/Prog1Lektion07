package opgave05;

public class Opgave05 {
    public static void main(String[] args){
        int[] integers = {2,2,2,4,5,6,};
        int numbersInRow = 3;
        System.out.println(hasNumbersInARow(integers,numbersInRow));
    }

    public static boolean hasNumbersInARow(int[] integers, int numbersInRow){
        int counter = 1;
        boolean isTrue = false;
        for (int i = 1; i < integers.length; i++) {
            if (integers[i-1]==integers[i]){
                counter += 1;
                if (counter >=numbersInRow){
                    isTrue = true;
                    break;
                }
            }
            else counter = 1;
        }
        return isTrue;
    }
}
