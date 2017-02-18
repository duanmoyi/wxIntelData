package wx.intel.data.app.api.service;

import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Service;
import wx.intel.data.app.api.Util.JuHeApiHttpUtil;
import wx.intel.data.app.api.model.JuHeApiResponseResult;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duanz on 2017/1/20.
 */
@Service
public class AppApiService<T> {

    public List<T> getApiResult(String url, Class<T> clazz){
        JuHeApiResponseResult result = JuHeApiHttpUtil.doGet(url);
        JSONArray dataResult = result.getResult().getData();
        List<T> dataList = new ArrayList<>();
        for(int i=0; i<dataResult.size(); i++){
            dataList.add(dataResult.getObject(i, clazz));
        }
        return dataList;
    }
}
