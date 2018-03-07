
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop specifies what kinds of items of value are held, owned, or managed by an organization or unclassified subject.  It may also specify the quantity and the general asset category.
 *          
 * 
 * <p>Java class for AssetArticleSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetArticleSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetClassText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="AssetTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="AssetArticleQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="6"/>
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
@XmlType(name = "AssetArticleSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "assetClassText",
    "assetTypeText",
    "assetArticleQuantity"
})
public class AssetArticleSummary {

    @XmlElement(name = "AssetClassText", required = true)
    protected DNBDecodedStringType assetClassText;
    @XmlElement(name = "AssetTypeText", required = true)
    protected DNBDecodedStringType assetTypeText;
    @XmlElement(name = "AssetArticleQuantity")
    protected Integer assetArticleQuantity;

    /**
     * Gets the value of the assetClassText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getAssetClassText() {
        return assetClassText;
    }

    /**
     * Sets the value of the assetClassText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setAssetClassText(DNBDecodedStringType value) {
        this.assetClassText = value;
    }

    /**
     * Gets the value of the assetTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getAssetTypeText() {
        return assetTypeText;
    }

    /**
     * Sets the value of the assetTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setAssetTypeText(DNBDecodedStringType value) {
        this.assetTypeText = value;
    }

    /**
     * Gets the value of the assetArticleQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssetArticleQuantity() {
        return assetArticleQuantity;
    }

    /**
     * Sets the value of the assetArticleQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssetArticleQuantity(Integer value) {
        this.assetArticleQuantity = value;
    }

}
