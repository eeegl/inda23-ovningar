import java.util.List;
import java.util.ArrayList;

/**
 * En enkel klass för att öva på rekursion med listor.
 */
public class RecursivePrinter {
    
    /**
     * Printar alla element i en lista.
     * 
     * @param list Listan som ska printas.
     */
    public static void print(List<Integer> list) {
        printRecursive(list, list.size() - 1);
    }

    /**
     * Printar element i en lista rekursivt.
     * 
     * @param list Listan som ska printas.
     * @param index Nuvarande index som ska printas.
     */
    public static void printRecursive(List<Integer> list, int index) {
        // Skriv er implementering här!
    }

    /**
     * Hjälpmetod för att skapa en lista med heltal.
     * 
     * @param from Starttal (inklusive).
     * @param to Sluttal (exklusive).
     * @return En heltalslista.
     */
    public static List<Integer> createIntList(int from, int to) {
        List<Integer> list = new ArrayList<>();
        for (int i = from; i < to; i++) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = createIntList(0, 10);
        print(list); // Ska printa hela listan
    }
}