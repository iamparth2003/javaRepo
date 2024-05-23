package pwrsonInfo;
import CountryInfo.*;

public class DemoPerson {
    public static void main(String args[]) {
        Country c = new Country("India");
        State s = new State("Gujarat");
        person p = new person("Parth", c, s);

        System.out.println(p);
    }
}
