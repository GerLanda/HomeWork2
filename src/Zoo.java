import animals.*;
import food.*;
import java.util.ArrayList;
import java.util.List;

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

        //Интерфейсы плавающих

        Swimming[] pond = new Swimming[4];
        pond[0] = nemo;
        pond[1] = fish;
        pond[2] = mcDuck;
        pond[3] = duck;

        for (Swimming swimming : pond) {
            swimming.swim();
            swimming.whirl();
            swimming.dive();
        }

        System.out.println();

        //Интерфейсы бегающих

        ArrayList<Run> running = new ArrayList<Run>();

        running.add(bear);
        running.add(wolf);
        running.add(elephant);
        running.add(panda);

        for (Run run : running) {
            run.run();
            run.sit();
            run.jump();
        }

        //Проверка метода подачи голоса
        System.out.println();

        worker.getVoice(wolf);
        worker.getVoice(bear);
        worker.getVoice(duck);
        worker.getVoice(panda);

        System.out.println();

        ArrayList<Animals> animals = new ArrayList<Animals>();
        animals.add(wolf);
        animals.add(bear);
        animals.add(fish);
        animals.add(duck);
        animals.add(panda);
        animals.add(elephant);

        Meat beef = new Beef();
        Meat chicken = new Chicken();
        Meat fresh_fish = new FreshFish();
        Grass bamboo = new Bamboo();
        Grass fruit = new Fruit();
        Grass fish_feed = new FishFeed();

        ArrayList<Food> food = new ArrayList<Food>();
        food.add(beef);
        food.add(chicken);
        food.add(fresh_fish);
        food.add(bamboo);
        food.add(fruit);
        food.add(fish_feed);


        for (Animals animalsObject : animals) {
            for (Food foodObject : food) {
                worker.feed((Food) foodObject, (Animals) animalsObject);
            }
        }
    }
}