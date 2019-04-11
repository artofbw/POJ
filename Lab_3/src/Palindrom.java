// EXERCISES 03_06
// Praca w parach: Damian Brzoskowski s18499, Łukasz Ćwikliński s19334

import java.lang.StringBuilder;

public class Palindrom
{

    private String data;

    public Palindrom(String data)
    {
        this.data = data;
    }

    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data  = data;
    }

    public boolean isPalindrome() {
        String remove_special_chars = this.data.replaceAll("[-+.^:,\\s+]","");
        String lower_case = remove_special_chars.toLowerCase();
        String reversed = new StringBuilder(lower_case).reverse().toString();
        return lower_case.equals(reversed);
    }



    public static void main(String[] args)
    {
        Palindrom PalindromObj = new Palindrom("Atak kata");
        System.out.println(PalindromObj.isPalindrome());
        PalindromObj.setData("Muzo, raz daj jad za rozum.");
        System.out.println(PalindromObj.isPalindrome());
        PalindromObj.setData("Wódy żal dla żydów.");
        System.out.println(PalindromObj.isPalindrome());
    }
} 