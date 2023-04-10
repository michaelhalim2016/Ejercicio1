import java.util.Scanner;
import java.util.*;

public class Animal {

    public static final double FAVNUMBER = 1.6180;

    private String name;
    private int weight;
    private boolean hasOwener = false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasOwener() {
        return hasOwener;
    }

    public void setHasOwener(boolean hasOwener) {
        this.hasOwener = hasOwener;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("unique ID set to : " + this.uniqueID);
    }

    public void setUniqueID() {
        long minNumber = 1;
        long maxNumber = 1000000;

        this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));
        String stringNumber = Long.toString(maxNumber);

        int numberString = Integer.parseInt(stringNumber);
    }

    public char getFavoriteChar() {
        return favoriteChar;
    }

    public void setFavoriteChar(char favoriteChar) {
        int randomNumber = (int) (Math.random() * 126) + 1;
        this.favoriteChar = (char) randomNumber;
        if (randomNumber == 32) {
            System.out.println("favorit charactor set to space ");
        } else if (randomNumber == 10) {
            System.out.println("favorite character set to newline");

        } else {
            System.out.println("favorite character set to " + this.favoriteChar);

        }
        if ((randomNumber > 97) && (randomNumber < 122)) {
            System.out.println("favorit character is a lowercase latter");
        }
        if (((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))) {
            System.out.println("favorit character is a lowercase character");
        }
        int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;

        switch (randomNumber) {
            case 8:
                System.out.println("favorit character is switch");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Favorit rest of switvh");
                break;
            default:
                System.out.println("somthing");
                break;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    protected static int numberOfAnimals = 0;

    static Scanner userinput = new Scanner(System.in);

    public Animal() {
        numberOfAnimals++;

        int sumOfNumbers = 5 + 1;
        System.out.println("5 + 1 = " + sumOfNumbers);

        int diffOfNumbers = 5 - 1;
        System.out.println("5 - 1 = " + diffOfNumbers);

        int multOfNumbers = 5 * 1;
        System.out.println("5 * 1 = " + multOfNumbers);

        int difOfNumbers = 5 / 1;
        System.out.println("5 / 1 = " + difOfNumbers);

        int modOfNumbers = 5 % 3;
        System.out.println("5 % 1 = " + modOfNumbers);

        System.out.print("Enter the name : \n ");

        if (userinput.hasNextLine()) {
            this.setName(userinput.nextLine());
        }

        this.setFavoritColor();
        this.setUniqueID();

    }

    private void setFavoritColor() {
    }

    protected static void countTo(int stringNumber) {
        for (int i = stringNumber; i <= 100; i++) {
            if (i == 90)
                continue;
            System.out.println(i);
        }
    }

    protected static void printNumbers(int maxNumber) {
        int i = 1;
        while (i < (maxNumber / 2)) {
            System.out.println(i);
            i++;
            if (i == (maxNumber / 2))
                break;
        }
        Animal.countTo(maxNumber / 2);
        return;
    }

    protected static void gussMyNumber() {
        int number;
        do {
            System.out.println("Guess Number up to 100");

            while (!userinput.hasNextInt()) {
                String numberentered = userinput.next();
                System.out.printf("%s is not a number \n", numberentered);

            }
            number = userinput.nextInt();

        } while (number != 50);

    }

    public String makeSound() {
        return "Grrr";
    }

    public static void speakAnimal(Animal randAnimal) {
        System.out.println("Animal says " + randAnimal.makeSound());
    }

    public static void main(String[] args) {

        Animal[] theAnimal = new Animal[10];
        Animal fido = new Dog();
        Animal fluffy = new Cat();

        theAnimal[0] = fido;
        theAnimal[1] = fluffy;
        System.out.println("fido says " + theAnimal[0].makeSound());
        System.out.println("fluffy says " + theAnimal[1].makeSound());

        String[] StringArray = {
                "Random", "Words", "Here"
        };

        for (String word : StringArray) {
            System.out.println(word);
        }

        // speakAnimal(fluffy);
        String[] ColoneOfArray = Arrays.copyOf(StringArray, 3);
        System.out.println(Arrays.toString(ColoneOfArray));
        System.out.println(Arrays.binarySearch(ColoneOfArray, "Random"));

    }

}