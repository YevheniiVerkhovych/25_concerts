package Model;

import Model.Data.Genre;
import Model.Data.Group;
import Model.Data.Locations;
import Model.entities.Concert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import View.*;


public class Model {
View view;

public Model(View view) {
    this.view = view;
}

public List<Concert> dataBase = new ArrayList<>();

    public void dataBaseFilling() throws ParseException {
     dataBase.add(new Concert("22 04 2019 22:00", Locations.KYIV,    500,  Genre.ROCK, Group.ACDC));
     dataBase.add(new Concert("09 03 2019 10:00", Locations.KYIV,    1500, Genre.ROCK, Group.ACCEPT));
     dataBase.add(new Concert("11 04 2019 18:00", Locations.ODESSA,  700,  Genre.POP, Group.BEACHBOYS));
     dataBase.add(new Concert("11 05 2019 20:00", Locations.HARKOV,  450,  Genre.TECHNO, Group.SCOOTER));
     dataBase.add(new Concert("02 05 2019 23:00", Locations.POLTAVA, 300,  Genre.POP, Group.BEEGEES));
     dataBase.add(new Concert("27 04 2019 23:00", Locations.JYTOMYR, 350,  Genre.ROCK, Group.ACCEPT));
     dataBase.add(new Concert("15 03 2019 22:00", Locations.KYIV,    2500, Genre.POP, Group.ABBA));
     dataBase.add(new Concert("20 03 2019 21:00", Locations.ODESSA,  1200, Genre.JAZZ, Group.ACCEPT));
     dataBase.add(new Concert("12 03 2019 19:00", Locations.HARKOV,  900,  Genre.TECHNO, Group.BEEGEES));

        dataBase.stream().forEach(System.out::println);
}




 public static Date dateConvert(String date) throws ParseException {

     String pattern = "dd MM yyyy HH:mm";
     return new SimpleDateFormat(pattern).parse(date);

    }


}
