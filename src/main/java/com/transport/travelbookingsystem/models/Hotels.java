package com.transport.travelbookingsystem.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "Hotels")
public class Hotels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hotel_name", nullable = false, length = 100)
    private String hotelName;

    @Column(name = "location", nullable = false, length = 100)
    private String location;

    @Column(name = "available_rooms", nullable = false)
    private Integer availableRooms;

    @Column(name = "price_per_night", nullable = false, precision = 10)
    private Double pricePerNight;

    @Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt = LocalDateTime.now();

    public Hotels() {
    }

    public Hotels(Long id, String hotelName, String location, Integer availableRooms, Double pricePerNight, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.hotelName = hotelName;
        this.location = location;
        this.availableRooms = availableRooms;
        this.pricePerNight = pricePerNight;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return this.hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getAvailableRooms() {
        return this.availableRooms;
    }

    public void setAvailableRooms(Integer availableRooms) {
        this.availableRooms = availableRooms;
    }

    public Double getPricePerNight() {
        return this.pricePerNight;
    }

    public void setPricePerNight(Double pricePerNight) {
        this.pricePerNight = pricePerNight;
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
        if (!(o instanceof Hotels)) {
            return false;
        }
        Hotels hotels = (Hotels) o;
        return Objects.equals(id, hotels.id) && Objects.equals(hotelName, hotels.hotelName) && Objects.equals(location, hotels.location) && Objects.equals(availableRooms, hotels.availableRooms) && Objects.equals(pricePerNight, hotels.pricePerNight) && Objects.equals(createdAt, hotels.createdAt) && Objects.equals(updatedAt, hotels.updatedAt);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", hotelName='" + getHotelName() + "'" +
            ", location='" + getLocation() + "'" +
            ", availableRooms='" + getAvailableRooms() + "'" +
            ", pricePerNight='" + getPricePerNight() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            "}";
    }
    
}
