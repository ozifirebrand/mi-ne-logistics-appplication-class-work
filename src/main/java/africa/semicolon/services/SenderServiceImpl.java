package africa.semicolon.services;

import africa.semicolon.data.models.Sender;
import africa.semicolon.data.repositories.SenderRepository;
import africa.semicolon.data.repositories.SenderRepositoryImpl;
import africa.semicolon.dtos.RegisterSenderResponse;
import africa.semicolon.dtos.Requests.RegisterSenderRequest;
import africa.semicolon.utils.ModelMapper;

public class SenderServiceImpl implements SenderService{
    private static final SenderRepository senderRepository = new SenderRepositoryImpl();
    @Override
    public RegisterSenderResponse registerSender(RegisterSenderRequest registerSenderRequest) {
        Sender sender = ModelMapper.map(registerSenderRequest);
        Sender savedSender = senderRepository.save(sender);

        return ModelMapper.map(savedSender);
    }
}
