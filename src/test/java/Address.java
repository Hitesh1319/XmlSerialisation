public class Address {
    private String state;
    private String country;
    private DistrictAndPin abc;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public DistrictAndPin getAbc() {
        return abc;
    }

    public void setAbc(DistrictAndPin abc) {
        this.abc = abc;
    }
}