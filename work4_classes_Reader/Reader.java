
class Reader {
    private String fullName;
    private int readerTicketNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int readerTicketNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги:");
        for (String title : bookTitles) {
            System.out.print(" " + title + ",");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги:");
        for (Book book : books) {
            System.out.print(" " + book.getTitle() + ",");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги");
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги:");
        for (String title : bookTitles) {
            System.out.print(" " + title + ",");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги:");
        for (Book book : books) {
            System.out.print(" " + book.getTitle() + ",");
        }
        System.out.println();
    }
}
