package edu.escuelaing.ieti.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface UserRepository extends MongoRepository<UserDocument, String>
  {}