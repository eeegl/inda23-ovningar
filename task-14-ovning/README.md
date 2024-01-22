# **Övning: `task-14` – Linked Lists**

Veckans övning ser ut såhär:

- Redovisning `task-14`
- Nytt i `task-15`
- Kodningsuppgift

## Den här veckan (`task-14`: Linked Lists)

### Diskussion

Diskutera veckans task i par:

- Hur har det gått?
    - Vad gick bra?
    - Vad har varit extra svårt?
- Skiljer sig era lösningar?
    - Om ja, hur skiljer de sig?
    - Om nej, hur skulle man kunna göra annorlunda?
    - Finns fördelar/nackdelar med de olika sätten?

### Redovisning

En grupp redovisar veckans task.

## Kommande vecka (`task-15`: Stacks)

### Stack (abstrakt)
Engelska för *stapel*, tänk er tallrikar staplade ovanpå varandra.

Är av varianten LIFO (Last In, First Out), vi har bara direkt tillgång till det översta (senast tillagda) elementet.

De vanligaste metoderna är

- **push()**: Lägger till ett element överst i stacken.
- **pop()**: Hämtar det översta elementet i stacken.

### Stack (Java)
Det går att använda `LinkedList` som en stack. Java har en egen `Stack`-klass, men hänvisar till `Deque`-klassen (double ended queue) som en mer komplett implementering.

### Prefix- infix- och postfixnotation
Syftar på var operatorer skrivs i förhållande till operanderna. Med additionsoperatorn (`+`) som exempel får vi:

| Namn    | Notation |
|---------|----------|
| Prefix (polsk notation) |  `+ a b` |
| Infix   |  `a + b` |
| Postfix (omvänd polsk notation) |  `a b +` | 

### Reguljära uttryck
Reguljära uttryck (engelska: *regular expressions*) är sökmönster som används för att matcha strängar. 

En bra hemsida för att testa reguljära uttryck är [Regex 101](https://regex101.com/).

> **Bra att veta:** det finns [två huvudtyper](https://www.gnu.org/software/sed/manual/html_node/BRE-vs-ERE.html) av reguljära uttryck, basic regular expressions (BRE) och extended regular expressions (ERE). De fungerar i stort sett likdant, men hanterar specialtecken olika.

## **Kodningsövning**

Den här veckan ska vi använda en stack för att avgöra om ett parentesuttryck är giltigt.

1. Börja med att lösa [Leetcode: 20. Valid parentheses](https://leetcode.com/problems/valid-parentheses/). Skapa ett konto om ni inte redan har ett.
2. När ni är färdiga med Leetcode kan ni gå in på [Regex 101](https://regex101.com/) och testa olika sökmönster för reguljära uttryck. En bra visuell lathund för reguljära uttryck finns även på [Datacamp](https://www.datacamp.com/cheat-sheet/regular-expresso).

> Om ni blir klara kan ni börja med `task-15`.

### **Sammanfattning**

- Stack
- Prefix-, postfix- och infixnotation
- Reguljära uttryck
