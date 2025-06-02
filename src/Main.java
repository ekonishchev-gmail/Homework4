//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }

        int personAge = 20;
        if (personAge > 2 && personAge < 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад");
        }
        if (personAge > 7 && personAge < 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу");
        }
        if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет");
        }
        if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу");
        }

        int childAge = 15;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        }
        if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int people = 70;
        if (people < 102) {
            System.out.println("Если количество людей равно " + people + ", в вагоне есть места");
        } else {
            System.out.println("Если количество людей равно " + people + ", вагон забит");
        }
        if (people > 60 && people < 102) {
            System.out.println("Если количество людей равно " + people + ", есть только стоячие места");
        }
        if (people < 60) {
            System.out.println("Если количество людей равно " + people + ", есть сидячие места");
        }





    }
}