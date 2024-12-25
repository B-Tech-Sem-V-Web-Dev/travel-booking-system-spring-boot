package com.transport.travelbookingsystem.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.transport.travelbookingsystem.models.TravelPlans.MediumOfTravel;
import java.util.Objects;

@Entity
@Table(name = "transport_schedules")
public class TransportSchedules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "medium", nullable = false)
    @Enumerated(EnumType.STRING)
    private MediumOfTravel medium;

    @Column(name = "source", nullable = false, length = 100)
    private String source;

    @Column(name = "destination", nullable = false, length = 100)
    private String destination;

    @Column(name = "departure_time", nullable = false)
    private LocalDateTime departureTime;

    @Column(name = "arrival_time", nullable = false)
    private LocalDateTime arrivalTime;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "booking_link", nullable = false, length = 255)
    private String bookingLink;

    @Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt = LocalDateTime.now();

    public TransportSchedules() {
    }

    public TransportSchedules(Long id, MediumOfTravel medium, String source, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime, BigDecimal price, String bookingLink, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.medium = medium;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        this.bookingLink = bookingLink;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MediumOfTravel getMedium() {
        return this.medium;
    }

    public void setMedium(MediumOfTravel medium) {
        this.medium = medium;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDepartureTime() {
        return this.departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBookingLink() {
        return this.bookingLink;
    }

    public void setBookingLink(String bookingLink) {
        this.bookingLink = bookingLink;
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
        if (!(o instanceof TransportSchedules)) {
            return false;
        }
        TransportSchedules transportSchedules = (TransportSchedules) o;
        return Objects.equals(id, transportSchedules.id) && Objects.equals(medium, transportSchedules.medium) && Objects.equals(source, transportSchedules.source) && Objects.equals(destination, transportSchedules.destination) && Objects.equals(departureTime, transportSchedules.departureTime) && Objects.equals(arrivalTime, transportSchedules.arrivalTime) && Objects.equals(price, transportSchedules.price) && Objects.equals(bookingLink, transportSchedules.bookingLink) && Objects.equals(createdAt, transportSchedules.createdAt) && Objects.equals(updatedAt, transportSchedules.updatedAt);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", medium='" + getMedium() + "'" +
            ", source='" + getSource() + "'" +
            ", destination='" + getDestination() + "'" +
            ", departureTime='" + getDepartureTime() + "'" +
            ", arrivalTime='" + getArrivalTime() + "'" +
            ", price='" + getPrice() + "'" +
            ", bookingLink='" + getBookingLink() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            "}";
    }
    

}
