# Övning: `quicksort` – Implementering

Veckans övning ser ut såhär:

- Redovisning `quicksort` – Implementering
    - Diskussion
    - Presentation
- Inför `quicksort` – Rapport
    - Om rapporten
    - Körtidstester
- Nästa kurs: DD1396
- Kodningsuppgift

## Info

Deadline för `quicksort`-rapporten har skjutits upp till tisdag 19 mars.

Idag är sista övningen i DD1338! Nästa övning blir första övningen i DD1396, fredag 22 mars.

## Den här veckan (`quicksort` – Implementering)

Diskutera veckans task i par:

- Hur har det gått?
    - Vad gick bra?
    - Vad har varit extra svårt?
- Skiljer sig era lösningar?
    - Om ja, hur skiljer de sig?
    - Om nej, hur skulle man kunna göra annorlunda?
    - Finns fördelar/nackdelar med de olika sätten?

## Nästa vecka (`quicksort` – Rapport)

Återigen: ingen övning nästa vecka.

Kom ihåg att Kattis-ID för godkänd inlämning ska lämnas in i `docs/submission.txt`

### Rapport

Skriv gärna i Latex (dock inget krav).

För graferna kan ni använda [Matplotlib](https://matplotlib.org/stable/users/getting_started/), som är ett Python-bibliotek för just att rita grafer. Det är inget krav, men kan vara kul att pröva på.

### Körtidstester

Utgå från kodskelettet ni har fått i `TimingExample`-klassen. Använd er av `Data` för att generera data till era tester, och `StopWatch` för att tajma era olika algoritmer.

Ett tips är att skriva ett _program som skriver ut ett program_ för Maplotlib (eller hur ni väljer att representera datan).

## Nästa kurs: *DD1396 Parallellprogrammering i introduktion till datalogi*

Kursen kallas *Palinda* och pågår i tre veckor (tre tasks och tre övningar). Vi kommer även att jobba i ett ***nytt programspråk:***

![image](go.webp)

### Vad handlar kursen om?

I kursen kommer vi att fokusera på hur man programmerar för att hantera flera olika saker som händer på samma gång. Här brukar man skilja mellan *samtidighet* och *parallellism*.

**Samtidighet** (engelska: *concurrency*) innebär att flera saker *hanteras* samtidigt. 

**Parallellism** (engelska: *parallelism*) innebär att flera saker *sker* samtidigt.

Lite förenklat kan man säga att samtidighet handlar om att samordna olika delar av ett program som utför olika arbeten och att parallellism handlar om att dela upp program på olika processorer som jobbar oberoende av varandra. Det går även att skriva program som är både samtidiga och parallella.

> Vi tittar på ett exempel.

### Vad är Go?

Go är ett programspråk skapat av Google, med inbyggt stöd för samtidighet. Språket påminner till viss del om Java, men skiljer sig en aning. Till exempel är Go inte (riktigt) objektorienterat.

## Kodningsövning

Veckans övning ska vi komma igång och pröva Go!

Navigera till https://go.dev/doc/install för att ladda ner och installera Go.

När du har gjort det kan du kontrollera att allt fungerar som det ska genom att köra följande kommando i terminalen:

```bash
go version
```

Du borde få något som liknar denna output:

```bash
go version go1.21.5 darwin/arm64
```

Du kan nu navigera till introduktionsguiden _A Tour of Go_ på https://go.dev/tour/welcome/1. Skumma igenom _Using the tour_, men lägg fokus på _Basics_. 

> Om ni blir klara kan ni fortsätta med `quicksort`.

## Sammanfattning

- Rapport
- Körtidstester
- Go
