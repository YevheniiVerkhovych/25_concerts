package Model.entities;

import Model.Data.Genre;
import Model.Data.Group;
import Model.Data.Locations;


public class Concert {
    private String date;
    private Locations locations;
    private boolean[] seats = new boolean[locations.getHallVolume()];
    private int price;
    private Genre genre;
    private Group group;


}
