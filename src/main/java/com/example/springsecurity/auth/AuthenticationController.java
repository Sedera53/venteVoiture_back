package com.example.springsecurity.auth;

import com.example.springsecurity.dto.UserDTO;
import com.example.springsecurity.repository.UserRepository;
import com.example.springsecurity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin
public class AuthenticationController {

    private final AuthenticationService service;
    private final UserRepository repository;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.register(request));
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(service.authenticate(request));
    }
    @PostMapping("/authenticateDTO")
    public ResponseEntity<UserDTO> authenticatedto(@RequestBody AuthenticationRequest request) {
        AuthenticationResponse authenticationResponse = service.authenticate(request);
        User user = repository.findByEmail(request.getEmail())
                .orElseThrow();

        UserDTO result = new UserDTO(authenticationResponse.getToken(), user);
        return ResponseEntity.ok(result);
    }

}
