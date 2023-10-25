# Övning 6

### **Vad pratade vi om förra veckan?**
* Kodkvalitet
* Arrays vs. `ArrayList`
* Strängar = listor

### **Deep vs. shallow copy**
Ta några minuter och diskutera som ni sitter:
* Vad är skillnaden egentligen?

### **Vi går igenom `task-6`**
* Hur har det gått? 😎😀🙂😐😟🤬💀
* Diskussion
* Redovisning

---

### **Kodningsuppgift: "gissa talet"-spel**

**Bakgrund**

För att våra program ska kunna göra någon nytta i praktiken måste de kunna ta emot information från världen utanför. I den här uppgiften kommer ni att få göra just det, genom att läsa input från en användare. Ni kommer sedan kombinera det med vad ni redan har lärt er för att skapa ett spel där datorn "tänker" på ett tal mellan 1 och 100 och spelaren ska försöka gissa sig fram till vilket tal det är.

> För den här uppgiften är det [parprogrammering](https://sv.wikipedia.org/wiki/Parprogrammering) som gäller. Ni ska alltså jobba i par, där en kodar och en vägleder.

**Förberedelse**

För att kunna implementera spelet behöver ni kunna göra följande:

1. Slumpmässigt generera det tal som ska gissas
1. Ta emot en gissningar från användaren
1. Få programmet att fortsätta köra (och ge ledtrådar) tills spelaren har gissat rätt

Slumpmässiga tal kan genereras med `Random`-klassen som ni känner till. För att läsa input kan ni använda Javas [`Scanner`](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)-klass och dess `nextInt()`-metod. Slutligen, för att få programmet att köra tills spelaren har gissat rätt kan ni använda en `while`-loop och en `boolean`-variabel `hasGuessedCorrectly`, som är `false` från början (det här är ett exempel på en [*spel-loop*](https://en.wikipedia.org/wiki/Video_game_programming#Game_structure)).

För att göra saker lite tydligare finns två exempel ni kan kika på:

- I [`UserInputDemo.java`](./UserInputDemo.java) lär ni er hur man kan ta emot och använda information från användaren.
- I [`SimpleGameLoopDemo.java`](./SimpleGameLoopDemo.java) finns ett exempel på en spel-loop kan se ut.

Sen är det dags att skapa själva spelet!

**Uppgift**

Spelet kommer att slumpmässigt välja ett tal mellan 1 och 100. Användarens mål är att gissa vilket tal det är. Efter varje gissning kommer spelet att berätta om det korrekta talet är högre eller lägre. Om användaren har gissat rätt.

Exempel på en körning av spelet där talet som ska gissas råkar vara 63:

```bash
javac GuessingGame.java
java GuessingGame
Gissa ett tal mellan 1 och 100: 50
Gissa högre!
Gissa ett tal mellan 1 och 100: 75
Gissa lägre!
Gissa ett tal mellan 1 och 100: 63
Grattis! Du gissade rätt!
```

---

**Om ni får tid över:** Lägg till en räknare som håller reda på hur många försök användaren behövde för att gissa rätt. Visa antalet försök när spelet är över.

---

**Överkurs:** Utveckla spelet så att det innehåller flera svårighetsgrader (t.ex. 1-10, 1-50, 1-100). Låt användaren välja svårighetsgrad i början av spelet.