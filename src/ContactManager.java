import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    static ArrayList<Contacts> listeContact = new ArrayList<Contacts>();

    Contacts contact = new Contacts();

    public static void ajouterContact(Contacts contact) {

        String result = "O";

        Scanner scanner = new Scanner(System.in);

        while (result == "O") {

            System.out.println("Ajouter un nouveau contact");

            System.out.println("nom : ");
            Contacts.setNom(scanner.nextLine());

            System.out.println("prenom : " + scanner.nextLine());
            Contacts.setPrenom(scanner.nextLine());

            System.out.println("adresse : " + scanner.nextLine());
            Contacts.setAdresseEMail(scanner.nextLine());

            System.out.println("telephone : " + scanner.nextLine());
            Contacts.setNumeroTelephone(scanner.nextLine());

            listeContact.add(contact);

            System.out.println("Nouveau contact ? Oui : O sinon Non : N");
            result = scanner.nextLine();
        }
    }
}
