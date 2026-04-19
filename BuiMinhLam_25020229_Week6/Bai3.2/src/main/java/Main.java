public class Main {
    static void main(String[] args) {
        Report reporter = new Report("Báo cáo năm 2026", "Doanh thu");

        ReportFormatter jsonFormatter = new JsonFormatter();
        ReportService service = new ReportService(jsonFormatter);

        System.out.println("Kết quả báo cáo (JSON): ");
        System.out.println(service.export(reporter));

        System.out.println("Kết quả báo cáo (XML): ");
        ReportFormatter xmlFormatter = new XmlFormatter();
        service.setFormatter(xmlFormatter);
        System.out.println(service.export(reporter));
    }
}
