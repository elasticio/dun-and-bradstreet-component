
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Records D&amp;amp;B&apos;s proprietary analytics which compares the most predictive organization risk indicators to deliver a highly reliable assessment of the probability that an organization will go out of business within the next 12 months.
 *          
 * 
 * <p>Java class for DNBViabilityRatingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBViabilityRatingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DNBViabilityRating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ViabilityScore" type="{http://services.dnb.com/AssessmentProductServiceV2.0}OverallViabilityScoreType" minOccurs="0"/>
 *         &lt;element name="PortfolioComparisonScore" type="{http://services.dnb.com/AssessmentProductServiceV2.0}PortfolioComparisonScoreType" minOccurs="0"/>
 *         &lt;element name="DataDepthDetail" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DataDepthDetailType" minOccurs="0"/>
 *         &lt;element name="OrganizationProfileDetail" type="{http://services.dnb.com/AssessmentProductServiceV2.0}OrganizationProfileDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBViabilityRatingType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "ratingDate",
    "dnbViabilityRating",
    "viabilityScore",
    "portfolioComparisonScore",
    "dataDepthDetail",
    "organizationProfileDetail"
})
public class DNBViabilityRatingType {

    @XmlElement(name = "RatingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ratingDate;
    @XmlElement(name = "DNBViabilityRating", required = true)
    protected String dnbViabilityRating;
    @XmlElement(name = "ViabilityScore")
    protected OverallViabilityScoreType viabilityScore;
    @XmlElement(name = "PortfolioComparisonScore")
    protected PortfolioComparisonScoreType portfolioComparisonScore;
    @XmlElement(name = "DataDepthDetail")
    protected DataDepthDetailType dataDepthDetail;
    @XmlElement(name = "OrganizationProfileDetail")
    protected OrganizationProfileDetailType organizationProfileDetail;

    /**
     * Gets the value of the ratingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRatingDate() {
        return ratingDate;
    }

    /**
     * Sets the value of the ratingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRatingDate(XMLGregorianCalendar value) {
        this.ratingDate = value;
    }

    /**
     * Gets the value of the dnbViabilityRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBViabilityRating() {
        return dnbViabilityRating;
    }

    /**
     * Sets the value of the dnbViabilityRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBViabilityRating(String value) {
        this.dnbViabilityRating = value;
    }

    /**
     * Gets the value of the viabilityScore property.
     * 
     * @return
     *     possible object is
     *     {@link OverallViabilityScoreType }
     *     
     */
    public OverallViabilityScoreType getViabilityScore() {
        return viabilityScore;
    }

    /**
     * Sets the value of the viabilityScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallViabilityScoreType }
     *     
     */
    public void setViabilityScore(OverallViabilityScoreType value) {
        this.viabilityScore = value;
    }

    /**
     * Gets the value of the portfolioComparisonScore property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioComparisonScoreType }
     *     
     */
    public PortfolioComparisonScoreType getPortfolioComparisonScore() {
        return portfolioComparisonScore;
    }

    /**
     * Sets the value of the portfolioComparisonScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioComparisonScoreType }
     *     
     */
    public void setPortfolioComparisonScore(PortfolioComparisonScoreType value) {
        this.portfolioComparisonScore = value;
    }

    /**
     * Gets the value of the dataDepthDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DataDepthDetailType }
     *     
     */
    public DataDepthDetailType getDataDepthDetail() {
        return dataDepthDetail;
    }

    /**
     * Sets the value of the dataDepthDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataDepthDetailType }
     *     
     */
    public void setDataDepthDetail(DataDepthDetailType value) {
        this.dataDepthDetail = value;
    }

    /**
     * Gets the value of the organizationProfileDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationProfileDetailType }
     *     
     */
    public OrganizationProfileDetailType getOrganizationProfileDetail() {
        return organizationProfileDetail;
    }

    /**
     * Sets the value of the organizationProfileDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationProfileDetailType }
     *     
     */
    public void setOrganizationProfileDetail(OrganizationProfileDetailType value) {
        this.organizationProfileDetail = value;
    }

}
