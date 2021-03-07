package animals;

public class Bear extends Carnivorus {
    private int weight;

    public Bear(String name, String view, int satiety, int age,int weight) {
        super(name, view, satiety, age);
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
}