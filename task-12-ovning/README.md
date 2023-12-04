# **Övning 12 – Time complexity**

### **Idag**
* Genomgång `task-12`
* Nya koncept i `task-13`: arv och induktionsbevis
* Inkapsling
* Åktomstmodifierare
* Julfika

### **💬 Diskussion `task-12`**
* Diskutera parvis hur ni har löst uppgiften
* Fokusera på det som var svårast

### **Genomgång `task-12`**
* Hur har det gått?
* Vad har varit svårt?
* Redovisning

### **En titt på `task-13`**
* Arv (inheritance)
* Induktionsbevis

### **Kort om induktionsbeviset**
* Skriv tydligt och prydligt!
* Gärna i $\LaTeX$, men det är inget krav

### **Vad är arv?**
> *"Alla fiskar är djur, men alla djur är inte fiskar."* - Örn Segerstedt, 2023

Arv (engelska: inheritance) är ett allmänt koncept inom OOP, som innebär att subklasser får (ärver) egenskaper från sina superklasser. Till exempel är katter och hundar subklasser till klassen djur. Alla djur äter, så hundar och katter ärver det beteendet. Men katter äter möss och hundar äter i princip vad som helst (?) så deras *implementering* av ätande-beteendet är olika. Vi kan illustrera arvshierarkin med ett träddiagram.

### **Inkapsling**
Ett viktigt begrepp som bland annat kan kopplas till arv inom OOP är *inkapsling* (engelska: encapsulation), vilket innebär att vi gömmer olika implementationsdetaljer i våra klasser från användare av klassen. Istället erbjuder vi ett *gränssnitt* (engelska: interface) för användaren. Detta kallas ibland för API (Application Programming Interface).

Ett exempel för att förklara vikten av inkapsling: tänk er att varje gång ni stoppade in en sladd i eluttaget skulle ni behöva göra alla kopplingar själva, jorda och så vidare. Det skulle bli alldeles för krångligt, och kanske till och med farligt. Därför har kopplingarna redan implementerats, och istället erbjuds gränssnittet *eluttag* som förenklar användningen och gör den säkrare. Notera att detta gränssnitt kan variera (till exempel har USA och Sverige olika eluttag).

> OBS: i det här sammanhanget är interface ett generellt begrepp, och inte detsamma som nyckelordet `interface` i Java.

### **Åtkomstmodifierare**

För att uppnå inkapsling använder vi åtkomstmodifierare, som begränsar vem som kan använda olika fält och metoder. Hittills har vi bara använt `public` och `private`, men det finns två till: `protected` och *package-private* (har inget nyckelord utan används genom att inte skriva ut någon åtkomstmodifierare). Den här tabellen visar de olika åtkomsterna:

| Åtkomstmodifierare | Klass | Paket | Subklass | Värld | Beskrivning |
|--------------------|------|--------|---------|------|---|
| `public`           | ✅   | ✅     | ✅      | ✅   | Åtkomligt från vilken annan klass som helst. |
| `protected`        | ✅   | ✅     | ✅      | ❌  | Åtkomligt i samma paket och subklass. |
| *package-private*  | ✅   | ✅     | ❌     | ❌  | Åtkomligt endast inom samma paket. |
| `private`          | ✅   | ❌    | ❌     | ❌  | Åtkomligt endast inom klassen själv. |

**Förklaring av kolumnerna**
- **Klass**: Klassen där medlemmarna deklareras.
- **Paket**: Andra klasser i samma paket.
- **Subklass**: Klasser som ärver från klassen, oavsett paket.
- **Värld**: Alla klasser från vilket paket som helst.

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

### **Julfika**
Detta är sista övningen innan ledigheten, så vi tar lite fika!

### **Kodningsövning**
I veckans uppgift kommer ni att få öva på arv. Börja med att skapa klasserna `Animal`, `Fish`, `FlyingFish` och `Mudskipper`. Klassen `Animal` ska ha ett fält `name` med tillhörande getter och setter. Utöver detta ska klasserna även ha följande:

`Animal`
* En konstruktor som har en parameter för `name`-fältet
* Metoden `eat()` som printar `Animal NAME is eating. Mmmmm.`

`Fish`
* Metoden `swim()` som printar `Fish NAME is swimming. Blub blub.`

`FlyingFish`
* Metoden `fly()` som printar `FlyingFish NAME is flying. Wohooo!`

`Mudskipper`
* Metoden `crawl()` som printar `Mudskipper NAME is crawling. ....`

> OBS: `NAME` ska bytas ut mot namnet som sparas i `name`-fältet.

Klasserna ska ärva av varandra enligt följande:

* `Fish` ärver från `Animal`
* `FlyingFish` och `Mudskipper` ärver från `Fish`

Skapa även en `Main`-klass med en `main`-metod, där ni skapar ett objekt för varje klass (utom `Main` själv) och printar alla metoder för varje objekt.

När alla metoder funkar som de ska, testa att printa `eat()` för `FlyingFish` och `Mudskipper`. De borde printa samma som för `Animal`. Överskugga sedan metoden i `FlyingFish` (använd `@Override`) och printa istället `"FlyingFish NAME is eating. Mmmmm, tasty flies!"`. Testa att printa för båda igen och se om det blir någon skillnad.

Visa mig när ni är klara, sen kan ni börja med `task-13` om ni hinner!

### **Sammanfattning**
* Induktionsbevis
* Arv
* Inkapsling
* Åktomstmodifierare

![image](god-jul.jpg)
