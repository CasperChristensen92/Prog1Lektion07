package opgave06;

public class Opgave06 {
    public static void main(String[] args) {
        char[] romanNumber = {'M', 'L', 'X', 'I'}; //1061
        System.out.println(romanNumberToArabicNumber(romanNumber));
    }

    private static int romanNumberToArabicNumber(char[] romanNumber) {
        //Din implementering her.
        int x0 = singleRomanNumberToArabicNumber(romanNumber[0]);
        int x1 = 0;
        if (romanNumber.length >1) x1 = singleRomanNumberToArabicNumber(romanNumber[1]);
        int x2 = 0;
        if (romanNumber.length >2) x2 = singleRomanNumberToArabicNumber(romanNumber[2]);
        int arabicNumber = 0;
        for (int i = 0; i < romanNumber.length - 2; i++) {
            x0 = singleRomanNumberToArabicNumber(romanNumber[i]);
            x1 = singleRomanNumberToArabicNumber(romanNumber[i + 1]);
            x2 = singleRomanNumberToArabicNumber(romanNumber[i + 2]);
            if (x0 < x1| x0 < x2)
                arabicNumber = arabicNumber - singleRomanNumberToArabicNumber(romanNumber[i]);
            else arabicNumber = arabicNumber + singleRomanNumberToArabicNumber(romanNumber[i]);
        }
        if (x1<x2){
            arabicNumber = arabicNumber - x1;
        }
        else arabicNumber = arabicNumber + x1;
        arabicNumber = arabicNumber + x2;


        return arabicNumber;
    }

    private static int singleRomanNumberToArabicNumber(char roman) {
        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException(roman + " is not a valid roman number literal.");
        };
    }
}
