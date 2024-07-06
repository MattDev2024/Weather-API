package matias.org.Register.Scomps.gateway.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import matias.org.Register.Scomps.client.WeatherUserRegister;
import matias.org.Register.Scomps.gateway.RegisterNewUserGateway;
import matias.org.Register.Scomps.request.CreateUserRequest;
import matias.org.Register.Scomps.response.UserResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RegisterNewUserGatewayImpl implements RegisterNewUserGateway {

    private final WeatherUserRegister weatherUserRegister;

    @Override
    public UserResponse register(CreateUserRequest createUserRequest) {
        log.info("Calling weatheruserrg service to create new User: {}", createUserRequest.toString());
        return weatherUserRegister.createNewUser(createUserRequest);
    }
}
