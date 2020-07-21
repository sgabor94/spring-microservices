package com.gsomogyi.limitservice;

import com.gsomogyi.limitservice.model.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    private final AppConfig appConfig;

    @Autowired
    LimitsConfigurationController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @GetMapping("/limits")
    public LimitsConfiguration getLimitsFromConfig() {
        return new LimitsConfiguration(appConfig.getMaximum(), appConfig.getMinimum());
    }
}
