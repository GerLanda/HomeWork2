import animals.*;
import food.Food;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {
        Wolf wolf = new Wolf("Акела", "Хищник", 5, "Тундровый");
        Bear bear = new Bear("Миша", "Русский", 7, 70);
        Fish fish = new Fish("Морской Чёрт", "Хищник", 3, 120);

        Duck duck = new Duck("Дональд", "Антропоморфный", 65, "Белый");
        Panda panda = new Panda("Дизайнер", "Рэпер", 23);
        Elephant elephant = new Elephant("Дамбо", "Слоновый", 5, 6000);

        Fish nemo = new Fish("Немо", "В поисках", 3, 120);
        Duck mcDuck = new Duck("Скрудж", "Антропоморфный", 65, "Белый");

        Worker worker = new Worker("Алексей", "Работник зоопарка");

        Food food1 = new Meat();
        Food food2 = new Grass();

        Pond.Swimming[] pond = new Pond.Swimming[4];
        pond[0] = nemo;
        pond[1] = fish;
        pond[2] = mcDuck;
        pond[3] = duck;

        //Проверка метода пруда
        for (Pond.Swimming p : pond) {
            p.swim();
        }

        System.out.println();

        //Проверка интерфейсов
        wolf.howl();
        bear.roar();
        fish.swim();

        duck.quack();
        panda.eatBamboo();
        elephant.watch();

        //Проверка кормления животных разной едой
        System.out.println();

        //Хищники довольны едой
        worker.feed(food1, wolf);
        worker.feed(food1, bear);
        worker.feed(food1, fish);
        //Хищники недовольны едой
        worker.feed(food2, wolf);
        worker.feed(food2, bear);
        worker.feed(food2, fish);
        //Травоядные довольны едой
        worker.feed(food2, duck);
        worker.feed(food2, panda);
        worker.feed(food2, elephant);
        //Травоядные недовольны едой
        worker.feed(food1, duck);
        worker.feed(food1, panda);
        worker.feed(food1, elephant);

        //Проверка метода подачи голоса
        System.out.println();

        worker.getVoice(wolf);
        worker.getVoice(bear);
        worker.getVoice(fish);
        worker.getVoice(duck);
        worker.getVoice(panda);
        worker.getVoice(elephant);
    }
}