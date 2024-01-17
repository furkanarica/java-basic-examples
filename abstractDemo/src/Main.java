public class Main {
    public static void main(String[] args) {
        BaseListManager [] baseListManagers = new BaseListManager[] {new ChildListManager(),new ManListManger()};
        for (BaseListManager baseListManager:baseListManagers) {
            baseListManager.listToProduct();
        }
    }
}