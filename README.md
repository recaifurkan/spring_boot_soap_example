# Spring Web Services (SOAP) using Spring Boot example

- `http://localhost:8091/soapWS` - request xml is under `src/main/resource/car-request.xml`



### Request Sample
```bash
curl --location --request POST 'http://localhost:8091/soapWS' \
--header 'Content-Type: text/xml' \
--data-raw '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
xmlns:us="http://rfbsoft.com">
<soapenv:Header/>
<soapenv:Body>
<us:getCarRequest>
<us:name>BMW</us:name>
</us:getCarRequest>
</soapenv:Body>
</soapenv:Envelope>'
```




