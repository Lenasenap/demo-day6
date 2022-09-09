package afternoon;

public class Main {
    public static void main(String[] args) {
        Shelf shelf = new Shelf("Svart");
        Book book1 = new Book("Titel", 89374873);
        Vase vase = new Vase("Vit", true);

        shelf.setBook1(book1);
        shelf.setVase(vase);

        System.out.println(shelf.getBook1());
        System.out.println(shelf.getColour());
    }
}
