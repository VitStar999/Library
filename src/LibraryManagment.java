public class LibraryManagment {

    private Library library;

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public String findBookByTitle(String title) {
      
        if (library != null && library.getBooks() != null) {
            for (Book book : library.getBooks()) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    return book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")";
                }
            }
        }
        return "Book not found.";
    }


    }

