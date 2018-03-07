
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data required for notes posted by the users to other users.
 *          
 * 
 * <p>Java class for AddSupplierNotesRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSupplierNotesRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplierDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierDetailForNotes"/>
 *         &lt;element name="NoteDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}NoteDetail" maxOccurs="unbounded"/>
 *         &lt;element name="InquiryReferenceDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}InquiryReferenceDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSupplierNotesRequestDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "supplierDetail",
    "noteDetail",
    "inquiryReferenceDetail"
})
public class AddSupplierNotesRequestDetail {

    @XmlElement(name = "SupplierDetail", required = true)
    protected SupplierDetailForNotes supplierDetail;
    @XmlElement(name = "NoteDetail", required = true)
    protected List<NoteDetail> noteDetail;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the supplierDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierDetailForNotes }
     *     
     */
    public SupplierDetailForNotes getSupplierDetail() {
        return supplierDetail;
    }

    /**
     * Sets the value of the supplierDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierDetailForNotes }
     *     
     */
    public void setSupplierDetail(SupplierDetailForNotes value) {
        this.supplierDetail = value;
    }

    /**
     * Gets the value of the noteDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noteDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteDetail }
     * 
     * 
     */
    public List<NoteDetail> getNoteDetail() {
        if (noteDetail == null) {
            noteDetail = new ArrayList<NoteDetail>();
        }
        return this.noteDetail;
    }

    /**
     * Gets the value of the inquiryReferenceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryReferenceDetail }
     *     
     */
    public InquiryReferenceDetail getInquiryReferenceDetail() {
        return inquiryReferenceDetail;
    }

    /**
     * Sets the value of the inquiryReferenceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryReferenceDetail }
     *     
     */
    public void setInquiryReferenceDetail(InquiryReferenceDetail value) {
        this.inquiryReferenceDetail = value;
    }

}
