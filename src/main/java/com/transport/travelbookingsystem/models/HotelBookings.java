package com.transport.travelbookingsystem.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "hotel_bookings")
public class HotelBookings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hotel_id", nullable = false)
    private Long hotelId;

    @Column(name = "travel_plan_id", nullable = false)
    private Long travelPlanId;

    @Column(name = "check_in_date", nullable = false)
    private LocalDate checkInDate;

    @Column(name = "check_out_date", nullable = false)
    private LocalDate checkOutDate;

    @Column(name = "rooms_booked", nullable = false)
    private int roomsBooked;

    @Column(name = "total_price", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalPrice;

    @Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt = LocalDateTime.now();

    public HotelBookings() {
    }

    public HotelBookings(Long id, Long hotelId, Long travelPlanId, LocalDate checkInDate, LocalDate checkOutDate, int roomsBooked, BigDecimal totalPrice, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.hotelId = hotelId;
        this.travelPlanId = travelPlanId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomsBooked = roomsBooked;
        this.totalPrice = totalPrice;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHotelId() {
        return this.hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Long getTravelPlanId() {
        return this.travelPlanId;
    }

    public void setTravelPlanId(Long travelPlanId) {
        this.travelPlanId = travelPlanId;
    }

    public LocalDate getCheckInDate() {
        return this.checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return this.checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getRoomsBooked() {
        return this.roomsBooked;
    }

    public void setRoomsBooked(int roomsBooked) {
        this.roomsBooked = roomsBooked;
    }

    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
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
        if (!(o instanceof HotelBookings)) {
            return false;
        }
        HotelBookings hotelBookings = (HotelBookings) o;
        return Objects.equals(id, hotelBookings.id) && Objects.equals(hotelId, hotelBookings.hotelId) && Objects.equals(travelPlanId, hotelBookings.travelPlanId) && Objects.equals(checkInDate, hotelBookings.checkInDate) && Objects.equals(checkOutDate, hotelBookings.checkOutDate) && roomsBooked == hotelBookings.roomsBooked && Objects.equals(totalPrice, hotelBookings.totalPrice) && Objects.equals(createdAt, hotelBookings.createdAt) && Objects.equals(updatedAt, hotelBookings.updatedAt);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", hotelId='" + getHotelId() + "'" +
            ", travelPlanId='" + getTravelPlanId() + "'" +
            ", checkInDate='" + getCheckInDate() + "'" +
            ", checkOutDate='" + getCheckOutDate() + "'" +
            ", roomsBooked='" + getRoomsBooked() + "'" +
            ", totalPrice='" + getTotalPrice() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            "}";
    }

}

