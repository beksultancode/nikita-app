package peaksoft.nikitaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import peaksoft.nikitaapp.nikita.models.MessageRequest;
import peaksoft.nikitaapp.nikita.models.MessageResponse;

@SpringBootApplication
public class NikitaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(NikitaAppApplication.class, args);

//        MessageRequest messageRequest = new MessageRequest(
//                "azemkg",
//                "LntrWKXQ",
//                "1",
//                "Taigan KG",
//                "your code is ?",
//                "996772202031"
//        );
//
//        NikitaMessageSender nikitaService = new NikitaMessageSender();
//
//        MessageResponse messageResponse = nikitaService.sendMessage(messageRequest);
//
//        System.out.println("messageResponse = " + messageResponse);

//        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><response xmlns=\"http://Giper.mobi/schema/Message\">".length());
    }

}
