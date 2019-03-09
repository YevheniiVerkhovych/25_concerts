package Controller;

import Model.entities.Concert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import static Model.Model.dataBase;
import static View.TextConstant.ROCK_NAME;
import static View.View.bundle;

public class Controller_Utilities {
    private int order = 4;

    public void showSortedLists(){

        Collections.sort(dataBase, Comparator.comparingInt(Concert::getPrice));
        dataBase.stream().forEach(System.out::println);
        System.out.println();

        Collections.sort(dataBase, Comparator.comparing(Concert::getLocations));
        dataBase.stream().forEach(System.out::println);
        System.out.println();

        Collections.sort(dataBase, Comparator.comparing(Concert::getDate));
        dataBase.stream().forEach(System.out::println);
        System.out.println();

        Collections.sort(dataBase, Comparator.comparing(Concert::getGroup));
        dataBase.stream().forEach(System.out::println);
        System.out.println();

        dataBase.stream().filter(a -> a.getDate().after(new Date())).forEach(System.out::println);
        System.out.println();

        dataBase.stream().filter(a -> a.getGenre().matches(bundle.getString(ROCK_NAME))).forEach(System.out::println);
        System.out.println();

        System.out.println(dataBase.get(2).toString());
        System.out.println(order + " seat(s) you bought, price is: " + dataBase.get(2).getPrice() * order);
        System.out.println(dataBase.get(2).getSeats() - order + " free seats left");
        dataBase.get(2).setSeats(dataBase.get(2).getSeats() - order);

    }


    public static Date dateConvert(String date) {

        String pattern = "dd MM yyyy HH:mm";
        try {
            return new SimpleDateFormat(pattern).parse(date);
        } catch (ParseException e) {
            e.printStackTrace(); return new Date();
        }

    }

}
