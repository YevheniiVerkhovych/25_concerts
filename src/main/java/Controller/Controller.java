package Controller;
import Model.Model;
import View.View;
import java.text.ParseException;

public class Controller {

View  view;
Model model;
Controller_Utilities controller_utilities = new Controller_Utilities();

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

public void process() throws ParseException {
    model.dataBaseFilling();
    controller_utilities.showSortedLists();
}



}
