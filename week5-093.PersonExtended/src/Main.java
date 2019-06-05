public class Main {
  public static void main(String[] args) {
    // write test code here
    // Person pekka = new Person("Pekka", 15, 2, 1993);
    MyDate bth = new MyDate(12,12,2021);
    Person pekka = new Person("Pekka", bth);

    System.out.println(pekka);
    bth.setDay(22222);
    System.out.println(pekka);
  }
}
