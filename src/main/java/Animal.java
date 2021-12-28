/**
 * Базовый класс Animal
 */
abstract public class Animal {

    protected String name; // Имя животного
    private static int counter; // Счётчик для подсчёта общего количества созданных животных

    /**
     * Метод для показа счётика
     */
    public static void showCounter() {
        System.out.println("Животных : " + counter);
    }

    /**
     * Дефольный конструктор
     */
    Animal() {
        this.name = "Животное";
        counter++;
    }

    /**
     * Конструтор с полем
     * @param name Имя животного
     */
    Animal(String name) {
        this.name = name;
        counter++;
    }

    /**
     * Метод бега для животных
     * @param length дистанция
     */
    abstract public void run(int length);

    /**
     * Метод плавания для животных
     * @param length дистанция
     */
    abstract public void swim(int length);

}
