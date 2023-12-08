# **Övning 12 – Time complexity**

### **Idag**
* Sista övningen för året!
* Genomgång `task-12`
* Kommer i `task-13`
    * Induktionsbevis
    * Arv
* Inkapsling
* Åktomstmodifierare
* Julfika


### **Genomgång `task-12`**
* Diskutera parvis hur ni har löst uppgiften
    * Vad har varit svårast?
    * Vad har ni gjort lika/olika?
* Redovisning

### **En titt på `task-13`**
* Arv (inheritance)
* Induktionsbevis
    * Skriv tydligt och prydligt!
    * Gärna i $\LaTeX$, men det är inget krav

### **Vad är arv?**
Arv (engelska: inheritance) är ett allmänt koncept inom OOP, som innebär att subklasser får (ärver) egenskaper och beteenden från sina superklasser. Till exempel är katter och hundar subklasser till klassen djur. Alla djur äter, så katter och hundar ärver det beteendet. Men de äter olika saker, så deras *implementering* av ätande-beteendet är olika. Vi kan illustrera arvshierarkin med ett träddiagram:

```
        Djur
         |
      ––––––––
     |        |
   Katt      Hund
```
**Figur 1:** *Arvsrelationen mellan klasserna `Djur`, `Katt` och `Hund`.*

### **Inkapsling**
Ett viktigt begrepp som bland annat kan kopplas till arv inom OOP är *inkapsling* (engelska: encapsulation), vilket innebär att vi gömmer olika implementationsdetaljer i våra klasser från användare av klassen. Istället erbjuder vi ett *gränssnitt* (engelska: interface) för användaren. Detta kallas ibland för API (Application Programming Interface).

Ett exempel för att förklara vikten av inkapsling: tänk er att varje gång ni stoppade in en sladd i eluttaget skulle ni behöva göra alla kopplingar själva, jorda och så vidare. Det skulle bli alldeles för krångligt, och kanske till och med farligt. Därför har kopplingarna redan implementerats, och istället erbjuds gränssnittet *eluttag* som förenklar användningen och gör den säkrare. Notera att detta gränssnitt kan variera (till exempel har USA och Sverige olika eluttag).

> ⚠️ OBS: I det här sammanhanget är interface ett generellt begrepp, och inte detsamma som nyckelordet `interface` i Java.

### **Åtkomstmodifierare**

För att uppnå inkapsling använder vi åtkomstmodifierare, som begränsar vem som kan använda olika fält och metoder. Hittills har vi bara använt `public` och `private`, men det finns två till: `protected` och *package-private* (har inget nyckelord utan används genom att inte skriva ut någon åtkomstmodifierare). Den här tabellen visar de olika åtkomsterna:

| Åtkomstmodifierare | Klass | Paket | Subklass | Alla | Beskrivning |
|--------------------|------|--------|---------|------|---|
| `public`           | ✅   | ✅     | ✅      | ✅   | Åtkomligt från vilken annan klass som helst. |
| `protected`        | ✅   | ✅     | ✅      | ❌  | Åtkomligt i samma paket och subklass. |
| *package-private*  | ✅   | ✅     | ❌     | ❌  | Åtkomligt endast inom samma paket. |
| `private`          | ✅   | ❌    | ❌     | ❌  | Åtkomligt endast inom klassen själv. |

### **💬 Diskussion**
* Försök komma på några egna exempel på inkapsling (kan vara vad som helst)
* Försök komma på olika användningsområden för de olika åtkomstmodifierarna

### **Arv i Java (nyckelorden `extends` och `super`)**
Hur hanterar vi då arv i Java? Med hjälp av åtkomstmodifierarna och nyckelorden `extends` och `super`. Med `extends` indikerar vi att en klass är en subklass till en annan, och ärver dess egenskaper och beteenden (fält och metoder). Vi använder `super` på ungefär samma sätt som `this`, fast det refererar till den överordnade klassen (klassen som `this` ärver från). Ett exempel:

```java
/*
 * Superklassen Animal.
 */
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("The animal " + name + " eats.");
    }

    public String getName() {
        return name;
    }
}

/*
 * Subklassen Dog som ärver från Animal.
 */
public class Dog extends Animal { 

    public Dog(String name) {
        super(name); // Anropar konstruktorn för Animal
    }

    @Override
    public void eat() {
        System.out.println("The dog " + getName() + " eats.");
    }

//     /*
//      * Fungerar ej eftersom fältet 'name' har åtkomstmodifierare 'private'.
//      * Om vi hade använt 'protected' hade det fungerat, men koden hade blivit
//      * mer bunden (engelska: coupled) och svårhanterlig.
//      */
//     @Override
//     public void eat() {
//         System.out.println("The dog " + name + " eats.");
//     }
}
```

### **🎅 Julfika 🧑‍🎄**
Detta är sista övningen innan ledigheten, så vi tar lite fika!

### **Kodningsövning**
I veckans uppgift kommer ni att få öva på arv. Börja med att skapa klasserna `Animal`, `Fish`, `FlyingFish` och `Mudskipper`. Klassen `Animal` ska ha ett fält `name` med tillhörande getter och setter. Utöver detta ska klasserna även ha följande:

| Klass        | Konstruktor                         | Metoder                                 |
|--------------|-------------------------------------|-----------------------------------------|
| `Animal`       | En konstruktor med `name`-parameter | `eat()` : Printar `Animal {NAME} is eating. Mmmmm.` |
| `Fish`         | -                                   | `swim()` : Printar `Fish {NAME} is swimming. Blub blub.` |
| `FlyingFish`   | -                                   | `fly()` : Printar `FlyingFish {NAME} is flying. Wohooo!` |
| `Mudskipper`   | -                                   | `crawl()` : Printar `Mudskipper {NAME} is crawling. ....` |

> I exemplen ovan ska `{NAME}` bytas ut mot namnet som sparas i `name`-fältet.

Klasserna ska ärva av varandra enligt följande:

```
        Animal
          |
         Fish
          |
      –––––––––––
     |           |
FlyingFish   Mudskipper
```
**Figur 2:** *Arvsrelationen mellan klasserna `Animal`, `Fish`, `FlyingFish` och `Mudskipper`.*

Skapa även en `Main`-klass med en `main`-metod, där ni skapar ett objekt för varje klass (utom `Main` själv) och printar alla metoder för varje objekt. Vad printas när ni kör `eat()` för `FlyingFish` och `Mudskipper`? Varför?

Överskugga metoden i `Fish` så att den printar `Fish {NAME} is eating. Mmmmm, blub.` (använd `@Override`). Blir det någon skillnad när ni anropar `eat()` med `FlyingFish` och `Mudskipper`? Varför?

Nu ska ni överskugga `eat()` för både `FlyingFish` och `Mudskipper`, som ska printa `FlyingFish {NAME} is eating. Mmmmm, tasty flies!` och `Mudskipper {NAME} is eating. Mmmmmud.`. Testa att printa för båda igen och se vad resultatet blir.

Sist ska ni skapa en lista av typen `List<Animal>` som innehåller olika typer av djur (ni kan extenda `Animal` med fler klasser om ni vill). Iterera sedan över hela listan och anropa `eat()` för varje djur. Vad printas och varför?

Visa mig när ni är klara, sen kan ni börja med `task-13` om ni hinner!

### **Sammanfattning**
* Induktionsbevis
* Arv
* Inkapsling
* Åktomstmodifierare

![image](god-jul.jpg)
