package uri_2339;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if ( y < (x * z)) {
            System.out.println("N");
        } else {
            System.out.println("S");
        }

        sc.close();

    }

}
