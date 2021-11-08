package africa.semicolon.dtos.Requests;

import lombok.Data;

@Data
public class RegisterSenderRequest {
    private String senderEmail;
    private String senderName;
    private String phoneNumber;

}
