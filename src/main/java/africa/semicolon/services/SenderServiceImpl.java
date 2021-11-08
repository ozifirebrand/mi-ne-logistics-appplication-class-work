package africa.semicolon.services;

import africa.semicolon.data.models.Sender;
import africa.semicolon.data.repositories.SenderRepository;
import africa.semicolon.data.repositories.SenderRepositoryImpl;
import africa.semicolon.dtos.RegisterSenderResponse;
import africa.semicolon.dtos.Requests.RegisterSenderRequest;

public class SenderServiceImpl implements SenderService{
    private static final SenderRepository senderRepository = new SenderRepositoryImpl();
    @Override
    public RegisterSenderResponse registerSender(RegisterSenderRequest registerSenderRequest) {
        Sender sender = new Sender();
        sender.setSenderName(registerSenderRequest.getSenderName());
        sender.setPhoneNumber(registerSenderRequest.getPhoneNumber());
        sender.setEmailAddress(registerSenderRequest.getSenderEmail());

        Sender savedSender = senderRepository.save(sender);

        RegisterSenderResponse response = new RegisterSenderResponse();
        response.setSenderEmail(savedSender.getEmailAddress());
        return response;
    }
}
