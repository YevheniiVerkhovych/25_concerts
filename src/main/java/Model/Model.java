package Model;

import Model.Data.Genre;
import View.View;

public class Model {

    Genre g;
    View view;


    public void setView(View view) {
        this.view = view;
    }

    public Genre getG() {
        return g;
    }

    public void setG(Genre g) {
        this.g = g;
    }

    public void printg() {
        System.out.println(g.getGenreName());
    }
}
