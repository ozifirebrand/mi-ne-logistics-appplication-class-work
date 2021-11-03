package africa.semicolon.services;

import africa.semicolon.data.models.Package;
import africa.semicolon.data.repositories.PackageRepository;
import africa.semicolon.data.repositories.PackageRepositoryImpl;
import africa.semicolon.dtos.Requests.AddPackageRequest;
import africa.semicolon.dtos.Responses.AddPackageResponse;

public class PackageServiceImpl implements PackageService{
    private final PackageRepository packageRepository = new PackageRepositoryImpl();

    @Override
    public AddPackageResponse addPackage(AddPackageRequest addPackageRequest) {
        // convert addPackage Request to a package
        Package aPackage = new Package();
        aPackage.setName(addPackageRequest.getPackageDescription());
        aPackage.setDeliveryAddress(addPackageRequest.getReceiverAddress());
        aPackage.setSenderPhone(addPackageRequest.getSenderPhone());
        aPackage.setSenderName(addPackageRequest.getSenderName());
        aPackage.setReceiverPhone(addPackageRequest.getReceiverPhoneNumber());
        aPackage.setReceiverName(addPackageRequest.getReceiverName());
        aPackage.setNetWeight(addPackageRequest.getPackageWeight());


        // save package
        Package savedPackage = packageRepository.save(aPackage);


        // convert saved package to addPackage response


        // return converted response
        return null;
    }
}
