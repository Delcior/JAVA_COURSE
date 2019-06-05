
public class Main {

    public static void main(String[] args) {
        // write some test code here
        Box box = new Box(10);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        Box biggerBox= new Box(20);
        biggerBox.add( new Book("TEST1", "Test Driven Development", 0.7) );

        biggerBox.add( new CD("TEST2", "Dark Side of the Moon", 1973) );
        biggerBox.add( new CD("TEST3", "Nuclear Nightclub", 1975) );
        biggerBox.add(box);
        System.out.println( biggerBox );
    }
}
