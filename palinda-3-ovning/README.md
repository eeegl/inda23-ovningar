# Övning: `palinda-3` – Parallel Performance    

Veckans övning ser ut såhär:

- Redovisning `palinda-3` – Parallel Performance
    - Diskussion
    - Presentation
- Ny kurs: DD1349 (Projekt)
    - Info
    - Git
    - GitHub
- Enkät
- Kodningsuppgift


## Den här veckan (`palinda-3` – Parallel Performance)

Diskutera veckans task i par:

- Hur har det gått?
    - Vad gick bra?
    - Vad har varit extra svårt?
- Skiljer sig era lösningar?
    - Om ja, hur skiljer de sig?
    - Om nej, hur skulle man kunna göra annorlunda?
    - Finns fördelar/nackdelar med de olika sätten?

## Nästa vecka (start DD1349)

### DD1349 Projektuppgift i introduktion till datalogi (Palinda)

Kortfattat gäller följande (mer detaljer nästa övning):

- Arbete sker i par (inom TA-gruppen)
- Programspråk är valfritt
- Projektidéer måste godkännas innan ni börjar
- Ni bedöms på *projektet*, inte på *koden*
- Betygssättning är godkänt/icke-godkänt (Pass/Fail)

### Git vs. GitHub

Vad är skillnaden?

<details>
<summary>Skillnaden är att...</summary>
<ul>
    <li>Git <i>hanterar förändringar</i></li>
    <li>GitHub <i>hanterar Git-repon</i></li>
</ul>
</details>


### Git

Git är ett *versionshanteringssystem* utvecklat av Linus Torvalds (skaparen av Linux).

Om du har en mapp med en `.git`-mapp i, så används Git.

De olika "tillstånden" för en fil i Git:

1. **Untracked** - filen är *okänd* för Git, i alla andra steg är filen *känd*
1. **Unmodified** - filen *har ej förändrats* sedan senaste commit
1. **Modified** - filen *har förändrats* sedan senaste commit
1. **Staged** - filen är redo och *kommer att tas med i nästa commit*

![image](./imgs/git-kretslopp.png)

*De olika tillstånden för en Git-fil.*

#### Vanliga kommandon

> Mer finns i [Git-lathunden](git-lathund.md).

```bash
# Se förändringar
git diff
git status

#Gå tillbaka till commit
git revert <commit-id>
git reset <commit-id>

#Se alla branches
git branch    # Endast lokala
git branch -a # Även remote

# Skapa ny branch
git branch <namn>

# Byt branch
git checkout <namn>

# Förbered ändringar för commit (stage:a)
git add <filer>

# Commit:a filer
git commit # Meddelande i textredigerare (akta för Vim)
git commit -m "Meddelande" # Snabbcommit

# Lägg till ändringar till commit
git commit --amend

# Ladda upp filer
git push

# Ladda ner filer
git pull
```

**OBS: kom ihåg att skilja mellan `commit` och `push`. För lokala ändringar, använd `commit`. När du vill dela med dig av de ändringar du har gjort använder du `push`.**


#### Resurser

- [Git-boken](https://git-scm.com/book/en/v2)
- [Atlassians tutorials](https://www.atlassian.com/git/tutorials)
- [W3 Schools tutorial](https://www.w3schools.com/git/)


### GitHub

GitHub är en *onlineplattform* för att hantera Git-repon. Det bygger på Git, men har ett användargränssnitt som gör det lättare att använda och samarbeta med andra.

GitHub erbjuder bland annat:

- Issues (gemensam anslagstavla)
- Pull Requests (kvalitetsgranskningar)
- Projects (yta för projektplanering/Kanban)
- Actions (koppla funktionalitet till händelser)

## Kodningsövning: intro till Git och GitHub

Som förberedelse inför projektet kommer här en uppvärmning med Git och GitHub. Uppgiften är ganska lång, så det gör inget om du inte hinner klart innan övningen är slut. Du kan även referera till den här senare under projektet om du vill.

Själva uppgiften hittar du i filen [`intro-till-git-och-github.md`](intro-till-git-och-github.md).

Lycka till!

> *Om du blir klar kan du börja fundera på projektidéer och programspråk.*

### **Sammanfattning**

- Projinda
- Git
- GitHub

