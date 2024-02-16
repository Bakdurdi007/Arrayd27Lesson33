import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Gaming {
    public static void main(String[] args) {

        String[] words = new String[]{"generation", "expenses", "address", "answer", "production"};

        String[] changWords = new String[words.length];

        LinkedHashSet<Integer> index = new LinkedHashSet<>();

        Random random = new Random();

        for (int i = 0; i < words.length; i++) {
            String Str = "";
            String w = words[i];
            for (int j = 0; j < words[i].length(); j++) {
                while (index.size() < words[i].length()) {
                    int number = random.nextInt(words[i].length());
                    index.add(number);
                }
            }

            for (Integer x : index){
                Str = Str + w.charAt(x);
            }

            changWords[i] = Str;
            index.clear();
        }

        Scanner scanner = new Scanner(System.in);

        int n = random.nextInt(words.length);

        System.out.println(" Kampyuter tomonidan tanlangan so'z to'g'ri xolatga o'tkazing ");

        String soz = changWords[n];

        for (int i = 0; i < soz.length(); i++) {
            System.out.print("\t " + soz.charAt(i));
        }

       while (true){
           System.out.print("\n >>> ");
           String str2 = scanner.nextLine();

           if(str2.equals(words[n])){
               System.out.println(" Siz so'zni topdingiz! ");
               return;
           }else {
               System.out.println(" Siz so'zni topa olmadingiz! ");
           }
       }

    }
}
