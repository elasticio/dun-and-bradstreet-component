
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This includes candidates that do match the specified navigator categories, either because the required data is absent or because it does not fit into any navigator category.
 * 
 * <p>Java class for UnmatchedCandidatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnmatchedCandidatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CandidateReturnedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnmatchedCandidatesType", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "candidateReturnedQuantity"
})
public class UnmatchedCandidatesType {

    @XmlElement(name = "CandidateReturnedQuantity")
    protected int candidateReturnedQuantity;

    /**
     * Gets the value of the candidateReturnedQuantity property.
     * 
     */
    public int getCandidateReturnedQuantity() {
        return candidateReturnedQuantity;
    }

    /**
     * Sets the value of the candidateReturnedQuantity property.
     * 
     */
    public void setCandidateReturnedQuantity(int value) {
        this.candidateReturnedQuantity = value;
    }

}
