package matias.org.Register.Scomps.usecase;

import matias.org.Register.Scomps.request.CreateUserRequest;
import matias.org.Register.Scomps.response.UserResponse;

public interface RegisterNewUserUseCase {

    UserResponse execute(CreateUserRequest createUserRequest);
}
