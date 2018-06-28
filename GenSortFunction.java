
import java.util.ArrayList;
import java.util.Collections;


public class GenSortFunction 
{
    public static void main(String[] args) 
    {
        ArrayList<String> sc=new ArrayList<>();
        sc.add("Gunjan");
        sc.add("Ambika");
        sc.add("Ananyaa");
        Collections.sort(sc);
        System.out.println(sc);

        ArrayList<Integer> a=new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        Collections.sort(a);
        System.out.println(a);
    }
}
