# Övning 4 - Loopar

### **Vad pratade vi om förra veckan?**
* `if`-satser
* Dokumentation
* JShell
* Översättning från matematisk notation till kod

### **Loopar**
Ta några minuter och diskutera som ni sitter:
* Varför använder vi egentligen loopar?
* Vad finns det för olika loopar och när är de användbara?
* Vad gör de olika delarna `STEG1`, `STEG2` och `STEG3` i `for`-loopen här under? Kan vi göra samma sak med en `while`-loop och isåfall hur?

```java
for (STEG1; STEG2; STEG3) {
    // Kod
}
```

### **Vi går igenom `task-4`**
* Hur har det gått? 😎😀🙂😐😟🤬💀
* Diskussion
* Redovisning

---

### **FizzBuzz**
Den här veckan blir det en klassisk programmeringsuppgift: FizzBuzz!

Uppgiften går ut på att printa alla tal från och med $1$ upp till och med ett givet tal $n$. Kruxet är alla tal som är delbara med $3$ ska printa `Fizz` och alla som är delbara med $5$ ska printa `Buzz`. Om ett tal är delbart med både $3$ och $5$ ska det printa `FizzBuzz`.

Ett exempel på outputen för $n = 20$ är:

```bash
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
```

Titta på kodskelettet i `FizzBuzz.java` och implementera det som saknas för att `print()` ska ge korrekt output.

Ni kan testa att köra programmet genom att först kompilera och sedan köra programmet med en input från kommandoraden. För att köra programmet med $n = 20$ kan det se ut såhär:

```bash
javac FizzBuzz.java
java FizzBuzz 20
```

Kom ihåg att kompilera om ifall ni ändrar något och vill testa att köra programmet igen.

> Tips: för att avgöra delbarhet kan vi använda modulo-operatorn `%`. Till exempel kan vi se om `x` är delbart med `2` genom villkoret `x % 2 == 0`.

---

**Om ni får tid över:** Vad händer om vi vill lägga till så att `Bazz` printas om talet är delbart med $7$? Detta betyder att tal som är delbara med $3$ och $7$ ska printa `FizzBazz` och tal som är delbara med $5$ och $7$ ska printa `BuzzBazz`. Tal som är delbara med $3$, $5$, och $7$ ska printa `FizzBuzzBazz`.

---

**Överkurs:** Hur kan vi implementera en generaliserad klass `FizzBuzzBazz.java` så att vi enkelt kan lägga till ord som printas på samma sätt som tidigare ifall talet vi är på är delbart med ett godtyckligt tal $m$?

> Tips: använd er av en [`HashMap`](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) för att mappa siffror till ord.
