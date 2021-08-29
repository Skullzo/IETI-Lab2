package edu.escuelaing.ieti.service;
import edu.escuelaing.ieti.document.User;
import edu.escuelaing.ieti.dto.UserDto;
import edu.escuelaing.ieti.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
public class UserServiceMongoDB implements UserService {
    private final UserRepository userRepository; 
    public UserServiceMongoDB(@Autowired UserRepository userRepository ) {
        this.userRepository = userRepository;
    }   
    @Override
    public User create(User user) {
        return userRepository.save(user);
    }
    @Override
    public User findById(String id) {
        return userRepository.findById(id).orElse(null);
    }
    @Override
    public List<User> all() {
        return null;
    } 
    @Override
    public boolean deleteById( String id ) {
        if ( userRepository.existsById( id ) )
        {
            userRepository.deleteById( id );
            return true;
        }
        return false;
    }    
    @Override
    public User update( UserDto userDto, String userId ) {
        if (userRepository.existsById(id))
        {
            User user = userRepository.findById(id).get();
            user.update(userDto);
            userRepository.save(user);
            return user;
        }
        return null;
    }    
}