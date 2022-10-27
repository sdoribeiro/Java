public class Encyclopedia extends Book {
    // TODO: Declare private fields: edition, numVolumes
    private String edition;
    private int numVolumes;

    // TODO: Define mutator methods -
    //       setEdition(), setNumVolumes()
    public void setEdition( String userInput) {
        edition = userInput;
    }
    public void setNumVolumes( int userInput) {
        numVolumes = userInput;
    }

    // TODO: Define accessor methods -
    //       getEdition(), getNumVolumes()
    public String getEdition () {
        return edition;
    }
    public int getNumVolumes () {
        return numVolumes;
    }

    // TODO: Define a printInfo() method that overrides
    //       the printInfo in Book class
    public void printInfo() {
        System.out.println("Book Information: ");
        System.out.println("   Book Title: " + getTitle());
        System.out.println("   Author: " + getAuthor());
        System.out.println("   Publisher: " + getPublisher());
        System.out.println("   Publication Date: " + getPublicationDate() );
        System.out.println("   Edition: " + getEdition());
        System.out.println("   Number of Volumes: " + getNumVolumes());
    }

}