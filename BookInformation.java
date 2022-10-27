import java.util.Scanner;

public class BookInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Book myBook = new Book();
        Encyclopedia myEncyclopedia = new Encyclopedia();
		// Creating a conflict to solve on Github
		

        String title, author, publisher, publicationDate;
        String eTitle, eAuthor, ePublisher, ePublicationDate, edition;
        int numVolumes;
        // input data of book
        title = scnr.nextLine();
        author = scnr.nextLine();
        publisher = scnr.nextLine();
        publicationDate = scnr.nextLine();
        // input data of Encyclopedia
        eTitle = scnr.nextLine();
        eAuthor = scnr.nextLine();
        ePublisher = scnr.nextLine();
        ePublicationDate = scnr.nextLine();
        edition = scnr.nextLine();
        numVolumes = scnr.nextInt();
        // set input data
        myBook.setTitle(title);
        myBook.setAuthor(author);
        myBook.setPublisher(publisher);
        myBook.setPublicationDate(publicationDate);
        myBook.printInfo();
        // set input data
        myEncyclopedia.setTitle(eTitle);
        myEncyclopedia.setAuthor(eAuthor);
        myEncyclopedia.setPublisher(ePublisher);
        myEncyclopedia.setPublicationDate(ePublicationDate);
        myEncyclopedia.setEdition(edition);
        myEncyclopedia.setNumVolumes(numVolumes);
        myEncyclopedia.printInfo();

    }
}
