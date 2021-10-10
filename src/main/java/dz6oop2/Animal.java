package dz6oop2;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    private final int MAX_RUN_DISTANCE = 0;
    private final int MAX_SWIM_DISTANCE = 0;

    abstract void run(int length);
    abstract void swim (int lenght);



}
