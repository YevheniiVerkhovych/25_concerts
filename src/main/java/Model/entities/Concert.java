package Model.entities;

import Model.Data.Genre;
import Model.Data.Group;
import Model.Data.Locations;
import Model.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Concert {

    private Date date;
    private Locations locations;
    private int price;
    private Genre genre;
    private Group group;
    private boolean[] seats;// = new boolean[locations.getHallVolume()];

    public Concert(String date, Locations locations, int price, Genre genre, Group group) throws ParseException {
        this.date = Model.dateConvert(date);
        this.locations = locations;
        this.price = price;
        this.genre = genre;
        this.group = group;
        this.seats = new boolean[locations.getHallVolume()];
    }

    public Date getDate() {
        return date;
    }

    public void setDate(String date) throws ParseException {
        this.date = Model.dateConvert(date);
    }

    public Locations getLocations() {
        return locations;
    }

    public void setLocations(Locations locations) {
        this.locations = locations;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public boolean[] getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        String pattern = "dd MM yyyy HH:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String dateReturn = simpleDateFormat.format(date);

        return "Concert " +
                dateReturn + " " + locations.getLocationName() +
                ", price=" + price + ", seats: " + locations.getHallVolume() +
                " " + genre.getGenreName() +
                " " + group.getGroupName();
    }





}
