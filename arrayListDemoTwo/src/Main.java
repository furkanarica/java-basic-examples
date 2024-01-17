import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add("Furkan");
        arrayList.add(true);
        arrayList.add(123.4);

        for (Object element:arrayList) {
            System.out.println(element);
        }
    }
}