import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by sjjo15 on 2017-02-27.
 */
public class Komplex {
    double real;
    double imagine;

    public Komplex(double Re, double Im) {
        real = Re;
        imagine = Im;
    }

    public String toString(){
        return real + " + " + imagine + " + i";
    }
}
