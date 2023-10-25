# Övning 3 – Is this a Triangle?

### **Info**
* Kom ihåg att kolla era issues för att se om ni får komplettering

### **Vad pratade vi om förra veckan?**
* Objekt
* Getters och setters
* Access modifiers (åtkomstmodifierare) som `public` och `private`
* Kortkommandon i Visual Studio Code


### **Diskussion**
Ta några minuter och diskutera som ni sitter:
* Varför använder vi egentligen if-satser?
* Hur skulle man kunna koda en egen version av absolutbelopssfunktionen? Som påminnelse är definitionen:

$$
| x | = 
\begin{cases} 
x & \text{if } x \geq 0 \\
-x & \text{if } x < 0 
\end{cases}
$$


### **Vi går igenom `task-3`**
* Hur har det gått? 😎😀🙂😐😟🤬💀
* Redovisning

### **Dokumentation**
Hur kan vi svara på frågor som

"Hur fungerar egentligen `String`-klassen?"

Helt enkelt genom att läsa dokumentationen. Ni hittar lättast genom att google på till exempel *Java String documentation* och gå in på Oracles hemsida.

### **JShell**
Den här veckan kommer ni att få arbeta med JShell, ett interaktivt program för att testa Java-kod. Det kan vara smidigt att använda när du bara vill testa en kodsnutt och inte orkar skriva en hel klass.

1. Gå in och skumma igenom dokumentationen för [JShell](https://docs.oracle.com/en/java/javase/20/jshell/introduction-jshell.html#GUID-630F27C8-1195-4989-9F6B-2C51D46F52C8).
1. Öppna terminalen och starta JSell med kommandot `jshell` (borde finnas installerat, säg till annars)
1. Testa att utvärdera `boolean`-uttrycken i veckans task om ni inte redan har gjort det.
1. Gör er egen definition av absolutbeloppsfunktionen (se definitionen ovan).

**Om ni får tid över:** Skriv en helt egen klass som använder sig av allt vi har lärt oss hittills! Det är helt fritt att hitta på vad ni vill, men se till att få med:

* Åtminstone två fält
* En konstruktor
* En metod som inte är getter/setter
* En `if`-sats

Har ni svårt att komma på något kan ni göra en `Person`-klass med fält som `age` och `name`, som printar information om personen på det här formatet:

```
Name = {Personens namn}
Age = {Personens ålder}
Can vote = {Om personen har rösträtt (baserat på ålder)}
```


