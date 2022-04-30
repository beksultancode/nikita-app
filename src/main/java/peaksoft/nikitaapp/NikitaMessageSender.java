package peaksoft.nikitaapp;

import com.thoughtworks.xstream.XStream;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;
import peaksoft.nikitaapp.nikita.models.MessageRequest;
import peaksoft.nikitaapp.nikita.models.MessageResponse;

import java.io.IOException;

/**
 * @author Beksultan
 */
@Component
public class NikitaMessageSender {

    public MessageResponse sendMessage(MessageRequest messageRequest) {
        try (CloseableHttpClient client = HttpClientBuilder.create().build()) {
            HttpPost post = new HttpPost("https://smspro.nikita.kg/api/message");

            XStream xStream = new XStream();
            xStream.processAnnotations(MessageRequest.class);

            post.setEntity(new StringEntity(xStream.toXML(messageRequest)));

            CloseableHttpResponse response = client.execute(post);
            String xmlResponse = EntityUtils.toString(response.getEntity());

            xStream.processAnnotations(MessageResponse.class);
            xStream.allowTypes(new Class[] {
                    MessageResponse.class
            });

            return (MessageResponse) xStream.fromXML(xmlResponse);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
