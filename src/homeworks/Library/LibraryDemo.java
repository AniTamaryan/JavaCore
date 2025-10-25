package homeworks.Library;
import java.util.Scanner;

public class LibraryDemo implements Commands{
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();


    public static void main(String[] args) {
        boolean isRun = true;

        while(isRun){
            Commands.printCommands();
            String command = scanner.nextLine();
             switch (command) {
                 case EXIT:
                     isRun = false;
                     break;
                 case ADD_BOOK:
                     addBook();
                     break;
                 case PRINT_ALL_BOOKS:
                     bookStorage.print();
                     break;
                 case SEARCH_BOOK_BY_TITLE:
                     System.out.println("Please input keyword: ");
                     String keyword = scanner.nextLine();
                     bookStorage.search(keyword);
                     break;
                 case PRINT_EXPENSIVE_BOOK:
                     Book expensiveBook = bookStorage.getBookByMaxPrice();
                     System.out.println(expensiveBook);
                     break;
                 case SEARCH_BOOK_BY_PRICE:
                     searchByPrice();
                     break;
                 case DELATE_BOOK_BY_ID:
                     System.out.println("Please enter book id: ");
                     int id = scanner.nextInt();
                     scanner.nextLine();
                     bookStorage.delateBookByIndex(id);
                     break;
                 default:
                     System.err.println("Wrong command: ");
             }
        }
    }
    private static void addBook(){
        System.out.println("Please input book title: ");
        String bookTitle = scanner.nextLine();
        System.out.println("Please input book autor name: ");
        String autorName = scanner.nextLine();
        System.out.println("Please input book price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input the book quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        Book book = new Book(bookTitle, autorName, price, quantity);

        bookStorage.add(book);
        System.out.println("Book added successfuly ");
    }

    private static void searchByPrice(){
        System.out.println("Enter the range of a price: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.nextLine();
        Book[] result = bookStorage.searchBookByPrice(num1, num2);

        if (result.length == 0) {
            System.out.println("No books found in this price range!");
        } else {
            System.out.println("Books found:");
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }
    }
}
