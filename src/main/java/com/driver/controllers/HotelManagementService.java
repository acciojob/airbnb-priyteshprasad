package com.driver.controllers;

import com.driver.model.Booking;
import com.driver.model.Facility;
import com.driver.model.Hotel;
import com.driver.model.User;

import java.util.List;

public class HotelManagementService {
    HotelManagementRepository repository = new HotelManagementRepository();

    public String addHotel(Hotel hotel){
        return repository.addHotel(hotel);
    }
    public Integer addUser(User user){
        return repository.addUser(user);
    }
    public String getHotelWithMostFacilities(){
        return repository.getHotelWithMostFacilities();
    }
    public int bookARoom(Booking booking){
        return repository.bookARoom(booking);
    }

    public int getBooking(Integer aadharCard){
        return repository.getBookings(aadharCard);
    }
    public Hotel updateFacilities(List<Facility> newFacilities, String hotelName){
        return repository.updateFacilities(newFacilities, hotelName);
    }
}
