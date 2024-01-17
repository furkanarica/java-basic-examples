import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Furkan");

        try {
            arrayList.get(1);
        }
        catch (IndexOutOfBoundsException exception) {
            System.out.println("This expection : " + exception);
        }
        catch (NullPointerException exception) {
            System.out.println("This expection : " + exception);
        }
        catch (Exception exception) {
            System.out.println("This expection : " + exception);
        }
        finally {
            System.out.println("Finally");
        }
    }
}