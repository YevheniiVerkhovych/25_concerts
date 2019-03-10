package Controller;

import Model.entities.Concert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import static Model.Model.dataBase;
import static View.TextConstant.*;
import static View.View.bundle;

public class Controller_Utilities {
    private int order = 2;

    //Sort Methods
    public void showSortedLists() {

        printMessage(bundle.getString(MESSAGE_PRICE_SORT));
        Collections.sort(dataBase, Comparator.comparingInt(Concert::getPrice));
        printForEach(dataBase);

        printMessage(bundle.getString(MESSAGE_LOCATION_SORT));
        Collections.sort(dataBase, Comparator.comparing(Concert::getLocations));
        printForEach(dataBase);

        printMessage(bundle.getString(MESSAGE_DATE_SORT));
        Collections.sort(dataBase, Comparator.comparing(Concert::getDate));
        printForEach(dataBase);

        printMessage(bundle.getString(MESSAGE_GROUPNAME_SORT));
        Collections.sort(dataBase, Comparator.comparing(Concert::getGroup));
        printForEach(dataBase);
    }
    //Filtering methods
    public void showFilteredList() {

        printMessage(bundle.getString(MESSAGE_DATE_FILTERING));
        dataBase.stream().filter(a -> a.getDate().after(new Date())).forEach(System.out::println);

        printMessage(bundle.getString(MESSAGE_ROCK_GENRE_FILTERING));
        dataBase.stream().filter(a -> a.getGenre().matches(bundle.getString(ROCK_NAME))).forEach(System.out::println);

    }
    //Ticket purchasing linked to location
    public void ticketsOrdering() {
        printMessage(bundle.getString(MESSAGE_TICKETS_PURCHASING));
        printMessage(dataBase.get(2).toString());
        printMessage(order + bundle.getString(MESSAGE_BOUGHT_SEATS) + dataBase.get(2).getPrice() * order);
        printMessage(dataBase.get(2).getSeats() - order + bundle.getString(MESSAGE_FREE_SEATS_LEFT));
        dataBase.get(2).setSeats(dataBase.get(2).getSeats() - order);

    }

    public void printForEach(List<Concert> c) {
        c.stream().forEach(System.out::println);
        System.out.println();
    }

    public void printMessage(String s) {
            System.out.println(s);
        }

    public static Date dateConvert(String date) {
        try {
            return new SimpleDateFormat(pattern).parse(date);
        } catch (ParseException e) {
            e.printStackTrace(); return new Date();
        }

    }

}
