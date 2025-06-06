package kg.attractor.java.task1;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);


        cats.sort(Comparator.comparing(Cat::getBreed));
        System.out.println("Сортировка по породе:");
        Printer.print(cats);


        cats.sort(Comparator.comparing(Cat::getName).thenComparing(Cat::getAge));
        System.out.println("Сортировка по имени и возрасту:");
        Printer.print(cats);


        cats.removeIf(cat -> cat.getColor() == Cat.Color.GINGER);
        System.out.println("Удалены коты с цветом GINGER:");
        Printer.print(cats);


        cats.removeIf(cat -> cat.getName().length() == 5);
        System.out.println("Удалены коты с именами длины 5:");
        Printer.print(cats);


    }

}
