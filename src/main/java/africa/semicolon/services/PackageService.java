package africa.semicolon.services;

import africa.semicolon.data.models.Package;
import africa.semicolon.dtos.Requests.AddPackageRequest;
import africa.semicolon.dtos.Requests.AddTrackingInfoRequest;
import africa.semicolon.dtos.Responses.AddPackageResponse;

import java.util.Collection;
import java.util.List;

public interface PackageService {
    AddPackageResponse addPackage(AddPackageRequest addPackageRequest);
    Package findPackageById(Integer trackingId);

    void deleteAllPackages();

    List<Package> getAllPackages();

    Package findPackageWithMy(Integer packageId);
}
