
package com.dnb.services.company;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchResultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchResultDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchDataCriteriaText" type="{http://services.dnb.com/CompanyServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="CandidateMatchedQuantity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MatchCandidate" type="{http://services.dnb.com/CompanyServiceV2.0}MatchResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchResultDetail", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "matchDataCriteriaText",
    "candidateMatchedQuantity",
    "matchCandidate"
})
public class MatchResultDetail {

    @XmlElement(name = "MatchDataCriteriaText")
    protected DNBDecodedStringType matchDataCriteriaText;
    @XmlElement(name = "CandidateMatchedQuantity")
    protected int candidateMatchedQuantity;
    @XmlElement(name = "MatchCandidate")
    protected List<MatchResult> matchCandidate;

    /**
     * Gets the value of the matchDataCriteriaText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getMatchDataCriteriaText() {
        return matchDataCriteriaText;
    }

    /**
     * Sets the value of the matchDataCriteriaText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setMatchDataCriteriaText(DNBDecodedStringType value) {
        this.matchDataCriteriaText = value;
    }

    /**
     * Gets the value of the candidateMatchedQuantity property.
     * 
     */
    public int getCandidateMatchedQuantity() {
        return candidateMatchedQuantity;
    }

    /**
     * Sets the value of the candidateMatchedQuantity property.
     * 
     */
    public void setCandidateMatchedQuantity(int value) {
        this.candidateMatchedQuantity = value;
    }

    /**
     * Gets the value of the matchCandidate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchCandidate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchCandidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchResult }
     * 
     * 
     */
    public List<MatchResult> getMatchCandidate() {
        if (matchCandidate == null) {
            matchCandidate = new ArrayList<MatchResult>();
        }
        return this.matchCandidate;
    }

}
