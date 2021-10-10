package dz6oop2;

 class Cat extends Animal {
     public Cat(String name) {
         super(name);
     }

     private final int MAX_RUN_DISTANCE = 200;



     @Override
     void run(int length) {
         if((length >=0)&&(length <= MAX_RUN_DISTANCE))
             System.out.println("Кот пробежал дистанцию");
         else System.out.println("Миссия невыполнима");

     }

     @Override
     void swim(int lenght) {
         System.out.println("Кошки не умеют плавать");

     }
 }
