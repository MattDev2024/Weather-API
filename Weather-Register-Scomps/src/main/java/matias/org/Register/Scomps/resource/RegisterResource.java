package matias.org.Register.Scomps.resource;

import lombok.RequiredArgsConstructor;
import matias.org.Register.Scomps.request.CreateUserRequest;
import matias.org.Register.Scomps.response.UserResponse;
import matias.org.Register.Scomps.usecase.RegisterNewUserUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
@RequiredArgsConstructor

public class RegisterResource {

    private final RegisterNewUserUseCase registerNewUserUseCase;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse createNewUser(@RequestBody CreateUserRequest createUserRequest){
        return registerNewUserUseCase.execute(createUserRequest);
    }

}
