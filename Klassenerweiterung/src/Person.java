package bwz.m320.u18.src;

public class Person {

    protected String name;

    protected int alter;

    public Person(String name) {
        this.name=name;
    }

    public void print() {
        System.out.println("Person: name=" + name + ", alter=" + alter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
