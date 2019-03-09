
import Controller.Controller;
import Model.Model;
import View.View;

import java.text.ParseException;


public class Main {

    public static void main(String[] args) throws ParseException {

        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(view, model);
        controller.process();

        }
}


