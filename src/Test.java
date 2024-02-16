import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        Integer[] toshbaqa = new Integer[] { 6,   2,   9,   1,   5,   8,   7,   6,   3};
        //                                  [0]  [1]  [2]  [3]  [4]  [5]  [6]  [7]  [8]
        //
        // O'sish tartibida:                1,    2,   3,   5,   6,   6,   7,   8,   9
        // Kamayuvchi tartibida:            9,    8,   7,   6,   6,   5,   3,   2,   1

        System.out.println(" Tartiblanmagan array elementlari: ");
        for (int x : toshbaqa){
            System.out.print(" " + x);
        }


        // Array elementlarini o'suvchi tartibda tartiblash.
        Arrays.sort(toshbaqa);


        System.out.println("\n\n O'suvchi tartibda tartiblanga array elementlari: ");
        for (int x : toshbaqa){
            System.out.print(" " + x);
        }


        // Array elementlarini kamayuvchi tartibda tartiblash.
        Arrays.sort(toshbaqa, Collections.reverseOrder());


        System.out.println("\n\n Kamayuvchi tartibda tartiblanga array elementlari: ");
        for (int x : toshbaqa){
            System.out.print(" " + x);
        }
    }
}
