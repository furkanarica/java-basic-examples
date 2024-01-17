import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Customer> customers = new HashMap<Integer,Customer>();

        customers.put(1,new Customer("Furkan","Arıca"));
        customers.put(2,new Customer("Ahmet","Güneş"));

        for (int id: customers.keySet()) {
            System.out.println("ID :" + id + " - Customer : " + customers.get(id).firsName);
        }
    }
}