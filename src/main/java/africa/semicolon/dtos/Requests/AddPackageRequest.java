package africa.semicolon.dtos.Requests;

import lombok.Data;

@Data
public class AddPackageRequest {
    private String senderName;
    private String senderPhone;
    private String receiverName;
    private String receiverAddress;
    private double packageWeight;
    private String packageDescription;
    private String receiverPhoneNumber;
}