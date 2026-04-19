public class Report {
    private String title;
    private String content;
    private String type;

    public Report(String title, String content) {
        this.content = content;
        this.title = title;
        //this.type = type;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }
}
