package com.covid19.recovereds.infodb;


import com.covid19.recovereds.entity.Recovered;
import com.covid19.recovereds.repository.RecoveredRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PreloadDatabase {
    private static final Logger log = LoggerFactory.getLogger(PreloadDatabase.class);

    @Autowired
    private RecoveredRepository recoveredRepository;

    @Bean
    CommandLineRunner initDatabase() {
        return args -> {
            recoveredRepository.deleteAll();
            log.info("Precargando data: " + recoveredRepository.save(Recovered.builder().id(1).age(40).name(" Fulanito").build()));
            log.info("Precargando data: " + recoveredRepository.save(Recovered.builder().id(2).age(30).name("peranito").build()));
            log.info("Precargando data: " + recoveredRepository.save(Recovered.builder().id(3).age(20).name("Sutanito").build()));
            log.info("Precargando data: " + recoveredRepository.save(Recovered.builder().id(4).age(28).name("Chamaquito").build()));
            log.info("Precargando data: " + recoveredRepository.save(Recovered.builder().id(5).age(36).name("Eusebio").build()));
            log.info("Precargando data: " + recoveredRepository.save(Recovered.builder().id(6).age(39).name("Camandulo").build()));
            log.info("Precargando data: " + recoveredRepository.save(Recovered.builder().id(7).age(32).name("Chamiquito").build()));
        };
    }
}
