package jp.ne.voqn;

import java.util.Collection;

/**
 *
 * @author VoQn
 */
public class StringsControl {

    public static String connect(String seperator, Collection<?> list) {
        return connect(seperator, list.toArray());
    }

    public static String connect(String seperator, Object... values) {
        if (seperator == null || values == null) {
            throw new IllegalArgumentException();
        }
        String format = "";
        for (int i = 0, l = values.length; i < l; i++) {
            format += "%s" + ((i < l - 1) ? seperator : "");
        }
        return String.format(format, values);
    }
}
