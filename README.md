# Övningsrepo för DD1337

Hej! I det här repot hittar du planeringar och uppgifter för övningarna i DD1337. Övningarna ligger i separata mappar som är döpta på formatet "`tasknamn`" + "`-ovning`", så för till exempel `task-1` heter övningsrepot `task-1-ovning`.

Du kan ladda ner det här repot och sen uppdatera det varje gång en ny övning kommer upp.

### Hur laddar jag ner repot?
När du laddar ner repot första gången gör du så här:
1. Tryck på den gröna **Code**-knappen längst upp på Githubsidan, välj **SSH** och kopiera länken.
1. Bestäm i vilken mapp du vill ha alla övningar och navigera dit i terminalen.
1. När du är i din valda mapp använder du `git clone` för att ladda ner:

```
git clone git@github.com:eeegl/inda23-ovningar
```

Nu är du klar! Använd `ls` för att se att du har fått mappen och att allt har funkat som det ska.

### Hur uppdaterar jag repot?
Om du redan har laddat ner repot och vill uppdatera det när en ny övning har kommit upp gör du så här:

1. Se till att du är i övningsmappen som du har lokalt på din dator.
1. När du är i din valda mapp använder du `git pull` i terminalen för att få alla nya uppdateringar:

```
git pull
```

Klart! Nu kan du öppna i Visual Studio Code (eller valfri textredigerare) och börja med övningen.

> OBS: Om du har gjort ändringar som krockar med uppdateringarna kan du få en merge conflict som du behöver lösa. Du kan läsa mer om det [här](https://www.atlassian.com/git/tutorials/using-branches/merge-conflicts).