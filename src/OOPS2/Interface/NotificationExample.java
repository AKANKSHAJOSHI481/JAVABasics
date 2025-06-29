package OOPS2.Interface;

public class NotificationExample {
    public static void main(String[] args) {
        NotificationService emailService = new EmailService("user@example.com");
        NotificationService smsService = new SMSService("8790273892");

        emailService.sendNotifications("Hello, this is an email notification");
        smsService.sendNotifications("Hello, this is an sms notification");

        emailService.subscribeToTopic("News");
        smsService.subscribeToTopic("Alerts");
    }
}
