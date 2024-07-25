//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "123165");
        Book book2 = new Book("1984", "George Orwell", "54484");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", "646646");


        Member member1 = new Member("Alice", 1);
        Member member2 = new Member("Bob", 2);
        Member member3 = new Member("Charlie", 3);

        Library library = new Library("Central Library", "123 Main St");
        library.setBooks(new Book[]{book1, book2,book3});
        library.setMembers(new Member[]{member1, member2,member3});




        LibraryManagment libraryManagment = new LibraryManagment();
        libraryManagment.setLibrary(library);
        libraryManagment.findBookByTitle("1984");
        System.out.println(libraryManagment.findBookByTitle("1984"));
        System.out.println(libraryManagment.findBookByTitle("1984"));
        System.out.println(libraryManagment.findBookByTitle("1984"));



    }
}