import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        // Đây là phần của Adapter
        int[] arr = {4, 0, 8, 2, 3, 10, 6};
        LegacySorter oldSorter = new LegacySorter();
        SorterAdapter newSorter = new SorterAdapter(oldSorter);

        int[] res = newSorter.sort(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();

        // Đây là phần của Prototype
        String title = "Default";
        String footer = "Footer";
        List<String> sections = new ArrayList<>();
        sections.add("First section");
        sections.add("Second section");

        ReportTemplate defaultTemplate = new ReportTemplate(title, footer, sections);
        ReportTemplate clone1 = defaultTemplate.clone();
        ReportTemplate clone2 = defaultTemplate.clone();

        clone1.setTitle("Mở đầu");
        clone1.addSections("Third section");

        clone2.setTitle("Thân bài");
        clone2.addSections("Third sections");
        clone2.addSections("Fourth sections");

        defaultTemplate.printReport();
        clone1.printReport();
        clone2.printReport();

    }
}
