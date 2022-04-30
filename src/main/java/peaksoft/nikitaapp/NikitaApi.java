package peaksoft.nikitaapp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.nikitaapp.dto.NikitaRequest;

import java.util.Map;

/**
 * @author Beksultan
 */

@RestController
@RequestMapping("api/nikita")
public class NikitaApi {

    private final NikitaService nikitaService;

    public NikitaApi(NikitaService nikitaService) {
        this.nikitaService = nikitaService;
    }

    @PostMapping("/send/message")
    public Map<String, String> sendMessage(@RequestBody NikitaRequest nikitaRequest) {
        return nikitaService.sendMessage(nikitaRequest);
    }

}
