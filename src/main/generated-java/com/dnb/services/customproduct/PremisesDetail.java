
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremisesDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremisesDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PremisesTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PremisesAreaMeasurement" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PremisesAreaMeasurementReliabilityText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PremisesAreaMeasurementUnitText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PremisesConstructionMaterialDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}PremisesConstructionMaterialDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremisesDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "premisesTypeText",
    "premisesAreaMeasurement",
    "premisesAreaMeasurementReliabilityText",
    "premisesAreaMeasurementUnitText",
    "premisesConstructionMaterialDetail"
})
public class PremisesDetail {

    @XmlElement(name = "PremisesTypeText")
    protected DNBDecodedStringType premisesTypeText;
    @XmlElement(name = "PremisesAreaMeasurement")
    protected BigDecimal premisesAreaMeasurement;
    @XmlElement(name = "PremisesAreaMeasurementReliabilityText")
    protected DNBDecodedStringType premisesAreaMeasurementReliabilityText;
    @XmlElement(name = "PremisesAreaMeasurementUnitText")
    protected DNBDecodedStringType premisesAreaMeasurementUnitText;
    @XmlElement(name = "PremisesConstructionMaterialDetail")
    protected List<PremisesConstructionMaterialDetail> premisesConstructionMaterialDetail;

    /**
     * Gets the value of the premisesTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPremisesTypeText() {
        return premisesTypeText;
    }

    /**
     * Sets the value of the premisesTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPremisesTypeText(DNBDecodedStringType value) {
        this.premisesTypeText = value;
    }

    /**
     * Gets the value of the premisesAreaMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPremisesAreaMeasurement() {
        return premisesAreaMeasurement;
    }

    /**
     * Sets the value of the premisesAreaMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPremisesAreaMeasurement(BigDecimal value) {
        this.premisesAreaMeasurement = value;
    }

    /**
     * Gets the value of the premisesAreaMeasurementReliabilityText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPremisesAreaMeasurementReliabilityText() {
        return premisesAreaMeasurementReliabilityText;
    }

    /**
     * Sets the value of the premisesAreaMeasurementReliabilityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPremisesAreaMeasurementReliabilityText(DNBDecodedStringType value) {
        this.premisesAreaMeasurementReliabilityText = value;
    }

    /**
     * Gets the value of the premisesAreaMeasurementUnitText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPremisesAreaMeasurementUnitText() {
        return premisesAreaMeasurementUnitText;
    }

    /**
     * Sets the value of the premisesAreaMeasurementUnitText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPremisesAreaMeasurementUnitText(DNBDecodedStringType value) {
        this.premisesAreaMeasurementUnitText = value;
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

}
