# Övning: `task-18` – Graphs

Veckans övning ser ut såhär:

- Redovisning `task-18` – Graphs
    - Diskussion
    - Presentation
- Nytt i `quicksort` – Quicksort
    - Upplägg
    - Quicksort-algoritmen
- ~~Kodningsuppgift~~

## Den här veckan (`task-18` – Graphs)

Diskutera veckans task i par:

- Hur har det gått?
    - Vad gick bra?
    - Vad har varit extra svårt?
- Skiljer sig era lösningar?
    - Om ja, hur skiljer de sig?
    - Om nej, hur skulle man kunna göra annorlunda?
    - Finns fördelar/nackdelar med de olika sätten?

## Nästa vecka (`qiucksort` – Quicksort)

Sista uppgiften i kursen!

> OBS: För godkänt i DD1338 krävs godkänt på `quicksort`.

### Upplägg

Quicksort-uppgiften är utspridd över två veckor:

- **Vecka 1: Implementering**
    - En implementering av instickssortering
    - Fyra implementeringar (varianter) av quicksort
    - Testklasser för alla fem implementeringar
    - En av quicksort-implementeringarna måste klara testerna på [Kattis](https://kth.kattis.com/)
- **Vecka 2: Analys**
    - En klass för körtidstester
    - En rapport

### Quicksort-algoritmen

**Quicksort** är en snabb jämförelsebaserad söndra-och-härska-sorteringsalgoritm.

*Jämförelsebaserad* innebär att den använder sig av en jämförelseoperation som grund för sorteringen, som i instickssortering och urvalssortering. Det går att bevisa att all jämförelsebaserad sortering är *omöjlig* att genomföra snabbare än $\mathcal{O}(n \log n)$. 

*Söndra-och-härska* innebär att den bryter ner hela problemet i delproblem som löses rekursivt.

Grunden i quicksort går ut på att välja ett element och placera alla mindre element "till vänster" och alla större "till höger" om elementet. Genom att dela upp alla element på detta sätt vet vi att det valda elementet kommer att vara på rätt plats i den slutgiltiga sorterade listan (*varför?*). Elementet som väljs kallas *pivotelement* och uppdelningen kallas *partitionering*.

Efter partitioneringen upprepas samma steg rekursivt för de båda dellistorna med elementen "till vänster" och elementen "till höger".

Basfallet är listan med ett enda element, som vi anser vara sorterad.

Alltså:

1. Om listan innehåller 1 element, returnera. Annars:
2. Välj ett pivotelement.
3. Partitionera listan.
4. Kör rekursivt från steg 1 för vänster och höger dellista.

> Vi torrkör ett exempel.

#### Tidskomplexitet

- Bästa fall: $\mathcal{O}(n \log n)$
- Värsta fall: $\mathcal{O}(n^2)$
- Genomsnitt: $\mathcal{O}(n \log n)$

> Fråga: Varför får vi just dessa tidskomplexiteter?

#### Att välja pivotelement

Det värsta fallet uppstår när listan är sorterad eller omvänt sorterad och vi väljer första eller sista elementet. För att undvika detta finns olika metoder. 

En vanlig är *median of three*, där vi väljer medianen av det första, mellersta och sista elementet i listan. 

En annan metod går ut på att helt enkelt slumpmässigt kasta om ordningen i listan innan vi kör sorteringen. Detta går att göra i linjär tid $\mathcal{O}(n)$. Eftersom jämförelsebaserad sortering inte går att genomföra snabbare än linearitmisk tid $\mathcal{O}(n \log n)$, så vi *tjänar* faktiskt på att lägga till ett extra steg där vi rör om listan linjär tid för att undvika kvadratisk tid $\mathcal{O}(n^2)$.

## Kodningsövning

Ingen specifik kodningsövning den här veckan, ni får börja med `quicksort`.

## Sammanfattning

- Quicksort
    - Generell algoritmidé
    - Tidskomplexitet
    - Välja pivotelement
