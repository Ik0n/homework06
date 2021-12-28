/**
 * Класс для примеров
 */
public class Sample01 {
    /**
     * Тока входа в программу
     * @param args
     */
    public static void main(String[] args) {

        Animal cat1 = new Cat("Барсик");
        Animal dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("QWERTY");

        cat1.run(150);
        dog1.swim(9);
        dog2.swim(50);
        dog2.run(132);

        Animal.showCounter();
        Cat.showCounter();
        Dog.showCounter();
    }

}
