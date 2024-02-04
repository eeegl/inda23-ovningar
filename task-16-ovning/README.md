# Övning: `task-16` – Hashtables

Veckans övning ser ut såhär:

- Nyckelord i Java
    - `switch`, `case`, `default`
- Redovisning `task-16` – Hashtables
    - Diskussion
    - Presentation
- Nytt i `task-17` – Trees
    - Träd
    - Binärt sökträd
- Kodningsuppgift


## Nyckelord i Java: `switch`, `case`, `default`

En `switch`-sats används för att multiplexa mellan olika alternativ. Den funkar endast med [vissa primitiva typer](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html) (`byte`, `short`, `char`, `int`), samt `Enum`s och `String`s.

Uttrycket utvärderas en gång och matchas mot de olika alternativen. Vid matchning körs koden. Vi måste se till att `switch`-satsen är uttömmande och behandlar alla möjliga alternativ för indatan. Detta kallas *exhaustiveness*.

Med `break` ser vi till att hoppa ur kodblocket efter att koden har körts, annars körs all följande kod i blocket. Att utelämna ett `break` för att leda flera alternativ till samma kod kallas *fallthrough*.

Med `default` fångar vi upp om ingen matchning sker.

Från Java 14 finns [alternativ](https://nipafx.dev/java-switch/) för att använda pilnotation (lambda-pilar). Denna notation tillåter inte fallthroughs, vilket minskar risken för buggar. Det kräver även kodblock när vi skriver mer än en rad, vilket skapar ny räckvidd för lokalvariabler.

Vi kan även ha flera labels för samma pil, samt använda pilnotationen för att beräkna ett värde för en variabel.

```java
// Klassisk notation
switch (number) {
	case 1: // Går till samma som case 2, pga. ingen break
	case 2:
		callMethod("few");
		break;
	default:
		callMethod("many");
		break;
}

// Pilnotation (från Java 14)
switch (number) {
	case 1 -> callMethod("one");
	case 2 -> callMethod("two");
	default -> { // Kodblock för flera rader
		var str = "many";
		callMethod(str);
	}
}

// Pilnotation med två cases som går till samma kod,
// och där vi sparar resultatet i en variabel.
var string = switch (number) {
	case 1, 2 -> "few";
	default -> "many";
};
```

## Den här veckan (`task-16`: Hashtables)

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


## Nästa vecka (`task-17`: Trees)

### Träd

Ett **träd** (engelska: *tree*) är en datastruktur med hierakiskt länkade noder, lite som en länkad lista, med skillnaden att en nod kan peka på flera noder. Det går bara att peka nedåt i trädet, inte uppåt eller åt sidan.

Lite terminologi:

| **Term** | **På engelska** | **Beskrivning** |
|--|--|--|
| Rot | Root| Noden överst i trädet |
| Förälder | Parent | Nod som pekar till andra noder |
| Barn | Child | Nod som en föräldranod pekar till |
| Syskon | Sibling | Noder med samma förälder |
| Löv | Leaf | Nod längst ner i trädet, som inte har några barn |
| Delträd | Subtree | Ett träd som börjar från en annan nod än roten |
| Kant | Edge | En koppling mellan två noder |
| Height | Höjd | Flest antal kanter från roten till ett löv |
| Nyckel | Key | Värdet för en nod |

![image](tree.png)
*Terminologi för olika delar av ett träd.*

### Binärt sökträd (abstrakt)

Ett **binärt sökträd (BST)** (engelska: *binary search tree*) är ett binärt träd (varje nod har max två barn) som även uppfyller följande krav:

1. Alla nycklar i trädet är jämförbara.
1. Varje nod är *större* än alla noder i *vänster* delträd.
1. Varje nod är *mindre* än alla noder i *höger* delträd.

Trädet ger flexibiliteten från en länkad lista där vi enkelt kan sätt in noder, och ordningen gör att vi kan söka lika snabbt som i en sorterad array.

> Vi tittar på några exempel.

### Binärt sökträd (Java)

I Java finns ingen standardimplementering av BST, det er uppgift att implementera er egen version.

## Kodningsövning

Den här veckan ska ni printa en lista med hjälp av rekursion. I klassen [`RecursivePrinter`](RecursivePrinter.java) ska skapa implementera metoden `printRecursive()` som kallas av `print()`.

När `print()` anropas ska varje element i listan printas. Det är okej att printa varje element på en ny rad. För att skapa rekursionen behöver ni anropa `printRecursive()` i sig själv.

> Om ni blir klara kan ni börja med `task-17`.

## Sammanfattning

- `switch`, `case`, `default`
- Träd
- Binärt sökträd