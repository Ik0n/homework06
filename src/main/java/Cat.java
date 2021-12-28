/**
 * Класс кошки унаследований от класса животное
 */
public class Cat extends Animal{

    private int maxDistanceToRun = 200; // Максимальная дистанция бега для Кошки
    private int maxDistanceToSwim = 0;  // Максимальная дистанция плавания для кошки
    private static int counter; // Счётчик для подсчёта общего количества созданных кошек

    /**
     * Метод для показа счётика
     */
    public static void showCounter() {
        System.out.println("Кошек : " + counter);
    }

    /**
     * Дефольный конструктор
     */
    Cat() {
        super("Кот");
        counter++;
    }

    /**
     * Конструтор с полем
     * @param name Имя животного
     */
    Cat(String name) {
        super(name);
        counter++;
    }

    /**
     * Метод бега для кошки
     * @param length дистанция
     */
    public void run(int length) {
        if (length > 0 && length <= 200) {
            System.out.println(this.name + " пробежал  : " + length);
        } else {
            System.out.println(this.name + " не может так много пробежать");
        }
    }

    /**
     * Метод плавания для кошки
     * @param length дистанция
     */
    public void swim(int length) {
        System.out.println(this.name + " не умеет плавать");
    }

}
