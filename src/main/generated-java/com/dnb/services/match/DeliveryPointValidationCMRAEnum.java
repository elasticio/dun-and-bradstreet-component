
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryPointValidationCMRAEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryPointValidationCMRAEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="64"/>
 *     &lt;enumeration value="Delivery Point Validated"/>
 *     &lt;enumeration value="Invalid Address"/>
 *     &lt;enumeration value="No DPV"/>
 *     &lt;enumeration value="No DPV Address"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryPointValidationCMRAEnum", namespace = "http://services.dnb.com/CompanyServiceV2.0")
@XmlEnum
public enum DeliveryPointValidationCMRAEnum {

    @XmlEnumValue("Delivery Point Validated")
    DELIVERY_POINT_VALIDATED("Delivery Point Validated"),
    @XmlEnumValue("Invalid Address")
    INVALID_ADDRESS("Invalid Address"),
    @XmlEnumValue("No DPV")
    NO_DPV("No DPV"),
    @XmlEnumValue("No DPV Address")
    NO_DPV_ADDRESS("No DPV Address");
    private final String value;

    DeliveryPointValidationCMRAEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryPointValidationCMRAEnum fromValue(String v) {
        for (DeliveryPointValidationCMRAEnum c: DeliveryPointValidationCMRAEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
