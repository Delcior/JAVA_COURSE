import java.util.ArrayList;

public class Library {
    private ArrayList<Book> tab;
    public Library(){
        this.tab=new ArrayList<Book>();
    }
    public void addBook(Book newBook){
        this.tab.add(newBook);
    }
    public void printBooks(){
        for(Book buk:tab){
            System.out.println(buk);
        }
    }
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> result = new ArrayList<Book>();
        for(Book buk:tab){
            if(StringUtils.included(buk.title(),title)){
                result.add(buk);
            }
        }
        return result;
    }
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> result = new ArrayList<Book>();
        for(Book buk:tab){
            if(StringUtils.included(buk.publisher(),publisher)){
                result.add(buk);
            }
        }
        return result;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> result = new ArrayList<Book>();
        for(Book buk:tab){
            if(buk.year()==year){
                result.add(buk);
            }
        }
        return result;
    }
}
