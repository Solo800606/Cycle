public class Two {
    public static void main(String[] args) {
        int first = 5;
        int second = 5;
        for (int i = 2; i <= first; i++) {
            for (int j = 2; j <= second; j++) {
                System.out.print(j + "+" + i + "=" + i + j + "\t");
            }
            System.out.println("");
        }
    }

}


