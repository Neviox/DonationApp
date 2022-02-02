package com.donationapp.prototype.service;

import com.donationapp.prototype.dto.SignUpRequest;
import com.donationapp.prototype.model.User;

import java.util.List;

public interface IUserService {
    User save(SignUpRequest signUpRequest);
    List<User> getAll();
    User getUser(int id);
    void deleteUser(int id);
}
