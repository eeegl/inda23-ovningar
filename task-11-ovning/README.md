# **Övning 11 – Sorting and Searching**

### **Idag**
* Genomgång `task-11`
* Koncept i `task-12`: mer tidskomplexitet
* Kodkluring

---

### **Nyckelorden `break` och `continue` i Java**
När vi befinner oss i en loop vill vi ibland hoppa direkt till nästa iteration eller till och med avbryta loopen helt om en viss situation uppstår. Det kan vi göra med `continue` och `break`.

Vad printas när koden här under körs?

```java
/*
 * Demonstration av 'continue'.
 */
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // Hoppa över resten av denna iterationen
    }
    System.out.println(i); 
}

/*
 * Demonstration av 'break'.
 */
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break; // Hoppa ur loopen helt
    }
    System.out.println(i);
}
```

<details>
<summary>Svar</summary>

I det första fallet med `continue` kommer koden att skriva ut:

```
1
2
4
5
```

Detta beror på att när `i` är 3, hoppar koden över resten av iterationen med `continue` och går direkt till nästa iteration.

I det andra fallet med `break` kommer koden att skriva ut:

```
1
2
```

Detta beror på att när `i` når 3, avslutas loopen helt med `break`, och inga ytterligare tal skrivs ut.
</details>

---

### **Genomgång `task-11`**
* Hur har det gått?
* Vad har varit svårt?
* Redovisning

### **En titt på `task-12`**
* Sista uppgiften för terminen!
* Mer tidskomplexitet

### **Repetition: tidskomplexitet**

Här är tabellen från förra övningen med några vanligt förekommande tidskomplexiteter:

| Ordonotation | Tidskomplexitet | Betyg (ungefärligt)          | Förekommer (bland annat) vid                 |
|--------------|-----------------|-----------------|-------------------------|
| $O(1)$      | Konstant        | Mycket bra      | Hämtning av element från en array |
| $O(\log n)$ | Logaritmisk     | Bra             | Binärsökning i en sorterad lista |
| $O(n)$      | Linjär          | Ganska bra      | Genomsökning av en lista |
| $O(n^2)$    | Kvadratisk      | Ofta bästa möjliga | Urvalssortering            |
| $O(n!)$     | Fakultetisk     | Inte bra        | "Brute force"-lösningar på grafproblem |

> Värt att notera: inom datavetenskap betyder $\log n$ oftast $\log_2 n$.

Vi kommer mest använda $O(n)$ som ger en övre gräns. Andra begrepp är $\Omega(n)$ som ger en undre gräns och $\Theta(n)$ som ger både en övre och undre gräns, men de
används inte lika mycket. Skillnaderna visualiseras bra [här](https://www.programiz.com/dsa/asymptotic-notations).

### **Exempeluppgifter tidskomplexitet**
Vad är tidskomplexiteten för de här uttrycken?
1. $7n + 50000 + 1,532n^3$
1. $n(n - 1) + n$
1. $987654321$
1. $99999999x$
1. $y(y(y(y(y + 1)+2)+3)+4)+5$
1. $z(1234 + \log z)$

<details>
<summary>Svar</summary>

1. $O(n^3)$
1. $O(n^2)$   
1. $O(1)$
1. $O(x)$
1. $O(y^5)$
1. $O(z \log z)$

</details>

### **Kodningsövning**

Vi testar [leetcode.com](https://leetcode.com/) som är en sajt med en massa kodkluringar! Bilda par och försök att lösa uppgift 9: Palindrome Number (gör ett nytt konto om
ni behöver). Lyckas ni med den kan ni välja att göra en till eller börja med `task-12`.

### **Sammanfattning**
* Tidskomplexitet och ordo
* Leetcode
