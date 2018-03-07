
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of details of the sources used for collecting information on this alert.
 *          
 * 
 * <p>Java class for ReferenceDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SourceDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PublicationName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PublicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="WebPageURL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SourceListName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SourceTypeText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContentText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "sourceName",
    "sourceDescription",
    "publicationName",
    "publicationDate",
    "webPageURL",
    "sourceListName",
    "sourceTypeText",
    "contentText"
})
public class ReferenceDetail {

    @XmlElement(name = "SourceName")
    protected String sourceName;
    @XmlElement(name = "SourceDescription")
    protected String sourceDescription;
    @XmlElement(name = "PublicationName")
    protected String publicationName;
    @XmlElement(name = "PublicationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationDate;
    @XmlElement(name = "WebPageURL")
    protected String webPageURL;
    @XmlElement(name = "SourceListName")
    protected String sourceListName;
    @XmlElement(name = "SourceTypeText")
    protected String sourceTypeText;
    @XmlElement(name = "ContentText")
    protected String contentText;

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the sourceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDescription() {
        return sourceDescription;
    }

    /**
     * Sets the value of the sourceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDescription(String value) {
        this.sourceDescription = value;
    }

    /**
     * Gets the value of the publicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationName() {
        return publicationName;
    }

    /**
     * Sets the value of the publicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationName(String value) {
        this.publicationName = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDate(XMLGregorianCalendar value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the webPageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPageURL() {
        return webPageURL;
    }

    /**
     * Sets the value of the webPageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPageURL(String value) {
        this.webPageURL = value;
    }

    /**
     * Gets the value of the sourceListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceListName() {
        return sourceListName;
    }

    /**
     * Sets the value of the sourceListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceListName(String value) {
        this.sourceListName = value;
    }

    /**
     * Gets the value of the sourceTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTypeText() {
        return sourceTypeText;
    }

    /**
     * Sets the value of the sourceTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTypeText(String value) {
        this.sourceTypeText = value;
    }

    /**
     * Gets the value of the contentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentText() {
        return contentText;
    }

    /**
     * Sets the value of the contentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentText(String value) {
        this.contentText = value;
    }

}
