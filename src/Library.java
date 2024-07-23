import java.util.ArrayList;

public class Library {

    private String nameLibrary;
    private String addressLibrary;
    private Book [] books;
    private Member[] members;


    public Library(String nameLibrary, String addressLibrary) {
        this.nameLibrary = nameLibrary;
        this.addressLibrary = addressLibrary;
        this.books = books;

    }

    public String getNameLibrary() {
        return nameLibrary;
    }

    public void setNameLibrary(String nameLibrary) {
        this.nameLibrary = nameLibrary;
    }

    public String getAddressLibrary() {
        return addressLibrary;
    }

    public void setAddressLibrary(String addressLibrary) {
        this.addressLibrary = addressLibrary;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public void displayLibraryBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].displayBook());
        }
    }
        public void displayLibraryMembers(){
            for(int i = 0; i < members.length; i++){
                System.out.println(members[i].displayMember() );
            }
    }
}


