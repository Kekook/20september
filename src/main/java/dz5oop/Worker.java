package dz5oop;

public class Worker {
    private String name;
    private String position;
    private String eMail;
    private String number;
    private int salary;
    private int age;

    public Worker(String name, String position, String eMail, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
//    public static void info(Worker worker){
//
//       System.out.printf("Сотрудник имя : %s, должность: %s,мэйл : %s, телефон : %s, зарплата : %s, возраст : %s\n",worker.name,worker.position,worker.eMail,worker.number,worker.salary,worker.age);
//    }

    public void info(){
        System.out.println("Имя"+ name + " должность"+ position + "почта"+ eMail +"телефон"+number + "ЗП"+ salary + "возраст" + age);
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", eMail='" + eMail + '\'' +
                ", number='" + number + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
