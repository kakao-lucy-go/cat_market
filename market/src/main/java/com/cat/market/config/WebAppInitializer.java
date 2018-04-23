package com.cat.market.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {


	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
      ctx.register(MarketConfiguration.class);
      ctx.setServletContext(arg0);

      ServletRegistration.Dynamic servlet = arg0.addServlet("dispatcherExample", new DispatcherServlet(ctx));
      servlet.setLoadOnStartup(1);
      servlet.addMapping("/");
      
	}
}
