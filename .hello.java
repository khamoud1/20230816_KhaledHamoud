public class Hello {
    private String vorname;
    private String nachname;
    private int alter;

    public Hello(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

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
