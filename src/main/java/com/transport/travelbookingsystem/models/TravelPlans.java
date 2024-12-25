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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Column(name = "destination", nullable = false, length = 100)
    private String destination;

    @Enumerated(EnumType.STRING)
    @Column(name = "medium_of_travel", nullable = false)
    private MediumOfTravel mediumOfTravel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id")
    private Hotels hotel;

    @Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt = LocalDateTime.now();

    public enum MediumOfTravel {
        BUS, TRAIN, FLIGHT
    }

    public TravelPlans() {
    }

    public TravelPlans(Long id, Users user, String destination, MediumOfTravel mediumOfTravel, Hotels hotel, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.user = user;
        this.destination = destination;
        this.mediumOfTravel = mediumOfTravel;
        this.hotel = hotel;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUser() {
        return this.user;
    }

    public void setUser(Users user) {
        this.user = user;
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

    public Hotels getHotel() {
        return this.hotel;
    }

    public void setHotel(Hotels hotel) {
        this.hotel = hotel;
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
        return Objects.equals(id, travelPlans.id) && Objects.equals(user, travelPlans.user) && Objects.equals(destination, travelPlans.destination) && Objects.equals(mediumOfTravel, travelPlans.mediumOfTravel) && Objects.equals(hotel, travelPlans.hotel) && Objects.equals(createdAt, travelPlans.createdAt) && Objects.equals(updatedAt, travelPlans.updatedAt);
    }
    
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", user='" + getUser() + "'" +
            ", destination='" + getDestination() + "'" +
            ", mediumOfTravel='" + getMediumOfTravel() + "'" +
            ", hotel='" + getHotel() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            "}";
    }

}
