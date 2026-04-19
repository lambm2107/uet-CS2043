public class PdfExport implements Export{
    @Override
    public void exportData(String data) {
        System.out.println("Đang xuất file PDF với nội dung: " + data);
    }
}
