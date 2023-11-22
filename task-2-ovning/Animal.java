/*
 * En stökig Animal-klass.
 */
public class Animal {
private String name;private String species;
       int age;
      double weight;

public Animal(String name, String species, int age, double weight) {
 this.name = name;this.species = species;
   this.age = age;this.weight = weight;
 }

    public String getName() { 
     return name;
        }
            public void setName(String name) {
this.name = name;
    }

   public String getSpecies() {
 return species;
   }
public void setSpecies(String species) {
                this.species = species;
    }

 public int getAge() {
        return age;}
                public void setAge(int age) {
            this.age = age;}

    public double getWeight() { return weight; }
   public void setWeight(double weight) {
       this.weight = weight;}

    public void eat() {
    System.out.println(name + " is eating.");
       }
public void sleep() {
 System.out.println(name + " is sleeping.");}
    public void move() {
  System.out.println(name + " is moving.");
       }

   @Override
     public String toString() {
   return "Animal [name=" + name + ", species=" + species + ", age=" + age + ", weight=" + weight + "]";
    }
       public static void main(String[] args) {
      Animal lion = new Animal("Leo", "Lion", 5, 200.5);
       System.out.println(lion);
       lion.eat();
  lion.sleep();
        lion.move();}
       }
