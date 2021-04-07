package sesion3;

public class Primitive {
    {
    String inStr = "5566";
    int number = Integer.parseInt(inStr);}
    {
        String inStr = "55.66";
        float aFloat = Float.parseFloat(inStr);
        double aDouble = Double.parseDouble("1.2345");
        aDouble = Double.parseDouble("1.2e-3");
    }
    {
        String msg = "Hello, world";
        char msgChar;
        for (int idx = 0; idx < msg.length(); ++idx) {
            msgChar = msg.charAt(idx);
        }
        {
            String boolStr="true";
            boolean done = Boolean.parseBoolean(boolStr);
            boolean valid = Boolean.parseBoolean("false");
        }
    }
}
