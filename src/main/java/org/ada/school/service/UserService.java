package org.ada.school.service;
import org.ada.school.repository.UserDocument;
import java.util.Optional;
import java.util.List;
import org.ada.school.dto.UserDto;

public interface UserService
{
    UserDocument create( UserDocument user );

    Optional<UserDocument> findById(String id );

    List<UserDocument> all();

    boolean deleteById( String id );

    UserDocument update( UserDto userDto, String id );
}
