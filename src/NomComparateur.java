import java.util.Comparator;

public class NomComparateur implements Comparator<Contacts> {

    @Override
    public int compare(Contacts a, Contacts b) {
        return a.getNom().compareTo(b.getNom());
    }

}
