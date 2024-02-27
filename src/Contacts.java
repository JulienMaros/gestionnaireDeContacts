public class Contacts {

    protected String nom;
    protected String prenom;
    protected String numeroTelephone;
    protected String adresseEMail;

    public Contacts() {
    }

    //Constructeur :
    public Contacts(String nom, String prenom, String numeroTelephone, String adresseEMail) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.adresseEMail = adresseEMail;
    }

    //Getters Setters

    public String getNom() {
        return nom;
    }

    public static void setNom(String nom) {
        nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public static void setPrenom(String prenom) {
        prenom = prenom;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public static void setNumeroTelephone(String numeroTelephone) {
        numeroTelephone = numeroTelephone;
    }

    public String getAdresseEMail() {
        return adresseEMail;
    }

    public static void setAdresseEMail(String adresseEMail) {
        adresseEMail = adresseEMail;
    }
}
