import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Furkan");
        arrayList.add("Arıca");

        Collections.sort(arrayList);

        for (String e:arrayList) {
            System.out.println(e);
        }

    }
}