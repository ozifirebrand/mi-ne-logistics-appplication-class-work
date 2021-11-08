package africa.semicolon.services;

import africa.semicolon.dtos.Requests.RegisterSenderRequest;
import africa.semicolon.dtos.RegisterSenderResponse;

public interface SenderService {
    RegisterSenderResponse registerSender(RegisterSenderRequest registerSenderRequest);
}
