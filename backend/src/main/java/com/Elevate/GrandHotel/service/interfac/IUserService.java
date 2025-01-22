package com.Elevate.GrandHotel.service.interfac;

import com.Elevate.GrandHotel.dto.LoginRequest;
import com.Elevate.GrandHotel.dto.Response;
import com.Elevate.GrandHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
