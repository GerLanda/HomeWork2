package animals;

public class Fish extends Carnivorus{

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
