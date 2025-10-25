package homeworks.Library;

public interface Commands {
     String  EXIT = "0";
     String  ADD_BOOK = "1";
    String  PRINT_ALL_BOOKS = "2";
    String  SEARCH_BOOK_BY_TITLE = "3";
    String  PRINT_EXPENSIVE_BOOK = "4";
    String SEARCH_BOOK_BY_PRICE = "5";
     String DELATE_BOOK_BY_ID = "6";

    static void printCommands(){
        System.out.println("please input " + EXIT + " for EXIT: ");
        System.out.println("Please input " + ADD_BOOK + " for add Book: ");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for Print all books: ");
        System.out.println("Please input " + SEARCH_BOOK_BY_TITLE + " for search book by title: ");
        System.out.println("Please input " + PRINT_EXPENSIVE_BOOK + " for print most expancive book: ");
        System.out.println("Please input " + SEARCH_BOOK_BY_PRICE + " for search book by price: ");
        System.out.println("Please input " + DELATE_BOOK_BY_ID + " for delate  book by id: ");

    }
}
