package za.ac.cput.repository;

/*
    LocationRepository.java
    Location Repository Class
    Author:Sharief Abdul
    Date:08/05/2025
*/

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Location;


public interface LocationRepository extends JpaRepository<Location, String> {
}
