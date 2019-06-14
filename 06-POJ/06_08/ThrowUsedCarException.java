// praca w parach: Łukasz Ćwikliński s19334, Maciej Rybacki s18553

package 06_08;

public class ThrowsUsedCarExceptions {

    public static void main(String[] args) throws UsedCarException{
        UsedCar[] used_car = new UsedCar[7];

        try{
            // valid
            used_car[0] = new UsedCar("6666", "Ford", 1998, 6900, 10000);
            // valid
            used_car[1] = new UsedCar("1234", "Honda", 2001, 7900, 6000);
            // invalid VIN
            used_car[2] = new UsedCar("", "Chrysler", 2005, 9800, 10000);
            // invalid price
            used_car[6] = new UsedCar("6789", "Ford", 2001, 260700, -9999);
            // invalid make
            used_car[3] = new UsedCar("7654", "Aston Martin", 2007, 2000, 100000);
            // invalid year
            used_car[4] = new UsedCar("4567", "Toyata", 2, 45000, 15000);
            // invalid mileage
            used_car[5] = new UsedCar("6789", "Other", 2016, -6900, 11000);
        }

        catch(UsedCarException e){
            System.out.println(e.getMessage());
        }

        for(UsedCar car: used_car){
            if(car != null) {
                System.out.println(car.toString());
            }
        }
    }
}