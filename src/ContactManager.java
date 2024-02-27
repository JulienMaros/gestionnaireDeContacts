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

    public static void supprimerContact(ArrayList listeContact) {
        String result = "O";

        Scanner scanner = new Scanner(System.in);

        while (result == "O") {

            System.out.println("Supprimer un contact");
            System.out.println("Donner l'indice du contact");
            int indice = scanner.nextInt();

            listeContact.remove(indice);

            System.out.println("Voulez-vous supprimer un autre contact ? Oui : O sinon Non : N");
            result = scanner.nextLine();
        }
    }

    public static void modifierContact(ArrayList listeContact) {
        String result = "O";

        Scanner scanner = new Scanner(System.in);

        while (result == "O") {

            System.out.println("Modifier un contact");
            System.out.println("Donner l'indice du contact");
            int indice = scanner.nextInt();

            System.out.println("Nouveau nom");
            listeContact(indice).setNom(scanner.nextLine());

            System.out.println("Nouveau prénom");
            listeContact(indice).setPrenom(scanner.nextLine());

            System.out.println("Nouveau adresse");
            listeContact(indice).setAdresseEMail(scanner.nextLine());

            System.out.println("Nouveau numéro téléphone");
            listeContact(indice).setNumeroTelephone(scanner.nextLine());

            System.out.println("Voulez-vous modifier un autre contact ? Oui : O sinon Non : N");
            result = scanner.nextLine();
        }
    }

    public static void afficherContact(listeContact) {
        for ()
    }
}
