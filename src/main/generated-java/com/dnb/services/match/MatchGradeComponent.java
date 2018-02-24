
package com.dnb.services.match;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchGradeComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchGradeComponent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchGradeComponentTypeText" type="{http://services.dnb.com/CompanyServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="MatchGradeComponentRating" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MatchGradeComponentScore" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="24"/>
 *               &lt;fractionDigits value="21"/>
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
@XmlType(name = "MatchGradeComponent", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "matchGradeComponentTypeText",
    "matchGradeComponentRating",
    "matchGradeComponentScore"
})
public class MatchGradeComponent {

    @XmlElement(name = "MatchGradeComponentTypeText", required = true)
    protected DNBDecodedStringType matchGradeComponentTypeText;
    @XmlElement(name = "MatchGradeComponentRating")
    protected String matchGradeComponentRating;
    @XmlElement(name = "MatchGradeComponentScore")
    protected BigDecimal matchGradeComponentScore;

    /**
     * Gets the value of the matchGradeComponentTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getMatchGradeComponentTypeText() {
        return matchGradeComponentTypeText;
    }

    /**
     * Sets the value of the matchGradeComponentTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setMatchGradeComponentTypeText(DNBDecodedStringType value) {
        this.matchGradeComponentTypeText = value;
    }

    /**
     * Gets the value of the matchGradeComponentRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchGradeComponentRating() {
        return matchGradeComponentRating;
    }

    /**
     * Sets the value of the matchGradeComponentRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchGradeComponentRating(String value) {
        this.matchGradeComponentRating = value;
    }

    /**
     * Gets the value of the matchGradeComponentScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMatchGradeComponentScore() {
        return matchGradeComponentScore;
    }

    /**
     * Sets the value of the matchGradeComponentScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMatchGradeComponentScore(BigDecimal value) {
        this.matchGradeComponentScore = value;
    }

}
