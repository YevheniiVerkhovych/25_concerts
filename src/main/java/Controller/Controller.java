package Controller;

import Model.Model;
import View.View;

import java.text.ParseException;

public class Controller {

View view;
Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

public void process() throws ParseException {
    model.dataBaseFilling();
}



}
