public class ExportFactory {
    public static Export createFile(String type) {
        if (type.equalsIgnoreCase("pdf")) {
            return new PdfExport();
        }

        if (type.equalsIgnoreCase("excel")) {
            return new ExcelExport();
        }
        return null;
    }
}
