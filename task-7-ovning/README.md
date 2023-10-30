# Övning 7

### **Vad pratade vi om förra veckan?**
* Deep vs. Shallow copy
* "Gissa talet"-spel

### **Hashmaps**
Ta några minuter och diskutera som ni sitter:
* När kan en hashmap vara användbar? Försök komma på några konkreta exempel.
* Vad är några fördelar med en hashmap jämfört med en lista?

### **Vi går igenom `task-7`**
* Hur har det gått? 😎😀🙂😐😟🤬💀
* Diskussion
* Redovisning

---

### **Kodningsuppgift: kontaktbok**

**Bakgrund**

Data lagras ofta på fil som behövs läsas in för att använda i ett program. Ett exempel på en sådan fil är en CSV-fil (Comma Separated Value), där varje rad i filen består av olika värden som avgränsas med kommatecken. I den här uppgiften ska ni implementera en kontaktbok, läsa in kontakter från en CSV-fil, lägg till kontakterna och sedan printa kontaktboken.

> För den här uppgiften är det [parprogrammering](https://sv.wikipedia.org/wiki/Parprogrammering) som gäller. Ni ska alltså jobba i par, där en kodar och en vägleder.

**Uppgift**

Ni har en klass `Contact`, som redan är färdig, och kodskelettet till klassen `ContactBook`, som ni ska implementera. Klassen ska läsa in kontakter från CSV-filen `contacts.csv` och lägga till i kontaktboken. När ni har lagt in alla kontakter ska ni printa hela kontaktboken.

Exempel på körning av programmet:

```bash
javac ContactBook.java
java ContactBook
Name: Bob Smith, Phone: 444-555-6666, Email: bob@email.com
Name: George Bluth, Phone: 135-246-8097, Email: george@email.com
Name: Alice Johnson, Phone: 111-222-3333, Email: alice@email.com
Name: Edward Scissorhands, Phone: 321-321-4321, Email: edward@email.com
Name: John Doe, Phone: 123-456-7890, Email: johndoe@email.com
Name: Fiona Gallagher, Phone: 543-765-9876, Email: fiona@email.com
Name: Diana Prince, Phone: 123-123-1234, Email: diana@email.com
Name: Charlie Brown, Phone: 777-888-9999, Email: charlie@email.com
Name: Hermione Granger, Phone: 246-810-8642, Email: hermione@email.com
Name: Jane Doe, Phone: 987-654-3210, Email: janedoe@email.com
```

> Tips: använd en `BufferedReader` i ett `try`/`catch`-block för att läsa in från filen och `split()`-metoden för att separera strängen.

---

**Om ni får tid över:** Lägg till funktionalitet för att ta bort kontakter och uppdatera kontakter i kontaktboken.

---

**Överkurs:** Läs in kontakter från flera filer.