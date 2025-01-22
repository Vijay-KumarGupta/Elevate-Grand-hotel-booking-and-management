package com.Elevate.GrandHotel.service.interfac;

import com.Elevate.GrandHotel.dto.Response;
import com.Elevate.GrandHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
