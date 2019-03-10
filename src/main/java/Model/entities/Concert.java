package Model.entities;

import Controller.Controller_Utilities;
import Model.Data.Genre;
import Model.Data.Group;
import Model.Data.Locations;
import static View.TextConstant.*;
import static View.View.bundle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Concert  {

    private Date date;
    private Locations locations;
    private int price;
    private Genre genre;
    private Group group;
    private int seats;

    public Concert(String date, Locations locations, int price, Genre genre, Group group) throws ParseException {
        this.date = Controller_Utilities.dateConvert(date);
        this.locations = locations;
        this.price = price;
        this.genre = genre;
        this.group = group;
        this.seats = locations.getHallVolume();
    }

    public Date getDate() {
        return date;
    }
    public String getLocations() {
        return locations.getLocationName();
    }
    public int getPrice() {
        return price;
    }
    public String getGenre() {
        return genre.getGenreName();
    }
    public String getGroup() {
        return group.getGroupName();
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }


    @Override
    public String toString() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String dateReturn = simpleDateFormat.format(date);

        return bundle.getString(MESSAGE_CONCERT) +
                dateReturn + " " + locations.getLocationName() +
                bundle.getString(MESSAGE_SEATS) + locations.getHallVolume() +
                " " + genre.getGenreName() +
                " " + group.getGroupName() + bundle.getString(MESSAGE_PRICE) + price;
    }

}
