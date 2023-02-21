public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача1");
        int age = 7;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2 () {
        System.out.println("Задача2");
        int temperature = 15;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
    }
    public static void task3 () {
        System.out.println("Задача3");
        int speed = 70;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ",то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф.");
        }
    }

    public static void task4 () {
        System.out.println("Задача4");
        int humanAge = 13;
        if (humanAge >= 2 && humanAge <=6) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то ему нужно ходить в детский сад.");
        } else if (humanAge >= 7 && humanAge <=18) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то ему нужно ходить в школу.");
        } else if (humanAge > 18 && humanAge < 24) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то его место в университете.");
        } else if (humanAge > 24) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то ему пора ходить на работу.");
        }

    }
    public static void task5 () {
        System.out.println("Задача5");
        int ageChild = 6;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + " ,то он не может кататься на аттракционе");
        } else if (ageChild > 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + " ,то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (ageChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + " ,то он может кататься без сопровождения взрослого.");
        }
    }
    public static void task6 () {
        System.out.println("Задача6");
        int capacity = 102;
        int seat = 60;
        int currentPassengers = 40;
        if (currentPassengers >= capacity) {
            System.out.println("Свободных мест нет.");
        } else if (currentPassengers >= seat) {
            System.out.println("Есть только стоячие места.");
        } else if (currentPassengers < seat) {
            System.out.println("Есть свободные сидячие места.");
        }
    }
    public static void task7 () {
        System.out.println("Задача7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two) {
            if (one > three) {
                System.out.println(one);
            } else {
                System.out.println(three);
            }
        } else {
           if (two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
    }
}