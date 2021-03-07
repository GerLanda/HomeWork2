package animals;

 public class Wolf extends Carnivorus {
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
