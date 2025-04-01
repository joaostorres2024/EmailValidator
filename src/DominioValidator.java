import java.util.Locale;
import java.util.Scanner;

public class DominioValidator {
    public static void main(String[] args) {
        var dominioExtractor = new DominioExtractor();
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o email que deverá ser verificado: ");
        dominioExtractor.setEmailInput(scanner.nextLine());

        System.out.println(dominioExtractor.extrairDominioEmail(dominioExtractor.getEmailInput()));

    }
}
