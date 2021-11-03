package africa.semicolon.data.repositories;

import africa.semicolon.data.models.Package;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PackageRepositoryImpl implements PackageRepository {

    Map<Integer, Package> database = new HashMap<>();

    @Override
    public Package save(Package aPackage) {
        Integer id = database.size()+1;
        aPackage.setTrackingId(id);
        database.put(id, aPackage);
        return database.get(id);
    }

    @Override
    public List<Package> findAll() {
        return null;
    }

    @Override
    public void delete(Package aPackage) {

    }

    @Override
    public void deleteByTrackingNumber(Integer trackingNumber) {

    }

    @Override
    public Package findPackageByTrackingNumber(Integer trackingNumber) {
        return null;
    }
}
