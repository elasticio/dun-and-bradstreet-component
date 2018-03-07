
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierListInquiryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierListInquiryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueueDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}QueueDetail"/>
 *         &lt;element name="DivisionDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}DivisionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierListInquiryDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "queueDetail",
    "divisionDetail"
})
public class SupplierListInquiryDetail {

    @XmlElement(name = "QueueDetail", required = true)
    protected QueueDetail queueDetail;
    @XmlElement(name = "DivisionDetail")
    protected List<DivisionDetail> divisionDetail;

    /**
     * Gets the value of the queueDetail property.
     * 
     * @return
     *     possible object is
     *     {@link QueueDetail }
     *     
     */
    public QueueDetail getQueueDetail() {
        return queueDetail;
    }

    /**
     * Sets the value of the queueDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueDetail }
     *     
     */
    public void setQueueDetail(QueueDetail value) {
        this.queueDetail = value;
    }

    /**
     * Gets the value of the divisionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the divisionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDivisionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DivisionDetail }
     * 
     * 
     */
    public List<DivisionDetail> getDivisionDetail() {
        if (divisionDetail == null) {
            divisionDetail = new ArrayList<DivisionDetail>();
        }
        return this.divisionDetail;
    }

}
