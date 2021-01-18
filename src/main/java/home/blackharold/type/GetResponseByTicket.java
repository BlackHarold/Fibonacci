package home.blackharold.type;

import javax.xml.soap.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

/*
Данный код создает запрос getResponseByTicket.
Запрос используется для получения информации об отправлениях по ранее
полученному билету. Ответ выводится на экран в формате xml.
Рекомендуется выполнять первое обращение за ответом по билету не ранее,
чем через 15 минут от момента выдачи билета.
*/
public class GetResponseByTicket {
    public static void main(String... args) throws Exception {
        /*
        Пример запроса:
        <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                            xmlns:pos="http://fclient.russianpost.org/postserver">
        <soapenv:Header/>
        <soapenv:Body>
            <pos:answerByTicketRequest>
                <ticket>20150917162048476CLIENTID</ticket>
                <login>my_login</login>
                <password>my_password</password>
            </pos:answerByTicketRequest>
        </soapenv:Body>
        </soapenv:Envelope>
        */

        Thread.sleep(100000); // задержка 15 минут.

        //Сначала создаем соединение
        SOAPConnectionFactory soapConnFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection connection = soapConnFactory.createConnection();
        String url = "https://tracking.russianpost.ru/fc";

        //Затем создаем сообщение
        MessageFactory messageFactory = MessageFactory.newInstance("SOAP 1.1 Protocol");
        SOAPMessage message = messageFactory.createMessage();

        //Создаем объекты, представляющие различные компоненты сообщения
        SOAPPart soapPart = message.getSOAPPart();
        SOAPEnvelope envelope = soapPart.getEnvelope();
        SOAPBody body = envelope.getBody();

        envelope.addNamespaceDeclaration("soapenv", "http://schemas.xmlsoap.org/soap/envelope/");
        envelope.addNamespaceDeclaration("pos", "http://fclient.russianpost.org/postserver");
        SOAPElement answerByTicketRequest = body.addChildElement("answerByTicketRequest", "pos");
        SOAPElement ticket = answerByTicketRequest.addChildElement("ticket");
        SOAPElement login = answerByTicketRequest.addChildElement("login");
        SOAPElement password = answerByTicketRequest.addChildElement("password");

        // Заполняем значения
        ticket.addTextNode("20150917162048476CLIENTID");
        login.addTextNode("myLogin");
        password.addTextNode("myPassword");

        //Сохранение сообщения
        message.saveChanges();

        //Отправляем запрос и выводим ответ на экран
        SOAPMessage soapResponse = connection.call(message, url);
        Source sourceContent = soapResponse.getSOAPPart().getContent();
        Transformer t = TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(OutputKeys.METHOD, "xml");
        t.setOutputProperty(OutputKeys.INDENT, "yes");
        StreamResult result = new StreamResult(System.out);
        t.transform(sourceContent, result);

        //Закрываем соединение
        connection.close();
    }
}