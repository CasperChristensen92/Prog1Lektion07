package opgave02;

public class Opgave02 {
    public static void main(String[] args) {
        char[] characterArray = getCharacterArray();
        System.out.println("amount of each vowel in an array, a, e, i, o, u, y, æ, ø, å");
        opgave01.Opgave01.printNumbers(amountOfEachVowel(characterArray));
        System.out.println("The array of chars printed in leetspeak");
        System.out.println(leetspeakConverter(characterArray));
    }

    private static char[] getCharacterArray() {
        return ("Der var så dejligt ude på landet; det var sommer, kornet stod gult, havren grøn, " +
                "høet var rejst i stakke nede i de grønne enge, og der gik storken på sine lange, " +
                "røde ben og snakkede ægyptisk, for det sprog havde han lært af sin moder. Rundt om" +
                " ager og eng var der store skove, og midt i skovene dybe søer; jo, der var rigtignok " +
                "dejligt derude på landet! Midt i solskinnet lå der en gammel herregård med dybe kanaler" +
                " rundt om, og fra muren og ned til vandet voksede store skræppeblade, der var så høje," +
                " at små børn kunne stå oprejste under de største; der var lige så vildsomt derinde, som " +
                "i den tykkeste skov, og her lå en and på sin rede; hun skulle ruge sine små ællinger ud, " +
                "men nu var hun næsten ked af det, fordi det varede så længe, og hun sjælden fik visit;" +
                " de andre ænder holdt mere af at svømme om i kanalerne, end at løbe op og sidde under " +
                "et skræppeblad for at snadre med hende." +
                "Endelig knagede det ene æg efter det andet: pip! pip! sagde det, alle æggeblommerne " +
                "var blevet levende og stak hovedet ud." +
                "Rap! rap! sagde hun, og så rappede de sig alt hvad de kunne, og så til alle sider " +
                "under de grønne blade, og moderen lod dem se så meget de ville, for det grønne er godt for " +
                "øjnene. Hvor dog verden er stor! sagde alle ungerne; thi de havde nu rigtignok ganske " +
                "anderledes plads, end da de lå inde i ægget. Tror I, det er hele verden! sagde moderen, " +
                "den strækker sig langt på den anden side haven, lige ind i præstens mark! " +
                "men der har jeg aldrig været! – I er her dog vel alle sammen! – og så rejste hun sig" +
                " op, nej, jeg har ikke alle! det største æg ligger der endnu; hvor længe skal det vare! nu er " +
                "jeg snart ked af det! og så lagde hun sig igen.").toCharArray();
    }

    //a
    public static int[] amountOfEachVowel(char[] characterArray) {
        int[] counters = new int[9];
        char[] largeVowels = {'A', 'E', 'I', 'O', 'U', 'Y', 'Æ', 'Ø', 'Å'};
        char[] smallVowels = {'a', 'e', 'i', 'o', 'u', 'y', 'æ', 'ø', 'å'};
        for (char a : characterArray) {
            for (int i = 0; i < smallVowels.length; i++) {
                if (a == smallVowels[i] | a == largeVowels[i]) {
                    counters[i] += 1;
                    break;
                }
            }
        }
        return counters;
    }
    public static char[] leetspeakConverter(char[] characterArray){
        char[] changedChars = {'A','B','C','E','I','J','O','S','T','Z','a','b','g','l','s','t'};
        char[] leetChars = {'4','8','[','3','|',']','0','$','7','2','@','6','9','1','5','+'};
        for (int i = 0; i < characterArray.length; i++) {
            for (int j = 0; j < changedChars.length; j++) {
                if (characterArray[i]==changedChars[j]){
                    characterArray[i] = leetChars[j];
                    break;
                }
            }
        }
        return characterArray;
    }
}
