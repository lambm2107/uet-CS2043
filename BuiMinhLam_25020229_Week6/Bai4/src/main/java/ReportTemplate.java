import java.util.ArrayList;
import java.util.List;

public class ReportTemplate implements Cloneable{
    private String title;
    private String footer;
    private List<String> sections;

    public ReportTemplate(String title, String footer, List<String> sections) {
        this.title = title;
        this.footer = footer;
        this.sections = sections;
    }

    @Override
    public ReportTemplate clone() {
        ReportTemplate cloned = null;
        try {
            cloned = (ReportTemplate) super.clone();
            cloned.sections = new ArrayList<>(this.sections);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone không được hỗ trợ", e);
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addSections(String sections) {
        this.sections.add(sections);
    }

    public void printReport() {
        System.out.println("This is " + title + " report");
        System.out.println("Sections: " + sections);
        System.out.println("Footer: " + footer);
    }
}
