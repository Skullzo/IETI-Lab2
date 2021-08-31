package org.ada.school.service;
import java.util.List;
import org.ada.school.dto.UserDto;
import org.ada.school.model.User;
import org.ada.school.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ada.school.repository.UserDocument;

@Service
public class UserServiceMongoDB {
    
    @Autowired
    UserRepository userRepository;
    public UserServiceMongoDB(){
        
    }
    /*   
    public UserServiceMongoDB(@Autowired UserRepository userRepository )
       {
           this.userRepository = userRepository;
       }
   
       @Override
       public User create( User user )
       {
           return userRepository.save( user );
       }
       
       @Override
       public UserDocument findById( String name )
       {
           
           return userRepository.findByName( name );
           
           
       }
       
       @Override
       public List<User> all()
       {
           return null;
       }
   
       @Override
       public boolean deleteById( String id )
       {
           if ( userRepository.existsById( id ) )
        {
            userRepository.deleteById( id );
            return true;
        }
        return false;
       }
       
       @Override
       public User update( UserDto userDto, String id )
       {
           
           if ( userRepository.existsById( id ) )
        {
            User user = userRepository.findById( id ).get();
            user.update( userDto );
            userRepository.save( user );
            return user;
        }
        
        return null;
       }
    */
    public String saveDocument(UserDocument user) {
       userRepository.save( user );
       return "Usuario agregado";
    }
}