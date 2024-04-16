# **Github-lathund**

>*OBS: Git och Github är två olika saker, även om de är relaterade. Git är ett [versionshanteringssystem](https://sv.wikipedia.org/wiki/Versionshantering) (kommandona ni kör i terminalen) och Github är en webbsida för att hantera Git-repon.*

## **Introduktion**

Det här dokumentet är ett överlevnadskit för Git och innehåller de viktigaste kommandona ni behöver. För den som är intresserad kan ni läsa mer här:

- [Git-boken](https://git-scm.com/book/en/v2)
- [Atlassians tutorials](https://www.atlassian.com/git/tutorials)
- [W3 Schools tutorial](https://www.w3schools.com/git/)


Utöver kommandona listade här kan det vara skönt att ha en städad och strukturerad repo. Det är inga konstigheter, lägg filer i mappar och döp saker ordentligt så kommer ni att tacka er själva i framtiden.

Ett annat knep för att hålla ordning i repot är att strunta i oväsentliga filer (till exempel `.class`-filer i Java). Det kan ni göra genom att lista filerna i en `.gitignore`-fil. Vi går inte igenom syntaxen här, men ni kan klippa och klistra från [Githubs egen repo för `.gitignore`-filer](https://github.com/github/gitignore) eller kopiera den från era tidigare tasks.

För att kunna använda alla kommandon korrekt är det viktigt att förstå hur Git hanterar filer. Det finns fyra olika möjliga "tillstånd" en fil kan ha:

1. **Untracked** - filen är *okänd* för Git, i alla andra steg är filen *känd*
1. **Unmodified** - filen *har ej förändrats* sedan senaste commit
1. **Modified** - filen *har förändrats* sedan senaste commit
1. **Staged** - filen är redo och *kommer att tas med i nästa commit*

De olika tillstånden och deras inbördes relationer är visualiserade i den här bilden:

![image](./imgs/git-kretslopp.png)
> *De olika tillstånden för en Git-fil.*

## **Lathund**

### **Visa ändringar och historik**

> *Dessa kommandon är bra för att se nuvarande status och vad som har hänt tidigare.*

För att se **ändringar sedan senaste commit**, använd:

```
git status [-s]
```
> *Valfri flagga: \
> `-s` ger kompakt vy.*

För att se **ändringar i en specifik fil**, använd:

```
git diff
```

För att se **commit-historiken**, använd:

```
git log [--oneline] [--graph] [--all]
```
> *Valfria flaggor: \
> `--oneline` ger kompakt vy. \
> `--graph` visar förgreningar som en graf. \
> `--all` visar alla commits.*

### **Hantera ändringar (lokalt)**

För att **börja spåra nya filer** eller **registrera ändringar**, använd:
```
git add <filer>
```
> *Använd `git add .` för att registrera alla ändringar i nuvarande mapp.*

För att **radera filer**, använd:
```
git rm [-f] <filer>
```
> *Valfri flagga: \
> `-f` tvingar att kommandot genomförs. Var försiktig när du gör detta, eftersom det inte går att ångra sig.*

För att **bokföra ändringar**, använd:
```
git commit -m "Mitt commit-meddelande"
```

### **Ångra eller uppdatera ändringar (lokalt)**

För att **addera till senaste commit**, använd:
```
git commit --amend
```

För att **gå tillbaka till en tidigare commit**, använd:
```
git reset [--hard]
```
> *Ange commit-ID för att hoppa till en specifik commit, annars antas commit vara den senaste.*
>
> *Valfria flaggor: \
> `--hard` rensar alla nuvarande ändringar och återställer commit.*

För att **göra en kopia av en tidigare commit**, använd:
```
git revert
```

### **Dela/ta del av ändringar (remote)**

För att **klona (ladda ner) ett repo**, använd:
```
git clone <adress>
```
> *Du hittar adressen genom att navigera till repot på Github och trycka på den gröna "Code"-knappen.*

För att **pusha (ladda upp) ett repo**, använd:
```
git push
```

För att **uppdatera ett lokalt repo (ladda ner ändringar) från ett remote (på Github)**, använd:
```
git pull
```

### **Förgreningar**

För att **visa tillgängliga grenar (branches)** använd:
```
git branch
```

För att **skapa en ny gren med namnet `<branch>`** använd:
```
git branch <branch>
```

För att **radera en gren med namnet `<branch>`** använd:
```
git branch -d <branch>
```

För att **hoppa till en gren med namnet `<branch>`** använd:
```
git checkout <branch>
```