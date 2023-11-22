import java.util.Arrays;

/**
 * Enkel klass som implementerar instickssortering för heltalsarrayer. 
 *
 * @author Örn Segerstedt
 * @author DITT NAMN HÄR
 * @version 2022-11-22
 */
public class Sorter {
    
    // En array med osorterade heltal
    private static int[] array = {57, 77, 98, -84, 96,
                                  63, -18, 30, 29, 36,
                                  72, 100, 54, 6, 5,
                                  30, 17, -78, 30, 30,
                                  61, 27, 95, 9, 99};

    /**
     * Utför instickssortering på en heltalsarray.
     * Sorteringen muterar arrayen.
     * 
     * @param array heltalsarrayen som ska sorteras.
     */
    public static void insertion(int[] array) {
        // TODO: implementera instickssortering!
    }

    /* Byter plats på två tal i en array */
    private static void swap(int a, int b, int[] array) {
        // TODO: (valfritt) implementera metoden
    }

    public static void main(String[] args) {
        // Hämta sträng för osorterad array
        String unSortedArray = Arrays.toString(array);
        
        // Sortera array
        insertion(array);

        // Hämta sträng för sorterad array
        String sortedArray = Arrays.toString(array);
        
        // Printa resultatet
        System.out.printf("Osorterad array: %s\n", unSortedArray);
        System.out.printf("Sorterad array: %s\n", sortedArray);
    }
}