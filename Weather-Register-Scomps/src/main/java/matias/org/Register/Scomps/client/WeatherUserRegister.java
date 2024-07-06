package matias.org.Register.Scomps.client;

import matias.org.Register.Scomps.request.CreateUserRequest;
import matias.org.Register.Scomps.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("Register-Scomps")
public interface WeatherUserRegister {

    @PostMapping("/weatheruserrg/v1/user/create")
    UserResponse createNewUser(@RequestBody CreateUserRequest createUserRequest);


}
