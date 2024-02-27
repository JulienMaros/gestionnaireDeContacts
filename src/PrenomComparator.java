import java.util.Comparator;

public class PrenomComparator implements Comparator<Contacts> {

    @Override
    public int compare(Contacts a, Contacts b) {
        return a.getPrenom().compareTo(b.getPrenom());
    }
}
