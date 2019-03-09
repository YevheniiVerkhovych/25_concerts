package Model.Data;

import static View.TextConstant.*;


import static View.View.bundle;

public enum Genre {

        ROCK(bundle.getString(ROCK_NAME)),
        JAZZ(bundle.getString(JAZZ_NAME)),
        POP(bundle.getString(POP_NAME)),
        TECHNO(bundle.getString (TECHNO_NAME));

        private String genreName;

        Genre(String genreName) {
            this.genreName = genreName;

        }

    public String getGenreName(){ return this.genreName; }


}
