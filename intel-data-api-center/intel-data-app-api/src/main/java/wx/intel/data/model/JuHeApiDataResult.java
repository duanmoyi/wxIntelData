package wx.intel.data.model;

import com.alibaba.fastjson.JSONArray;

/**
 * Created by duanz on 2017/1/20.
 */
public class JuHeApiDataResult {
    private String stat;
    private JSONArray data;

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public JSONArray getData() {
        return data;
    }

    public void setData(JSONArray data) {
        this.data = data;
    }
}
