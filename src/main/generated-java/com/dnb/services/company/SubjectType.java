
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubjectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Affiliate"/>
 *     &lt;enumeration value="Branch"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Division"/>
 *     &lt;enumeration value="DomesticUltimate"/>
 *     &lt;enumeration value="GlobalUltimate"/>
 *     &lt;enumeration value="Headquarters"/>
 *     &lt;enumeration value="Parent"/>
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="Subsidiary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubjectType", namespace = "http://services.dnb.com/CompanyServiceV2.0")
@XmlEnum
public enum SubjectType {

    @XmlEnumValue("Affiliate")
    AFFILIATE("Affiliate"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Division")
    DIVISION("Division"),
    @XmlEnumValue("DomesticUltimate")
    DOMESTIC_ULTIMATE("DomesticUltimate"),
    @XmlEnumValue("GlobalUltimate")
    GLOBAL_ULTIMATE("GlobalUltimate"),
    @XmlEnumValue("Headquarters")
    HEADQUARTERS("Headquarters"),
    @XmlEnumValue("Parent")
    PARENT("Parent"),
    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Subsidiary")
    SUBSIDIARY("Subsidiary");
    private final String value;

    SubjectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubjectType fromValue(String v) {
        for (SubjectType c: SubjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
