package homeworks.Library;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book){
        if (size == books.length){
            extend();
        }
        books[size++] =  book;

    }

    private void extend() {
        Book[] tmp = new Book[size + 10];
        System.arraycopy(books,0, tmp,0,size );
        books = tmp;
    }

    public void print(){
        for (int i = 0; i < size; i++){
            System.out.println(books[i]);
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++){
            if(books[i].getTitle().toLowerCase().contains(keyword)){
                System.out.println(books[i]);
            }
        }
    }

    public Book getBookByMaxPrice(){
        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++){
            if(books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];
    }

    public Book[] searchBookByPrice(int num1, int num2){
        int count = 0;
        for (int i = 0; i < size; i++){
            if(books[i].getPrice() > num1 &&  books[i].getPrice() < num2) {
                count++;
            }
        }

        Book[] result = new Book[count];
        int index = 0;

        for (int i = 0; i < size; i++) {
            int price = (int) books[i].getPrice();
            if (price > num1 && price < num2) {
                result[index] = books[i];
                index++;
            }
        }

        return result;
    }

    public void delateBookById(int id) {
        if (id < 1 || id >= size) {
            System.err.println("Invalid Id: ");
            return;
        }
        for (int i = id - 1; i < size - 1; i++) {
            books[i] = books[i + 1];
        }
        size--;
        System.out.println("Book is delated: ");
    }
}
