package africa.semicolon.services;

import africa.semicolon.data.models.Package;
import africa.semicolon.data.repositories.PackageRepository;
import africa.semicolon.data.repositories.PackageRepositoryImpl;
import africa.semicolon.dtos.Requests.AddPackageRequest;
import africa.semicolon.dtos.Responses.AddPackageResponse;
import africa.semicolon.utils.ModelMapper;

public class PackageServiceImpl implements PackageService{
    private final PackageRepository packageRepository = new PackageRepositoryImpl();

    @Override
    public AddPackageResponse addPackage(AddPackageRequest addPackageRequest) {
        // convert addPackage Request to a package
        Package aPackage = ModelMapper.map(addPackageRequest);

        // save package
        Package savedPackage = packageRepository.save(aPackage);


        // convert saved package to addPackage response

        // return converted response

        return ModelMapper.map(savedPackage);
    }

    @Override
    public Package findPackageById(Integer trackingId) {
        return packageRepository.findPackageByTrackingNumber(trackingId);
    }
}
