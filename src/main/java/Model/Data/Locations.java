package Model.Data;
import static View.TextConstant.*;
import static View.View.bundle;

public enum Locations {
    KYIV(bundle.getString(KYIV_NAME),500),
    ODESSA(bundle.getString(ODESSA_NAME),300),
    JYTOMYR(bundle.getString(JYTOMYR_NAME),200),
    POLTAVA(bundle.getString(POLTAVA_NAME),250),
    HARKOV(bundle.getString(HARKOV_NAME),400);


    private String locationName;

    private int hallVolume;


    Locations(String locationName, int hallVolume) {
        this.locationName = locationName;
        this.hallVolume = hallVolume;

    }

    public String getLocationName(){
        return this.locationName;
    }

    public int getHallVolume() {
        return this.hallVolume;
    }



}
