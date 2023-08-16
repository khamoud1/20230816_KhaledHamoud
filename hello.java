/**
 * This class represents a person with first name, last name, and age.
 */
public class Hello {
    private String vorname;
    private String nachname;
    private int alter;

    /**
     * Constructs a new Hello instance.
     * @param vorname The first name of the person.
     * @param nachname The last name of the person.
     * @param alter The age of the person.
     */
    public Hello(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    /**
     * Prints the information about the person.
     */
    public void printInformation() {
        System.out.println("Vorname: " + vorname);
        System.out.println("Nachname: " + nachname);
        System.out.println("Alter: " + alter);
    }

    public static void main(String[] args) {
        Hello person = new Hello("Max", "Mustermann", 30);
        person.printInformation();
    }
}
