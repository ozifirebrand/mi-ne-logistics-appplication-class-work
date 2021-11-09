package africa.semicolon.dtos.Requests;

import africa.semicolon.data.models.TrackingData;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class AddTrackingInfoRequest {
    private Integer packageId;
    private String event;

    public AddTrackingInfoRequest(Integer packageId){
        this.packageId = packageId;
    }
    public AddTrackingInfoRequest(String event){
        this.event = event;
    }
}

