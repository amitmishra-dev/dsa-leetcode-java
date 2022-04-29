package java8;

import java.util.Objects;

public class Address {
    private int phone;
    private String street;

    public Address(int phone, String street) {
        this.phone = phone;
        this.street = street;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Address))
            return false;
        Address address = (Address) o;
        return phone == address.phone && Objects.equals(street, address.street);
    }

    @Override public int hashCode() {
        return Objects.hash(phone, street);
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
