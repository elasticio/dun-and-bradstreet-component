
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchGradeSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchGradeSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchGradeComponentRating" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="MatchGradeComponentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MatchGradeComponentTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SignalsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StrongSignalsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchGradeSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "matchGradeComponentRating",
    "matchGradeComponentCount",
    "matchGradeComponentTypeText",
    "signalsCount",
    "strongSignalsCount"
})
public class MatchGradeSummaryType {

    @XmlElement(name = "MatchGradeComponentRating", required = true)
    protected List<String> matchGradeComponentRating;
    @XmlElement(name = "MatchGradeComponentCount")
    protected Integer matchGradeComponentCount;
    @XmlElement(name = "MatchGradeComponentTypeText")
    protected List<DNBDecodedStringType> matchGradeComponentTypeText;
    @XmlElement(name = "SignalsCount")
    protected Integer signalsCount;
    @XmlElement(name = "StrongSignalsCount")
    protected Integer strongSignalsCount;

    /**
     * Gets the value of the matchGradeComponentRating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchGradeComponentRating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchGradeComponentRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMatchGradeComponentRating() {
        if (matchGradeComponentRating == null) {
            matchGradeComponentRating = new ArrayList<String>();
        }
        return this.matchGradeComponentRating;
    }

    /**
     * Gets the value of the matchGradeComponentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMatchGradeComponentCount() {
        return matchGradeComponentCount;
    }

    /**
     * Sets the value of the matchGradeComponentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMatchGradeComponentCount(Integer value) {
        this.matchGradeComponentCount = value;
    }

    /**
     * Gets the value of the matchGradeComponentTypeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchGradeComponentTypeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchGradeComponentTypeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBDecodedStringType }
     * 
     * 
     */
    public List<DNBDecodedStringType> getMatchGradeComponentTypeText() {
        if (matchGradeComponentTypeText == null) {
            matchGradeComponentTypeText = new ArrayList<DNBDecodedStringType>();
        }
        return this.matchGradeComponentTypeText;
    }

    /**
     * Gets the value of the signalsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignalsCount() {
        return signalsCount;
    }

    /**
     * Sets the value of the signalsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignalsCount(Integer value) {
        this.signalsCount = value;
    }

    /**
     * Gets the value of the strongSignalsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStrongSignalsCount() {
        return strongSignalsCount;
    }

    /**
     * Sets the value of the strongSignalsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrongSignalsCount(Integer value) {
        this.strongSignalsCount = value;
    }

}
