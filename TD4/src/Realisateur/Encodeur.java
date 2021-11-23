package Realisateur;

import java.lang.RuntimeException;
import java.util.Locale;

public class Encodeur
{
    public String encode1(String str, char c, int i)
    {
        String s = new String();

        if (i < 1)
            throw new RuntimeException("Wrong i parameter");

        int ki = 0;
        s += c;
        for (int k = 0; k < str.length(); k++)
        {
            if (ki == i - 1)
            {
                s += c;
                ki = 0;
            } else
                ki++;

            s += str.charAt(k);
        }
        return s;
    }

    public String encode2(String str)
    {
        String s = new String();
        for (int k = 0; k < str.length() - 1; k++)
        {
            if (k % 2 == 0)
            {
                s += str.charAt(k + 1);
                s += str.charAt(k);
            }
        }
        if (str.length() % 2 == 1)
            s += str.charAt(str.length() - 1);
        return s;
    }

    public String toUppercase(String str){

        str = str.toUpperCase(Locale.ROOT);
        return str;

    }
}
