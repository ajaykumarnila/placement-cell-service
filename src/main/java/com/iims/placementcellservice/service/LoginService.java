package com.iims.placementcellservice.service;

import com.iims.placementcellservice.entity.LoginDetails;
import com.iims.placementcellservice.model.LoginDto;
import org.springframework.http.ResponseEntity;

public interface LoginService {

    ResponseEntity<String> login(LoginDto loginDto);
}
