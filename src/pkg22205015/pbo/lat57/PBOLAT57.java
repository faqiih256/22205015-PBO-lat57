
package pkg22205015.pbo.lat57;

// * Nama         : Ahmad Nurfaqih
// * Nim          : 22205015
// * prodi        : Teknik Informatia
// * Deskripsi    : Vehicle

class Vehicle {
      private String myBrand;
    private String myModel;

    public Vehicle() {
       // Constructor
    }

    public String getBrand() {
        return myBrand;
    }

    public void setBrand(String brand) {
        myBrand = brand;
    }

    public String getModel() {
        return myModel;
    }

    public void setModel(String model) {
        myModel = model;
    }
}

// Bicycle class
class Bicycle extends Vehicle {
    private int myGearCount;

    public Bicycle() {
        // Constructor
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int gearCount) {
        myGearCount = gearCount;
    }
}

// Skateboard class
class Skateboard extends Vehicle {
    private double myBoardLength;

    public Skateboard() {
        // Constructor
    }

    public double getBoardLength() {
        return myBoardLength;
    }

    public void setBoardLength(double boardLength) {
        myBoardLength = boardLength;
    }
}

public class PBOLAT57 {
    public static void main(String[] args) {
        
        System.out.println("===LATIHAN 57===\n");
        Bicycle myBike = new Bicycle();
        myBike.setBrand("Trek Bike");
        myBike.setModel("7.4FX");
        myBike.setGearCount(23);

        Skateboard myBoard = new Skateboard();
        myBoard.setBrand("Ally Skate");
        myBoard.setModel("Rocket");
        myBoard.setBoardLength(54.5);

        // Display vehicle information
        System.out.println("BICYCLE");
        System.out.println("Bicycle Brand: " + myBike.getBrand());
        System.out.println("Bicycle Model: " + myBike.getModel());
        System.out.println("Bicycle Gear Count: " + myBike.getGearCount());
        System.out.println();
        
        System.out.println("SKATEBOARD");
        System.out.println("Skateboard Brand: " + myBoard.getBrand());
        System.out.println("Skateboard Model: " + myBoard.getModel());
        System.out.println("Skateboard Board Length: " + myBoard.getBoardLength() + " inches");
    }
    
}
