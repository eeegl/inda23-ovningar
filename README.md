# Övningsrepo för INDA-kursen

Hej! I det här repot hittar du planeringar och uppgifter för INDA-övningarna. Övningarna ligger i separata mappar som är döpta på formatet "`tasknamn`" + "`-ovning`", så för till exempel `task-1` heter övningsrepot `task-1-ovning`.

Du kan klona (ladda ner) det här repot och sen uppdatera det varje gång en ny övning kommer upp. Du behöver inte (och kan inte) pusha dina ändringar till det här repot.

### Hur klonar jag repot?
Du klonar repot så här:
1. Tryck på den gröna **Code**-knappen längst upp på Githubsidan, välj **SSH** och kopiera länken.
1. Bestäm i vilken mapp du vill ha alla övningar och navigera dit i terminalen.
1. När du är i din valda mapp använder du `git clone` för att ladda ner:

```
git clone git@github.com:eeegl/inda23-ovningar
```

Nu är du klar! Använd `ls` för att se att du har fått mappen och att allt har funkat som det ska.

### Hur uppdaterar jag repot?
Om du redan har laddat ner repot och vill uppdatera det när en ny övning har kommit upp gör du så här:

1. Se till att du är i övningsmappen som du har lokalt på din dator.
1. När du är i din valda mapp använder du `git pull` i terminalen för att få alla nya uppdateringar:

```
git pull
```

Klart! Nu kan du öppna i Visual Studio Code (eller valfri textredigerare) och börja med övningen.

> OBS: Om du har gjort ändringar som krockar med uppdateringarna kan du få en merge conflict som du behöver lösa. Du kan läsa mer om det [här](https://www.atlassian.com/git/tutorials/using-branches/merge-conflicts).

## **Info om DD1338 (Algoritmer och datastrukturer)**

Start den 24 november!

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
* Ni kommer skriva tester för varje övning
* **Formatera er kod (`SHIFT + ALT + F i VSC`)**
* **Se till att testerna fungerar**

#### **Betygssättning**
Kursen består av 9 inlämningar (`task-10` till och med `task-18`) och 

Alla startar med A. För varje `Fail` sänks betygssteget ett hack, så:

| Antal `Fail` | Betyg |
|--------------|-------|
| 0            |   A   |
| 1            |   B   |
| 2            |   C   |
| 3            |   D   |
| 4            |   E   |
| 5+           |   F   |

Såhär bedöms era tasks generellt (specialfall kan förekomma):
| Bedömning | Kriterier |
|-----------|-----------|
| `Pass`    | <li> Närvaro på övningen<br><li> Task inlämnad i tid<br><li> Alla tester godkända |
| `Komp`    | <li> Misslyckade tester<br><li> Dålig formatering<br><li> Inga Javadoc<li>kommentarer |
| `Fail`    | <li> (Ogiltig) frånvaro<br><li> Ingen inlämning |