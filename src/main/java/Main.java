import Controller.Controller;
import Model.Data.Genre;
import Model.Model;
import View.View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws ParseException {



Controller c = new Controller();

        c.Date_Convert();
        View view = new View();
        Model m = new Model();
        m.setView(view);
        m.setG(Genre.POP);
        m.printg();




            }


//        // write your code here
//        Controller controller =
//                new Controller(new Model(), new View());
//        // Run
//        controller.processUser();
    }


