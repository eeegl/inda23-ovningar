import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ContactBook {
    private Map<String, Contact> contacts;

    public ContactBook() {
        // Skriv din kod här!
    }

    public void addContact(Contact contact) {
        // Skriv din kod här!
    }

    public void loadContactsFromFile(String filePath) {
        // Skriv din kod här!
    }

    public void printAllContacts() {
        // Skriv din kod här!
    }

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.loadContactsFromFile("contacts.csv");
        contactBook.printAllContacts();
    }
}
