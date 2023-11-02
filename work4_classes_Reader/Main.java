public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В. В.", 123456, "Математика", "01.01.1990", "+123456789");
        Reader reader2 = new Reader("Иванов А. А.", 789456, "Физика", "02.02.1995", "+987654321");

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(new Book("Приключения", "Автор1"), new Book("Словарь", "Автор2"), new Book("Энциклопедия", "Автор3"));

        reader2.returnBook(2);
        reader2.returnBook("Приключения", "Словарь");
        reader2.returnBook(new Book("Приключения", "Автор1"), new Book("Словарь", "Автор2"));
    }
}