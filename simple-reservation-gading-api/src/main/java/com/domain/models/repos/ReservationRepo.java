package com.domain.models.repos;

import java.util.List;


import com.domain.models.entities.Reservation;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepo extends CrudRepository<Reservation, Long> {
    
    @Query(value ="SELECT * FROM reservation WHERE is_deleted IS NULL", nativeQuery = true)
    public List<Reservation> getAllData();

    @Modifying
    @Query(value="UPDATE reservation SET is_deleted = 1 WHERE id_reservation = :id", nativeQuery = true)
    public void softDelete(Long id);

}
