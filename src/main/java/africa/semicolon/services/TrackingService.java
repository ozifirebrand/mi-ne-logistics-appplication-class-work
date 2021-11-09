package africa.semicolon.services;

import africa.semicolon.dtos.Requests.AddTrackingInfoRequest;
import africa.semicolon.dtos.Responses.AddTrackingInfoResponse;

public interface TrackingService {
    AddTrackingInfoResponse updateTrackingInfo(AddTrackingInfoRequest addTrackingInfoRequest);
}
