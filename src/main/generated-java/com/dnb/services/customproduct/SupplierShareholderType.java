
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the individual or institution (including a corporation) that legally owns a share of stock in this supplier which can be a public or private corporation.
 *          
 * 
 * <p>Java class for SupplierShareholderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierShareholderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}ShareholderForRegisterSupplier">
 *       &lt;sequence>
 *         &lt;element name="SubjectTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="LitigationDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}LawSuitType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InternetReferenceDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}InternetReferenceDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierShareholderType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "subjectTypeText",
    "litigationDetail",
    "internetReferenceDetail"
})
public class SupplierShareholderType
    extends ShareholderForRegisterSupplier
{

    @XmlElement(name = "SubjectTypeText")
    protected DNBDecodedStringType subjectTypeText;
    @XmlElement(name = "LitigationDetail")
    protected List<LawSuitType> litigationDetail;
    @XmlElement(name = "InternetReferenceDetail")
    protected List<InternetReferenceDetail> internetReferenceDetail;

    /**
     * Gets the value of the subjectTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getSubjectTypeText() {
        return subjectTypeText;
    }

    /**
     * Sets the value of the subjectTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setSubjectTypeText(DNBDecodedStringType value) {
        this.subjectTypeText = value;
    }

    /**
     * Gets the value of the litigationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the litigationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLitigationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LawSuitType }
     * 
     * 
     */
    public List<LawSuitType> getLitigationDetail() {
        if (litigationDetail == null) {
            litigationDetail = new ArrayList<LawSuitType>();
        }
        return this.litigationDetail;
    }

    /**
     * Gets the value of the internetReferenceDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internetReferenceDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternetReferenceDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternetReferenceDetail }
     * 
     * 
     */
    public List<InternetReferenceDetail> getInternetReferenceDetail() {
        if (internetReferenceDetail == null) {
            internetReferenceDetail = new ArrayList<InternetReferenceDetail>();
        }
        return this.internetReferenceDetail;
    }

}
