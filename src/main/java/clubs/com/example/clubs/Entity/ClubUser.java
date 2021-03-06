package clubs.com.example.clubs.Entity;

import lombok.*;
import org.atmosphere.config.service.Get;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClubUser {

    @Id
    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String clubId;

    @Column(nullable = false)
    private String userId;
}
