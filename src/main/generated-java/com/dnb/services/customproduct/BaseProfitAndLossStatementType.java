
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseProfitAndLossStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseProfitAndLossStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatementItem" type="{http://services.dnb.com/CustomProductServiceV2.0}StatementItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProfitAndLossStatementText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProjectedAnnualSalesText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FreeFormStatementItem" type="{http://services.dnb.com/CustomProductServiceV2.0}FreeFormStatementItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseProfitAndLossStatementType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "statementItem",
    "profitAndLossStatementText",
    "projectedAnnualSalesText",
    "employeeQuantity",
    "freeFormStatementItem"
})
public class BaseProfitAndLossStatementType {

    @XmlElement(name = "StatementItem")
    protected List<StatementItem> statementItem;
    @XmlElement(name = "ProfitAndLossStatementText")
    protected String profitAndLossStatementText;
    @XmlElement(name = "ProjectedAnnualSalesText")
    protected String projectedAnnualSalesText;
    @XmlElement(name = "EmployeeQuantity")
    protected Integer employeeQuantity;
    @XmlElement(name = "FreeFormStatementItem")
    protected List<FreeFormStatementItem> freeFormStatementItem;

    /**
     * Gets the value of the statementItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementItem }
     * 
     * 
     */
    public List<StatementItem> getStatementItem() {
        if (statementItem == null) {
            statementItem = new ArrayList<StatementItem>();
        }
        return this.statementItem;
    }

    /**
     * Gets the value of the profitAndLossStatementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitAndLossStatementText() {
        return profitAndLossStatementText;
    }

    /**
     * Sets the value of the profitAndLossStatementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitAndLossStatementText(String value) {
        this.profitAndLossStatementText = value;
    }

    /**
     * Gets the value of the projectedAnnualSalesText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectedAnnualSalesText() {
        return projectedAnnualSalesText;
    }

    /**
     * Sets the value of the projectedAnnualSalesText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectedAnnualSalesText(String value) {
        this.projectedAnnualSalesText = value;
    }

    /**
     * Gets the value of the employeeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployeeQuantity() {
        return employeeQuantity;
    }

    /**
     * Sets the value of the employeeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployeeQuantity(Integer value) {
        this.employeeQuantity = value;
    }

    /**
     * Gets the value of the freeFormStatementItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeFormStatementItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeFormStatementItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeFormStatementItem }
     * 
     * 
     */
    public List<FreeFormStatementItem> getFreeFormStatementItem() {
        if (freeFormStatementItem == null) {
            freeFormStatementItem = new ArrayList<FreeFormStatementItem>();
        }
        return this.freeFormStatementItem;
    }

}
