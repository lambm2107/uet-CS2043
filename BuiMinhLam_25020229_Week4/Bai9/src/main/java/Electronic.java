import java.time.LocalDate;

public class Electronic extends Product implements Manage{
    private int dateWarranty;

    public Electronic(String id, String name, int dateWarranty) {
        super(id, name);
        this.dateWarranty = dateWarranty;
    }

    public void setDateGurantee(int dateWarranty) {
        this.dateWarranty = dateWarranty;
    }

    public int getDateWarranty() {
        return dateWarranty;
    }

    @Override
    public String toString() {
        return getName() + " - " + dateWarranty + " tháng bảo hành";
    }

}
