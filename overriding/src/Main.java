public class Main {
    public static void main(String[] args) {
        BaseCrediManager [] crediManagers = new BaseCrediManager[]
                {new StudentCrediManager(), new RetiredCrediManager()};

        for (BaseCrediManager crediManager: crediManagers) {
                System.out.println(crediManager.calculate(30000));
        }
    }
}