package animals;

abstract public class Animals {
    private String name;
    private String view;
    private int satiety;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getView() {
        return view;
    }

    public void setView() {
        this.view = view;
    }

    public Animals(String name, String view, int satiety, int age) {
        this.name = name;
        this.satiety = satiety;
        this.age = age;
        this.view = view;
    }

    public void display() {
        System.out.println("Это живтное: " + getName() + ",оно " + getView() + ",возраст " + getAge() + ",уровень сытости " + getSatiety());
    }

}














