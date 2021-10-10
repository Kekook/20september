package dz6oop2;

class Dog extends Animal{
    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
    }

    @Override
    void run(int length) {
        if(( length >=0) && (MAX_RUN_DISTANCE <=500))
            System.out.println("Собака  прошла дистанцию");
        else System.out.println("Миссия невыполнима");

    }

    @Override
    void swim(int lenght) {
        if ((lenght >=0) && (MAX_SWIM_DISTANCE <= 10))
            System.out.println("Собака проплыла дистанцию");
        else System.out.println("Миссия невыполнима");

    }
}
