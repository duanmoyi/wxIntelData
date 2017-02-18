package intel.data.app.db.service;

import intel.data.app.db.model.News;

import java.util.List;

/**
 * Created by duanmoyi on 2017/2/18.
 */
public interface NewsService {

    public List<News> getNewsList(String newsType);

    public void addNewsList(List<News> newsList);
}
