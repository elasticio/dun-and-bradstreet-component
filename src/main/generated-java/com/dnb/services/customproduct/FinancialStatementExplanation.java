
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of explanations of aspects of the Financial Statement, e.g., the method used to value inventory, the items that have been reported as marketable securities. This does not include general or broad explanations that pertain to the whole statement; only explanations that relate to specific items within the statement.
 *          
 * 
 * <p>Java class for FinancialStatementExplanation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialStatementExplanation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExplanationText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType256" maxOccurs="unbounded"/>
 *         &lt;element name="ExplanationTextTypeDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialStatementExplanation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "explanationText",
    "explanationTextTypeDescription"
})
public class FinancialStatementExplanation {

    @XmlElement(name = "ExplanationText", required = true)
    protected List<DNBStringType256> explanationText;
    @XmlElement(name = "ExplanationTextTypeDescription", required = true)
    protected DNBDecodedStringType explanationTextTypeDescription;

    /**
     * Gets the value of the explanationText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the explanationText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExplanationText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBStringType256 }
     * 
     * 
     */
    public List<DNBStringType256> getExplanationText() {
        if (explanationText == null) {
            explanationText = new ArrayList<DNBStringType256>();
        }
        return this.explanationText;
    }

    /**
     * Gets the value of the explanationTextTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getExplanationTextTypeDescription() {
        return explanationTextTypeDescription;
    }

    /**
     * Sets the value of the explanationTextTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setExplanationTextTypeDescription(DNBDecodedStringType value) {
        this.explanationTextTypeDescription = value;
    }

}
