/**
 * Класс собаки унаследований от класса животное
 */
public class Dog extends Animal {

    private int maxDistanceToRun = 500; // Максимальная дистанция бега для собаки
    private int maxDistanceToSwim = 10; // Максимальная дистанция плавания для собаки
    private static int counter; // Счётчик для подсчёта общего количества созданных собак

    /**
     * Метод для показа счётика
     */
    public static void showCounter() {
        System.out.println("Собак : " + counter);
    }

    /**
     * Дефольный конструктор
     */
    Dog() {
        super("Собака");
        counter++;
    }

    /**
     * Конструтор с полем
     * @param name Имя животного
     */
    Dog(String name) {
        super(name);
        counter++;
    }

    /**
     * Метод бега для собаки
     * @param length дистанция
     */
    public void run(int length) {
        if (length > 0 && length <= 500) {
            System.out.println(this.name + " пробежал  : " + length);
        } else {
            System.out.println(this.name + " не может так много пробежать");
        }
    }

    /**
     * Метод плавания для собаки
     * @param length дистанция
     */
    public void swim(int length) {
        if (length > 0 && length <= 10) {
            System.out.println(this.name + " проплыл : " + length);
        } else {
            System.out.println(this.name + " не может так много плыть");
        }
    }
}
