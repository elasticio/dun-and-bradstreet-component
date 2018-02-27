
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryPointValidationStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryPointValidationStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="64"/>
 *     &lt;enumeration value="Delivery Point Validated"/>
 *     &lt;enumeration value="DPV STE Bad"/>
 *     &lt;enumeration value="Invalid Address"/>
 *     &lt;enumeration value="Missing STE"/>
 *     &lt;enumeration value="No DPV"/>
 *     &lt;enumeration value="No DPV Address"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryPointValidationStatusEnum", namespace = "http://services.dnb.com/CompanyServiceV2.0")
@XmlEnum
public enum DeliveryPointValidationStatusEnum {

    @XmlEnumValue("Delivery Point Validated")
    DELIVERY_POINT_VALIDATED("Delivery Point Validated"),
    @XmlEnumValue("DPV STE Bad")
    DPV_STE_BAD("DPV STE Bad"),
    @XmlEnumValue("Invalid Address")
    INVALID_ADDRESS("Invalid Address"),
    @XmlEnumValue("Missing STE")
    MISSING_STE("Missing STE"),
    @XmlEnumValue("No DPV")
    NO_DPV("No DPV"),
    @XmlEnumValue("No DPV Address")
    NO_DPV_ADDRESS("No DPV Address");
    private final String value;

    DeliveryPointValidationStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryPointValidationStatusEnum fromValue(String v) {
        for (DeliveryPointValidationStatusEnum c: DeliveryPointValidationStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
