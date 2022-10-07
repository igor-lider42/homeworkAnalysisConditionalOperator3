public class Main {
    public static void main(String[] args) {
        // Разбор задания 3
        System.out.println("Разбор задания 3");
       //Задача 1
        System.out.println("Решение задачи 1");
        int yearsOld = 7;
        if (yearsOld>=2 && yearsOld<=6) {
            System.out.println("Если возраст человека равен" + yearsOld + ", то ему нужно ходить в детский сад.");
            }else if (yearsOld>=7 && yearsOld<=18) {
            System.out.println("Если возраст человека равен" + yearsOld + ", то ему нужно ходить в школу.");
        }else if (yearsOld>=18 && yearsOld<=24) {
            System.out.println("Если возраст человека равен" + yearsOld + ", то ему нужно ходить в университет.");
        }else if (yearsOld>24) {
            System.out.println("Если возраст человека равен" + yearsOld + ", то ему нужно ходить на работу.");
        }
        //Задача 2
        System.out.println("Решение задачи 2");
        if (yearsOld<5){
            System.out.println("Ребёнок не может каться на атракционе.");
        } else if (yearsOld<14) {
            System.out.println("Ребёнок может кататься на атракционе только в сопровождении взрослого." +
                    " Если взрослого нет, то кататься нельзя. ");
        } else {
            System.out.println("Ребёнок может кататься на атракционе.");
        }
        // Задача 3
        System.out.println("Решение задачи 3");
        int one = 4;
        int two = 5;
        int three = 4;
        if (one > two){
            if (one > three) {
                System.out.println("Максимальное число " + one);
            }else {
                System.out.println("Максимальное число " + three);
            }
        } else if (two > one) {
            if (two > three) {
                System.out.println("Максимальное число" + two);
            } else {
                System.out.println("Максимальное число" + three);
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число" + one);
            } else if (three > one) {
                System.out.println("Максимальное число" + three);
            } else {
                System.out.println("Все 3 числа равны");
            }
        }
    }
}