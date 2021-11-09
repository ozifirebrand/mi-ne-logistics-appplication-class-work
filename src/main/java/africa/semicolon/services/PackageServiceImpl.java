package africa.semicolon.services;

import africa.semicolon.data.models.Package;
import africa.semicolon.data.models.Sender;
import africa.semicolon.data.repositories.PackageRepository;
import africa.semicolon.data.repositories.PackageRepositoryImpl;
import africa.semicolon.dtos.Requests.AddPackageRequest;
import africa.semicolon.dtos.Responses.AddPackageResponse;
import africa.semicolon.utils.ModelMapper.*;

import java.util.Optional;

import static africa.semicolon.utils.ModelMapper.*;

public class PackageServiceImpl implements PackageService{
    private static final PackageRepository packageRepository = new PackageRepositoryImpl();
    private final SenderService senderService = new SenderServiceImpl();

    @Override
    public AddPackageResponse addPackage(AddPackageRequest addPackageRequest) {
        Optional<Sender> senderOptional = senderService.findSenderByEmail(addPackageRequest.getSenderEmail());

        Package aPackage = map(addPackageRequest);
        Package savedPackage = packageRepository.save(aPackage);
        return map(savedPackage);
    }

    @Override
    public Package findPackageById(Integer trackingId) {
        return packageRepository.findPackageByTrackingNumber(trackingId);
    }
}
