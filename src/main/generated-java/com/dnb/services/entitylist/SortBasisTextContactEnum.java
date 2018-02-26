
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortBasisTextContactEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortBasisTextContactEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ConsolidatedEmployeeQuantity"/>
 *     &lt;enumeration value="DUNSNumber"/>
 *     &lt;enumeration value="FirstName"/>
 *     &lt;enumeration value="FullName"/>
 *     &lt;enumeration value="LastName"/>
 *     &lt;enumeration value="ManagementResponsibilityCodeText"/>
 *     &lt;enumeration value="OrganizationPrimaryName"/>
 *     &lt;enumeration value="SalesRevenueAmount"/>
 *     &lt;enumeration value="Relevancy"/>
 *     &lt;enumeration value="JobRanking"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortBasisTextContactEnum", namespace = "http://services.dnb.com/EntityListServiceV2.0")
@XmlEnum
public enum SortBasisTextContactEnum {

    @XmlEnumValue("ConsolidatedEmployeeQuantity")
    CONSOLIDATED_EMPLOYEE_QUANTITY("ConsolidatedEmployeeQuantity"),
    @XmlEnumValue("DUNSNumber")
    DUNS_NUMBER("DUNSNumber"),
    @XmlEnumValue("FirstName")
    FIRST_NAME("FirstName"),
    @XmlEnumValue("FullName")
    FULL_NAME("FullName"),
    @XmlEnumValue("LastName")
    LAST_NAME("LastName"),
    @XmlEnumValue("ManagementResponsibilityCodeText")
    MANAGEMENT_RESPONSIBILITY_CODE_TEXT("ManagementResponsibilityCodeText"),
    @XmlEnumValue("OrganizationPrimaryName")
    ORGANIZATION_PRIMARY_NAME("OrganizationPrimaryName"),
    @XmlEnumValue("SalesRevenueAmount")
    SALES_REVENUE_AMOUNT("SalesRevenueAmount"),
    @XmlEnumValue("Relevancy")
    RELEVANCY("Relevancy"),
    @XmlEnumValue("JobRanking")
    JOB_RANKING("JobRanking");
    private final String value;

    SortBasisTextContactEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortBasisTextContactEnum fromValue(String v) {
        for (SortBasisTextContactEnum c: SortBasisTextContactEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
