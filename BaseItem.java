// ===== Code from file BaseItem.java =====
public class BaseItem {
    protected String lastName;

    public void setLastName(String providedName) {
        lastName = providedName;
    }

    // FIXME: Define printItem() method

    public void printItem() {
        System.out.print("Last name: ");
        System.out.println(lastName);
    }

}
// ===== end =====