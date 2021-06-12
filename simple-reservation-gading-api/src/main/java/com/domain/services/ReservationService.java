package com.domain.services;

import java.util.List;

import javax.transaction.Transactional;

import com.domain.models.entities.Reservation;
import com.domain.models.repos.ReservationRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ReservationService {
    
    @Autowired
    private ReservationRepo reservationRepo;

    public List<Reservation> getAllData(){
        return reservationRepo.getAllData();
    }

    public void sofDelete(Long id){
        reservationRepo.softDelete(id);
    }

    public Reservation findDataById(Long id){
        return reservationRepo.findById(id).get();
    }

    public Reservation save(Reservation reservation){
        return reservationRepo.save(reservation);
    }

}
