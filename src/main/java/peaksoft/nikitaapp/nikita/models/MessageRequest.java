package peaksoft.nikitaapp.nikita.models;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Arrays;

/**
 * @author Beksultan
 */
@XStreamAlias(value = "message")
public class MessageRequest {
    private String login;
    private String pwd;
    private String id;
    private String sender;
    private String text;
    @XStreamAlias(value = "phones")
    private Phones phones;

    public MessageRequest() {
    }

    public MessageRequest(String login,
                          String pwd,
                          String id,
                          String sender,
                          String text,
                          String... phones) {
        this.login = login;
        this.pwd = pwd;
        this.id = id;
        this.sender = sender;
        this.text = text;
        this.phones = new Phones(Arrays.asList(phones));
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Phones getPhones() {
        return phones;
    }

    public void setPhones(Phones phones) {
        this.phones = phones;
    }

}
