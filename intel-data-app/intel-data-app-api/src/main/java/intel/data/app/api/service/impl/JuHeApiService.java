package intel.data.app.api.service.impl;

import com.alibaba.fastjson.JSONArray;
import intel.data.app.api.model.JuHeApiResponseResult;
import intel.data.app.api.service.ApiService;
import intel.data.util.RestTemplateUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duanz on 2017/1/20.
 */
@Service
public class JuHeApiService implements ApiService{

    @Override
    public <T> List<T> getApiResult(String url, Class<T> clazz) {
        JuHeApiResponseResult result = RestTemplateUtil.doGetForObject(url, JuHeApiResponseResult.class);
        JSONArray dataResult = result.getResult().getData();
        List<T> dataList = new ArrayList<>();
        for (int i = 0; i < dataResult.size(); i++) {
            dataList.add(dataResult.getObject(i, clazz));
        }
        return dataList;
    }
}
