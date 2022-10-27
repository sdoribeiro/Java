import java.util.Scanner;

public class InstrumentInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Instrument myInstrument = new Instrument();
        StringInstrument myStringInstrument = new StringInstrument();

        String instrumentName, manufacturerName, stringInstrumentName, stringManufacturer;
        int yearBuilt, cost, stringYearBuilt, stringCost, numStrings, numFrets;
        /*
        instrumentName = scnr.nextLine();
        manufacturerName = scnr.nextLine();
        yearBuilt = scnr.nextInt();
        scnr.nextLine();
        cost = scnr.nextInt();
        scnr.nextLine();
        stringInstrumentName = scnr.nextLine();
        stringManufacturer = scnr.nextLine();
        stringYearBuilt = scnr.nextInt();
        stringCost = scnr.nextInt();
        numStrings = scnr.nextInt();
        numFrets = scnr.nextInt();
        */
        instrumentName = "Drums";
        manufacturerName = "Zildjian";
        yearBuilt = 2015;

        cost = 2500;

        stringInstrumentName = "Guitar";
        stringManufacturer = "Gibson";
        stringYearBuilt = 2002;
        stringCost = 1200;
        numStrings = 6;
        numFrets = 19;


        myInstrument.setName(instrumentName);
        myInstrument.setManufacturer(manufacturerName);
        myInstrument.setYearBuilt(yearBuilt);
        myInstrument.setCost(cost);
        myInstrument.printInfo();

        myStringInstrument.setName(stringInstrumentName);
        myStringInstrument.setManufacturer(stringManufacturer);
        myStringInstrument.setYearBuilt(stringYearBuilt);
        myStringInstrument.setCost(stringCost);
        myStringInstrument.setNumOfStrings(numStrings);
        myStringInstrument.setNumOfFrets(numFrets);
        myStringInstrument.printInfo();

        System.out.println("   Number of strings: " + myStringInstrument.getNumOfStrings());
        System.out.println("   Number of frets: " + myStringInstrument.getNumOfFrets());
    }
}