public class ExampleOne {
    public static void main (String [] args) {
        String [] [] groups = new String[3][2];

        groups [0][0] = "A";
        groups [0][1] = "B";

        groups [1][0] = "Real Madrid";
        groups [1][1] = "Manchester City";

        groups [2][0] = "Manchester United";
        groups [2][1] = "Barcelona";

        for (int j =0;j<2;j++) {
            System.out.println();
            for (int i=0;i<3;i++) {
                System.out.println(groups[i][j]);
            }
        }
    }
}
