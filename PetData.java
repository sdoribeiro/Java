// ===== Code from file PetData.java =====
public class PetData extends AnimalData {
    private int idNum;

    public void setID(int petID) {
        idNum = petID;
    }

    // FIXME: Add printAll() member function
    @Override
    public void printAll() {
        super.printAll();
        System.out.print("ID: " + this.idNum );

    }

    /* Your solution goes here  */

}
// ===== end =====