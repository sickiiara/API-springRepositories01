package co.develhope.APIspringRepositories01.repositories;

import co.develhope.APIspringRepositories01.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
