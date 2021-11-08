package africa.semicolon.controllers;

import africa.semicolon.data.models.Sender;
import africa.semicolon.dtos.RegisterSenderResponse;
import africa.semicolon.dtos.Requests.RegisterSenderRequest;
import africa.semicolon.services.SenderService;
import africa.semicolon.services.SenderServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {
    private final SenderService senderService = new SenderServiceImpl();
    @PostMapping("api/v1/sender")
    public RegisterSenderResponse registerSender(RegisterSenderRequest registerSenderRequest){
        return senderService.registerSender(registerSenderRequest);
    }

    @GetMapping("api/v1/sender/{email}")
    public Sender getSender(@PathVariable String email){
        return senderService.findSenderByEmail(email);
    }
}
