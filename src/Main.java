public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("Фёдор", "Достоевский");
        Author authorTwo = new Author("Лев", " Толстой");
        Book bookOne = new Book("Идиот", 1886);
        Book bookTwo = new Book("Война и мир", 1869);
        bookOne.setYear(1887);
        System.out.println("Книга: " + bookOne.getTitle() + ". Автор: " + authorOne.getFirstName() + authorOne.getLastName() + ". Год публикации: " + bookOne.getYear());
        System.out.println("Книга: " + bookTwo.getTitle() + ". Автор: " + authorTwo.getFirstName() + authorTwo.getLastName() + ". Год публикации: " + bookTwo.getYear());
        bookOne.setAuthor(authorOne);
        bookTwo.setAuthor(authorTwo);System.out.println(bookOne);
        System.out.println(bookTwo);
        System.out.println(bookOne.equals(bookTwo));
        System.out.println(bookOne.hashCode());
        System.out.println(bookTwo.hashCode());
    }
}