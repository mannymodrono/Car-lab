public class Car {
    //instance var
    private double startMiles;
    private double endMiles;
    private double gallons;

    //Constructor
    public Car (double pStartMiles, double pEndMiles, double pGallons) {
        this.startMiles = pStartMiles;
        this.endMiles = pEndMiles;
        this.gallons = pGallons;
    }

    //methods

    public void setGallons(double pGallons) {
        this.gallons = pGallons;
    }

    public double getGallons() {
        return this.gallons;
    }

    public double getMPG() {
        double totalMiles = this.endMiles - this.startMiles;
        return totalMiles/this.gallons;
    }

    public String toString(){
        return "Starting miles: " + this.startMiles + "\nEnding miles: " + this.endMiles + "\nGallons used: " + this.gallons + "\n\nMPG: " + this.getMPG();
    }
}