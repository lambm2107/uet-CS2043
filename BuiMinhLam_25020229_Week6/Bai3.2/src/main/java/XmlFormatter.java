public class XmlFormatter implements ReportFormatter{
    @Override
    public String format(Report report) {
        //return report.getType() + ": " + report.getTitle() + " & " + report.getContent();
        return report.getTitle() + " & " + report.getContent();
    }
}
