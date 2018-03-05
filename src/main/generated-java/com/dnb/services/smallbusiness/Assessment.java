
package com.dnb.services.smallbusiness;

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
 *         &lt;element name="SBRIOriginationCreditCardScore" type="{http://services.dnb.com/SBRIProductServiceV2.0}SBRIScore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SBRIOriginationLeaseScore" type="{http://services.dnb.com/SBRIProductServiceV2.0}SBRIScore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SBRIOriginationLoanScore" type="{http://services.dnb.com/SBRIProductServiceV2.0}SBRIScore" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assessment", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "sbriOriginationCreditCardScore",
    "sbriOriginationLeaseScore",
    "sbriOriginationLoanScore"
})
public class Assessment {

    @XmlElement(name = "SBRIOriginationCreditCardScore")
    protected List<SBRIScore> sbriOriginationCreditCardScore;
    @XmlElement(name = "SBRIOriginationLeaseScore")
    protected List<SBRIScore> sbriOriginationLeaseScore;
    @XmlElement(name = "SBRIOriginationLoanScore")
    protected List<SBRIScore> sbriOriginationLoanScore;

    /**
     * Gets the value of the sbriOriginationCreditCardScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbriOriginationCreditCardScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSBRIOriginationCreditCardScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SBRIScore }
     * 
     * 
     */
    public List<SBRIScore> getSBRIOriginationCreditCardScore() {
        if (sbriOriginationCreditCardScore == null) {
            sbriOriginationCreditCardScore = new ArrayList<SBRIScore>();
        }
        return this.sbriOriginationCreditCardScore;
    }

    /**
     * Gets the value of the sbriOriginationLeaseScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbriOriginationLeaseScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSBRIOriginationLeaseScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SBRIScore }
     * 
     * 
     */
    public List<SBRIScore> getSBRIOriginationLeaseScore() {
        if (sbriOriginationLeaseScore == null) {
            sbriOriginationLeaseScore = new ArrayList<SBRIScore>();
        }
        return this.sbriOriginationLeaseScore;
    }

    /**
     * Gets the value of the sbriOriginationLoanScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbriOriginationLoanScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSBRIOriginationLoanScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SBRIScore }
     * 
     * 
     */
    public List<SBRIScore> getSBRIOriginationLoanScore() {
        if (sbriOriginationLoanScore == null) {
            sbriOriginationLoanScore = new ArrayList<SBRIScore>();
        }
        return this.sbriOriginationLoanScore;
    }

}
