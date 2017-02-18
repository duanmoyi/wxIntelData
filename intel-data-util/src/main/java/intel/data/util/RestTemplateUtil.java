package intel.data.util;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * Created by duanmoyi on 2017/2/18.
 */
public class RestTemplateUtil {

    private final static RestTemplate REST_TEMPLE = new RestTemplate();

    public static <T> T doGetForObject(String url, Class<T> cl) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.getForObject(url, cl);
    }

    public static <T> T doGetForObject(String url, Class<T> cl, Object... uriVariables) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.getForObject(url, cl, uriVariables);
    }

    public static <T> T doGetForObject(String url, Class<T> cl,
                                       Map<String, ?> uriVariables) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.getForObject(url, cl, uriVariables);
    }

    public static <T> ResponseEntity<T> doGetForEntity(String url, Class<T> cl) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.getForEntity(url, cl);
    }

    public static <T> ResponseEntity<T> doGetForEntity(String url, Class<T> cl,
                                                       Object... uriVariables) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.getForEntity(url, cl, uriVariables);
    }

    public static <T> ResponseEntity<T> doGetForEntity(String url, Class<T> cl,
                                                       Map<String, ?> uriVariables) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.getForEntity(url, cl, uriVariables);
    }

    public static <T> T doPostForObject(String url, Class<T> cl, Object request) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.postForObject(url, request, cl);
    }

    public static <T> T doPostForObject(String url, Class<T> cl, Object... uriVariables) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.postForObject(url, uriVariables, cl);
    }

    public static <T> T doPostForObject(String url, Class<T> cl,
                                        Map<String, ?> uriVariables) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.postForObject(url, uriVariables, cl);
    }

    public static <T> ResponseEntity<T> doPostForEntity(String url, Class<T> cl,
                                                        Object request) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.postForEntity(url, request, cl);
    }

    public static <T> ResponseEntity<T> doPostForEntity(String url, Class<T> cl,
                                                        Object... uriVariables) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.postForEntity(url, uriVariables, cl);
    }

    public static <T> ResponseEntity<T> doPostForEntity(String url, Class<T> cl,
                                                        Map<String, ?> uriVariables) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.postForEntity(url, uriVariables, cl);
    }

    public static <T> ResponseEntity<T> exchange(String url, Class<T> cl, Object request, HttpMethod method,
                                                 RequestEntity requestEntity) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.exchange(url, method, requestEntity, cl, request);
    }

    public static <T> ResponseEntity<T> exchange(String url, Class<T> cl, HttpMethod method,
                                                 RequestEntity requestEntity,
                                                 Object... uriVariables) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.exchange(url, method, requestEntity, cl, uriVariables);
    }

    public static <T> ResponseEntity<T> exchange(String url, Class<T> cl, Map<String, ?> uriVariables,
                                                 HttpMethod method,
                                                 RequestEntity requestEntity) throws RestClientException {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        return REST_TEMPLE.exchange(url, method, requestEntity, cl, uriVariables);
    }
}
