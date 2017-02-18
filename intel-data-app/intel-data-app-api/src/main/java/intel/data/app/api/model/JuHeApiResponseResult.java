package intel.data.app.api.model;

/**
 * Created by duanz on 2017/1/20.
 */
public class JuHeApiResponseResult {
    private String reason;
    private JuHeApiDataResult result;
    private String error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public JuHeApiDataResult getResult() {
        return result;
    }

    public void setResult(JuHeApiDataResult result) {
        this.result = result;
    }
}
