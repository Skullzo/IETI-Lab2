package org.ada.school.repository;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Optional;
import java.util.Date;
import org.ada.school.dto.UserDto;
@Document

public class UserDocument {
    @Id
    String id;
  
    String name;
  
    @Indexed(unique = true)
    String email;
  
    String lastName;

    String createdAt;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getCreatedAt() { return createdAt; }

    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

    public UserDocument() {
    }
  
    public UserDocument(UserDto userDto) {
        id= userDto.getId();
        name= userDto.getName();
        email= userDto.getEmail();
        lastName=userDto.getLastName();
        createdAt=userDto.getCreatedAt();
    }
    public void update(UserDto userDto) {
        id= userDto.getId();
        name= userDto.getName();
        email= userDto.getEmail();
        lastName=userDto.getLastName();
        createdAt=userDto.getCreatedAt();
    }
}