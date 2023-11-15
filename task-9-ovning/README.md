# **Övning 9 – Testing**

### **AI-bot uppe**
Ni kan nu få automatisk feedback på Github issues! Ni kan få övningsfrågor om er kod, få hjälp eller få er Java-kod alternativt ert repo utvärderat.

Skapa ett nytt issue med titeln `help`, så får ni mer detaljer.

---

### **Idag**
* Info om DD1338
* Genomgång `task-9`
* Nytt i `task-10`
* Repetition av testning
* Kodningsövning: rekursion

### **Info om DD1338 (Algoritmer och datastrukturer)**

Startar nästa vecka, den 24 november!

#### **Ni kan förvänta er:**
* **Algoritmer** (sortering, sökning, med mera)
* **Datastrutkturer** (listor, stacks, binära träd, sets, hashtables, med mera)
* **Tidskomplexitet** (analys av hur effektiv vår kod är)
* **Tester** (mer JUnit)
* **Rapportskrivning** (om en algoritm)
* ...och en massa annat

#### **Viktigt för kursen**
* Läs [kurskraven](https://gits-15.sys.kth.se/inda-23/course-instructions/blob/master/DD1338/README.md)
* Använd [Javadoc](https://www.tutorialspoint.com/java/java_documentation.htm)-kommentarer
* Ni kommer skriva (några få) egna tester för varje övning
* **Formatera er kod (`SHIFT + ALT + F i VSC`)**
* **Se till att testerna fungerar**
* Om ni har rimlig anledning att inte komma på övningen: kommunicera det **i god tid**

#### **Upplägg**
Kursen består av 9 inlämningar (`task-10` till och med `task-18`), plus en tvåveckorsuppgift `quicksort` i slutet. Där ska ni implementera olika versioner av quicksort-algoritmen första veckan och analysera och skriva en rapport om den andra veckan.

#### **Betygssättning**
För att få godkänt i kursen måste ni ha
1. ett godkänt betyg (alltså A-E)
2. en godkänd inlämning på `quicksort` (alltså `Pass`)

Alla startar med A. För varje `Fail` sänks betygssteget ett hack, så:

| Antal `Fail` | Antal `Pass` | Betyg |
|--------------|--------------|-------|
| 0            | 9            |   A   |
| 1            | 8            |   B   |
| 2            | 7            |   C   |
| 3            | 6            |   D   |
| 4            | 5            |   E   |
| ≥ 5          | ≤ 4          |   F   |

Såhär bedöms era tasks generellt (specialfall kan förekomma):
| Bedömning | Kriterier |
|-----------|-----------|
| `Pass`    | <li> Närvaro på övningen<br><li> Task inlämnad i tid<br><li> Alla tester godkända |
| `Komp`    | <li> Misslyckade tester<br><li> Dålig formatering<br><li> Inga Javadoc<li>kommentarer |
| `Fail`    | <li> (Ogiltig) frånvaro<br><li> Ingen inlämning |

Jag kommer att vara hårdare den här kursen med formatering och inlämning i tid.

### **Genomgång `task-9`**
* Funkar JUnit?
* Redovisning

### **En titt på `task-10`**
* Unit testing!
* Test Driven Development

### **Repetition: unit testing och JUnit**

- **Unit testing (*enhetstestning*)** testar enskilda "enheter" i koden (t.ex. metoder, klasser)
- **JUnit** är själva biblioteket med all testfunktionalitet
- **Hamcrest** är ett ramverk för att skriva mjukvarutester och används av JUnit
- I den här kursen använder vi JUnit version **4.12**

### **Testning i kommandotolken**
Om JUnit krånglar i VSC kan vi köra tester i kommandotolken (terminalen). Då använder vi följande kommando:

```
java -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MyClassTest
```

(Förutsatt att filerna `junit-4.12.jar` och `hamcrest-core-1.3.jar` finns i mappen vi befinner oss i.)

Om vi dissikerar raden så består den av:

* `java` anropar JRE (Java Runtime Environment) för att köra programmet.
* `-cp` är en förkortning för `--classpath` och gör att Java inkluderar de
  klasserna angivna inom citattecken.
* `.:junit-4.12.jar:hamcrest-core-1.3.jar` består av
    * `.` (punkt) för current directory.
    * `junit-4.12.jar` är sökväg till JUnit-biblioteket.
    * `hamcrest-core-1.3.jar` sökväg till Hamcrest-biblioteket.
    * `:` (kolon) för att separera de olika sökvägarna.
* `org.junit.runner.JUnitCore` är kärnan i JUnit (behövs för att köra tester).
* `MyClassTest` är testklassens namn.

### **Kodningsövning: rekursion**
I veckans övning ska vi repetera rekursion. Som en påminnelse är rekursion *något som definieras i termer av sig självt*. Er uppgift är helt enkelt att implementera metoderna i kodskelettet i klassen [`RecursiveExercises.java`](RecursiveExercises.java). För att testa er kod kan ni köra testerna i [`RecursiveExercisesTest.java`](RecursiveExercisesTest.java).

Lite kort repetition. Rekursion brukar delas in i **basfall** och **rekursionssteg**, vilket påminner lite om induktion. Rekursionen säger hur vi ska beräkna nästa steg och basfallet säger när vi ska sluta, så att vi inte får *oändlig* rekursion.

Först exemplet i [den här videon](https://www.youtube.com/watch?v=ngCos392W4w&ab_channel=Reducible) ger en bra introduktion.

> *Tips:* \
> Skriv ner olika exempel och försök hitta mönster som ni kan använda som basfall och rekursion i er kod.

### **Sammanfattning**
* DD1338
* Testning
* Rekursion
