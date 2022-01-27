package de.codecamp.vaadin.flowdui.demo.ui;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route(value = "")
public class MainView
  extends Composite<VerticalLayout>
{

  @Override
  protected VerticalLayout initContent()
  {
    VerticalLayout content = super.initContent();

    content.add("MainView");

    return content;
  }

}
