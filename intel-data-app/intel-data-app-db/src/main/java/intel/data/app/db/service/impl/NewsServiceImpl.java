package intel.data.app.db.service.impl;

import intel.data.app.db.model.News;
import intel.data.app.db.repository.NewsRepository;
import intel.data.app.db.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by duanmoyi on 2017/2/18.
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsRepository newsRepository;

    @Override
    public List<News> getNewsList(String newsType) {
        return StringUtils.isEmpty(newsType) ? null : newsRepository.getNewsList(newsType);
    }

    @Override
    public void addNewsList(List<News> newsList) {
        newsRepository.addNewsList(newsList);
    }
}
