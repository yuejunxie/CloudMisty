package cloud.misty.web.restful;

import cloud.misty.web.vo.SessionVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CachePut;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author xieyuejun
 * @created 2017/10/13
 *
 * Session Restful
 */
@RestController
@RequestMapping(path = "/session",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SessionRestful {
    /**
     * Logger
     */
    private Logger logger = LoggerFactory.getLogger(SessionRestful.class);

    /**
     *
     * @param request
     * @param response
     * @return
     */
    @GetMapping("")
    public SessionVO getSession(HttpServletRequest request,HttpServletResponse response){
        HttpSession session = request.getSession();
        logger.info("Session Timeout："+session.getMaxInactiveInterval());
        return new SessionVO(session.getId(),session.getMaxInactiveInterval(),new Date());

    }

    @GetMapping("/id")
    @CachePut(value = "id",key = "'sav'")
    public String getSessionId(HttpServletRequest request){
        return request.getSession().getId();

    }
}
