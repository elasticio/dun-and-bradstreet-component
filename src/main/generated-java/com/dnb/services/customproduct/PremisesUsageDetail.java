
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremisesUsageDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremisesUsageDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PremisesUnitTypeTotalCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MultiUnitOccurrenceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PremisesConstructionMaterialDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}PremisesConstructionMaterialDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PremisesUsageFunctionDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}PremisesUsageFunctionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PremisesUsageTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PremisesArea" type="{http://services.dnb.com/CustomProductServiceV2.0}PremisesArea" minOccurs="0"/>
 *         &lt;element name="PremisesUsageText" type="{http://services.dnb.com/CustomProductServiceV2.0}TextEntryType" minOccurs="0"/>
 *         &lt;element name="PremisesInternalUnitDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}PremisesInternalUnitDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PremisesExternalUnitDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}PremisesExternallUnitDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremisesUsageDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "premisesUnitTypeTotalCount",
    "multiUnitOccurrenceIndicator",
    "premisesConstructionMaterialDetail",
    "premisesUsageFunctionDetail",
    "premisesUsageTypeText",
    "premisesArea",
    "premisesUsageText",
    "premisesInternalUnitDetail",
    "premisesExternalUnitDetail"
})
public class PremisesUsageDetail {

    @XmlElement(name = "PremisesUnitTypeTotalCount")
    protected Integer premisesUnitTypeTotalCount;
    @XmlElement(name = "MultiUnitOccurrenceIndicator")
    protected Boolean multiUnitOccurrenceIndicator;
    @XmlElement(name = "PremisesConstructionMaterialDetail")
    protected List<PremisesConstructionMaterialDetail> premisesConstructionMaterialDetail;
    @XmlElement(name = "PremisesUsageFunctionDetail")
    protected List<PremisesUsageFunctionDetail> premisesUsageFunctionDetail;
    @XmlElement(name = "PremisesUsageTypeText")
    protected DNBDecodedStringType premisesUsageTypeText;
    @XmlElement(name = "PremisesArea")
    protected PremisesArea premisesArea;
    @XmlElement(name = "PremisesUsageText")
    protected TextEntryType premisesUsageText;
    @XmlElement(name = "PremisesInternalUnitDetail")
    protected List<PremisesInternalUnitDetailType> premisesInternalUnitDetail;
    @XmlElement(name = "PremisesExternalUnitDetail")
    protected List<PremisesExternallUnitDetailType> premisesExternalUnitDetail;

    /**
     * Gets the value of the premisesUnitTypeTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPremisesUnitTypeTotalCount() {
        return premisesUnitTypeTotalCount;
    }

    /**
     * Sets the value of the premisesUnitTypeTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPremisesUnitTypeTotalCount(Integer value) {
        this.premisesUnitTypeTotalCount = value;
    }

    /**
     * Gets the value of the multiUnitOccurrenceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiUnitOccurrenceIndicator() {
        return multiUnitOccurrenceIndicator;
    }

    /**
     * Sets the value of the multiUnitOccurrenceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiUnitOccurrenceIndicator(Boolean value) {
        this.multiUnitOccurrenceIndicator = value;
    }

    /**
     * Gets the value of the premisesConstructionMaterialDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premisesConstructionMaterialDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremisesConstructionMaterialDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremisesConstructionMaterialDetail }
     * 
     * 
     */
    public List<PremisesConstructionMaterialDetail> getPremisesConstructionMaterialDetail() {
        if (premisesConstructionMaterialDetail == null) {
            premisesConstructionMaterialDetail = new ArrayList<PremisesConstructionMaterialDetail>();
        }
        return this.premisesConstructionMaterialDetail;
    }

    /**
     * Gets the value of the premisesUsageFunctionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premisesUsageFunctionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremisesUsageFunctionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremisesUsageFunctionDetail }
     * 
     * 
     */
    public List<PremisesUsageFunctionDetail> getPremisesUsageFunctionDetail() {
        if (premisesUsageFunctionDetail == null) {
            premisesUsageFunctionDetail = new ArrayList<PremisesUsageFunctionDetail>();
        }
        return this.premisesUsageFunctionDetail;
    }

    /**
     * Gets the value of the premisesUsageTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPremisesUsageTypeText() {
        return premisesUsageTypeText;
    }

    /**
     * Sets the value of the premisesUsageTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPremisesUsageTypeText(DNBDecodedStringType value) {
        this.premisesUsageTypeText = value;
    }

    /**
     * Gets the value of the premisesArea property.
     * 
     * @return
     *     possible object is
     *     {@link PremisesArea }
     *     
     */
    public PremisesArea getPremisesArea() {
        return premisesArea;
    }

    /**
     * Sets the value of the premisesArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremisesArea }
     *     
     */
    public void setPremisesArea(PremisesArea value) {
        this.premisesArea = value;
    }

    /**
     * Gets the value of the premisesUsageText property.
     * 
     * @return
     *     possible object is
     *     {@link TextEntryType }
     *     
     */
    public TextEntryType getPremisesUsageText() {
        return premisesUsageText;
    }

    /**
     * Sets the value of the premisesUsageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextEntryType }
     *     
     */
    public void setPremisesUsageText(TextEntryType value) {
        this.premisesUsageText = value;
    }

    /**
     * Gets the value of the premisesInternalUnitDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premisesInternalUnitDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremisesInternalUnitDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremisesInternalUnitDetailType }
     * 
     * 
     */
    public List<PremisesInternalUnitDetailType> getPremisesInternalUnitDetail() {
        if (premisesInternalUnitDetail == null) {
            premisesInternalUnitDetail = new ArrayList<PremisesInternalUnitDetailType>();
        }
        return this.premisesInternalUnitDetail;
    }

    /**
     * Gets the value of the premisesExternalUnitDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premisesExternalUnitDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremisesExternalUnitDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremisesExternallUnitDetailType }
     * 
     * 
     */
    public List<PremisesExternallUnitDetailType> getPremisesExternalUnitDetail() {
        if (premisesExternalUnitDetail == null) {
            premisesExternalUnitDetail = new ArrayList<PremisesExternallUnitDetailType>();
        }
        return this.premisesExternalUnitDetail;
    }

}
