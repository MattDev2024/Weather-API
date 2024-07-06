package matias.org.Register.Scomps.gateway;

import matias.org.Register.Scomps.request.CreateUserRequest;
import matias.org.Register.Scomps.response.UserResponse;

public interface RegisterNewUserGateway {

    UserResponse register(CreateUserRequest createUserRequest);
}
