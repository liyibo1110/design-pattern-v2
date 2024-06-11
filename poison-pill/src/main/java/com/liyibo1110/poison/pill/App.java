package com.liyibo1110.poison.pill;

/**
 * @author liyibo
 * @date 2024-06-11 15:12
 */
public class App {

    public static void main(String[] args) {
        var queue = new SimpleMessageQueue(1000);
        var producer = new Producer("PRODUCER_1", queue);
        var consumer = new Consumer("CONSUMER_1", queue);

        new Thread(consumer::consume).start();

        new Thread(() -> {
            producer.send("hand shake");
            producer.send("some very important information");
            producer.send("bye!");
            producer.stop();
        }).start();
    }
}
