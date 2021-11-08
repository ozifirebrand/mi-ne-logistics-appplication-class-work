package africa.semicolon.services;

import africa.semicolon.dtos.RegisterSenderResponse;
import africa.semicolon.dtos.Requests.RegisterSenderRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderServiceImplTest {
    private SenderService senderService;


    @BeforeEach
    void setUp() {
        senderService = new SenderServiceImpl();
    }
    @Test
    void registerSender(){
        RegisterSenderRequest registerSenderRequest = new RegisterSenderRequest();
        registerSenderRequest.setSenderName("Jery");
        registerSenderRequest.setSenderEmail("jerry@email.com");
        registerSenderRequest.setPhoneNumber("98745987");
        RegisterSenderResponse response = senderService.registerSender(registerSenderRequest);
    }
}

