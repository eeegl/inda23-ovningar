# Intro till Git och GitHub

Här är veckans uppgift för att få er att komma igång med Git och GitHub.

I veckans uppgift ska ni öva på Git och GitHub. Följ de olika stegen nedan och referera gärna till [Git-lathunden](git-lathund.md). Uppgiften är rätt lång, så det gör inget om du inte hinner med allt.

## Del 1 — Att skapa ett Git-repo och koppla till GitHub

1. Börja med att skapa en tom mapp och initalisera den som ett Git-repo.
1. Kolla statusen för Git. Allt borde vara tomt.
1. Skapa filen `my_file.txt` med lite text i.
1. Kolla statusen för Git. Nu borde `my_file.txt` synas som en ospårad fil.
1. Lägg till `my_file.txt` i Git. 
1. Kolla statusen för Git. Nu borde `my_file.txt` synas som en tillagd fil.
1. Gör en commit (med ett beskrivande meddelande).
1. Kolla statusen för Git. Nu borde allt vara tomt igen.
1. Kolla commit-historiken. Du borde se din commit.
    - Testa `git log --oneline` för en mer kompakt vy.
1. Skapa filen `README.md` med en mening som beskriver repot.
1. Lägg till `README.md` i Git.
1. Gör en commit (med ett beskrivande meddelande).
1. Kolla commit-historiken igen. Du borde nu se båda commits.
1. Skapa ett repo på GitHub (offentliga eller KTH:s). 
    - Gör detta genom att trycka på "+"-ikonen uppe till höger.
1. Pusha dina ändringar från det lokala repot till GitHub.
1. Uppdatera GitHub och se så att dina filer har laddats upp ordentligt.

> **Tips:** följ instruktionerna på GitHub eller i terminalen om du känner dig osäker på hur du ska pusha.

<!-- ## Del 2 — Att gå tillbaka till en tidigare ändring
1. Gör en (dålig) ändring i `my_file.txt`.
1. Lägg till ändringen (utan att committa).
1. Du ångrade dig, så gå tillbaka till den förra committen.
1. Kontrollera att ändringen försvann.

## Del 3 — Att hantera branches och [merging](https://www.atlassian.com/git/tutorials/using-branches/git-merge)
1. Gör en ny branch `test-branch` och byt till branchen.
1. Gör en ändring i FILEN.
1. Lägg till ändringen och committa.
1. Byt till `main`-branchen.
1. Merga `test-branch` till `main`.

## Del 4 — Att hantera pull requests
1. Gör en till ändring på `test-branch`.
1. Pusha branchen till GitHub.
1. Gör en pull request för att merge:a till `main`.

## Del 5 — Att hantera merge conflicts
1. Gör en ändring i `main`.
1. Gör en annan ändring på samma rad i `test-branch`.
1. Försök att merge:a `test-branch` till `main`.
1. Hantera merge conflicten.

#### Skapa ett issue med en [punktlista](https://www.markdownguide.org/extended-syntax/#task-lists) i markdown -->

<!-- 
- Gör milestones
- Skapa ett issue
- Gör en pull request
- Skapa en branch
- Hantera mergekonflikt
- etc.
-->
