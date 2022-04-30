package peaksoft.nikitaapp.nikita.models;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * @author Beksultan
 */
@XStreamAlias("response")
public class MessageResponse {
    private String id;
    private Integer status;

    private Integer phones;
    private String smscnt;
//    private String message;
    public MessageResponse() {
    }

    public MessageResponse(String id, Integer status, Integer phones, String smscnt) {
        this.id = id;
        this.status = status;
        this.phones = phones;
        this.smscnt = smscnt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPhones() {
        return phones;
    }

    public void setPhones(Integer phones) {
        this.phones = phones;
    }

    public String getSmscnt() {
        return smscnt;
    }

    public void setSmscnt(String smscnt) {
        this.smscnt = smscnt;
    }

    @Override
    public String toString() {
        return "MessageResponse{" +
                "id='" + id + '\'' +
                ", status=" + status +
                ", phones=" + phones +
                ", smscnt='" + smscnt + '\'' +
                '}';
    }
}
