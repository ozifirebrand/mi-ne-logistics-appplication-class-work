package africa.semicolon.controllers;

import africa.semicolon.dtos.Requests.AddPackageRequest;
import africa.semicolon.dtos.Responses.AddPackageResponse;
import africa.semicolon.services.PackageService;
import africa.semicolon.services.PackageServiceImpl;

public class PackageController {

    private final PackageService packageService = new PackageServiceImpl();
    public AddPackageResponse addPackage(AddPackageRequest addPackageRequest){
        return packageService.addPackage(addPackageRequest);
    }
}
