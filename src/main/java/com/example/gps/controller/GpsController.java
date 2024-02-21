package com.example.gps.controller;

import com.example.gps.dto.LocationDTO;
import com.example.gps.model.Location;
import com.example.gps.service.GpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GpsController {

    private final GpsService gpsService;

    @Autowired
    public GpsController(GpsService gpsService) {
        this.gpsService = gpsService;
    }

    @GetMapping("/location/{ip}")
    public LocationDTO getLocation(@PathVariable String ip) {
        // Получаем местоположение через сервис и конвертируем его в DTO
        Location location = gpsService.getLocationByIp(ip);
        LocationDTO locationDTO = new LocationDTO();
        locationDTO.setCountry(location.getCountry());
        locationDTO.setCity(location.getCity());
        locationDTO.setLatitude(location.getLatitude());
        locationDTO.setLongitude(location.getLongitude());
        return locationDTO;
    }
}
