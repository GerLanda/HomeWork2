package animals;

import food.Food;

abstract public class Animals{
    private String name;
    private String view;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Animals(String name, String view, int age) {
        this.name = name;
        this.view = view;
        this.age = age;
    }

    public void display() {
        System.out.println("Это живтное: " + getName() + ",оно " + getView() + ",возраст " + getAge());
    }

    abstract public void eat(Food food);
}
















