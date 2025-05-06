
 public class Book {
    void read() {
        System.out.println("Reading a book...");
    }
}
class Novel extends Book {
    void storyLine() {
        System.out.println("This novel has an exciting storyline!");
    }
}


 class  Main {
    public static void main(String[] args) {
        Novel myNovel = new Novel();
        myNovel.read();        // Call method from Book class
        myNovel.storyLine();   // Call method from Novel class
    }
}
