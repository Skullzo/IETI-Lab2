package edu.escuelaing.ieti.document;
import edu.escuelaing.ieti.dto.UserDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
@Document
public class User {
    
    @Id
    private String id;
    
    private String name;
    
    private String email;
    
    private String lastName;
    
    private Date createdAt;

    public User() {
        
    }
    public User(UserDto userDto) {
        name = userDto.getName();
        email = userDto.getEmail();
        lastName = userDto.getLastName();
        createdAt = userDto.getCreatedAt();
    }
    public void update(UserDto userDto) {
        name = userDto.getName();
        email = userDto.getEmail();
        lastName = userDto.getLastName();
        createdAt = userDto.getCreatedAt();
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getLastName() {
        return lastName;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
}