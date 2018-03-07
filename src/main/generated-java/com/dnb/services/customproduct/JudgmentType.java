
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This section details provides details on the final decision of a court resolving a dispute and determining the rights and obligations of the parties
 *          
 * 
 * <p>Java class for JudgmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JudgmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventBaseType">
 *       &lt;sequence>
 *         &lt;element name="JudgmentAwardAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="RemedyFiled" type="{http://services.dnb.com/CustomProductServiceV2.0}RemedyFiled" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JudgmentType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "judgmentAwardAmount",
    "remedyFiled"
})
public class JudgmentType
    extends LegalEventBaseType
{

    @XmlElement(name = "JudgmentAwardAmount")
    protected AmountType judgmentAwardAmount;
    @XmlElement(name = "RemedyFiled")
    protected List<RemedyFiled> remedyFiled;

    /**
     * Gets the value of the judgmentAwardAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getJudgmentAwardAmount() {
        return judgmentAwardAmount;
    }

    /**
     * Sets the value of the judgmentAwardAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setJudgmentAwardAmount(AmountType value) {
        this.judgmentAwardAmount = value;
    }

    /**
     * Gets the value of the remedyFiled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remedyFiled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemedyFiled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemedyFiled }
     * 
     * 
     */
    public List<RemedyFiled> getRemedyFiled() {
        if (remedyFiled == null) {
            remedyFiled = new ArrayList<RemedyFiled>();
        }
        return this.remedyFiled;
    }

}
