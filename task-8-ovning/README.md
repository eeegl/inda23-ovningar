# **Övning 8 – Adventure awaits!**

### **Idag**
* Testa varandras spel!
* Nytt i `task-9`: testning
* Annotationer
* JUnit

> **Påminnelse: formatera kod (`SHIFT + ALT + F` i VSC) och använd Javadoc!**

### **Testa varandras spel!**
Bilda par (tre funkar om vi är udda) och testa varandras spel! Diskutera lite vad som var bra och vad som kunde varit bättre. Titta på varandras kod och se var ni har tänkt lika/olika.

### **En titt på `task-9`**
* Testning!
* Annotationer

### **Kort om testning**
Ju större projekt vi jobbar med, desto fler buggar kommer uppstå. För att motverka detta använder vi oss av *testklasser* som kontrollerar att vår kod uppför sig som vi förväntar oss.

Tester namnges som `KlassNamn` + suffixet `Test`. Så testet till exempelvis klassen `MyClass` skulle vara `MyClassTest`.

### **Kort om annotationer**
Annotationer används för att ge ytterligare information om koden du har skrivit. De börjar med ett `@`-tecken och skrivs med inledande versal. Ett exempel är `@Override` som används för att överskugga (byta ut) ärvda metoder:

```java
@Override
public String toString() {
    // Kod    
}
```

### **JUnit**
JUnit är ett externt bibliotek som används för testning. För att få det att fungera behöver vi importera det till vårt projekt. 

> **OBS! I den här kursen använder vi JUnit 4.12**

JUnit använder dessa annotationer:

* `@Before`: gör något innan testerna körs
* `@Test`: indikera att en metod är ett test
* `@After`: rensa upp efter att testerna har körts

### **Snabbguide till JUnit i VSC**
1. Tryck på "Extensions"-fliken i menyn till vänster och ladda ner "Extension pack for Java" (om du inte redan har det)
1. Tryck på "Testing"-fliken, välj "Enable Java Tests" och sedan "JUnit"
1. Se till att du har mappen `lib` i din workspace, som inehåller filerna
    - `hamcrest-core-1.3.jar`
    - `junit-4.12.jar` (inte 4.13!)
1. Skumma igenom `Adder.java` och `AdderTest.java`
1. I `AdderTest.java` borde du se en grön "play"-knapp till vänster om klassen, tryck på den
1. Om allt har gått rätt till borde du se att testerna blir gröna och allt funkar!

### **Kodningsövning**
Fakultetfunktionen $n!$ brukar definieras rekursivt som
$n!=n\cdot(n-1)\cdot(n-2)\cdot \ldots \cdot 2 \cdot 1$. Men den går även bra att definiera iterativt. Gör en `Factorial`-klass med iterativ implementation av fakultetfunktionen och skriv några tester till den. Använd metodheadern

```java
public static int fact(int n)
```

Försök tänka ut rimliga testfall, och tänk på specialfall. Som exempel: vad händer för fakulteten av negativa tal?

### **Sammanfattning**
* Prova spel
* Testning
* Annotationer
* JUnit
