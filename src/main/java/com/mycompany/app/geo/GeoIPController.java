package com.mycompany.app.geo;

import com.maxmind.geoip2.exception.GeoIp2Exception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class GeoIPController {

    @Autowired
    private GeoIPService service;

    @RequestMapping(method = RequestMethod.POST, value = "/send_ip", consumes = "application/json")
    public String getIp(@RequestBody String ip) throws IOException, GeoIp2Exception {

        service.setIp(ip);
        service.setCountry(service.getLocation(service.getIp()));

        return "redirect:/";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get_country")
    public String getCountry() {
        return service.getCountry();
    }

}
