
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InclusionDataEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InclusionDataEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IncludeIncompleteData"/>
 *     &lt;enumeration value="IncludeNonMarketableSubject"/>
 *     &lt;enumeration value="IncludeUndeliverableAddressSubject"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InclusionDataEnum", namespace = "http://services.dnb.com/CustomProductServiceV2.0")
@XmlEnum
public enum InclusionDataEnum {

    @XmlEnumValue("IncludeIncompleteData")
    INCLUDE_INCOMPLETE_DATA("IncludeIncompleteData"),
    @XmlEnumValue("IncludeNonMarketableSubject")
    INCLUDE_NON_MARKETABLE_SUBJECT("IncludeNonMarketableSubject"),
    @XmlEnumValue("IncludeUndeliverableAddressSubject")
    INCLUDE_UNDELIVERABLE_ADDRESS_SUBJECT("IncludeUndeliverableAddressSubject");
    private final String value;

    InclusionDataEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InclusionDataEnum fromValue(String v) {
        for (InclusionDataEnum c: InclusionDataEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
