package CountryInfo;

public class Country {
    String cname;

    public Country(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Country [cname=" + cname + "]";
    }

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}
