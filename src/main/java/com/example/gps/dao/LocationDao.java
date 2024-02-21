package com.example.gps.dao;

import com.example.gps.model.Location;

public interface LocationDao {
    Location getLocationByIp(String ip);
}
