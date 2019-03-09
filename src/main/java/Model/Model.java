package Model;

import Model.Data.Genre;
import Model.Data.Group;
import Model.Data.Locations;
import Model.entities.Concert;
import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Model {

public static List<Concert> dataBase = new ArrayList<>();

    public static void dataBaseFilling() throws ParseException {
     dataBase.add(new Concert("22 04 2019 22:00", Locations.KYIV,    500,  Genre.ROCK, Group.ACDC));
     dataBase.add(new Concert("09 03 2019 10:00", Locations.KYIV,    1500, Genre.ROCK, Group.ACCEPT));
     dataBase.add(new Concert("11 04 2019 18:00", Locations.ODESSA,  700,  Genre.POP, Group.BEACHBOYS));
     dataBase.add(new Concert("11 05 2019 20:00", Locations.HARKOV,  450,  Genre.TECHNO, Group.SCOOTER));
     dataBase.add(new Concert("02 05 2019 23:00", Locations.POLTAVA, 300,  Genre.POP, Group.BEEGEES));
     dataBase.add(new Concert("27 04 2019 23:00", Locations.JYTOMYR, 350,  Genre.ROCK, Group.ACCEPT));
     dataBase.add(new Concert("15 02 2019 22:00", Locations.KYIV,    2500, Genre.POP, Group.ABBA));
     dataBase.add(new Concert("20 03 2019 21:00", Locations.ODESSA,  1200, Genre.JAZZ, Group.ACCEPT));
     dataBase.add(new Concert("12 03 2019 19:00", Locations.HARKOV,  900,  Genre.TECHNO, Group.BEEGEES));

   }






}
