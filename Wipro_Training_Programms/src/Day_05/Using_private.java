package Day_05;

interface MessageService {
    
    void sendMessage(String msg);

    private void log(String msg) {
        System.out.println("Read :" + msg);
    }

    default void sendWithLog(String msg) {
        log(msg);          
        sendMessage(msg);  
    }
}

class EmailService implements MessageService {
    public void sendMessage(String msg) {
        System.out.println("Code : " + msg);
    }
}

public class Using_private {
    public static void main(String[] args) {
        MessageService service = new EmailService();
        service.sendWithLog("Java");
    }
}

