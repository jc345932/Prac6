public abstract class Book {
    private String booktitle;
    double price;

    public Book(String bt) {
        booktitle = bt;
    }

    public String getbooktitle() {
        return booktitle;
    }

    public double getPrice() {
        return price;
    }
    public abstract void setPrice();
}
