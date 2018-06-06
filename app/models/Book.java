package models;

import java.util.HashSet;
import java.util.Set;


public class Book {
    public Integer id;
<<<<<<< HEAD
    public String link;
    public String title;
=======
    public String title;
    public Integer price;
>>>>>>> ec555096eff22510aafdad743c0f3f357ff9bda5
    public String author;

    public Book(){

    }

<<<<<<< HEAD
    public Book(Integer id, String link, String title, String author){
        this.id = id;
        this.link=link;
        this.title=title;
=======
    public Book(Integer id, String title, Integer price, String author){
        this.id = id;
        this.title=title;
        this.price=price;
>>>>>>> ec555096eff22510aafdad743c0f3f357ff9bda5
        this.author=author;
    }

    private static Set<Book> books;
    private static Set<Book> cart;

    static {
        books = new HashSet<>();
<<<<<<< HEAD
        books.add(new Book(1, "https://picsum.photos/200/300?image=63", "Picture1", "Kot"));
        books.add(new Book(2, "https://picsum.photos/200/300?image=634", "Picture2", "Kot"));
        books.add(new Book(3, "https://picsum.photos/200/300?image=13", "Picture3", "Kot"));
        books.add(new Book(4, "https://picsum.photos/200/300?image=85", "Picture4", "Kot"));
=======
        cart = new HashSet<>();
        books.add(new Book(1, "The Trial", 20, "Franz Kafka"));
        books.add(new Book(2, "Silmarillion", 15, "J R R Tolkien"));
        books.add(new Book(3, "The Odyssey", 25, "Homer"));
        books.add(new Book(4, "War and Peace", 30, "Leo Tolstoy"));
>>>>>>> ec555096eff22510aafdad743c0f3f357ff9bda5
    }

    public static Set<Book> retrieveAll(){
        return books;
    }

    public static Set<Book> retrieveCart(){
        return cart;
    }

    public static void clearCart(){
        cart = new HashSet<>();
    }

    public static Book retrieveById(Integer id) {
        for (Book book : books) {
            if (id.equals(book.id)) {
                return book;
            }
        }
    return null;
    }

    public static void add(Book book){
        books.add(book);
    }

    public static void addtoCart(Book book){
        cart.add(book);
    }

    public static boolean remove(Book book){
        return books.remove(book);
    }
    public static boolean removeFromCart(Book book){
        return cart.remove(book);
    }
}
