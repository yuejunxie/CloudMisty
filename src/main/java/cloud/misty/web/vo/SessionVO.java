package cloud.misty.web.vo;

import java.util.Date;

/**
 * @author xieyuejun
 * @created 2017/10/15
 * <p>
 * SessionVO
 */
public class SessionVO {
    /**
     * Id
     */
    private String id;
    /**
     * 过期时间
     */
    private int timeout;
    /**
     * 创建时间
     */
    private Date created;

    public SessionVO() {
    }

    public SessionVO(String id) {
        this.id = id;
    }

    public SessionVO(String id, int timeout) {
        this.id = id;
        this.timeout = timeout;
    }

    public SessionVO(String id, int timeout, Date created) {
        this.id = id;
        this.timeout = timeout;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "SessionVO{" +
                "id='" + id + '\'' +
                ", timeout=" + timeout +
                ", created=" + created +
                '}';
    }
}
