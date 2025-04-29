package kg.attractor.java.task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        var cats = new ArrayList<ActiveCat>();

        cats.add(new ActiveCat(ActiveCat::jump));
        cats.add(new ActiveCat(ActiveCat::sleep));
        cats.add(new ActiveCat(ActiveCat::eat));

        // добавьте ещё два-три кота, с совершенно другими действиями

        cats.add( new ActiveCat(() -> "Я бегаю!"));
        cats.add(new ActiveCat(() -> "Я мурлыкаю!"));

        cats.forEach(ActiveCat::doAction);
    }

}
