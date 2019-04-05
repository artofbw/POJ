//Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak
//wiek, waga, wzrost, imię i płeć, numer indeksu, rozmiar stopy. Klasa powinna także
//zawierać metody getAge, getWeight, getHeight, getName, isMale, getFeetSize,
//getIndexNumber. Stwórz także odpowiednie metody set. Stwórz przykładowy
//obiekt zwierający Twoje dane.


public enum Gender {
    MALE,
    FEMALE
}

public class Human {
    // the Human class has seven fields
    public int age;
    public int weigth;
    public int heigth;
    public String name;
    public Gender gender;
    public int index;
    public int feetSize;

    // the Human class has one constructor
    public Human(int age, int weigth, int heigth, String name, Gender gender, int index, int feetSize) {
        this.age = age;
        this.weigth = weigth;
        this.heigth = heigth;
        this.name = name;
        this.gender = gender;
        this.index = index;
        this.feetSize = feetSize;
    }

    // the Human class has seven methods
    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weigth;
    }

    public int getHeight() {
        return heigth;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        if(gender == Gender.MALE) {
            return true;
        }
    }

    public int getFeetSize() {
        return feetSize;
    }

    public int getIndexNumber() {
        return index;
    }

    public static void main(String[] args) {
        Human human = new Human(20, 50, 180, "Janusz", Gender.MALE, 1, 42);
        human.getAge();
    }
}