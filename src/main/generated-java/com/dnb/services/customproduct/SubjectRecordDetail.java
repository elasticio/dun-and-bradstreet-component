
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the workflow details of the supplier record.
 *          
 * 
 * <p>Java class for SubjectRecordDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectRecordDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScreeningConfigurationName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubjectQueueHistoryDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectQueueHistoryDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubjectNoteDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}NoteDetailForResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectRecordDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "screeningConfigurationName",
    "subjectQueueHistoryDetail",
    "subjectNoteDetail"
})
public class SubjectRecordDetail {

    @XmlElement(name = "ScreeningConfigurationName", required = true)
    protected String screeningConfigurationName;
    @XmlElement(name = "SubjectQueueHistoryDetail")
    protected List<SubjectQueueHistoryDetail> subjectQueueHistoryDetail;
    @XmlElement(name = "SubjectNoteDetail")
    protected List<NoteDetailForResponse> subjectNoteDetail;

    /**
     * Gets the value of the screeningConfigurationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreeningConfigurationName() {
        return screeningConfigurationName;
    }

    /**
     * Sets the value of the screeningConfigurationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreeningConfigurationName(String value) {
        this.screeningConfigurationName = value;
    }

    /**
     * Gets the value of the subjectQueueHistoryDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectQueueHistoryDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectQueueHistoryDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectQueueHistoryDetail }
     * 
     * 
     */
    public List<SubjectQueueHistoryDetail> getSubjectQueueHistoryDetail() {
        if (subjectQueueHistoryDetail == null) {
            subjectQueueHistoryDetail = new ArrayList<SubjectQueueHistoryDetail>();
        }
        return this.subjectQueueHistoryDetail;
    }

    /**
     * Gets the value of the subjectNoteDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectNoteDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectNoteDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteDetailForResponse }
     * 
     * 
     */
    public List<NoteDetailForResponse> getSubjectNoteDetail() {
        if (subjectNoteDetail == null) {
            subjectNoteDetail = new ArrayList<NoteDetailForResponse>();
        }
        return this.subjectNoteDetail;
    }

}
