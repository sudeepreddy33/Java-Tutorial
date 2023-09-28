package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Drivers_License {

    @Id
    @Column(name = "Driver_ID")
    private int driver_ID;
    @Column(name = "First_Name")
    private String first_name;
    @Column(name = "Last_Name")
    private String last_name;
    @Column(name = "Address")
    private String address;
    @Column(name = "Postcode")
    private String postcode;

    public int getDriver_ID() {
        return driver_ID;
    }

    public void setDriver_ID(int driver_ID) {
        this.driver_ID = driver_ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Drivers_License{" +
                "driver_ID=" + driver_ID +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
