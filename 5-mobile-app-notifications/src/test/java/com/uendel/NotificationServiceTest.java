package com.uendel;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NotificationServiceTest {

    private String captureOutput(Runnable action) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        action.run();
        System.setOut(System.out);
        return out.toString().trim();
    }

    @Test
    void shouldSendEmailNotification() {
        NotificationService service = new NotificationService(new EmailNotification());
        String output = captureOutput(() -> service.notifyUser("Hello"));
        assertThat(output).isEqualTo("Sending EMAIL: Hello");
    }

    @Test
    void shouldSendSmsNotification() {
        NotificationService service = new NotificationService(new SmsNotification());
        String output = captureOutput(() -> service.notifyUser("Hello"));
        assertThat(output).isEqualTo("Sending SMS: Hello");
    }

    @Test
    void shouldSendPushNotification() {
        NotificationService service = new NotificationService(new PushNotification());
        String output = captureOutput(() -> service.notifyUser("Hello"));
        assertThat(output).isEqualTo("Sending PUSH: Hello");
    }
}

