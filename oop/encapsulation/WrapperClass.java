package oop.encapsulation;

public class WrapperClass {
    private int Id;
    private String name;
    private String mNumber;
    private String city;
    public int getId(){
        return Id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }
    public String getmNumber() {
        return mNumber;
    }


    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }


}
