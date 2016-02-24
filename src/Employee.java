
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Employee extends Card implements Constants{

    double salaryPerHr;
    GregorianCalendar issued;

    public Employee(){
        salaryPerHr = 120;
        issued = new GregorianCalendar();
    }
    @Override
    boolean checkPIN(int pin) {
        int day, month, year;
        int second, minute, hour;
        GregorianCalendar date = new GregorianCalendar();

        day = date.get(Calendar.DAY_OF_MONTH);

        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);

        if (hour >= 7 && hour <= 17 && !isCancelled() && pin != 9999) {
            return true;

        }
        return false;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setFullName(String fullName) {
        String names[] = fullName.split("\\s+");
        firstName = names[0];
        lastName=names[1];
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public double calcCredit() {
        return salaryPerHr * 45; // constant 45
    }

    @Override
    public double calcBonus() {
        GregorianCalendar date = new GregorianCalendar();
        int currentYear = date.get(Calendar.YEAR);
        int startYear = issued.get(Calendar.YEAR);

        return (currentYear-startYear) * 45;
    }
}
