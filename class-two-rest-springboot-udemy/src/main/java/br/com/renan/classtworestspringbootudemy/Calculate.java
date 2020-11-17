package br.com.renan.classtworestspringbootudemy;

public class Calculate {
    private final long id;
    private final String content;

    public Calculate(long id, String content) {
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
