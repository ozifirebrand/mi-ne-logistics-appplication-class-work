package africa.semicolon.services;

import africa.semicolon.data.models.Sender;
import africa.semicolon.dtos.Requests.RegisterSenderRequest;
import africa.semicolon.dtos.RegisterSenderResponse;

import java.util.List;

public interface SenderService {
    RegisterSenderResponse registerSender(RegisterSenderRequest registerSenderRequest);
    List<Sender> getSenders();
    void deleteAllSenders();
    Sender findSenderByEmail(String email);
}
