package sesion3;

import java.util.Locale;

public class Operations {
    String str = "Java is cool!";

    {
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(5));

        String anotherStr = "Java is COOL!";
        System.out.println(str.equals(anotherStr));
        System.out.println(str.equalsIgnoreCase(anotherStr));
        System.out.println(anotherStr.equals(str));
        System.out.println(anotherStr.equalsIgnoreCase(str));
    }
    {
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.substring(0, 3));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.endsWith("cool"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
