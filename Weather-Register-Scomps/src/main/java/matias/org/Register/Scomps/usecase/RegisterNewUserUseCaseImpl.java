package matias.org.Register.Scomps.usecase;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import matias.org.Register.Scomps.gateway.RegisterNewUserGateway;
import matias.org.Register.Scomps.request.CreateUserRequest;
import matias.org.Register.Scomps.response.UserResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RegisterNewUserUseCaseImpl implements RegisterNewUserUseCase{

    private final RegisterNewUserGateway registerNewUserGateway;

    @Override
    public UserResponse execute(CreateUserRequest createUserRequest) {
        return registerNewUserGateway.register(createUserRequest);
    }
}
