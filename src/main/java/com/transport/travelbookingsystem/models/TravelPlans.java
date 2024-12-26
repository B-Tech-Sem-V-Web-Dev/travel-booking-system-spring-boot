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

    @Enumerated(EnumType.STRING)
    @Column(name = "medium_of_travel")
    private MediumOfTravel mediumOfTravel;

    // Replaced the foreign key relationship with a simple hotel_id field
    @Column(name = "hotel_id", nullable = true)
    private Long hotelId;

    @Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt = LocalDateTime.now();

    public enum MediumOfTravel {
        BUS, TRAIN, FLIGHT
    }

    public TravelPlans() {
    }

    public TravelPlans(Long id, String username, String destination, MediumOfTravel mediumOfTravel, Long hotelId, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.username = username;
        this.destination = destination;
        this.mediumOfTravel = mediumOfTravel;
        this.hotelId = hotelId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public MediumOfTravel getMediumOfTravel() {
        return this.mediumOfTravel;
    }

    public void setMediumOfTravel(MediumOfTravel mediumOfTravel) {
        this.mediumOfTravel = mediumOfTravel;
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
        return Objects.equals(id, travelPlans.id) && Objects.equals(username, travelPlans.username) && Objects.equals(destination, travelPlans.destination) && Objects.equals(mediumOfTravel, travelPlans.mediumOfTravel) && Objects.equals(hotelId, travelPlans.hotelId) && Objects.equals(createdAt, travelPlans.createdAt) && Objects.equals(updatedAt, travelPlans.updatedAt);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", destination='" + getDestination() + "'" +
            ", mediumOfTravel='" + getMediumOfTravel() + "'" +
            ", hotelId='" + getHotelId() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            "}";
    }
}
