package asd;

/**
 *
 * @author ico
 */
public class Client {

    private String code;
    private String name;

    public Client(String name, String code) {
        super();
        this.setName(name);
        this.setCode(code);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

}
