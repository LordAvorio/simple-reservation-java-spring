package com.domain.controllers;

import java.util.List;

import javax.validation.Valid;

import com.domain.dto.ResponseData;
import com.domain.models.entities.Reservation;
import com.domain.services.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
    
    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public ResponseEntity<ResponseData<Reservation>> create(@Valid @RequestBody Reservation reservation, Errors errors) {
        ResponseData<Reservation> responseData = new ResponseData<>();

        if (errors.hasErrors()) {
            for (ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(reservationService.save(reservation));
        return ResponseEntity.ok(responseData);

    }

    @PutMapping
    public ResponseEntity<ResponseData<Reservation>> update(@Valid @RequestBody Reservation reservation, Errors errors) {
        ResponseData<Reservation> responseData = new ResponseData<>();

        if (errors.hasErrors()) {
            for (ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(reservationService.save(reservation));
        return ResponseEntity.ok(responseData);

    }

    @GetMapping
    public List<Reservation>getAllData(){
        return reservationService.getAllData();
    }

    @DeleteMapping("/{id}")
    public void softDelete(@PathVariable("id") Long id){
        reservationService.sofDelete(id);
    }

    @GetMapping("/{id}")
    public Reservation getDataById(@PathVariable("id") Long id){
        return reservationService.findDataById(id);
    }



}
