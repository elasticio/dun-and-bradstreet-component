package io.elastic.dnb.soap.client;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPException;

import java.security.GeneralSecurityException;

public class WSPolicy {

    private static final String WSS_TOKEN_URL = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText";
    private static final String WSS_TOKEN_XSD = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    private static final String WSS_OASIS_XSD = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";

    /**
     * Method to add WS Security header to SOAP Message
     * <p>
     * <SOAP-ENV:Header>
     *   <wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd">
     *     <wsse:UsernameToken xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="UsernameToken-2">
     *       <wsse:Username>login</wsse:Username>
     *       <wsse:Password Type="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText">password</wsse:Password>
     *     </wsse:UsernameToken>
     *   </wsse:Security>
     * </SOAP-ENV:Header>
     *
     * @param soapMessage
     * @return
     */
    public static SOAPHeader addWSSEHeader(SOAPMessage soapMessage, String login, String password) throws GeneralSecurityException {

        if (login == null || login.isEmpty()) {
            throw new GeneralSecurityException("Login and password can not be empty");
        }
        if (password == null || password.isEmpty()) {
            throw new GeneralSecurityException("Login and password can not be empty");
        }

        SOAPHeader header = null;
        try {
            SOAPEnvelope envelope = soapMessage.getSOAPPart().getEnvelope();
            SOAPFactory factory = SOAPFactory.newInstance();
            String prefix = "wsse";
            String uri = WSS_TOKEN_XSD;
            SOAPElement securityElem =
                    factory.createElement("Security", prefix, uri);
            SOAPElement tokenElem =
                    factory.createElement("UsernameToken", prefix, uri);
            tokenElem.addAttribute(QName.valueOf("wsu:Id"), "UsernameToken-2");
            tokenElem.addAttribute(QName.valueOf("xmlns:wsu"), WSS_OASIS_XSD);
            SOAPElement userElem =
                    factory.createElement("Username", prefix, uri);
            userElem.addTextNode(login);
            SOAPElement pwdElem =
                    factory.createElement("Password", prefix, uri);
            pwdElem.addTextNode(password);
            pwdElem.addAttribute(QName.valueOf("Type"), WSS_TOKEN_URL);
            tokenElem.addChildElement(userElem);
            tokenElem.addChildElement(pwdElem);
            securityElem.addChildElement(tokenElem);

            if (envelope.getHeader() != null) {
                envelope.getHeader().detachNode();
            }
            header = envelope.addHeader();
            header.addChildElement(securityElem);
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        return header;
    }
}
