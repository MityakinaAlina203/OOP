public class Printablee {
    public static void main(String[] args) {
        Book book1 = new Book("Book1");
        Book book2 = new Book("Book2");

        Magazine magazine1 = new Magazine("mag1");
        Magazine magazine2 = new Magazine("mag2");

        Printable newspaper = new Printable() {
            @Override
            public void print() {
                System.out.println("Print newspaper");
            }
        };

        Printable[] printables = {book1, book2, magazine1, magazine2, newspaper};
        for (Printable p : printables) {
            p.print();
        }
    }
}

