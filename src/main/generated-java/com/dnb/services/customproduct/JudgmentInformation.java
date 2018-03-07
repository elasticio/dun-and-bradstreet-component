
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the details and the summarized views of decisions made by a court that involves the subject
 *          
 * 
 * <p>Java class for JudgmentInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JudgmentInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JudgmentSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventSummaryType" minOccurs="0"/>
 *         &lt;element name="JudgmentPeriodSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventPeriodSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Judgment" type="{http://services.dnb.com/CustomProductServiceV2.0}JudgmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisclaimerText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType720" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JudgmentInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "judgmentSummary",
    "judgmentPeriodSummary",
    "judgment",
    "disclaimerText"
})
public class JudgmentInformation {

    @XmlElement(name = "JudgmentSummary")
    protected LegalEventSummaryType judgmentSummary;
    @XmlElement(name = "JudgmentPeriodSummary")
    protected List<LegalEventPeriodSummaryType> judgmentPeriodSummary;
    @XmlElement(name = "Judgment")
    protected List<JudgmentType> judgment;
    @XmlElement(name = "DisclaimerText")
    protected String disclaimerText;

    /**
     * Gets the value of the judgmentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEventSummaryType }
     *     
     */
    public LegalEventSummaryType getJudgmentSummary() {
        return judgmentSummary;
    }

    /**
     * Sets the value of the judgmentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEventSummaryType }
     *     
     */
    public void setJudgmentSummary(LegalEventSummaryType value) {
        this.judgmentSummary = value;
    }

    /**
     * Gets the value of the judgmentPeriodSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the judgmentPeriodSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJudgmentPeriodSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEventPeriodSummaryType }
     * 
     * 
     */
    public List<LegalEventPeriodSummaryType> getJudgmentPeriodSummary() {
        if (judgmentPeriodSummary == null) {
            judgmentPeriodSummary = new ArrayList<LegalEventPeriodSummaryType>();
        }
        return this.judgmentPeriodSummary;
    }

    /**
     * Gets the value of the judgment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the judgment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJudgment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JudgmentType }
     * 
     * 
     */
    public List<JudgmentType> getJudgment() {
        if (judgment == null) {
            judgment = new ArrayList<JudgmentType>();
        }
        return this.judgment;
    }

    /**
     * Gets the value of the disclaimerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimerText() {
        return disclaimerText;
    }

    /**
     * Sets the value of the disclaimerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimerText(String value) {
        this.disclaimerText = value;
    }

}
