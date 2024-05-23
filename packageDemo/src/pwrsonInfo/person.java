package pwrsonInfo;
import CountryInfo.*;

public class person {
    private String name;
    private Country country;
    private State state;

    public person(String name, Country country, State state) {
        this.name = name;
        this.country = country;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", country=" + country + ", state=" + state + "]";
    }
}
