
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplierStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AppealDeclined"/>
 *     &lt;enumeration value="Approved"/>
 *     &lt;enumeration value="Declined"/>
 *     &lt;enumeration value="DismissedAsTPI"/>
 *     &lt;enumeration value="PendingAdditionalScreening"/>
 *     &lt;enumeration value="PendingApproval"/>
 *     &lt;enumeration value="PendingBusinessUnitReview"/>
 *     &lt;enumeration value="PendingReview"/>
 *     &lt;enumeration value="PendingScreeningSelection"/>
 *     &lt;enumeration value="PendingSupplierRegistration"/>
 *     &lt;enumeration value="UnderAppeal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupplierStatusEnum", namespace = "http://services.dnb.com/CustomProductServiceV2.0")
@XmlEnum
public enum SupplierStatusEnum {

    @XmlEnumValue("AppealDeclined")
    APPEAL_DECLINED("AppealDeclined"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Declined")
    DECLINED("Declined"),
    @XmlEnumValue("DismissedAsTPI")
    DISMISSED_AS_TPI("DismissedAsTPI"),
    @XmlEnumValue("PendingAdditionalScreening")
    PENDING_ADDITIONAL_SCREENING("PendingAdditionalScreening"),
    @XmlEnumValue("PendingApproval")
    PENDING_APPROVAL("PendingApproval"),
    @XmlEnumValue("PendingBusinessUnitReview")
    PENDING_BUSINESS_UNIT_REVIEW("PendingBusinessUnitReview"),
    @XmlEnumValue("PendingReview")
    PENDING_REVIEW("PendingReview"),
    @XmlEnumValue("PendingScreeningSelection")
    PENDING_SCREENING_SELECTION("PendingScreeningSelection"),
    @XmlEnumValue("PendingSupplierRegistration")
    PENDING_SUPPLIER_REGISTRATION("PendingSupplierRegistration"),
    @XmlEnumValue("UnderAppeal")
    UNDER_APPEAL("UnderAppeal");
    private final String value;

    SupplierStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupplierStatusEnum fromValue(String v) {
        for (SupplierStatusEnum c: SupplierStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
