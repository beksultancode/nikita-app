package peaksoft.nikitaapp.nikita.models;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * @author Beksultan
 */
public class Phones {
    @XStreamImplicit(itemFieldName = "phone")
    private List<String> phone;

    public Phones() {
    }

    public Phones(List<String> phone) {
        this.phone = phone;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }
}
