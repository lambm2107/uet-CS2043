public class Factory {
    private Button button;
    private Checkbox checkbox;

    public Factory(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    void render() {
        button.render();
        checkbox.render();
    }

}
