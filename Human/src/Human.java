// Łukasz Ćwikliński s19334

public class Human {
    public enum Gender {
        MALE,
        FEMALE,
    }

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

    // the Human class has fourteen methods
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
        return false;
    }

    public int getFeetSize() {
        return feetSize;
    }

    public int getIndexNumber() {
        return index;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setWeight(int newWeigth) {
        weigth = newWeigth;
    }

    public void setHeight(int newHeigth) {
        heigth = newHeigth;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setGender(Gender newGender) {
        gender = newGender;
    }

    public void setFeetSize(int newFeetSize) {
        feetSize = newFeetSize;
    }

    public void setIndexNumber(int newIndexNumber) {
        index = newIndexNumber;
    }

    public static void main(String[] args) {
        Human human = new Human(20, 50, 180, "Janusz", Gender.MALE, 1, 42);
        System.out.println(human.getAge());
        System.out.println(human.getWeight());
        System.out.println(human.getHeight());
        System.out.println(human.getName());
        System.out.println(human.isMale());
        System.out.println(human.getFeetSize());
        System.out.println(human.getIndexNumber());

        human.setAge(100);
        human.setFeetSize(50);
        human.setGender(Gender.FEMALE);
        human.setHeight(150);
        human.setIndexNumber(50);
        human.setName("Halynka");
        human.setWeight(80);

        System.out.println(human.getAge());
        System.out.println(human.getWeight());
        System.out.println(human.getHeight());
        System.out.println(human.getName());
        System.out.println(human.isMale());
        System.out.println(human.getFeetSize());
        System.out.println(human.getIndexNumber());
    }
}
