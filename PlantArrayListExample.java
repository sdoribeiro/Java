import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

    // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects
    public static void printArrayList(ArrayList<Plant> myGarden) {
        for (int i = 0; i < myGarden.size(); ++i) {
            myGarden.get(i).printInfo();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        // TODO: Declare an ArrayList called myGarden that can hold object of type plant
        ArrayList<Plant> myGarden = new ArrayList<Plant>();

        // TODO: Declare variables - plantName, plantCost, colorOfFlowers, isAnnual
        String plantName, colorOfFlowers, plantCost, isAnnual;


        input = scnr.next();
        while (!input.equals("-1")) {
            // TODO: Check if input is a plant or flower
            //       Store as a plant object or flower object
            //       Add to the ArrayList myGarden
            plantName = scnr.next();
            plantCost = scnr.next();
            if (input.equals("flower")) {
                isAnnual = scnr.next();
                colorOfFlowers = scnr.next();
                Flower myFlower = new Flower();
                myFlower.setPlantName(plantName);
                myFlower.setPlantCost(plantCost);
                myFlower.setPlantType(Boolean.parseBoolean(isAnnual));
                myFlower.setColorOfFlowers(colorOfFlowers);
                myGarden.add(myFlower);
            }
            else {
                // Plant
                Plant myPlant = new Plant();
                myPlant.setPlantName(plantName);
                myPlant.setPlantCost(plantCost);
                myGarden.add(myPlant);
            }

            input = scnr.next();
        }

        // TODO: Call the method printArrayList to print myGarden
       printArrayList(myGarden);
    }
}
