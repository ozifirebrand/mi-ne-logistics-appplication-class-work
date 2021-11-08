package africa.semicolon.controllers;

import africa.semicolon.data.models.Package;
import africa.semicolon.dtos.Requests.AddPackageRequest;
import africa.semicolon.dtos.Responses.AddPackageResponse;
import africa.semicolon.services.PackageService;
import africa.semicolon.services.PackageServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class PackageController {
    private final PackageService packageService = new PackageServiceImpl();

    @PostMapping("/api/addpackage")
    public AddPackageResponse addPackage(@RequestBody AddPackageRequest addPackageRequest){
        return packageService.addPackage(addPackageRequest);
    }

    @GetMapping("/api/package/{id}")
    public Package findPackageById(@PathVariable("id") Integer trackingId){
        return packageService.findPackageById(trackingId);
    }
}
