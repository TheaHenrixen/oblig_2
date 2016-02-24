
public abstract class Card {
    String firstName;
    String lastName;
    int pin;
    private long cardNumber;
    private boolean accessCode;
    private static long card = 1;

    public Card() {
        firstName = "Thomas";
        lastName = "Newton";
        pin = 1111;
        this.cardNumber = card;
        card++;
        accessCode = false;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    abstract boolean checkPIN(int pin);

    @Override
    public String toString() {
        return "Name: " + getFullName() + "\nPIN: " + pin + "\nCard Number: " + cardNumber +
                "\nCancelled? " + accessCode;
    }

    boolean isCancelled() {
        return accessCode;
    }

    @Override
    public int compareTo(Card o) {
        Comparable<Card>
        if (this.lastName.compareTo(o.firstName) != 0)
            return -1;
        return this.firstName.compareTo(o.firstName);
    }
}
