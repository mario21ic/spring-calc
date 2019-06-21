package hello;

public class Calc {

    private final long id;
    private final String content;

    public Calc(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
