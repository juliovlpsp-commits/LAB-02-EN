package lab2;

/**
 * summary with topic and content
 */
public class Summary {
    private String topic;
    private String content;

    public Summary(String topic, String content) {
        this.topic = topic;
        this.content = content;
    }

    public String getTopic() {
        return this.topic;
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public String toString() {
        return this.topic + ": " + this.content;
    }
}
