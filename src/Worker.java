import animals.*;
import food.*;

public class Worker {
    private String name;
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Worker(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void feed(Food food, Animals animals) {
        if (animals instanceof Wolf) {
            if (animals.eat(food) == true) {
                System.out.println("Вууууу, свежее мясо ...");
            } else {
                System.out.println("Ты бы мне ещё консервных банок притащил...");
            }
        } else if (animals instanceof Bear) {
            if (animals.eat(food) == true) {
                System.out.println("Медведь кушает..., миша доволен...");
            } else {
                System.out.println("Медведь рычит, кажется эта еда ему не нравится, миша начинает злиться ...");
            }
        } else if (animals instanceof Fish) {
            if (animals.eat(food) == true) {
                System.out.println("Рыба быстро подплыла и схватила еду...");
            } else {
                System.out.println("Рыба не может ничего вам сказать , но если бы могла ...");
            }
        } else if (animals instanceof Duck) {
            if (animals.eat(food) == true) {
                System.out.println("Утка, благодарно крякает...");
            } else {
                System.out.println("Утка, посмотрела на еду... и на вас..., снова на еду... , снова на вас...?");
            }
        } else if (animals instanceof Panda) {
            if (animals.eat(food) == true) {
                System.out.println("ёу бро , забористый бамбук ты приташил ...");
            } else {
                System.out.println("ооу неет.., кажется это плохо пахнет.. У тебя нет немного бамбука для меня ...?");
            }
        } else if (animals instanceof Elephant) {
            if (animals.eat(food) == true) {
                System.out.println("Слон, любезно машет ушами ....");
            } else {
                System.out.println("Слон, недоумевает и топчет ногами, эта еда ему не нравится...");
            }
        }
    }

    public void getVoice(Animals animals){
        if(animals instanceof Bear){
            System.out.println("Вы заставили медведя рыкнуть, но лучше так больше не делать...");
        }
        else if(animals instanceof Wolf){
            System.out.println("Вы заставили волка подать голос, но волк гордый и не завыл...");
        }
        else if(animals instanceof Fish){
            System.out.println("Кажется у рыбы нет голоса...( ");
        }
        else if(animals instanceof Duck){
            System.out.println("Вы заставляете утку крякать...Вы крякаете, кря-кря... кря-кря... Утка не реагирует... Возможно она думает, что вы сумасшедший");
        }
        else if(animals instanceof Panda){
            System.out.println("Вы заставляете панду подать голос .. И знаете , что он говорит ?..\"do you have some bamboo bro?\"");
        }
        else if(animals instanceof Elephant){
            System.out.println("Кажется этот слон не хочет сейчас разговаривать...Или он вообще не разговаривает..? Поговорите с пандой...");
        }
    }

}
