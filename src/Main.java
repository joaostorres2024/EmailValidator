import java.net.InetAddress;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var dominioChecker = new DominioChecker();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o email que deverá ser válidado: ");
        dominioChecker.setEmail(sc.next());
        
    }
}
