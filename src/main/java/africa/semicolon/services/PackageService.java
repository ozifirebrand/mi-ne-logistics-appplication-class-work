package africa.semicolon.services;

import africa.semicolon.dtos.Requests.AddPackageRequest;
import africa.semicolon.dtos.Responses.AddPackageResponse;

public interface PackageService {
    AddPackageResponse addPackage(AddPackageRequest addPackageRequest);
}
