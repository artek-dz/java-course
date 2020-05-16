package assign10.streams;

import java.util.Objects;

public class Address {
    private String city;

    @Override
    public String toString() {
        return city;
    }

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }
}
