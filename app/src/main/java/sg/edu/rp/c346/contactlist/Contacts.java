package sg.edu.rp.c346.contactlist;

/**
 * Created by 16030820 on 23/7/2018.
 */

public class Contacts {

    private String name;
    private int countryCode;
    private int phoneNum;

    public Contacts(String name, int countryCode, int phoneNum) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", countryCode=" + countryCode +
                ", phoneNum=" + phoneNum +
                '}';
    }
}
