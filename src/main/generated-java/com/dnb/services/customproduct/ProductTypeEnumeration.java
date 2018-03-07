
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Marketing"/>
 *     &lt;enumeration value="Risk"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductTypeEnumeration", namespace = "http://services.dnb.com/CustomProductServiceV2.0")
@XmlEnum
public enum ProductTypeEnumeration {

    @XmlEnumValue("Marketing")
    MARKETING("Marketing"),
    @XmlEnumValue("Risk")
    RISK("Risk");
    private final String value;

    ProductTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductTypeEnumeration fromValue(String v) {
        for (ProductTypeEnumeration c: ProductTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
