package animals;

public abstract class Carnivorus extends Animals {

    public Carnivorus(String name, String view, int satiety, int age) {
        super(name, view, satiety, age);
    }
}

class Wolf extends Carnivorus {
    private String group;

    public Wolf(String name, String view, int satiety, int age,String group) {
        super(name, view, satiety, age);
        this.group = group;

    }

    public String getGroup(){
        return group;
    }

    public void setGroup(String group){
        this.group = group;
    }
}


class Bear extends Carnivorus {
    private String weight;

    public Bear(String name, String view, int satiety, int age,String weight) {
        super(name, view, satiety, age);
        this.weight = weight;
    }

    public String getWeight(){
        return weight;
    }

    public void setWeight(String weight){
        this.weight = weight;
    }
}

class Fish extends Carnivorus{

    private int size;

    public Fish(String name, String view, int satiety, int age,int size) {
        super(name, view, satiety, age);
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

}


