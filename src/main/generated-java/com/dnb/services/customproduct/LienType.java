
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This section provides details on claims a creditor holds against specific property of the company as security for satisfaction of a debt. (Lien)
 *          
 * 
 * <p>Java class for LienType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LienType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventBaseType">
 *       &lt;sequence>
 *         &lt;element name="FilingAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CollateralDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}CollateralDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FilingDescriptionText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="LegalJurisdictionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LienType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "filingAmount",
    "collateralDetail",
    "filingDescriptionText",
    "legalJurisdictionText"
})
public class LienType
    extends LegalEventBaseType
{

    @XmlElement(name = "FilingAmount")
    protected AmountType filingAmount;
    @XmlElement(name = "CollateralDetail")
    protected List<CollateralDetailType> collateralDetail;
    @XmlElement(name = "FilingDescriptionText")
    protected String filingDescriptionText;
    @XmlElement(name = "LegalJurisdictionText")
    protected DNBDecodedStringType legalJurisdictionText;

    /**
     * Gets the value of the filingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFilingAmount() {
        return filingAmount;
    }

    /**
     * Sets the value of the filingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFilingAmount(AmountType value) {
        this.filingAmount = value;
    }

    /**
     * Gets the value of the collateralDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collateralDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollateralDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralDetailType }
     * 
     * 
     */
    public List<CollateralDetailType> getCollateralDetail() {
        if (collateralDetail == null) {
            collateralDetail = new ArrayList<CollateralDetailType>();
        }
        return this.collateralDetail;
    }

    /**
     * Gets the value of the filingDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingDescriptionText() {
        return filingDescriptionText;
    }

    /**
     * Sets the value of the filingDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingDescriptionText(String value) {
        this.filingDescriptionText = value;
    }

    /**
     * Gets the value of the legalJurisdictionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getLegalJurisdictionText() {
        return legalJurisdictionText;
    }

    /**
     * Sets the value of the legalJurisdictionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setLegalJurisdictionText(DNBDecodedStringType value) {
        this.legalJurisdictionText = value;
    }

}
