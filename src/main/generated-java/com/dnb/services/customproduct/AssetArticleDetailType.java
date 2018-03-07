
package com.dnb.services.customproduct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Text identifying the kind of item of value that is held, owned, or managed by the subject, e.g., truck, office equipment, freighter, textile goods, accounts receivables
 *          
 * 
 * <p>Java class for AssetArticleDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetArticleDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="AssetClassText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="AssetSizeMeasurement" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AssetSizeMeasurementUnitText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetArticleDetailType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "assetTypeText",
    "assetClassText",
    "assetSizeMeasurement",
    "assetSizeMeasurementUnitText"
})
public class AssetArticleDetailType {

    @XmlElement(name = "AssetTypeText")
    protected DNBDecodedStringType assetTypeText;
    @XmlElement(name = "AssetClassText")
    protected DNBDecodedStringType assetClassText;
    @XmlElement(name = "AssetSizeMeasurement")
    protected BigInteger assetSizeMeasurement;
    @XmlElement(name = "AssetSizeMeasurementUnitText")
    protected DNBDecodedStringType assetSizeMeasurementUnitText;

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
     * Gets the value of the assetSizeMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssetSizeMeasurement() {
        return assetSizeMeasurement;
    }

    /**
     * Sets the value of the assetSizeMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssetSizeMeasurement(BigInteger value) {
        this.assetSizeMeasurement = value;
    }

    /**
     * Gets the value of the assetSizeMeasurementUnitText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getAssetSizeMeasurementUnitText() {
        return assetSizeMeasurementUnitText;
    }

    /**
     * Sets the value of the assetSizeMeasurementUnitText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setAssetSizeMeasurementUnitText(DNBDecodedStringType value) {
        this.assetSizeMeasurementUnitText = value;
    }

}
