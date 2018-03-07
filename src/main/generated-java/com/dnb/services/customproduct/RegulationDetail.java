
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegulatorDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}RegulatorDetail" minOccurs="0"/>
 *         &lt;element name="MatchCandidate" type="{http://services.dnb.com/CustomProductServiceV2.0}MatchResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulationDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "regulatorDetail",
    "matchCandidate"
})
public class RegulationDetail {

    @XmlElement(name = "RegulatorDetail")
    protected RegulatorDetail regulatorDetail;
    @XmlElement(name = "MatchCandidate")
    protected List<MatchResult> matchCandidate;

    /**
     * Gets the value of the regulatorDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatorDetail }
     *     
     */
    public RegulatorDetail getRegulatorDetail() {
        return regulatorDetail;
    }

    /**
     * Sets the value of the regulatorDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatorDetail }
     *     
     */
    public void setRegulatorDetail(RegulatorDetail value) {
        this.regulatorDetail = value;
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
