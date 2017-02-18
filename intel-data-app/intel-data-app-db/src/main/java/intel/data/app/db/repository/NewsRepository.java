package intel.data.app.db.repository;

import intel.data.app.db.model.News;

import java.util.List;

/**
 * Created by duanmoyi on 2017/2/18.
 */
public interface NewsRepository {

    public List getNewsList(String newsType);

    public void addNewsList(List<News> newsList);
}
