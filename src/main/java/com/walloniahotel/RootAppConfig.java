package com.walloniahotel;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(excludeFilters = {@ComponentScan.Filter(org.springframework.stereotype.Controller.class)})
public class RootAppConfig {

    //@Bean configuration methods here
}
