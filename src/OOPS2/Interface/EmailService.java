package OOPS2.Interface;

public class EmailService implements NotificationService{

    private String email;

    public EmailService(String email){
        this.email = email;
    }
    @Override
    public void sendNotifications(String message) {
        System.out.println("Sending email notifications to " + email);
    }

    @Override
    public void subscribeToTopic(String topic) {
        System.out.println("Sending email notifications to " + email + " for topic " + topic);
    }
}
