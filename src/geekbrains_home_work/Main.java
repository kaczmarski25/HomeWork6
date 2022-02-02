package geekbrains_home_work;

public class Main {

    public static void main(String[] args) {



        Cats Cat1 = new Cats("Пушистик");
        Cats Cat2 = new Cats("Лорик");
        Cats Cat3 = new Cats("Чемпион");

        Dogs Dog1 = new Dogs("Мухтар");
        Dogs Dog2 = new Dogs("Бобик");
        Dogs Dog3 = new Dogs("Тузик");

        System.out.println("Полоса препятствий для кота " + Cat1.name);
        Cat1.run(250);
        Cat1.swim(12);
        System.out.println();

        System.out.println("Полоса препятствий для кота " + Cat2.name);
        Cat2.run(180);
        Cat2.swim(12);
        System.out.println();

        System.out.println("Полоса препятствий для кота " + Cat3.name);
        Cat3.run(180);
        Cat3.swim(0);
        System.out.println();

        System.out.println("Полоса препятствий для собаки " + Dog1.name);
        Dog1.run(480);
        Dog1.swim(12);
        System.out.println();

        System.out.println("Полоса препятствий для собаки " + Dog2.name);
        Dog2.run(380);
        Dog2.swim(12);
        System.out.println();

        System.out.println("Полоса препятствий для собаки " + Dog3.name);
        Dog3.run(380);
        Dog3.swim(8);
    }



}
