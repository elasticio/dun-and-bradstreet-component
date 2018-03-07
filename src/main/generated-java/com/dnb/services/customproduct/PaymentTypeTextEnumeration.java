
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTypeTextEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTypeTextEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Customer paid"/>
 *     &lt;enumeration value="Supplier paid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentTypeTextEnumeration", namespace = "http://services.dnb.com/CustomProductServiceV2.0")
@XmlEnum
public enum PaymentTypeTextEnumeration {

    @XmlEnumValue("Customer paid")
    CUSTOMER_PAID("Customer paid"),
    @XmlEnumValue("Supplier paid")
    SUPPLIER_PAID("Supplier paid");
    private final String value;

    PaymentTypeTextEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTypeTextEnumeration fromValue(String v) {
        for (PaymentTypeTextEnumeration c: PaymentTypeTextEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
