package com.pluralsight.application;

import com.pluralsight.controllers.ActorsController;
import com.pluralsight.services.ActorsDao;
import com.pluralsight.services.mysql.MySqlActorsDao;
import com.pluralsight.views.ActorAddView;
import com.pluralsight.views.ActorListView;

import com.pluralsight.views.ActorSearchByIdView;
import com.pluralsight.views.HomeView;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationConfiguration
{
    //DataSources
    private final DataSource dataSource = buildDataSource();

    private static DataSource buildDataSource() {
        try (FileInputStream stream = new FileInputStream("src/main/resources/config.properties")) {
            // first get the variables from the properties file
            Properties properties = new Properties();
            properties.load(stream);

            String connectionString = properties.getProperty("db.connectionString");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            // build a BasicDataSource object
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setUrl(connectionString);
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            return dataSource;

        } catch (IOException e) {
        }

        return null;
    }

    //daos
    //MySqlDAO need a datasource
    ActorsDao actorsDao = new MySqlActorsDao(dataSource);
    // ActorsDao actorsDao = new CsvActorsDao();

    //Create a new controllers
    ActorsController actorsController = new ActorsController(actorsDao);

    //views
    HomeView homeView = new HomeView();
    ActorListView actorListView = new ActorListView();
    ActorAddView actorAddView = new ActorAddView();
    ActorSearchByIdView actorSearchByIdView = new  ActorSearchByIdView();
}




