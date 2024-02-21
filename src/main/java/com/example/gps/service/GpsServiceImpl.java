package com.example.gps.service;

import com.example.gps.data.GpsData;
import com.example.gps.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GpsServiceImpl implements GpsService {

    private final GpsData gpsData;

    @Autowired
    public GpsServiceImpl(GpsData gpsData) {
        this.gpsData = gpsData;
    }

    @Override
    public Location getLocationByIp(String ip) {
        return gpsData.getLocationByIp(ip);
    }
}
