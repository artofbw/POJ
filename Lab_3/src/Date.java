// EXERCISES 03_04
// Praca w parach: Damian Brzoskowski s18499, Łukasz Ćwikliński s19334


public class Date
{

    private int day;
    private int month;
    private int year;

    public Date(
            int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public void setDay(int day) {
        this.day  = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public String toString()
    {
        String day = "", month = "", year= "";

        if (this.getDay() < 10) {
            day = "0" + this.getDay();
        }
        else {
            day = "" + this.getDay();
        }


        if (this.getMonth() < 10) {
            month = "0" + this.getMonth();
        }
        else {
            month = "" + this.getMonth();
        }
        
        return this.getDay() + "/"+ this.getMonth() + "/" + this.getYear();
    }


    public static void main(String[] args)
    {
        Date DateObj = new Date(11, 12, 1993);
        System.out.println("Inicjowanie obiektu z wartosciami:");
        System.out.println(DateObj.toString());
        System.out.println(DateObj.getDay());
        System.out.println(DateObj.getMonth());
        System.out.println(DateObj.getYear());
        System.out.println("Zmiana wartosci dla qty i unitPrice:");
        DateObj.setDate(10, 11, 2010);
        System.out.println(DateObj.toString());
    }
} 
