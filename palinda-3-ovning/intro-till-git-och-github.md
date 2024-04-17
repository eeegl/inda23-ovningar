# Intro till Git och GitHub

Det här dokumentet är en guide med syfte att ge dig en interaktiv introduktion till Git och GitHub. Förhoppningsvis kan du ha användning av den både före och under (och kanske till och med efter) projektet. Det gör inget om du inte hinner med allt under övningen.

> [!TIP]
> Referera gärna till [Git-lathunden](git-lathund.md) under guidens gång.

#### Innehåll

- [Del 1 - Att få igång ett Git-repo och koppla till GitHub](#del-1--att-få-igång-ett-git-repo-och-koppla-till-github)
    - [1.1 Att starta ett Git-repo](#11-att-starta-ett-git-repo)
    - [1.2 Att hantera filer](#12-att-hantera-filer)
    - [1.3 Att koppla Git till GitHub](#13-att-koppla-git-till-github)
    - [1.4 Sammanfattning](#14-sammanfattning)

## Del 1 — Att få igång ett Git-repo och koppla till GitHub

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

Kolla statusen för Git igen. Båda filer borde dyka upp (som ospårade). Lägg till och commit:a båda filer *en i taget* för att göra det så tydligt som möjligt vilka ändringar som har skett. Till exempel:

```bash
git add my_file.txt
git commit -m "Skapar my_file.txt"
```

och på samma sätt för `README.md`. Kolla gärna statusen innan du gör varje commit, så ser du att Git har registrerat att filen kommer att komma med i commit:en.

<!-- [!WARNING] är GitHub-specifik syntax,
     se mer här: https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax#alerts
     -->
> [!WARNING] 
> Om du bara skriver `git commit` (utan `-m` och meddelandet) öppnas den förinställda textredigeraren. Har du [Vim](https://sv.wikipedia.org/wiki/Vim_(textredigerare)) inställt kan det vara svårt att hitta ut, men [det går](https://builtin.com/articles/how-to-exit-vim).️

Anledningen till varför vi gör fler små commits är att när vi sedan kollar igenom commit-historiken, så får vi en mycket bättre överblick av alla förändringar som har skett. Annars klumpas allting ihop till en enda **MEGAFÖRÄNDRING** och det blir svårt att hitta det man letar efter (till exempel om man vill gå tillbaka till en specifik ändring för att se om den introducerade en ny bugg).

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
> Om du är intresserad av att förstå exakt vad som hände när du copy paste:ade kommandona så tar vi en lite närmare titt:
> 
> #### `git remote add`
> 
> Med detta kommando kopplar vi ett *remote*-repo till vårt lokala repo.
> 
> Remote översätts till svenska som *avlägsen*, alltså anger vi ett avlägset repo som lokala filer ska skickas till och hämtas från när vi kör `git push` respektive `git pull`.
> 
> I vårt fall innebär det att vi säger vilket GitHub-repo vi vill använda. Det första argumentet anger förinställt remote-repo (`origin` är konvention). Som andra argument ges en URL till repot.
> 
> #### `git branch`
> 
> Kommandot används generellt för att hantera branches i Git, mer om det senare. Flaggan `-M` tvingar den nuvarande branch:en add döpas om, i det här fallet till `main`.
> 
> #### `git push`
> 
> Ni känner ju redan till `git push`, men här används flaggan `-u` för att koppla en lokal branch till en remote. I det här fallet kopplar vår *lokala branch* `main` till vår *remote branch* `main` på vårt *remote repo* `origin`. På så sätt vet Git vilken branch den ska hämta och skicka till med `git push` och `git pull`.

### 1.4 Sammanfattning

Snyggt jobbat! Efter den här delen har du förhoppningsvis fått en lite bättre förståelse för grunderna i Git och GitHub, och hur man kommer igång med ett repo. Du har alltså:

- Initialiserat ett repo med `git init`
- Kollat status med `git status`
- Lagt till filer med `git add`
- Commit:at filer med `git commit`
- Sett commit-historiken med `git log` och `git log --oneline`
- Kopplat ditt lokala repo till GitHub med `git add origin`
- Döpt om din branch med `git branch`
- Kopplat din branch och laddat upp dina filer på GitHub med `git push`

I nästa del kommer du att få lära dig hur man *ångrar sig*, något som händer mer ofta än man kanske skulle vilja.

<!-- ## Del 2 — Att gå tillbaka till en tidigare ändring

Nu har du ditt Git-repo och det är kopplat till GitHub. Efter att ha jobbat ett tag inser du att du har gjort en massa ändringar som bara gjorde saker och ting värre än innan. Hur går man tillbaka då?

1. Gör en (dålig) ändring i `my_file.txt`.
1. Lägg till ändringen (utan att committa).
1. Du ångrade dig, så gå tillbaka till den förra committen.
1. Kontrollera att ändringen försvann. -->

<!-- ## Del 3 — Att hantera branches och [merging](https://www.atlassian.com/git/tutorials/using-branches/git-merge)
1. Gör en ny branch `test-branch` och byt till branchen.
1. Gör en ändring i FILEN.
1. Lägg till ändringen och committa.
1. Byt till `main`-branchen.
1. Merga `test-branch` till `main`.
 -->

<!-- ## Del 4 — Att hantera pull requests
1. Gör en till ändring på `test-branch`.
1. Pusha branchen till GitHub.
1. Gör en pull request för att merge:a till `main`.
 -->

<!-- ## Del 5 — Att hantera merge conflicts
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
