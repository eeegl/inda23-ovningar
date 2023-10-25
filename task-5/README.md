# Övning 5 - Listor

### **Vad pratade vi om förra veckan?**
* Loopar
* FizzBuzz

### **Några ord om kodkvalitet**
* Använd måsvingar (`{}`) för era `if`-satser 
* Kom ihåg att formatera koden med `ALT + SHIFT + F`
* Tänk på klasstrukturen

En typisk klass brukar se ut ungefär såhär:

```java
// Paket

// Importer

// Dokumentationskommentar

public class MyClass { // Klassdeklaration

    // Fält

    // Konsktuktor(er)

    // Metoder

        // "Icke-triviala" metoder

        // Getters

        // Setters

    public static void main(String[] args) { 
        // Main-metod
    }
}
```

### **Listor: array vs. `ArrayList`**
Ta några minuter och diskutera som ni sitter:
* När använder vi listor?
* Vad är fördelar/nackdelar med arrayer vs. `ArrayList`?

### **Vi går igenom `task-5`**
* Hur har det gått? 😎😀🙂😐😟🤬💀
* Diskussion
* Redovisning

---

### **Strängar**

**Bakgrund**

Veckans uppgift är tänkt att ge en djupare förståelse för `String`-typen genom att jobba med arrays.

Inom datavetenskapen är en sträng en sekvens av symboler. Den representeras ofta som en lista. Till exempel kan strängen $\text{"DD1337"}$ ses som listan $\lbrace\text{D, D, 1, 3, 3, 7} \rbrace$. Ni ska nu implementera en Java-klass som representerar strängar på detta sätt.

> OBS: här syftar $\lbrace\rbrace$-notationen på en *lista* (som är ordnad och kan ha upprepade element), och inte på en *mängd* (som inte är ordnad och som har unika element)..

**Uppgift**

Uppgiften är att skapa en sträng som en lista med symboler (som beskrivs ovan), och sedan printa strängen. Javas `String`-typ fungerar internt på ett liknande sätt, men ni ska inte använda den i den här uppiften, utan skapa en egen version.

Börja med att ska skapa klassen `WordPrinter.java` med ett fält, `arrayWord`, som är en array av typen `char`. Lägg sedan in ett ord i `arrayWord`. Sist så ska ni iterera över listan och printa varje `char`, så att `ArrayWord: ` och sedan hela ordet skrivs ut.

Ett exempel på hur en körning av programmet skulle kunna se ut för strängen $\text{"DD1337"}$:

```bash
javac WordPrinter.java
java WordPrinter
ArrayWord: DD1337
```

Kom ihåg att kompilera om ifall ni ändrar något och vill testa att köra programmet igen.

> Tips: använd `System.out.print()` om ni inte vill lägga till en ny rad och `System.out.println()` om ni vill göra det.

---

**Om ni får tid över:** Lägg till ett fält `listWord` som är av typ `ArrayList` och printa det orded med. Vad är fördelarna och nackdelarna med båda?

Outputen blir då:

```bash
javac WordPrinter.java
java WordPrinter
ArrayWord: DD1337
ListWord: DD1337
```

---

**Överkurs:** Lägg till fältet `words` som är en lista med strängar. Detta blir alltså en lista som innehåller listor av typen `char`. Fyll `words` med ord som bildar en mening och printa meningen genom att iterera över alla ord i `words`. 

> Tips: fundera först över vilken lista som gör jobbet lättast: array eller `ArrayList`.
