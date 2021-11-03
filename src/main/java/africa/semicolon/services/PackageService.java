package africa.semicolon.services;

import africa.semicolon.data.models.Package;
import africa.semicolon.dtos.Requests.AddPackageRequest;
import africa.semicolon.dtos.Responses.AddPackageResponse;

public interface PackageService {
    AddPackageResponse addPackage(AddPackageRequest addPackageRequest);
    Package findPackageById(Integer trackingId);
}
