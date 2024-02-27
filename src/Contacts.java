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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getAdresseEMail() {
        return adresseEMail;
    }

    public void setAdresseEMail(String adresseEMail) {
        this.adresseEMail = adresseEMail;
    }
}
