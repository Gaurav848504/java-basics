class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println();
    }
    public static void main(String[] args) {
        Book originalBook = new Book("Java Programming", "James Gosling", 30.5);
        System.out.println("Original Book Details:");
        originalBook.displayDetails();
        Book copiedBook = new Book(originalBook);
        System.out.println("Copied Book Details:");
        copiedBook.displayDetails();
    }
}
