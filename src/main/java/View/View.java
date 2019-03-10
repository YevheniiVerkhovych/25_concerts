package View;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "text_and_messages";

    //Language trigger
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ru", "RU"));  // Ru
                  //  new Locale("en"));        // En
}
