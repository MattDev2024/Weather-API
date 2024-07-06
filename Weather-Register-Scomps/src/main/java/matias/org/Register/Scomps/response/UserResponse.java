package matias.org.Register.Scomps.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UserResponse {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private boolean premium;
    private LocalDate createdDate;
    private boolean active;
}
