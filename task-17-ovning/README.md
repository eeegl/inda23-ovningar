# Övning: `task-17` – Trees

Veckans övning ser ut såhär:

- Redovisning `task-17` – Trees
    - Diskussion
    - Presentation
- Nytt i `task-18` – Graphs
    - Grafer
    - Sökning i grafer
- Kodningsuppgift

## Den här veckan (`task-17`: Trees)

Diskutera veckans task i par:

- Hur har det gått?
    - Vad gick bra?
    - Vad har varit extra svårt?
- Skiljer sig era lösningar?
    - Om ja, hur skiljer de sig?
    - Om nej, hur skulle man kunna göra annorlunda?
    - Finns fördelar/nackdelar med de olika sätten?

## Nästa vecka (`task-18`: Graphs)

### Grafer (abstrakt)

En **graf** $G$ är en datastruktur som beskriver *nätverk*. Matematiskt består den av två mängder: nodmängden $V$ (punkterna i grafen) och bågmängden $E$ (kopplingarna mellan punkterna).

Formellt skrivs det $G = (V, E)$.

Grafer används i många olika sammanhang för att modellera interrelaterad information, till exempel för att avgöra flöden i elektriska kretsar, hitta vägar i Google Maps, på Facebook för att representera sociala nätverk.

> Fråga: Vad är kopplingen mellan grafer, länkade listor och träd?

<!-- Svar: länkade listor och träd är specialfall av grafer. -->

Lite terminologi:

| **Term** | **På engelska** | **Beskrivning** |
|--|--|--|
| Nod/hörn | Node/vertex | En "punkt" i grafen |
| Båge/kant | Link/edge | En "koppling" mellan noder grafen |
| Komponent | Component | Delgraf som är helt avskilt från resten av grafen |
| Ordning | Order | Antal noder i en (ändlig) graf |
| Grad/valens (nod) | Degree/valency (node) | Antal bågar mellan en nod och andra noder |
| Oriktad graf | Undirected graph | Graf där bågar saknar riktning (ritas som streck) |
| Riktad graf | Directed graph | Graf där bågar har riktning (ritas som pilar) |
| Viktad graf | Weighted graph | Graf där bågar har ett värde |

> Vi tittar på några exempel.

### **Grafer (Java)**

Java har inte någon färdig implementering av grafer, den får ni göra själva.

### Sökning i grafer

Det finns två huvudsakliga sätt att söka i en graf: bredden-först-sökning och djupet-först-sökning.

**Bredden-först-sökning (BFS)** (engelska: *breadth-first search*) undersöker alla närliggande noder innan den går vidare.

**Djupet-först-sökning (DFS)** (engelska: *depth-first search*) följer den första noden för varje närliggande nod tills den inte kan gå längre.

> Vi tittar på några exempel.

## Kodningsövning

Ingen specifik kodningsövning den här veckan, ni får börja med `task-18`.

## Sammanfattning

* Task: binärt sökträd
* Grafer
* BFS
* DFS