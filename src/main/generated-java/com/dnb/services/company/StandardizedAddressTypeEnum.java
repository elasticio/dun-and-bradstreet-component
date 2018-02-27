
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardizedAddressTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandardizedAddressTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Firm"/>
 *     &lt;enumeration value="General Delivery"/>
 *     &lt;enumeration value="High Rise"/>
 *     &lt;enumeration value="Military"/>
 *     &lt;enumeration value="PO Box"/>
 *     &lt;enumeration value="Rural or Highway Route"/>
 *     &lt;enumeration value="Street"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StandardizedAddressTypeEnum", namespace = "http://services.dnb.com/CompanyServiceV2.0")
@XmlEnum
public enum StandardizedAddressTypeEnum {

    @XmlEnumValue("Firm")
    FIRM("Firm"),
    @XmlEnumValue("General Delivery")
    GENERAL_DELIVERY("General Delivery"),
    @XmlEnumValue("High Rise")
    HIGH_RISE("High Rise"),
    @XmlEnumValue("Military")
    MILITARY("Military"),
    @XmlEnumValue("PO Box")
    PO_BOX("PO Box"),
    @XmlEnumValue("Rural or Highway Route")
    RURAL_OR_HIGHWAY_ROUTE("Rural or Highway Route"),
    @XmlEnumValue("Street")
    STREET("Street"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    StandardizedAddressTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardizedAddressTypeEnum fromValue(String v) {
        for (StandardizedAddressTypeEnum c: StandardizedAddressTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
