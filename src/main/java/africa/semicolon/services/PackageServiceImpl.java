package africa.semicolon.services;

import africa.semicolon.data.models.Package;
import africa.semicolon.data.repositories.PackageRepository;
import africa.semicolon.data.repositories.PackageRepositoryImpl;
import africa.semicolon.dtos.Requests.AddPackageRequest;
import africa.semicolon.dtos.Responses.AddPackageResponse;
import africa.semicolon.utils.ModelMapper.*;

import static africa.semicolon.utils.ModelMapper.*;

public class PackageServiceImpl implements PackageService{
    private final PackageRepository packageRepository = new PackageRepositoryImpl();

    @Override
    public AddPackageResponse addPackage(AddPackageRequest addPackageRequest) {
        Package aPackage = map(addPackageRequest);
        Package savedPackage = packageRepository.save(aPackage);
        return map(savedPackage);
    }

    @Override
    public Package findPackageById(Integer trackingId) {
        return packageRepository.findPackageByTrackingNumber(trackingId);
    }
}
