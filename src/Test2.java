import java.util.*;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {

        LinkedHashSet<Integer> sonlar = new LinkedHashSet<>();

        System.out.println(sonlar.size());

        sonlar.add(7);
        sonlar.add(6);
        sonlar.add(5);
        sonlar.add(4);
        sonlar.add(9);
        sonlar.add(7);

        System.out.println(sonlar.size());


        for (Integer x : sonlar){
            System.out.print(" " + x);
        }

    }
}