package matias.org.Register.Scomps.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CreateUserRequest {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;

    @Override
    public String toString(){
        return "CreateUserRequest{" +
                "username='" + userName + '\'' +
                ", password='" + "*******" + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
