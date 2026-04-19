import java.time.LocalDate;

public class Food extends Product implements Manage{
    private LocalDate dateExpired;

    public Food(String id, String name, LocalDate dateExpired) {
        super(id, name);
        this.dateExpired = dateExpired;
    }


    public void setDateExpired(LocalDate dateExpired) {
        this.dateExpired = dateExpired;
    }


    public LocalDate getDateExpired() {
        return dateExpired;
    }


    @Override
    public void importGoods() {

    }

    @Override
    public void exportGoods() {

    }

    @Override
    public void check() {

    }

    @Override
    public String toString() {
        return getName() + " - " + dateExpired;
    }
}
