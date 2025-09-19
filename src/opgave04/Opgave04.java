package opgave04;

import java.util.Scanner;

public class Opgave04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("Cheack if word is a palidrom: ");
        System.out.println(palidromString(word));
    }

    public static boolean palidromString (String word){
        char[] charArray = word.toCharArray();
        boolean isPalidrom = true;
        for (int i = 0; i < charArray.length/2; i++) {
            if (charArray[i]!=charArray[charArray.length-(i+1)]){
                isPalidrom = false;
                break;
            }
        }
        return isPalidrom;
    }
}
