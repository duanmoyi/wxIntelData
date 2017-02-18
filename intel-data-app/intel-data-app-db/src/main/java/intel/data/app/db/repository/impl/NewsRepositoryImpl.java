package intel.data.app.db.repository.impl;

import intel.data.app.db.model.News;
import intel.data.app.db.repository.NewsRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by duanmoyi on 2017/2/18.
 */
@Transactional
@Repository
public class NewsRepositoryImpl implements NewsRepository {
    @PersistenceContext
    private EntityManager entityManager;

    private Log log = LogFactory.getLog(getClass());

    @Override
    public List<News> getNewsList(String newsType) {
        try {
            return entityManager.createQuery("select news from News news where news.newsType =:newsType")
                    .setParameter("newsType", newsType).getResultList();
        } catch (Exception e) {
            if(log.isErrorEnabled()){
                log.error(e, e.getCause());
            }
            return null;
        }
    }

    @Override
    public void addNewsList(List<News> newsList) {
        try {
            newsList.stream().filter(m -> m != null).forEach(m->entityManager.persist(m));
        } catch (Exception e) {
            if(log.isErrorEnabled()){
                log.error(e, e.getCause());
            }
        }
    }
}
