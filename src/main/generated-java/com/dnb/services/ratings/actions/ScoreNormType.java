
package com.dnb.services.ratings.actions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScoreNormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoreNormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScoreModelVersionNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RiskIncidencePercentageIndustryNorm" type="{http://services.dnb.com/AssessmentProductServiceV2.0}NormType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreNormType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "scoreModelVersionNumber",
    "riskIncidencePercentageIndustryNorm"
})
public class ScoreNormType {

    @XmlElement(name = "ScoreModelVersionNumber")
    protected String scoreModelVersionNumber;
    @XmlElement(name = "RiskIncidencePercentageIndustryNorm")
    protected List<NormType> riskIncidencePercentageIndustryNorm;

    /**
     * Gets the value of the scoreModelVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreModelVersionNumber() {
        return scoreModelVersionNumber;
    }

    /**
     * Sets the value of the scoreModelVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreModelVersionNumber(String value) {
        this.scoreModelVersionNumber = value;
    }

    /**
     * Gets the value of the riskIncidencePercentageIndustryNorm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskIncidencePercentageIndustryNorm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskIncidencePercentageIndustryNorm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NormType }
     * 
     * 
     */
    public List<NormType> getRiskIncidencePercentageIndustryNorm() {
        if (riskIncidencePercentageIndustryNorm == null) {
            riskIncidencePercentageIndustryNorm = new ArrayList<NormType>();
        }
        return this.riskIncidencePercentageIndustryNorm;
    }

}
