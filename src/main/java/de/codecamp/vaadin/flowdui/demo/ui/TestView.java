package de.codecamp.vaadin.flowdui.demo.ui;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;


@Route(value = "test")
public class TestView
  extends Composite<VerticalLayout>
  implements
    BeforeEnterObserver
{

  @Override
  protected VerticalLayout initContent()
  {
    VerticalLayout content = super.initContent();

    content.add("TestView");

    return content;
  }

  @Override
  public void beforeEnter(BeforeEnterEvent event)
  {
    event.forwardTo(MainView.class);
  }

}
