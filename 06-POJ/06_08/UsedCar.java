// praca w parach: Łukasz Ćwikliński s19334, Maciej Rybacki s18553

package 06_08;

public class UsedCar {
    private String make, vin;
    private int year;
    private double price, mileage;

    public UsedCar(String vin, String make, int year, double mileage, double price) throws UsedCarException{

        if(vin.length() != 4){
            throw new UsedCarException("Exception: Invalid vin");
        }

        if((!make.equals("Ford")) && (!make.equals("Honda")) &&
                (!make.equals("Toyata")) && (!make.equals("Chrysler"))
                && (!make.equals("Other"))){
            throw new UsedCarException("Exception: Invalid make");
        }

        if(year < 1997 && year > 2017){
            throw new UsedCarException("Exception: Invalid year");
        }

        if(mileage < 0){
            throw new UsedCarException("Exception: Mileage is negative");
        }

        if(price < 0){
            throw new UsedCarException("Exception: Price is negative");
        }

        this.vin = vin;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;

    }

    @Override
    public String toString() {
        return vin + ", " + make + ", " + year + ", " + mileage + ", " + price;
    }
}