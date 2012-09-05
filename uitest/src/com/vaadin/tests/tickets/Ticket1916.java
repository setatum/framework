package com.vaadin.tests.tickets;

import com.vaadin.Application;
import com.vaadin.server.UserError;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI.LegacyWindow;
import com.vaadin.ui.TextField;

public class Ticket1916 extends Application {

    @Override
    public void init() {

        HorizontalLayout test = new HorizontalLayout();
        test.setSizeFull();

        TextField tf = new TextField();
        tf.setComponentError(new UserError("Error message"));

        test.addComponent(tf);
        test.setComponentAlignment(tf, Alignment.MIDDLE_CENTER);

        LegacyWindow w = new LegacyWindow("Test #1916", test);
        setMainWindow(w);
    }

}
