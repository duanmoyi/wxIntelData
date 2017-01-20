package wx.intel.data.Util;

import org.springframework.web.client.RestTemplate;
import wx.intel.data.model.JuHeApiResponseResult;

/**
 * Created by duanz on 2017/1/20.
 */
public class JuHeApiHttpUtil {
    public static JuHeApiResponseResult doGet(String url){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, JuHeApiResponseResult.class);
    }
}
