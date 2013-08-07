package sun.natee.winapp.utility;

import java.util.ResourceBundle;

public class MessageAlert {

    private static ResourceBundle bundle;

    static {
        bundle = ResourceBundle.getBundle("sun/natee/winapp/prop/pos_message_prop");
    }

    public static String userIsEmpty() {
        return bundle.getString("message.userIsEmpty");
    }
    
    public static String passIsEmpty() {
        return bundle.getString("message.passIsEmpty");
    }
    
    public static String invalidLogin() {
        return bundle.getString("message.invalidLogin");
    }
}
