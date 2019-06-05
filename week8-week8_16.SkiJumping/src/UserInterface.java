public class UserInterface {

    public void printEntry(){
        System.out.println("Kumpula ski jumping week\n\n" +
                "Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
    }
    public void tournamentBegins(){
        System.out.println("\nThe tournament begins!");
    }
    public void printCommand(){
        System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
    }
    public void printEnding(){
        System.out.println("\nThanks!\n\nTournament results:\nPosition    Name");
    }
}
