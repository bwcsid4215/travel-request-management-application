package com.bwc.travel_request_management.dto;

import com.bwc.travel_request_management.entity.TravelBooking;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TravelBookingDTO {

    private UUID bookingId;

    @NotNull(message = "Booking type is required")
    private TravelBooking.BookingType bookingType;

    @NotBlank(message = "Booking details are required")
    private String details;

    private String notes;
    private LocalDateTime createdAt;
}