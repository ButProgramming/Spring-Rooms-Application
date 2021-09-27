package com.mycompany.app.geo;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

@Service
@Getter
@Setter
public class GeoIPService {
    private String ip;
    private String country = "noname";
    private DatabaseReader dbReader;

    public GeoIPService() throws IOException {
        File database = new File("src/main/resources/db/GeoLite2-City.mmdb");
        dbReader = new DatabaseReader.Builder(database).build();
    }

    public String getLocation(String ip)
            throws IOException, GeoIp2Exception {

        InetAddress ipAddress = InetAddress.getByName(ip);
        CityResponse response = dbReader.city(ipAddress);
        String countryName = response.getCountry().getName();

        return countryName;
    }
}
