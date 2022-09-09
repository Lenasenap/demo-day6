import model.Person;

public class Main {
    public static void main(String[] args) {
        // Skapar upp ett nytt animal och sätter animal.type till "Häst"
        Animal animal = new Animal("Häst");

        // Sätter animal.age till 4
        animal.setAge(4);

        // Hämtar åldern på animal
        System.out.println(animal.getAge());

        /*
        * Här nedan försöker jag sätta ett värde på ett objekt av Animal, men det går inte eftersom
        * variabeln type är final.
        */
        // animal.type = "Häst";

        // Den här metoden går fint att anropa eftersom den inte är private
        animal.makeSound();

        Person person = new Person();
        person.name = "Lena";
        person.sayHello();


        Counter counter = new Counter();

        // Variabeln COUNTER är static och kommer bara existera en enda gång.
        // Varje gång jag skapar en ny Counter (alltså att konstruktorn anropas) så kommer variabeln COUNTER
        // att ökas med 1 varje gång

        // Här är COUNTER == 1
        System.out.println(Counter.COUNTER);

        Counter counter1 = new Counter();

        //Här är COUNTER == 2
        System.out.println(Counter.COUNTER);

    }
}
