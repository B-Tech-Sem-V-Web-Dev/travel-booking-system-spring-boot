package com.transport.travelbookingsystem.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
@Entity
@Table(name = "TravelPlans")
public class TravelPlans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, length = 100)
    private String username;

    @Column(name = "destination", length = 100)
    private String destination;

    @Column(name = "medium_of_travel")
    private Long mediumOfTravelId;

    // Replaced the foreign key relationship with a simple hotel_id field
    @Column(name = "hotel_id", nullable = true)
    private Long hotelId;

    @Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt = LocalDateTime.now();

    public TravelPlans() {
    }

    public TravelPlans(String username, String destination, Long mediumOfTravelId, Long hotelId) {
        this.username = username;
        this.destination = destination;
        this.mediumOfTravelId = mediumOfTravelId;
        this.hotelId = hotelId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Long getMediumOfTravelId() {
        return this.mediumOfTravelId;
    }

    public void setMediumOfTravelId(Long mediumOfTravelId) {
        this.mediumOfTravelId = mediumOfTravelId;
    }

    public Long getHotelId() {
        return this.hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TravelPlans)) {
            return false;
        }
        TravelPlans travelPlans = (TravelPlans) o;
        return Objects.equals(id, travelPlans.id) && Objects.equals(username, travelPlans.username) && Objects.equals(destination, travelPlans.destination) && Objects.equals(mediumOfTravelId, travelPlans.mediumOfTravelId) && Objects.equals(hotelId, travelPlans.hotelId) && Objects.equals(createdAt, travelPlans.createdAt) && Objects.equals(updatedAt, travelPlans.updatedAt);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", destination='" + getDestination() + "'" +
            ", mediumOfTravel='" + getMediumOfTravelId() + "'" +
            ", hotelId='" + getHotelId() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            "}";
    }
}
