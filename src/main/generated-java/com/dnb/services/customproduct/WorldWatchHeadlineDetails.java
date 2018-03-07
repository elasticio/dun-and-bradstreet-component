
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorldWatchHeadlineDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorldWatchHeadlineDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastUpdateDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ShelfLifeClassText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ImportanceLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WorldWatchHeadlineText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
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
@XmlType(name = "WorldWatchHeadlineDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "lastUpdateDate",
    "shelfLifeClassText",
    "importanceLevel",
    "worldWatchHeadlineText"
})
public class WorldWatchHeadlineDetails {

    @XmlElement(name = "LastUpdateDate")
    protected DNBDateType lastUpdateDate;
    @XmlElement(name = "ShelfLifeClassText")
    protected DNBDecodedStringType shelfLifeClassText;
    @XmlElement(name = "ImportanceLevel")
    protected Integer importanceLevel;
    @XmlElement(name = "WorldWatchHeadlineText")
    protected String worldWatchHeadlineText;

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setLastUpdateDate(DNBDateType value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the shelfLifeClassText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getShelfLifeClassText() {
        return shelfLifeClassText;
    }

    /**
     * Sets the value of the shelfLifeClassText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setShelfLifeClassText(DNBDecodedStringType value) {
        this.shelfLifeClassText = value;
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

    /**
     * Gets the value of the worldWatchHeadlineText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorldWatchHeadlineText() {
        return worldWatchHeadlineText;
    }

    /**
     * Sets the value of the worldWatchHeadlineText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorldWatchHeadlineText(String value) {
        this.worldWatchHeadlineText = value;
    }

}
