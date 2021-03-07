import animals.*;
import food.Food;
import food.Grass;
import food.Meat;


public class Zoo {
    public static void main(String[] args) {
        Carnivorus wolf = new Wolf("Акела", "Хищник", 10, 5, "Тундровый");
        Carnivorus bear = new Bear("Миша", "Русский", 10, 7, 70);
        Carnivorus fish = new Fish("Морской Чёрт", "Хищник", 10, 3, 120);

        Herbivorous duck = new Duck("Дональд", "Антропоморфный", 10, 65, "Белый");
        Herbivorous panda = new Panda("Дизайнер", "Рэпер", 10, 23);
        Herbivorous elephant = new Elephant("Дамбо", "Слоновый", 10, 10, 6000);

        Food food1 = new Meat();
        Food food2 = new Grass();

        // Проверка всех методов

        wolf.feed(food1,wolf);
        bear.feed(food1,bear);
        fish.feed(food1,fish);

        wolf.feed(food2,wolf);
        bear.feed(food2,bear);
        fish.feed(food2,fish);

        duck.feed(food2,duck);
        panda.feed(food2,panda);
        elephant.feed(food2,elephant);

        duck.feed(food1,duck);
        panda.feed(food1,panda);
        elephant.feed(food1,elephant);



    }
}