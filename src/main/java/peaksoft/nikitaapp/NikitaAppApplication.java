package peaksoft.nikitaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import peaksoft.nikitaapp.nikita.models.MessageRequest;
import peaksoft.nikitaapp.nikita.models.MessageResponse;

@SpringBootApplication
public class NikitaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(NikitaAppApplication.class, args);
    }

}
