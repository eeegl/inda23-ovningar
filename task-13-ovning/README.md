# Övning: `task-13` – Correctness

### **Välkomna tillbaka!**

Hoppas att alla har haft en fin ledighet.

## Dagordning

- Sammanfattning HT
- Överblick VT
- Redovisning `task-13`
- Nytt i `task-14`
- Kodningsuppgift

## Sammanfattning av HT 2023

#### DD1337

> Java och objektorienterad programmering (OOP)

- klasser,
- objekt,
- typer (primitiva typer och objekttyper),
- kontrollflödde (villkor, booleanuttryck),
- förgrening (if-satser),
- slingor (*loopar*),
- Java Collections,
- arv (*inheritance*) och gränssnitt (*interfaces*),
- dokumentation,
- I/O, och
- testning. 

#### DD1338 (hittills)

> Algoritmer

- sökalgoritmer (sekventiell och binär sökning),
- sorteringsalgoritmer (insticks- och urvalssortering),
- tidskomplexitet, och
- korrekthet.

## Överblick över VT 2024

### P3

#### Fortsättning av DD1338 (Algoritmer och datastrukturer):

- 9 tasks totalt (`task-10` till `task-18`)
- Mer fokus på *datastrukturer* i resten av kursen
- `task-18`: Quicksort
    - Tasken ligger över två veckor
    - Ni ska skriva en kort rapport
    - Måste vara godkänd för godkänt i kursen

### P4

#### DD1396 (Parallellprogrammering)

- Nytt programspråk: Go (skapat av Google)
- Flera saker händer samtidigt (inte helt deterministiskt)
- Lite inslängd, bara att kämpa igenom!

#### DD1349 (Projektuppgift)

- Arbete i par
- Helt valfritt (inom rimliga gränser)
- Mycket eget ansvar
- Behöver inte vara i Java!

## Den här veckan (`task-13`: Correctness)

### Diskussion

Diskutera veckans task i par:

- Hur har det gått?
    - Vad gick bra?
    - Vad har varit extra svårt?
- Skiljer sig era lösningar?
    - Om ja, hur skiljer de sig?
    - Om nej, hur skulle man kunna göra annorlunda?
    - Finns fördelar/nackdelar med de olika sätten?

### Redovisning

En grupp redovisar veckans task.

## Kommande vecka (`task-14`: Linked Lists)

### Pekare
I datorns minne lagras värden på *[minnesadresser](https://en.wikipedia.org/wiki/Memory_address)*.
En [pekare](https://en.wikipedia.org/wiki/Pointer_(computer_programming)) är en variabel som pekar till en minnesadress.
När vi har minnesadressen kan vi hämta datan.

### Värdet NULL
Inom programmering kan värdet NULL ses som en representation av "ingenting". I Java används nyckelordet `null` (små bokstäver). Endast objekttyper kan ha värdet `null` i Java (alltså inte primitiva typer som `int` och `boolean`).

### Nästlade klasser

En nästlad klass är en klass som definieras i en annan klass.

Java har [två typer av nästlade klasser](https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html):

- Inner classes (har tillgång till yttre klassens medlemmar (fält och metoder)).
- Static nested classes (har *inte* tillgång till yttre klassens medlemmar).

### Länkad lista
- Består av sammanlänkade noder.
- Varje nod innehåller data och en pekare till nästa nod.
- Sista noden pekar på NULL för att visa att inga fler element finns i listan.
- I Java finns klassen `LinkedList`.
- I er implementation ska ni använda en nästlad klass (statisk nästlad klass) för noderna.

Visualisering finns [här](https://antoniosarosi.github.io/Linked-List-Visualization/).

#### Exempel

Låt $L = \lbrace 2, 3, 5 \rbrace$ vara en länkad lista.

Hur kan vi sätta in $10$ mellan $2$ och $3$?

> Ovan beskrivs en *enkelriktad* länkad lista (eng: *singly linked list*), men den kan även vara *dubbelriktad* (eng: *doubly linked list*). I en dubbelriktad länkad lista pekar varje nod till både nästa nod och föregående nod.
> 
> Hur kan vi göra $L$ dubbelriktad?

### Array vs. länkad lista

Arrayer har statisk storlek (kan inte ändra storlek) och är sammanhängande i minnet (minnesadresserna kommer direkt efter varandra).

Länkade listor däremot har dynamisk storlek (kan växa och krympa) och är utspridda i minnet (noderna kan ligga på helt olika platser och behöver inte vara bredvid varandra).

|  | Array | Länkad lista |
|---|---|---|
| **Storlek** | Statisk | Dynamisk |
| **Minne** | Sammanhängande | Utspritt |

## **Kodningsövning**

Veckans uppgift är att ni alla tillsammans ska bilda en *mänsklig* länkad lista och utföra olika operationer på den. Varje person får två lappar: en med nodens värde och en med pekare till nästa nod.

Kruxet är hur ni ska uppdatera pekarna.

Det ni ska göra är:

1. Bilda tomma listan
1. Bilda listan där alla är med
1. Ta bort den första noden i listan
1. Sätt in den borttagna noden på femte index
1. Ta bort den sista noden i listan
1. Lägg till den borttagna noden först i listan
1. Skapa en ny lista som är samma lista fast omvänd

> Om vi blir klara kan ni börja med `task-14`.

<!-- 1. Bilda par och gå in på https://leetcode.com/problems/valid-parentheses/.
1. Försök att lösa uppgiften tillsammans med parprogrammering.
1. Blir ni klara kan ni börja på `task-14`. -->

## **Sammanfattning**

- Tillbakablick HT och VT
- Pekare, NULL, och nästlade klasser
- Länkad lista
