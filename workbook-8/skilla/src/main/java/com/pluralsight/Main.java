package com.pluralsight;
import com.pluralsight.application.ApplicationConfiguration;
import com.pluralsight.application.SakillaMoviesApplication;


public class Main {
    public static void main(String[] args)
    {
        ApplicationConfiguration config = new ApplicationConfiguration();

        SakillaMoviesApplication app = new SakillaMoviesApplication(config);
        app.run();
    }


}