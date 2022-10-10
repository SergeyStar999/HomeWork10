public class Main {
    public static void main(String[] args) {
        var aythor1 = new Author("Артём", "Долгов");
        var aythor2 = new Author("Роберт", "Киосаки");

        var book1 = new Book("Игра. ", aythor1, 1996);
        var book2 = new Book("Конец. ", aythor2, 1969);

        book2.setPublicationYear(1999);

        System.out.println(book1);
        System.out.println(book2);
    }
}