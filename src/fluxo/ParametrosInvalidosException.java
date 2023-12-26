package fluxo;

public class ParametrosInvalidosException extends Throwable {

    private final String msg;

    public ParametrosInvalidosException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
