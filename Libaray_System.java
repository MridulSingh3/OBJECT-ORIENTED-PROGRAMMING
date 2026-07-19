class LibraryBook{
    private String title;
    private String author;
    private boolean available;
    
    LibraryBook(String title, String author){
        this.title=title;
        this.author=author;
        this.available=true;
    }
    
    void issueBook(){
        if(available){
            available=false;
            System.out.print(title+ "has been issued");
        }
        else{
            System.out.print("Book is not available yet!");
        }
    }
    
    void returnBook(){
        if(!available){
            available=true;
            System.out.print("Now" +title+ "is available");
        }
        else{
            System.out.println(title + " is already available in the library.");
        }
    }
    
    boolean isAvailable(){
        return this.available;
    }
}
public class Main{
	public static void main(String[] args) {
	    LibraryBook book = new LibraryBook("Java Programming", "James Gosling");

        System.out.println("Available: " + book.isAvailable());

        book.issueBook();
        System.out.println("Available: " + book.isAvailable());

        book.issueBook();

        book.returnBook();
        System.out.println("Available: " + book.isAvailable());

        book.returnBook();
	}
}
