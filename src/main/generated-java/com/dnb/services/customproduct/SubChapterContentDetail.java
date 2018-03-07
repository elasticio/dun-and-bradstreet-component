
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the details recorded in the profile sub chapter.
 *          
 * 
 * <p>Java class for SubChapterContentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubChapterContentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TitleText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="ContentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeyFactText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="QuestionText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="ContactJobTitleDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *         &lt;element name="WebPageURL" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="ImageURL" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="ImportanceLevel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
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
@XmlType(name = "SubChapterContentDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "titleText",
    "contentText",
    "keyFactText",
    "questionText",
    "contactJobTitleDescription",
    "webPageURL",
    "imageURL",
    "importanceLevel"
})
public class SubChapterContentDetail {

    @XmlElement(name = "TitleText")
    protected String titleText;
    @XmlElement(name = "ContentText")
    protected String contentText;
    @XmlElement(name = "KeyFactText")
    protected List<String> keyFactText;
    @XmlElement(name = "QuestionText")
    protected String questionText;
    @XmlElement(name = "ContactJobTitleDescription")
    protected String contactJobTitleDescription;
    @XmlElement(name = "WebPageURL")
    protected String webPageURL;
    @XmlElement(name = "ImageURL")
    protected String imageURL;
    @XmlElement(name = "ImportanceLevel")
    protected Integer importanceLevel;

    /**
     * Gets the value of the titleText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleText() {
        return titleText;
    }

    /**
     * Sets the value of the titleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleText(String value) {
        this.titleText = value;
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

    /**
     * Gets the value of the keyFactText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyFactText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyFactText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeyFactText() {
        if (keyFactText == null) {
            keyFactText = new ArrayList<String>();
        }
        return this.keyFactText;
    }

    /**
     * Gets the value of the questionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Sets the value of the questionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionText(String value) {
        this.questionText = value;
    }

    /**
     * Gets the value of the contactJobTitleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactJobTitleDescription() {
        return contactJobTitleDescription;
    }

    /**
     * Sets the value of the contactJobTitleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactJobTitleDescription(String value) {
        this.contactJobTitleDescription = value;
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
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

    /**
     * Gets the value of the importanceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImportanceLevel() {
        return importanceLevel;
    }

    /**
     * Sets the value of the importanceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImportanceLevel(Integer value) {
        this.importanceLevel = value;
    }

}
