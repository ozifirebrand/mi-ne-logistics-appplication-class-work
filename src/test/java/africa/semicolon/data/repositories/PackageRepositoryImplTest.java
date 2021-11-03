package africa.semicolon.data.repositories;

import africa.semicolon.data.models.Package;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageRepositoryImplTest {
    PackageRepository packageRepository;
    @BeforeEach
    public void setUp(){
        packageRepository = new PackageRepositoryImpl();
    }

    @Test
    public void test_saveNewPackage() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping Mat");
        aPackage.setSenderName("Ajerry");
        aPackage.setReceiverName("Dami");
        aPackage.setNetWeight(65.4);
        aPackage.setDeliveryAddress("No 4 Herbert Macaulay Way Sabo Yaba Lagos");
        aPackage.setReceiverPhone("08055438309");
        aPackage.setSenderPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);

        assertEquals(1, savedPackage.getTrackingId());
    }
    @Test
    public void test_updatePackage() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping Mat");
        aPackage.setSenderName("Ajerry");
        aPackage.setReceiverName("Dami");
        aPackage.setNetWeight(65.4);
        aPackage.setDeliveryAddress("No 4 Herbert Macaulay Way Sabo Yaba Lagos");
        aPackage.setReceiverPhone("08055438309");
        aPackage.setSenderPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);
        savedPackage.setName("Sniper");
        Package updatedPackage = packageRepository.save(savedPackage);
        assertEquals(1, savedPackage.getTrackingId());
    }



    @Test
    public void findAll() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping Mat");
        aPackage.setSenderName("Ajerry");
        aPackage.setReceiverName("Dami");
        aPackage.setNetWeight(65.4);
        aPackage.setDeliveryAddress("No 4 Herbert Macaulay Way Sabo Yaba Lagos");
        aPackage.setReceiverPhone("08055438309");
        aPackage.setSenderPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);
        assertEquals(1, packageRepository.findAll().size());


    }

    @Test
    public void delete() {

        Package aPackage = new Package();
        aPackage.setName("Sleeping Mat");
        aPackage.setSenderName("Ajerry");
        aPackage.setReceiverName("Dami");
        aPackage.setNetWeight(65.4);
        aPackage.setDeliveryAddress("No 4 Herbert Macaulay Way Sabo Yaba Lagos");
        aPackage.setReceiverPhone("08055438309");
        aPackage.setSenderPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);
        savedPackage.setName("Sniper");
        Package updatedPackage = packageRepository.save(savedPackage);
        packageRepository.delete(updatedPackage);
        assertEquals(0, packageRepository.findAll().size());

    }

    @Test
    public void deleteByTrackingNumber() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping Mat");
        aPackage.setSenderName("Ajerry");
        aPackage.setReceiverName("Dami");
        aPackage.setNetWeight(65.4);
        aPackage.setDeliveryAddress("No 4 Herbert Macaulay Way Sabo Yaba Lagos");
        aPackage.setReceiverPhone("08055438309");
        aPackage.setSenderPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);
        savedPackage.setName("Sniper");
        Package updatedPackage = packageRepository.save(savedPackage);
        packageRepository.deleteByTrackingNumber(updatedPackage.getTrackingId());
        assertEquals(0, packageRepository.findAll().size());
    }

    @Test
    public void findPackageByTrackingNumber() {

        Package aPackage = new Package();
        aPackage.setName("Sleeping Mat");
        aPackage.setSenderName("Ajerry");
        aPackage.setReceiverName("Dami");
        aPackage.setNetWeight(65.4);
        aPackage.setDeliveryAddress("No 4 Herbert Macaulay Way Sabo Yaba Lagos");
        aPackage.setReceiverPhone("08055438309");
        aPackage.setSenderPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);
        assertEquals(savedPackage, packageRepository.findPackageByTrackingNumber(aPackage.getTrackingId()));
    }
}