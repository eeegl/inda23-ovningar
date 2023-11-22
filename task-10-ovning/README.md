# **Övning 10 – Search & Sort**

### **Idag**
* Repetition + diskussion
* Genomgång av `task-10`
* Nytt i `task-11`: sortering
* Kodningsövning: sorteringsalgoritm

### **Kodkommentarer**
I Java finns tre olika typer av kommentarer:
- Javadoc-kommentarer (för dokumentation)
- Blockkommentarer (för längre implementationsdetaljer)
- Enradskommentarer (för korta implementationsdetaljer)

Javadoc-kommentarer måste finnas för

- Klassen (längst upp efter importer, innan klassdeklarationen)
- Varje metod (utom `private`-metoder och enkla metoder som getters/setters)

och ska inte ha några mellanrum efter kommentaren.

#### **Exempel:**
```java
/** <--- OBS: två asterisker (**)
 * Det här är en Javadoc-kommentar.
 * 
 */
public void method() { // Det här är en enradskommentar
    /* <--- OBS: en asterisk (*)
     * Det här är en blockkommentar.
     */
}
```

### **Konstanter**
Konstanter gör koden säkrare och lättare att ändra. Vi kan skapa en konstant genom att lägga till `static final` till ett fält.

* Nyckelordet `static` gör att endast en version av variabeln existerar
* Nyckelordet `final` gör att variabeln inte får ändras (måste därför initialiseras direkt)
* Fältnamnet skrivs konventionellt med versaler och understreck mellan ord
* Gör koden mer lätthanterlig eftersom vi bara behöver ändra på ett ställe

#### **Exempel:**

```java
// Heltalskonstant
private static final int MAX_ITERATIONS = 100;
// Stränkonstant
private static final String FILE_PATH = "path/to/my/file.txt";


// Användning i en loop
for (int i = 0; i < MAX_ITERATIONS; i++) {
    // ...
}
```

### **Parametriserade typer**
Parametriserade typer är när en typ tar en annan typ som argument. I Java kallas det för *generics*. Ett exempel är `LinkedList`:

```java
// Dessa två är olika typer
public LinkedList<Integer> intList; // Listan innehåller element av typen Integer
public LinkedList<String> strList; // Listan innehåller element av typen String
```

### **💬 Diskussion**
- Varför är det viktigt med kommentarer?
- Varför vill vi använda konstanter?
- Varför behöver vi parametriserade typer?


### **Genomgång `task-10`**
* Hur har det gått?
* Vad har varit svårt?
* Andra tankar?
* Redovisning

### **Vad kommer i `task-11`?**
* Comparable
* Sortering
* Sökning
* Tidskomplexitet

### **`Comparable`**
I Java är [`Comparable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html) ett interface. Vad är då det?

> *Ett interface är ett kontrakt som **garanterar** viss **funktionalitet**.*

Och vad innebär det då? Jo, interfacet `Comparable` garanterar att objekt kan jämföras med `compareTo()`-metoden. Och kan vi jämföra dem så kan vi även *ordna* dem, vilket kommer väl till pass för både **sortering** och **sökning**. Vi signalerar att en klass implementerar ett interface med nyckelordet `implements` och sen överskuggar vi `compareTo()` och gör vår egen implementation.

#### **Exempel:**

```java
public class Person implements Comparable<Person> {
    @Override
    public int compareTo(Person other) {
        // Jämför efter till exempel längd
    }
}
```

Hur ska vi då implementera `compareTo()`? Helt enkelt så att returvärdet är negativt, noll eller positivt, beroende på om det jämförda objektet är mindre än, lika stort som eller större än objektet vi utgår ifrån. Exakt hur vi gör beror på vad som ska jämföras.

#### **Funktionstabell:**

| Fall     | Betydelse                                           |
|-----------------|-----------------------------------------------------|
| `x.compareTo(y) < 0`        | `x` är mindre än `y` |
| `x.compareTo(y) == 0`            | `x` är lika stort som `y` |
| `x.compareTo(y) > 0`        | `x` är större än `y` |

### **Kort om tidskomplexitet och ordonotation**
Tidskomplexitet beskriver hur mycket längre tid en algoritm tar när indatan blir större. Vi räknar oftast med värsta fallet (allt annat är bonus).

Vi noterar tidskomplexitet med $O(n)$ (uttalas "ordo av $n$"), där det som står inom parentes är *högstagradstermen* i algoritmen. På engelska kallas notationen "big O".

#### **Exempel:**
| Ordonotation | Tidskomplexitet | Betyg (ungefärligt)          | Förekommer (bland annat) vid                 |
|--------------|-----------------|-----------------|-------------------------|
| $O(1)$      | Konstant        | Mycket bra      | Hämtning av element från en array |
| $O(\log n)$ | Logaritmisk     | Bra             | Binärsökning i en sorterad lista |
| $O(n)$      | Linjär          | Ganska bra      | Genomsökning av en lista |
| $O(n^2)$    | Kvadratisk      | Ofta bästa möjliga | Urvalssortering            |
| $O(n!)$     | Fakultetisk     | Inte bra        | I "brute force"-lösningar på grafproblem |



#### **Fråga:**

Vad är tidskomplexiteten för $32x^3 + 5x^2 - 23$?


### **Kort om pseudokod**
Ibland vill vi kunna skriva ner våra algoritmidéer generellt, utan att behöva tänka på ett specifikt programspråk. Då används ofta *pseudokod*, vilket är en sorts "låtsaskod" som liknar riktiga programspråk men är lite mer avslappnat. 

### **Instickssortering (insertion sort)**

#### **Algoritm**
Instickssortering funkar ungefär som när man sorterar en korthand. Pseudokod (från `task-11`) ser ut såhär:

```go
Insertion Sort (A)
------------------
1   for i = 1 to A.length - 1
2       j = i
3       while j > 0 and A[j-1] > A[j]
4           temp = A[j]
5           A[j] = A[j-1]
6           A[j-1] = temp
7           j = j - 1
```

Vi torrkör tillsammans och sorterar `A = [3, 4, 5, 2, 1]`.

#### **Tidskomplexitet**
* Vad är tidskomplexiteten för instickssortering?
* I bästa fall (helt sorterad array)?
* I värsta fall (omvänt sorterad array)?

### **Kodningsövning**
Gör en egen implementering av instickssortering i Java. Utgå från kodskelettet i `Sorter.java`.

> *Tips:*
> * Försök att översätta pseudokoden till Java.
> * Gör en `swap()`-metoden för att göra koden mer lättläslig.

### **Sammanfattning**
* Kommentarer, konstanter och generics
* Comparable
* Tidskomplexitet och ordo
* Instickssortering
