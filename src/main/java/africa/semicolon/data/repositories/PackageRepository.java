package africa.semicolon.data.repositories;

import africa.semicolon.data.models.Package;

import java.util.List;
import java.util.Optional;

public interface PackageRepository {
    Package save(Package aPackage);
    List<Package> findAll();
    void delete(Package aPackage);
    void deleteByTrackingNumber(Integer trackingNumber);
    Package findPackageByTrackingNumber(Integer trackingNumber);
}
