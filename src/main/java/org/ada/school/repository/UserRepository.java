package org.ada.school.repository;
import org.ada.school.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends MongoRepository<UserDocument, String> {

    
    
    
    
}