// Интерфейс сервиса
package com.example.gps.service;

import com.example.gps.model.Location;

public interface GpsService {
    Location getLocationByIp(String ip);
}
