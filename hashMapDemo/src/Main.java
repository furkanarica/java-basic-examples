import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

        hashMap.put(1,"Bir");
        hashMap.put(10,"On");
        hashMap.put(100,"Yüz");

        for (int key: hashMap.keySet()) {
            System.out.println("Key :" + key + " " + " Value :" + hashMap.get(key));
        }

        System.out.println();

        hashMap.remove(100);
        System.out.println(hashMap.get(100));
    }
}