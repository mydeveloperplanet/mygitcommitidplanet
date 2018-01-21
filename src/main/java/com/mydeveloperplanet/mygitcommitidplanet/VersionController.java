package com.mydeveloperplanet.mygitcommitidplanet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * A controller for handling retrieval of version information
 */
@RestController
public class VersionController {

    @RequestMapping(value = "/version", method= GET)
    public String versionInformation() {
        return "Version 1.0-SNAPSHOT";
    }

}
