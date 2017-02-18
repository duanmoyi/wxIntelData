package intel.data.app.data;

import intel.data.app.db.model.News;
import intel.data.app.db.service.NewsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by duanmoyi on 2017/2/18.
 */
@RestController
@RequestMapping("/api/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    private Log log = LogFactory.getLog(getClass());

    @RequestMapping(path = "/{newsType}", method = RequestMethod.GET)
    public ResponseEntity<List<News>> getNewsList(@PathVariable String newsType){
        try {
            List<News> newsList = newsService.getNewsList(newsType);
            if(! newsList.isEmpty()){
                return new ResponseEntity<List<News>>(newsList, HttpStatus.OK);
            }else{
                return new ResponseEntity<List<News>>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            if(log.isErrorEnabled()){
                log.error(e.getMessage(), e);
            }
            return new ResponseEntity<List<News>>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
