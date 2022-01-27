package de.codecamp.vaadin.flowdui.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.vaadin.flow.component.page.AppShellConfigurator;


@SpringBootApplication
public class Application
  extends SpringBootServletInitializer
  implements
    AppShellConfigurator
{

  public static void main(String[] args)
  {
    SpringApplication.run(Application.class, args);
  }

}
