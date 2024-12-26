package com.transport.travelbookingsystem.models;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "co_passengers")
public class CoPassengers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "travel_plan_id", nullable = false)
    private Long travelPlanId; // Store the travel plan ID instead of a foreign key reference

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "is_registered_user", nullable = false)
    private Boolean isRegisteredUser = false;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    public CoPassengers() {
    }

    public CoPassengers(Long id, Long travelPlanId, String name, Boolean isRegisteredUser, String email, String phoneNumber) {
        this.id = id;
        this.travelPlanId = travelPlanId;
        this.name = name;
        this.isRegisteredUser = isRegisteredUser;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTravelPlanId() {
        return this.travelPlanId;
    }

    public void setTravelPlanId(Long travelPlanId) {
        this.travelPlanId = travelPlanId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isIsRegisteredUser() {
        return this.isRegisteredUser;
    }

    public Boolean getIsRegisteredUser() {
        return this.isRegisteredUser;
    }

    public void setIsRegisteredUser(Boolean isRegisteredUser) {
        this.isRegisteredUser = isRegisteredUser;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CoPassengers)) {
            return false;
        }
        CoPassengers coPassengers = (CoPassengers) o;
        return Objects.equals(id, coPassengers.id) && Objects.equals(travelPlanId, coPassengers.travelPlanId) && Objects.equals(name, coPassengers.name) && Objects.equals(isRegisteredUser, coPassengers.isRegisteredUser) && Objects.equals(email, coPassengers.email) && Objects.equals(phoneNumber, coPassengers.phoneNumber);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", travelPlanId='" + getTravelPlanId() + "'" +
            ", name='" + getName() + "'" +
            ", isRegisteredUser='" + isIsRegisteredUser() + "'" +
            ", email='" + getEmail() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            "}";
    }
}
