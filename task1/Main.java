package kg.attractor.java.task1;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        // Сортировка по породе (используем ссылку на метод)
        cats.sort(Comparator.comparing(Cat::getBreed));
        System.out.println("Сортировка по породе:");
        Printer.print(cats);




    }

}
