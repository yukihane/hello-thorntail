package com.github.yukihane.hello.thorntail.cdi;

import java.util.Date;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class MyBean {

    private final Date date = new Date();

    public Date getDate() {
        return date;
    }

}
