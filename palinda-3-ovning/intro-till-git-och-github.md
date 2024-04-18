# Intro till Git och GitHub

Det här dokumentet är en guide med syfte att ge dig en interaktiv introduktion till Git och GitHub. Förhoppningsvis kan du ha användning av den både före och under (och kanske till och med efter) projektet.

> [!TIP]
> Referera gärna till [Git-lathunden](git-lathund.md) under guidens gång.

## Innehåll

- [Del 1 — Att komma igång](#del-1--att-komma-igång)
    - [1.1 Att starta ett Git-repo](#11-att-starta-ett-git-repo)
    - [1.2 Att hantera filer](#12-att-hantera-filer)
    - [1.3 Att koppla Git till GitHub](#13-att-koppla-git-till-github)
    - [1.4 Sammanfattning](#14-sammanfattning)
- [Del 2 — Att ångra sig](#del-2--att-ångra-sig)
    - [2.1 — Att unstaga icke-commitade ändringar](#21-att-unstaga-icke-commitade-ändringar)
    - [2.2 — Att rensa alla nya ändringar](#22-att-rensa-alla-nya-ändringar)
    - [2.3 — Att återställa en gammal commit](#23-att-återställa-en-gammal-commit)
    - [2.4 — Sammanfattning](#24-sammanfattning)
<!-- - [Del 3 — Att testa nytt](#del-3--att-testa-nytt)
- [Del 4 — Att samarbeta](#del-4--att-samarbeta)
- [Del 5 — Att synkronisera ändringar](#del-5--att-synkroniser-ändringar) -->

## Del 1 — Att komma igång

I den här delen kommer du att skapa ett nytt lokalt Git-repo, lägga till några filer, och sedan ladda upp till GitHub.

### 1.1 Att starta ett Git-repo

Först och främst behöver du skapa en tom mapp. Navigera sedan in i mappen och initalisera den som ett Git-repo med:

```bash
git init
```

Kolla sedan statusen för Git med:

```bash
git status
```

Outputen borde vara vilken branch du är på och att du inte har några commits.

Först steget avklarat, dags att lägga till lite filer.

### 1.2 Att hantera filer

Skapa två filer:

1. `my_file.txt` som innehåller valfri mening.
2. `README.md` som innehåller en mening som beskriver repot.

Kolla statusen för Git igen. Båda filer borde dyka upp (som ospårade). Lägg till och commita båda filer *en i taget* för att göra det så tydligt som möjligt vilka ändringar som har skett. Till exempel:

```bash
git add my_file.txt
git commit -m "Skapar my_file.txt"
```

och på samma sätt för `README.md`. Kolla gärna statusen innan du gör varje commit, så ser du att Git har registrerat att filen kommer att komma med i commiten.

<!-- [!WARNING] är GitHub-specifik syntax,
     se mer här: https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax#alerts
     -->
> [!WARNING] 
> Om du bara skriver `git commit` (utan `-m` och meddelandet) öppnas den förinställda textredigeraren. Har du [Vim](https://sv.wikipedia.org/wiki/Vim_(textredigerare)) inställt kan det vara svårt att hitta ut, men [det går](https://builtin.com/articles/how-to-exit-vim).️

Motiveringen till att göra fler små commits är att när du sedan kollar igenom commit-historiken, så får du en mycket bättre överblick av alla förändringar som har skett. Annars klumpas allting ihop till en enda **MEGAFÖRÄNDRING** och det blir svårt att hitta det du letar efter (till exempel om du vill gå tillbaka till en specifik ändring för att se om den introducerade en ny bugg).

Kolla statusen för Git igen, nu borde allt vara tomt.

Vid den här tidpunkten vill du kanske se vilka commits du har gjort. Detta gör du med:

```bash
git log
```

Det kan dock bli ganska stökigt och en del överflödig information, så för en mer kompakt vy kan du använda:

```bash
git log --oneline
```

Mycket bättre, dags att ladda upp på GitHub.

### 1.3 Att koppla Git till GitHub

Börja med att skapa ett nytt repo på valfri version av GitHub:

- [Offentliga GitHub](https://github.com/)
- [KTH:s GitHub](https://gits-15.sys.kth.se/)

Själva repot skapar du genom att trycka på "plus"-ikonen ($+$) uppe till höger, och sedan **New repository**. Sätt dig själv som *Owner* om det behövs, annars räcker att du fyller i vad repot ska heta. När du har gjort det kan du trycka på **Create repository**.

Just nu är ditt repo på GitHub inte kopplat till ditt lokala repo som du just har gjort på din dator. För att koppla ihop dem kan du kopiera de tre kommandona som står listade under rubriken "**…or push an existing repository from the command line**":

```bash
git remote add origin <ditt-github-repo>
git branch -M main
git push -u origin main
```

Sedan kan du uppdatera sidan på GitHub för att kontrollera att dina filer har laddats upp ordentligt.

> [!NOTE]
> Om du är intresserad av att förstå exakt vad som hände när du copy pastade kommandona så kan du läsa förklaringen nedan. Annars kan du gå vidare och komma tillbaka hit senare.
> 
> #### `git remote add`
> 
> Med detta kommando kopplar du ett *remote*-repo till ditt lokala repo.
> 
> Remote översätts till svenska som *avlägsen*, alltså anger du ett avlägset repo som lokala filer ska skickas till och hämtas från när du kör `git push` respektive `git pull`.
> 
> I ditt fall innebär det att du säger till Git vilket GitHub-repo du vill använda. Det första argumentet anger förinställt remote-repo (`origin` är konvention). Som andra argument ges en URL till repot.
> 
> #### `git branch`
> 
> Kommandot används generellt för att hantera branches i Git, mer om det senare. Flaggan `-M` tvingar den nuvarande branchen att döpas om, i det här fallet till `main`.
> 
> #### `git push`
> 
> Du känner ju redan till `git push`, men här används flaggan `-u` för att koppla en lokal branch till en remote. I det här fallet kopplas din *lokala branch* `main` till din *remote branch* `main` i ditt *remote repo* `origin`. På så sätt vet Git vilken branch den ska hämta och skicka till med `git push` och `git pull`.

### 1.4 Sammanfattning

Snyggt jobbat! Efter den här delen har du förhoppningsvis fått en lite bättre förståelse för grunderna i Git och GitHub, och hur man kommer igång med ett repo. Du har alltså:

- Initialiserat ett repo med `git init`
- Kollat status med `git status`
- Lagt till filer med `git add`
- Commitat filer med `git commit`
- Sett commit-historiken med `git log` och `git log --oneline`
- Kopplat ditt lokala repo till GitHub med `git add origin`
- Döpt om din branch med `git branch`
- Kopplat din branch och laddat upp dina filer på GitHub med `git push`

I nästa del kommer du att få lära dig hur man *ångrar sig*, något som händer oftare än man kanske skulle vilja.

## Del 2 — Att ångra sig

Från förra delan har du ditt Git-repo och det är kopplat till GitHub. Efter att ha jobbat ett tag kanske du inser att du har gjort en massa ändringar som bara gjorde saker och ting värre än innan. Hur går du tillbaka då? 

En commit är lite som en "checkpoint" eller "sparningspunkt" i ett TV-spel. När du har sparat kan du alltid ladda ditt sparade tillstånd för att komma tillbaka till där du var tidigare. Därför underlättar det ifall du gör många små commits, som nämndes i förra delen. De följande rubrikerna går igenom olika sätt att hantera commits.

<!-- Det finns lite olika sätt att ladda sparade commits, och de förklaras i den här delen. -->

### 2.1 Att unstaga icke-commitade ändringar

Börja med att göra en ändring i `my_file.txt` och kolla statusen. För att se mer i detalj vad som har ändrats, använd:

```bash
git diff my_file.txt
```

De röda raderna har tagits bort och de gröna har lagts till. Du kan även köra kommandot utan argument för att se ändringarna i alla filer.

> [!NOTE]
> Outputen för `git diff` visas endast för filer som lagts till men som inte har stagats.

Lägg till filen och kolla statusen så borde du se att filen är redo för commit. Men nu ändrar dig du och vill ta bort filen från nästa commit, så unstaga filen med:

```bash
git reset my_file.txt
```

Tittar du status igen så ser du att filen nu inte längre är stagad. Även här kan du köra kommandot utan något argument så unstagas alla filer.

### 2.2 Att rensa alla nya ändringar

Nu inser du att du vill kassera alla ändringar du har gjort och gå tillbaka helt och hållet till hur ditt projekt såg ut vid den senaste commiten. Då kan du göra en *hard reset* genom att använda:

```bash
git reset --hard
```

Detta kan liknas vid att ladda en sparning i ett TV-spel, utan att ha sparat där man är för tillfället. Efter att ha kört kommandot borde det stå att du inte har några ändringar, och filerna borde se ut som de gjorde vid förra commiten.

> [!CAUTION]
> Det går inte att återhämta sig från en hard reset, har du kört kommandot så är alla ändringar borta för alltid. Var ***väldigt försiktig*** när du använder det här kommandot. Risken är annars att du slänger bort flera timmars hårt arbete och får börja om från början.

### 2.3 Att återställa en gammal commit

Du fortsätter jobba och commita tills du inser att de senaste commitsen du har gjort egentligen inte var bra, och du vill gå tillbaka till en tidigare commit. Hur gör du då? Det säkraste är att helt enkelt skapa en ny commit med samma innehåll som den gamla du vill tillbaka till, för att inte ändra i historiken. Detta gör du med:

```bash
git revert <commit-id>
```
Du får ID:t för en commit genom att visa commit-historiken och kopiera det hexadecimala talet.

### 2.4 Sammanfattning

Ännu en del klar! Nu har du lagt till följande verktyg i verktygslådan:

- Se detaljerade ändringar med `git diff`
- Unstaga filer med `git reset`
- Rensa alla nya ändringar med `git reset --hard`
- Gå tillbaka till en tidigare commit med `git revert`

I nästa del kommer du få se hur du kan testa nya ändringar utan att det påverkar något annat, med hjälp av *branches*.

## Del 3 — Att testa nytt

> *Kommer snart!*

<!--
## Del 3 — Att testa nytt
## Del 3 — Att hantera branches och [merging](https://www.atlassian.com/git/tutorials/using-branches/git-merge)
1. Gör en ny branch `test-branch` och byt till branchen.
1. Gör en ändring i FILEN.
1. Lägg till ändringen och committa.
1. Byt till `main`-branchen.
1. Merga `test-branch` till `main`.
 -->

## Del 4 — Att samarbeta

> *Kommer snart!*

<!-- ## Del 4 — Att hantera pull requests
1. Gör en till ändring på `test-branch`.
1. Pusha branchen till GitHub.
1. Gör en pull request för att merge:a till `main`.
 -->

<!-- Inkludera i del 4
1. Gör en ändring i `main`.
1. Gör en annan ändring på samma rad i `test-branch`.
1. Försök att merge:a `test-branch` till `main`.
1. Hantera merge conflicten.
 -->

<!-- #### Skapa ett issue med en [punktlista](https://www.markdownguide.org/extended-syntax/#task-lists) i markdown
 -->

<!-- 
- Gör milestones
- Skapa ett issue
- Gör en pull request
- Skapa en branch
- Hantera mergekonflikt
- etc.
-->
