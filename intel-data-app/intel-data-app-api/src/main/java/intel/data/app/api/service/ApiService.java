package intel.data.app.api.service;

import java.util.List;

/**
 * Created by duanmoyi on 2017/2/18.
 */
public interface ApiService {

    public <T> List<T> getApiResult(String url, Class<T> clazz);

}
