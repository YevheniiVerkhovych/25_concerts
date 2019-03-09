package Model.Data;
import static View.TextConstant.*;
import static View.View.bundle;

public enum Group {

        ACDC(bundle.getString     (ACDC_NAME)),
        ACCEPT(bundle.getString   (ACCEPT_NAME)),
        SCOOTER(bundle.getString  (SCOOTER_NAME)),
        ABBA(bundle.getString     (ABBA_NAME)),
        BEACHBOYS(bundle.getString(BEACHBOYS_NAME)),
        BEEGEES(bundle.getString  (BEEGEES_NAME));

        private String groupName;

        Group(String groupName) {
            this.groupName = groupName;

        }

        public String getGroupName(){
            return this.groupName;
        }


}



