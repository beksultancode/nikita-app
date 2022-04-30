package peaksoft.nikitaapp;

import org.springframework.stereotype.Service;
import peaksoft.nikitaapp.dto.NikitaRequest;
import peaksoft.nikitaapp.nikita.models.MessageRequest;
import peaksoft.nikitaapp.nikita.models.MessageResponse;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * @author Beksultan
 */
@Service
public class NikitaService {

    private final NikitaMessageSender messageSender;
    private final NikitaConfig nikitaConfig;

    public NikitaService(NikitaMessageSender messageSender,
                         NikitaConfig nikitaConfig) {
        this.messageSender = messageSender;
        this.nikitaConfig = nikitaConfig;
    }


    public Map<String, String> sendMessage(NikitaRequest nikitaRequest) {
        MessageRequest messageRequest = new MessageRequest(
                nikitaConfig.getLogin(),
                nikitaConfig.getPassword(),
                LocalDateTime.now().getNano() + "",
                nikitaConfig.getSender(),
                nikitaRequest.getPhoneNumber(),
                nikitaRequest.getPhoneNumber()
        );

        MessageResponse messageResponse = messageSender.sendMessage(messageRequest);

        // TODO: 30/4/22 check status

        return Map.of(
                "status", messageResponse.getStatus() + ""
        );
    }
}
