package OOPS2.Interface;

public class SMSService implements NotificationService{

    private String phoneNo;

    public SMSService(String phoneNo){
        this.phoneNo = phoneNo;
    }
    @Override
    public void sendNotifications(String message) {
        System.out.println("Sending notifications to " + phoneNo);
    }

    @Override
    public void subscribeToTopic(String topic) {
        System.out.println("subscribed " + phoneNo + " to email notifications for topic " + topic);
    }
}
