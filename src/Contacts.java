public class Contacts {

private String nom;
private String prenom;
private Integer numeroTelephone;
private String adresseEMail;

//Constructeur :
    public Contacts(String nom, String prenom, Integer numeroTelephone, String adresseEMail) {
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

    public Integer getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(Integer numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getAdresseEMail() {
        return adresseEMail;
    }

    public void setAdresseEMail(String adresseEMail) {
        this.adresseEMail = adresseEMail;
    }
}
