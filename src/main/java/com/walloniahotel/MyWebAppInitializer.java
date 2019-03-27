package com.walloniahotel;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootAppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{MainWebConfiguration.class, MainWebConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/main/*", "/api/*"};
    }
}
