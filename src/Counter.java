public class Counter {
    // Den här variabeln tillhör klassen - inte de specifika objekten
    public static int COUNTER = 0;

    // Varje gång en ny Counter skapas så ska värdet i COUNTER ökas med 1
    public Counter() {
        COUNTER++;
    }
}
