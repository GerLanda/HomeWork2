import animals.*;
import food.Food;
import food.Grass;
import food.Meat;

import java.util.ArrayList;

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

        Swimming[] pond = new Swimming[4];
        pond[0] = nemo;
        pond[1] = fish;
        pond[2] = mcDuck;
        pond[3] = duck;

        //Проверка метода пруда
        for (Swimming p : pond) {
            p.swim();
        }

        System.out.println();

        //Проверка интерфейсов
        bear.run();
        wolf.run();

        panda.run();
        elephant.run();

        //Проверка метода подачи голоса
        System.out.println();

        worker.getVoice(wolf);
        worker.getVoice(bear);
        worker.getVoice(duck);
        worker.getVoice(panda);

        System.out.println();

        ArrayList<Object> animals = new ArrayList<Object>();
        animals.add(wolf);
        animals.add(bear);
        animals.add(fish);
        animals.add(duck);
        animals.add(panda);
        animals.add(elephant);

        ArrayList<Object> food = new ArrayList<Object>();
        food.add(food1);
        food.add(food2);

        for(Object f:food){
            for(Object a:animals)
            worker.feed((Food) f,(Animals) a);
        }
    }
}