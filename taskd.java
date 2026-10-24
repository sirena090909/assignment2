import java.util.Scanner;

public class taskd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        if ((a == c )||( b == d )) {

            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
