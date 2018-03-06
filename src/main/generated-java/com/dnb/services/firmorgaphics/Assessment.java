
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Assessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assessment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HistoryRatingText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="CommercialCreditScore" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}CommercialCreditScoreType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MarketingSegmentationClusterValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USPatriotActComplianceRiskScore" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}USPatriotActComplianceRiskScore" minOccurs="0"/>
 *         &lt;element name="ProofOfRightCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assessment", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "historyRatingText",
    "commercialCreditScore",
    "marketingSegmentationClusterValue",
    "usPatriotActComplianceRiskScore",
    "proofOfRightCount"
})
public class Assessment {

    @XmlElement(name = "HistoryRatingText")
    protected DNBDecodedStringType historyRatingText;
    @XmlElement(name = "CommercialCreditScore")
    protected List<CommercialCreditScoreType> commercialCreditScore;
    @XmlElement(name = "MarketingSegmentationClusterValue")
    protected Integer marketingSegmentationClusterValue;
    @XmlElement(name = "USPatriotActComplianceRiskScore")
    protected USPatriotActComplianceRiskScore usPatriotActComplianceRiskScore;
    @XmlElement(name = "ProofOfRightCount")
    protected Integer proofOfRightCount;

    /**
     * Gets the value of the historyRatingText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getHistoryRatingText() {
        return historyRatingText;
    }

    /**
     * Sets the value of the historyRatingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setHistoryRatingText(DNBDecodedStringType value) {
        this.historyRatingText = value;
    }

    /**
     * Gets the value of the commercialCreditScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialCreditScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialCreditScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommercialCreditScoreType }
     * 
     * 
     */
    public List<CommercialCreditScoreType> getCommercialCreditScore() {
        if (commercialCreditScore == null) {
            commercialCreditScore = new ArrayList<CommercialCreditScoreType>();
        }
        return this.commercialCreditScore;
    }

    /**
     * Gets the value of the marketingSegmentationClusterValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarketingSegmentationClusterValue() {
        return marketingSegmentationClusterValue;
    }

    /**
     * Sets the value of the marketingSegmentationClusterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarketingSegmentationClusterValue(Integer value) {
        this.marketingSegmentationClusterValue = value;
    }

    /**
     * Gets the value of the usPatriotActComplianceRiskScore property.
     * 
     * @return
     *     possible object is
     *     {@link USPatriotActComplianceRiskScore }
     *     
     */
    public USPatriotActComplianceRiskScore getUSPatriotActComplianceRiskScore() {
        return usPatriotActComplianceRiskScore;
    }

    /**
     * Sets the value of the usPatriotActComplianceRiskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link USPatriotActComplianceRiskScore }
     *     
     */
    public void setUSPatriotActComplianceRiskScore(USPatriotActComplianceRiskScore value) {
        this.usPatriotActComplianceRiskScore = value;
    }

    /**
     * Gets the value of the proofOfRightCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProofOfRightCount() {
        return proofOfRightCount;
    }

    /**
     * Sets the value of the proofOfRightCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProofOfRightCount(Integer value) {
        this.proofOfRightCount = value;
    }

}
