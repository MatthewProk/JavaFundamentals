package Task3;

import java.util.Locale;
import java.util.ResourceBundle;

class AppResources {


    private ResourceBundle bundle;

    AppResources(Locale locale){
        bundle = ResourceBundle.getBundle("prop", locale);
    }

    String getValue(String key){
        return bundle.getString(key);
    }
}
