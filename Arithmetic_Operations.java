package sesion3;

public class Arithmetic_Operations {
    char c1 = '0';
    char c2 = 'A';
    char c3;

    {
        System.out.println((int) c1);
        System.out.println((int) c2);
        c3 = 97;
        System.out.println(c3);
        System.out.println((char) 97);
    }
    {
        c3 = (char)(c1+c2);
        System.out.println(c3);
        System.out.println(c1+c2);
        System.out.println((char)(c1+c2));
    }
    {
        c3 = (char)(c1+5);
        System.out.println(c3);
        System.out.println(c1+5);

        for (int codeNum = 'a'; codeNum <= 'z'; ++codeNum) {
            System.out.println((char)codeNum + ": " + codeNum);
        }
    }
    {
        char c4 = '0';
        c4+=5;
        System.out.println(c4);
    }
    {
        for (char c = '0'; c<= '9'; ++c) {
            System.out.println(c);
        }
    }
}
