import java.util.Calendar;
import java.util.GregorianCalendar;

public interface Constants {
    void setFirstName(String firstName);
    String getFirstName();
    void setLastName(String lastName);
    String getLastName();
    void setFullName(String fullName);
    String getFullName();
    double calcCredit();
    double calcBonus();
}

