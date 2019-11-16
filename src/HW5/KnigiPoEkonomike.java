package HW5;
import java.util.ArrayList;
import java.util.List;

public class KnigiPoEkonomike {


    public static void main(String[] args) {

        List<Book> books = new ArrayList<Book>();

        books.add(new Book.BookBuilder("Теория нравственных чувств").addAuthors("Адам Смит").addAuthors("Джон Кейнс").setCountPage(800).setPublishDate(1759).build());
        books.add(new Book.BookBuilder("Природа богатств народов").addAuthors("Давид Рикардо").addAuthors("Адам Смит").setCountPage(100).setPublishHouse("Париж").build());

        System.out.println("Книги, написанные определенным автором");
        UtilsBook.printList(UtilsBook.getListByAuthor(books, "Адам Смит"));

        System.out.println("Книги, напечатанные в определнном издательстве");
        UtilsBook.printList(UtilsBook.getListByPublishHouse(books, "Париж"));

        System.out.println("Книни, выпущеные после определенного года");

        UtilsBook.printList(UtilsBook.getListAfterYear(books, 1730));
    }

}

class UtilsBook {
    public static ArrayList<Book> getListAfterYear(List<Book> bookList, int year) {
        ArrayList<Book> list = new ArrayList<Book>();
        for (Book book : bookList) {
            if (book.getPublishDate() >= year)
                list.add(book);
        }
        return list;
    }


    public static ArrayList<Book> getListByPublishHouse(List<Book> bookList, String namePublish) {
        ArrayList<Book> books = new ArrayList<Book>();
        for (Book book : bookList) {
            if (book.getPublishHouse().equalsIgnoreCase(namePublish))
                books.add(book);
        }
        return books;
    }

    public static ArrayList<Book> getListByAuthor(List<Book> bookList, String nameAuthor) {
        ArrayList<Book> books = new ArrayList<Book>();
        for (Book book : bookList) {
            for (String name : book.getAuthors()) {
                if (name.equalsIgnoreCase(nameAuthor))
                    books.add(book);
            }
        }
        return books;
    }

    public static void printList(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}

class Book {

    private static int meter = 1;
    private int id = meter;
    private String name;
    private List<String> authors;
    private String publishHouse;
    private int publishDate;
    private int countPage;
    private Long cost;
    private String typeBinding;

    private Book(BookBuilder builder) {
        this.id = meter++;
        this.name = builder.name;
        this.authors = builder.authors;
        this.publishHouse = builder.publishHouse;
        this.publishDate = builder.publishDate;
        this.countPage = builder.countPage;
        this.cost = builder.cost;
        this.typeBinding = builder.typeBinding;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public String getPublishHouse() {
        return publishHouse;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", authors=").append(authors);
        sb.append(", publishHouse='").append(publishHouse).append('\'');
        sb.append(", publishDate=").append(publishDate);
        sb.append(", countPage=").append(countPage);
        sb.append(", cost=").append(cost);
        sb.append(", typeBinding='").append(typeBinding).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class BookBuilder {
        private String name;
        private List<String> authors = new ArrayList<String>();
        private String publishHouse = "";
        private int publishDate = 0;
        private int countPage = 0;
        private Long cost = 0L;
        private String typeBinding = "";

        public BookBuilder(String name) {
            this.name = name;
        }

        public BookBuilder addAuthors(String author) {
            this.authors.add(author);
            return this;
        }

        public BookBuilder setPublishHouse(String publishHouse) {
            this.publishHouse = publishHouse;
            return this;
        }

        public BookBuilder setPublishDate(int publishDate) {
            this.publishDate = publishDate;
            return this;
        }

        public BookBuilder setCountPage(int countPage) {
            this.countPage = countPage;
            return this;
        }

        public BookBuilder setCost(Long cost) {
            this.cost = cost;
            return this;
        }

        public BookBuilder setTypeBinding(String typeBinding) {
            this.typeBinding = typeBinding;
            return this;
        }

        public Book build() {
            return new Book(this);

        }
    }
}