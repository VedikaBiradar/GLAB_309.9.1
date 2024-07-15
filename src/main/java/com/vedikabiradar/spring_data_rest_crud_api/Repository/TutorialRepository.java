package com.vedikabiradar.spring_data_rest_crud_api.Repository;

import com.vedikabiradar.spring_data_rest_crud_api.Entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path = "learningtutorials")
public interface TutorialRepository extends JpaRepository<Tutorial, Long>
{
    // findByPublished is a custom method()
    List<Tutorial> findByPublished(boolean published);
}




