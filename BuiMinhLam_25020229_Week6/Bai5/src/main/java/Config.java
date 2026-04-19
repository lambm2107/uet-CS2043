public class Config implements Cloneable {
    private String module;

    public Config(String module) {
        this.module = module;
    }

    @Override
    public Config clone()  {
        try {
            return (Config) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone không được hỗ trợ", e);
        }
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getModule() {
        return this.module;
    }
}
