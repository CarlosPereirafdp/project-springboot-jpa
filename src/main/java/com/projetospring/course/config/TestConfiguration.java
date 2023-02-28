package com.projetospring.course.config;

import com.projetospring.course.entities.User;
import com.projetospring.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfiguration implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User carlos = new User(null, "Carlos Pereira", "carlospereira@hotmail.com", "916322142", "carlospassword");
        User carina = new User(null, "Carina Teixeira", "carinateixeira@hotmail.com", "912345678", "carinapassword");

        userRepository.saveAll(Arrays.asList(carina, carlos));
    }
}
