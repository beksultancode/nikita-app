# Nikita-App
### Nikita.kg is API that helps us to send messages to phone numbers
>nikita pattern to send message
```
<?xml version="1.0" encoding="UTF-8"?> 
<message>
     <login>login</login>
     <pwd>passwd</pwd>
     <id>A88726</id>
     <sender>My-company</sender>
     <text>Any SMS message text</text>
     <time>20100921235957</time>
     <phones>
          <phone>996550123456</phone>
          <phone>996550123457</phone>
     </phones>
     <test>1</test>
</message>
```
### Message requests response
```
<?xml version="1.0" encoding="UTF-8"?> <response>
     <id>A88726</id>
     <status>0</status>
     <phones>2</phones>
     <smscnt>2</smscnt>
     <message></message>
</response>
```

### used dependency
```
        <dependency>
            <groupId>com.thoughtworks.xstream</groupId>
            <artifactId>xstream</artifactId>
            <version>1.4.19</version>
        </dependency>
```
### and we used httpclient from apache
```
        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpclient</artifactId>
        </dependency>
```

> to work with this application
> you need to register to http://nikita.kg 
> and add login & password & sender name to application.yml