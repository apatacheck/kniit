package lab1.task1;

public class Main {
    public static void main(String[] args) {
        String line = "";
        for (int n = 1; n<=100; n++) {
            line = line + n;
            if (n % 10 == 0) {
                line = line + "\n";
            } else {
                line = line + ", ";
            }
        }
        System.out.println(line);

    }

}
