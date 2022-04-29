package java8;

public class Address {
    private int phone;
    private String street;

    public Address(int phone, String street) {
        this.phone = phone;
        this.street = street;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("phone=").append(phone);
        sb.append(", street='").append(street).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
