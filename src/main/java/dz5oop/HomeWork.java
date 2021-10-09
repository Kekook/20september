package dz5oop;

public class HomeWork {

    public static void main(String[] args) {

        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Andrey","manager","fff@mail.ru","212121",162,35);
        workers[1] = new Worker("Vasya","director","eee@mail.ru","214456",300,65);
        workers[2] = new Worker("Gosha","cleaner","tyt@mail.ru","142225",100,49);
        workers[3] = new Worker("Anton","pilot","yama@inbox.ru","766663",400,45);
        workers[4] = new Worker("Misha","doctor","dok@mail.ru","5565655",500,34);
        for (int i = 0; i < workers.length; i++) {
            if(workers[i].getAge() > 40){
                workers[i].info();

        }

        }

//        Worker worker1 = new Worker("Andrey","manager","fff@mail.ru","212121",162,35);
//        Worker worker2 = new Worker("Vasya","director","eee@mail.ru","214456",300,65);
//        Worker worker3 = new Worker("Gosha","cleaner","tyt@mail.ru","142225",100,49);
//        Worker worker4 = new Worker("Anton","pilot","yama@inbox.ru","766663",400,45);
//        Worker worker5 = new Worker("Misha","doctor","dok@mail.ru","5565655",500,34);

    }


}
