// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
    // TODO: Declare private fields: numStrings, numFrets
    private int numStrings;
    private int numFrets;

    // TODO: Define mutator methods -
    //      setNumOfStrings(), setNumOfFrets()
    public void setNumOfStrings (int userNum) {
        numStrings = userNum;
    }

    public void setNumOfFrets (int userNum) {
        numFrets = userNum;
    }

    // TODO: Define accessor methods -
    //      getNumOfStrings(), getNumOfFrets()
    public int getNumOfStrings() {
        return numStrings;
    }

    public int getNumOfFrets () {
        return numFrets;
    }

}

