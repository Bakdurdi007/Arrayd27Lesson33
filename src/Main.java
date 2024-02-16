import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Array xosil qilishning birinchi usuli.
        int[] array1 = new int[10];

        // Array xosil qilishning ikkinchi usuli.
        int[] array2 = new int[]{ 6,   2,   9,   1,   5,   8,   7,   6,   3};
        //                       [0]  [1]  [2]  [3]  [4]  [5]  [6]  [7]  [8]

        // length -> Arrayning elementlari sonini yoki bo'lmasa Arrayning uzunligini qaytaradi.
        int len = array2.length;
        System.out.println(" array2 ning elementlari soni: " + len);

        // Array elementlariga murojaat qilish.
        System.out.println(" array2 ning birinchi elementi: " + array2[0]);
        System.out.println(" array2 ning oxirgi elementi: " + array2[len - 1]);

        // Array xosil qilishning uchinchi usuli.
        Scanner scanner = new Scanner(System.in);

        System.out.print(" array3 ning uzunligi nechiga teng bo'lsin: ");
        int n = scanner.nextInt();

        int[] array3 = new int[n];

        // array ning boshlang'ich qiymatlari.
        // byte, short, int, long -> 0
        // float, double -> 0.0
        // boolean -> false;
        // char -> ' '

        for (int i = 0; i < n; i++) {
            System.out.print(" " + array3[i]);
        }

        System.out.print("\n\n Qaysi indeksda turgan element qiymatini o'zgartirmoqchisiz: ");
        int index = scanner.nextInt();

        System.out.print(" Qanday qiymat bermoqchisiz: ");
        int value = scanner.nextInt();

        array3[index] = value;

        for (int i = 0; i < n; i++) {
            System.out.print(" " + array3[i]);
        }

    }
}