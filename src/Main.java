// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        NumberManipulator manipulator = new NumberManipulator();

        int number = 5;

        System.out.println("Исходное число: " + number);

        int incrementedNumber = manipulator.incrementByOne(number);
        System.out.println("Увеличенное число: " + incrementedNumber);

        int decrementedNumber = manipulator.decrementByOne(number);
        System.out.println("Уменьшенное число: " + decrementedNumber);
    }
}






