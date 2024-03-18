# Övning: `palinda-1` – Introduction to Go

Veckans övning ser ut såhär:

- Info om DD1396
- Redovisning `palinda-1` – Introduction to Go
    - Diskussion
    - Presentation
- Inför `palinda-2` – Concurrency Conundrums
    - Vanliga problem med samtidighet
		- Deadlock
		- Data race
    - `sync.WaitGroup`
- Kodningsuppgift


## Info om DD1396

Kursen består av tre uppgifter och är P/F (godkänt/icke-godkänt).

Betygssättning:

| Antal `Fail` | Antal `Pass` | Betyg |
| ------------ | ------------ | ----- |
| 0            | 3            | P     |
| ≥ 1          | ≤ 2          | F     |

> Sedan bara projektkursen kvar!

## Den här veckan (`palinda-1` – Introduction to Go)

Diskutera veckans task i par:

- Hur har det gått?
    - Vad gick bra?
    - Vad har varit extra svårt?
- Skiljer sig era lösningar?
    - Om ja, hur skiljer de sig?
    - Om nej, hur skulle man kunna göra annorlunda?
    - Finns fördelar/nackdelar med de olika sätten?

## Nästa vecka (`palinda-2` – Concurrency Conundrums)

### Repetition

<details>
<summary>Vad är skillnaden mellan samtidighet och  parallellism?</summary>
</br> 

**Samtidighet** (engelska: *concurrency*) innebär att flera saker *hanteras* samtidigt. 
</br> 

**Parallellism** (engelska: *parallelism*) innebär att flera saker *sker* samtidigt.
</details>

### Samtidighetsproblem

Två av de vanligaste problemen som uppstår i samtidiga program är *deadlocks* och *data races*.

<details>
<summary>Ett <b>deadlock</b> (svenska: <i>dödläge</i>) är när...</summary>
</br>

...alla trådar (gorutiner) i ett program väntar på varandra, så att programmet fryser.
</details>

> Vi tittar på ett exempel.
</br>

<details>
<summary>Ett <b>data race</b> (svenska: <i>kapplöpning</i>) är när...</summary>
</br>

...två trådar (gorutiner) försöker ändra samma data vid samma tidpunkt, vilket leder till att datan inte uppdateras korrekt.
</details>

> Vi tittar på ett exempel.


### Metoder i Go

I Go är metoder och funktioner olika saker.

Funktioner är *fristående*. De hör inte ihop med något.

Metoder hör till en `struct`. Det är lite som klassmetoder i `Java`.

#### Exempel:

```go
package main

import "fmt"

type Person struct {
	name string
}

// (p Person) är en VALUE RECEIVER.
// Den skapar ny kopia av 'p'.
// Använd om du inte ska göra några förändringar.
func (p Person) printName() {
	fmt.Println("Name is:", p.name)
}

// (p *Person) är en POINTER RECEIVER.
// Den refererar till originella 'p'.
// Använd om du ska förändra det originella värdet.
func (p *Person) updateName(name string) {
	fmt.Println("Updating name...") 
	p.name = name
}

func main() {
	p := Person{"ÖRN"}
	p.printName()
	p.updateName("Örn")
	p.printName()
}
```


## Kodningsövning

Er uppgift den här veckan är att fixa buggen i [`src/increment.go`](src/increment.go).

Börja med att titta igenom koden för att förstå vad den gör.

Identifiera sedan felet genom att köra koden med

```bash
go run increment.go
```

och se vad som printas.

Vad händer om ni höjer `numWorkers` och `incrementCount`? Varför? Vilken typ av bugg är det vi har att göra med?

När ni har kommit underfund med vad som är felet ska ni försöka fixa det. Det räcker med två extra rader kod för att fixa buggen, och i koden som är given finns redan alla verktyg som behövs för att lösa uppgiften.

> Om ni blir klara kan ni börja med `palinda-2`.
