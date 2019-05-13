package exercise04_05_Armstrong;


public class Armstrong {

    private int number;

    public Armstrong(int number) {
        this.number = number;
    }

    public Armstrong() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isArmstrong(int number) {
        String text = String.valueOf(number);
        char[] digits = text.toCharArray();

        int value = 0;

        for (int i = 0; i < digits.length; i++) {
            int tmp = Character.getNumericValue(digits[i]);
            value += tmp * tmp * tmp;
        }
        if (value == number) {
            return true;
        }
        return false;
    }

}
