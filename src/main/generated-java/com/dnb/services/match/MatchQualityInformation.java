
package com.dnb.services.match;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchQualityInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchQualityInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfidenceCodeValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MatchBasis" type="{http://services.dnb.com/CompanyServiceV2.0}MatchBasis" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MatchGradeText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MatchGradeComponentCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MatchGradeComponent" type="{http://services.dnb.com/CompanyServiceV2.0}MatchGradeComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MatchDataProfileText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="28"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MatchDataProfileComponentCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MatchDataProfileComponent" type="{http://services.dnb.com/CompanyServiceV2.0}MatchDataProfileComponent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchQualityInformation", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "confidenceCodeValue",
    "matchBasis",
    "matchGradeText",
    "matchGradeComponentCount",
    "matchGradeComponent",
    "matchDataProfileText",
    "matchDataProfileComponentCount",
    "matchDataProfileComponent"
})
public class MatchQualityInformation {

    @XmlElement(name = "ConfidenceCodeValue")
    protected Integer confidenceCodeValue;
    @XmlElement(name = "MatchBasis")
    protected List<MatchBasis> matchBasis;
    @XmlElement(name = "MatchGradeText")
    protected String matchGradeText;
    @XmlElement(name = "MatchGradeComponentCount")
    protected Integer matchGradeComponentCount;
    @XmlElement(name = "MatchGradeComponent")
    protected List<MatchGradeComponent> matchGradeComponent;
    @XmlElement(name = "MatchDataProfileText")
    protected String matchDataProfileText;
    @XmlElement(name = "MatchDataProfileComponentCount")
    protected Integer matchDataProfileComponentCount;
    @XmlElement(name = "MatchDataProfileComponent")
    protected List<MatchDataProfileComponent> matchDataProfileComponent;

    /**
     * Gets the value of the confidenceCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfidenceCodeValue() {
        return confidenceCodeValue;
    }

    /**
     * Sets the value of the confidenceCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfidenceCodeValue(Integer value) {
        this.confidenceCodeValue = value;
    }

    /**
     * Gets the value of the matchBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchBasis }
     * 
     * 
     */
    public List<MatchBasis> getMatchBasis() {
        if (matchBasis == null) {
            matchBasis = new ArrayList<MatchBasis>();
        }
        return this.matchBasis;
    }

    /**
     * Gets the value of the matchGradeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchGradeText() {
        return matchGradeText;
    }

    /**
     * Sets the value of the matchGradeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchGradeText(String value) {
        this.matchGradeText = value;
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
     * Gets the value of the matchGradeComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchGradeComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchGradeComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchGradeComponent }
     * 
     * 
     */
    public List<MatchGradeComponent> getMatchGradeComponent() {
        if (matchGradeComponent == null) {
            matchGradeComponent = new ArrayList<MatchGradeComponent>();
        }
        return this.matchGradeComponent;
    }

    /**
     * Gets the value of the matchDataProfileText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchDataProfileText() {
        return matchDataProfileText;
    }

    /**
     * Sets the value of the matchDataProfileText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchDataProfileText(String value) {
        this.matchDataProfileText = value;
    }

    /**
     * Gets the value of the matchDataProfileComponentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMatchDataProfileComponentCount() {
        return matchDataProfileComponentCount;
    }

    /**
     * Sets the value of the matchDataProfileComponentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMatchDataProfileComponentCount(Integer value) {
        this.matchDataProfileComponentCount = value;
    }

    /**
     * Gets the value of the matchDataProfileComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchDataProfileComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchDataProfileComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchDataProfileComponent }
     * 
     * 
     */
    public List<MatchDataProfileComponent> getMatchDataProfileComponent() {
        if (matchDataProfileComponent == null) {
            matchDataProfileComponent = new ArrayList<MatchDataProfileComponent>();
        }
        return this.matchDataProfileComponent;
    }

}
