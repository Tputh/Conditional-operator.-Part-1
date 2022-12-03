public class Main {
    public static void main(String[] args) {
        System.out.println("Условный оператор. Часть 1");
         System.out.println("Домашнее задание - 1. Домашнее задание - 2");
        // Задание 1
        System.out.println("Задание 1");

        byte age = 17;
        if (age >= 18)
            System.out.println("поздравляем пользователя с совершеннолетием");
        else {
            System.out.println(" возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        // Задание 2
        System.out.println("Задание 2");

        byte child = 7;
        System.out.println("7");
        if (child >= 7)
            System.out.println("ребенок ходит в школу");
        else {
            System.out.println("ребёнок не может ходить в школу");
        }

        byte human = 18;
        System.out.println("18");
        if (human >= 18)
            System.out.println("уже закончил школу и может отправляться в университет");
        else {
            System.out.println("ещё не закончил школу и не может отправляться в университет");
        }
        byte adult = 24;
        System.out.println("24");
        if (adult >= 24)
            System.out.println("человек окончил университет и ему пора искать первую работу");
        else {
            System.out.println("человек ещё не окончил университет и не может искать работу");
        }

        // Задание 3
        System.out.println("Задание 3");

        byte passengers = 105;
        System.out.println("пассажиров в вагоне" + passengers + "человек");
        byte carCapacity = 102;
        byte seats = 60;
        int standingPlaces = carCapacity - seats;
        System.out.println("всего в вагоне" + carCapacity + "мест");
        System.out.println("сидячих" + seats + "мест");
        System.out.println("стоячих" + standingPlaces + "мест");
        if (passengers >= seats)
            System.out.println("сидячих мест нет");
        else {
            System.out.println("есть свободные сидячие места");
        }

        if (passengers >= standingPlaces)
            System.out.println("стоячих мест нет");
        else {
            System.out.println("есть свободные стоячие места");
        }
        if (passengers >= carCapacity)
            System.out.println("мест в вагоне нет");
        else {

            System.out.println("места в вагоне есть");
        }
        System.out.println("Домашнее задание - 3");
        // Задание 1
        System.out.println("Задание 1");
        byte aSmallChild = 5;
        System.out.println("маленький ребёнок" +aSmallChild + "лет");
        if (aSmallChild >= 2 && aSmallChild <= 6 )
            System.out.println("маленькому ребёнку нужно ходить в детский сад");

        byte schoolboy = 15;
        System.out.println("школьник" + schoolboy + "лет");
        if (schoolboy >= 7 && schoolboy <= 18)
            System.out.println("человеку нужно ходить в школу");

        byte student = 22;
        System.out.println("студен" + student + "года");
        if (student >= 18 && student <=24)
            System.out.println("место человека в университете");

        byte anAdult =27;
        System.out.println("взрослый человек" + anAdult + "лет");
        if (adult >= 24 && anAdult <= 56 )
            System.out.println("человеку нужно ходить на работу");

        // Задание 2
        System.out.println("Задание 2");

        byte theGirl = 13;
        if (theGirl < 5 )
        System.out.println("Если ребенку меньше 5 лет, то он не может кататься на аттракционе,");
        else {
            System.out.println("ребёнку нет 5 поэтому он не может кататься на атракционе");
        }
        if (theGirl > 5 || theGirl< 14)
        System.out.println("Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        if (theGirl > 14)
        System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого");
        else {
            System.out.println("ребёнку нет 14 поэтому он не может кататься без сопровождения взрослого");
        }

        // Задание 3
        System.out.println("Задание 3");


        int one = 1;
        int two = 2;
        int three= 3;
        if (three > one && three > two)
       System.out.println("больше всех" + three);



    }
}














