package africa.semicolon.utils;

import africa.semicolon.data.models.Package;
import africa.semicolon.dtos.Requests.AddPackageRequest;
import africa.semicolon.dtos.Responses.AddPackageResponse;

public class ModelMapper {
    public static Package map(AddPackageRequest addPackageRequest){
        Package aPackage = new Package();
        aPackage.setName(addPackageRequest.getPackageDescription());
        aPackage.setDeliveryAddress(addPackageRequest.getReceiverAddress());
        aPackage.setSenderEmail(addPackageRequest.getSenderEmail());
        aPackage.setReceiverPhone(addPackageRequest.getReceiverPhoneNumber());
        aPackage.setReceiverName(addPackageRequest.getReceiverName());
        aPackage.setNetWeight(addPackageRequest.getPackageWeight());
        return aPackage;
    }

    public static AddPackageResponse map(Package savedPackage){
        AddPackageResponse response = new AddPackageResponse();
        response.setPackageName(savedPackage.getName());
        response.setReceiverName(savedPackage.getReceiverName());
        response.setPackageWeight(savedPackage.getNetWeight());
        response.setReceiverPhone(savedPackage.getReceiverPhone());
        response.setTrackingId(savedPackage.getTrackingId());
        return response;
    }
}
