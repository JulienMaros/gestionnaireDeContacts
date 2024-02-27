import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ContactManager {
    static ArrayList<Contacts> listeContact = new ArrayList<Contacts>();


    public static void ajouterContact() {

        String result = "O";

        Contacts contact = new Contacts();

        Scanner scanner = new Scanner(System.in);

        while (result == "O") {

            System.out.println("Ajouter un nouveau contact");

            System.out.println("nom : ");
            contact.setNom(scanner.nextLine());

            System.out.println("prenom : " + scanner.nextLine());
            contact.setPrenom(scanner.nextLine());

            System.out.println("adresse : " + scanner.nextLine());
            contact.setAdresseEMail(scanner.nextLine());

            System.out.println("telephone : " + scanner.nextLine());
            contact.setNumeroTelephone(scanner.nextLine());

            listeContact.add(contact);

            System.out.println("Nouveau contact ? Oui : O sinon Non : N");
            result = scanner.nextLine();
        }
    }

    public static void supprimerContact() {
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

    public static void modifierContact() {
        String result = "O";

        Scanner scanner = new Scanner(System.in);

        while (result == "O") {

            System.out.println("Modifier un contact");
            System.out.println("Donner l'indice du contact");
            int indice = scanner.nextInt();

            System.out.println("Nouveau nom");
            listeContact.get(indice).setNom(scanner.nextLine());

            System.out.println("Nouveau prénom");
            listeContact.get(indice).setPrenom(scanner.nextLine());

            System.out.println("Nouveau adresse");
            listeContact.get(indice).setAdresseEMail(scanner.nextLine());

            System.out.println("Nouveau numéro téléphone");
            listeContact.get(indice).setNumeroTelephone(scanner.nextLine());

            System.out.println("Voulez-vous modifier un autre contact ? Oui : O sinon Non : N");
            result = scanner.nextLine();
        }
    }

    public static void afficherContact() {
        for (Contacts contacts : listeContact) {
            System.out.println(contacts);
        }
    }

    public static void trierContactsParNom() {
        Collections.sort(listeContact, new NomComparateur());
        for (Contacts contact : listeContact) {
            System.out.println(contact);
        }
    }
}
