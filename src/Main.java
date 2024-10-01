public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Задача 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        //Общая масса бойцов
        var boxerWeight = boxer1 + boxer2;
        System.out.println("Общая масса двух бойцов " + boxerWeight);
        //Разница между массами бойцов
        var differenceBoxerWeight = boxer1 - boxer2;
        System.out.println("Разница массы бойцов" + differenceBoxerWeight);
        //Задача 7
        //Остаток от деления между 2 весами
        var remainsBoxerWeight = boxer2 % boxer1;
        System.out.println(remainsBoxerWeight);
        //Задача 8
        //Всего часов
        var totalWatchWork = 640;
        //Часов на одного работника
        var watchWorkOneEmployee = 8;
        //Кол-во сотрудников
        var quantityEmployee = totalWatchWork / watchWorkOneEmployee;
        System.out.println("Всего работников в компании - " + quantityEmployee + " человек");
        //Сотрудников на 94 больше
        quantityEmployee = quantityEmployee + 94;
        //Всего часов поделено
        totalWatchWork = watchWorkOneEmployee * quantityEmployee;
        System.out.println("Если в компании работает " + quantityEmployee + " человека, то всего " + totalWatchWork + " часов работы может быть поделено между сотрудниками");
    }
}