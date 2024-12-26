package com.transport.travelbookingsystem.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "booked_transport")
public class BookedTransport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "travel_plan_id", nullable = false)
    private Long travelPlanId;

    @Column(name = "transport_schedule_id", nullable = false)
    private Long transportScheduleId;

    @Column(name = "booking_reference", length = 100)
    private String bookingReference;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, columnDefinition = "ENUM('Pending', 'Confirmed', 'Failed') DEFAULT 'Pending'")
    private Status status = Status.Pending;

    @Column(name = "booked_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime bookedAt = LocalDateTime.now();

    public enum Status {
        Pending,
        Confirmed,
        Failed
    }

    public BookedTransport() {
    }

    public BookedTransport(Long id, String username, Long travelPlanId, Long transportScheduleId, String bookingReference, Status status, LocalDateTime bookedAt) {
        this.id = id;
        this.username = username;
        this.travelPlanId = travelPlanId;
        this.transportScheduleId = transportScheduleId;
        this.bookingReference = bookingReference;
        this.status = status;
        this.bookedAt = bookedAt;
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

    public Long getTravelPlanId() {
        return this.travelPlanId;
    }

    public void setTravelPlanId(Long travelPlanId) {
        this.travelPlanId = travelPlanId;
    }

    public Long getTransportScheduleId() {
        return this.transportScheduleId;
    }

    public void setTransportScheduleId(Long transportScheduleId) {
        this.transportScheduleId = transportScheduleId;
    }

    public String getBookingReference() {
        return this.bookingReference;
    }

    public void setBookingReference(String bookingReference) {
        this.bookingReference = bookingReference;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getBookedAt() {
        return this.bookedAt;
    }

    public void setBookedAt(LocalDateTime bookedAt) {
        this.bookedAt = bookedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BookedTransport)) {
            return false;
        }
        BookedTransport bookedTransport = (BookedTransport) o;
        return Objects.equals(id, bookedTransport.id) && Objects.equals(username, bookedTransport.username) && Objects.equals(travelPlanId, bookedTransport.travelPlanId) && Objects.equals(transportScheduleId, bookedTransport.transportScheduleId) && Objects.equals(bookingReference, bookedTransport.bookingReference) && Objects.equals(status, bookedTransport.status) && Objects.equals(bookedAt, bookedTransport.bookedAt);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", travelPlanId='" + getTravelPlanId() + "'" +
            ", transportScheduleId='" + getTransportScheduleId() + "'" +
            ", bookingReference='" + getBookingReference() + "'" +
            ", status='" + getStatus() + "'" +
            ", bookedAt='" + getBookedAt() + "'" +
            "}";
    }

}