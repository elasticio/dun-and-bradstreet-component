
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfSizeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitOfSizeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SingleUnits"/>
 *     &lt;enumeration value="Tens"/>
 *     &lt;enumeration value="Hundred"/>
 *     &lt;enumeration value="Thousand"/>
 *     &lt;enumeration value="Million"/>
 *     &lt;enumeration value="Billion"/>
 *     &lt;enumeration value="Trillion"/>
 *     &lt;enumeration value="Quadrillion"/>
 *     &lt;enumeration value="Quintillion"/>
 *     &lt;enumeration value="Sextillion"/>
 *     &lt;enumeration value="Septillion"/>
 *     &lt;enumeration value="Octillion"/>
 *     &lt;enumeration value="Nonillion"/>
 *     &lt;enumeration value="Decillion"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitOfSizeEnumeration", namespace = "http://services.dnb.com/CustomProductServiceV2.0")
@XmlEnum
public enum UnitOfSizeEnumeration {

    @XmlEnumValue("SingleUnits")
    SINGLE_UNITS("SingleUnits"),
    @XmlEnumValue("Tens")
    TENS("Tens"),
    @XmlEnumValue("Hundred")
    HUNDRED("Hundred"),
    @XmlEnumValue("Thousand")
    THOUSAND("Thousand"),
    @XmlEnumValue("Million")
    MILLION("Million"),
    @XmlEnumValue("Billion")
    BILLION("Billion"),
    @XmlEnumValue("Trillion")
    TRILLION("Trillion"),
    @XmlEnumValue("Quadrillion")
    QUADRILLION("Quadrillion"),
    @XmlEnumValue("Quintillion")
    QUINTILLION("Quintillion"),
    @XmlEnumValue("Sextillion")
    SEXTILLION("Sextillion"),
    @XmlEnumValue("Septillion")
    SEPTILLION("Septillion"),
    @XmlEnumValue("Octillion")
    OCTILLION("Octillion"),
    @XmlEnumValue("Nonillion")
    NONILLION("Nonillion"),
    @XmlEnumValue("Decillion")
    DECILLION("Decillion");
    private final String value;

    UnitOfSizeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitOfSizeEnumeration fromValue(String v) {
        for (UnitOfSizeEnumeration c: UnitOfSizeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
