
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustryChapterNameEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndustryChapterNameEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BusinessChallenges"/>
 *     &lt;enumeration value="CallPreparationQuestions"/>
 *     &lt;enumeration value="ExecutiveInsight"/>
 *     &lt;enumeration value="FinancialInformation"/>
 *     &lt;enumeration value="GlossaryOfAcronyms"/>
 *     &lt;enumeration value="IndustryForecast"/>
 *     &lt;enumeration value="IndustryIndicators"/>
 *     &lt;enumeration value="IndustryOverview"/>
 *     &lt;enumeration value="IndustryWebsites"/>
 *     &lt;enumeration value="QuarterlyIndustryUpdate"/>
 *     &lt;enumeration value="TrendsAndOpportunities"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="FastFacts"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndustryChapterNameEnum", namespace = "http://services.dnb.com/CustomProductServiceV2.0")
@XmlEnum
public enum IndustryChapterNameEnum {

    @XmlEnumValue("BusinessChallenges")
    BUSINESS_CHALLENGES("BusinessChallenges"),
    @XmlEnumValue("CallPreparationQuestions")
    CALL_PREPARATION_QUESTIONS("CallPreparationQuestions"),
    @XmlEnumValue("ExecutiveInsight")
    EXECUTIVE_INSIGHT("ExecutiveInsight"),
    @XmlEnumValue("FinancialInformation")
    FINANCIAL_INFORMATION("FinancialInformation"),
    @XmlEnumValue("GlossaryOfAcronyms")
    GLOSSARY_OF_ACRONYMS("GlossaryOfAcronyms"),
    @XmlEnumValue("IndustryForecast")
    INDUSTRY_FORECAST("IndustryForecast"),
    @XmlEnumValue("IndustryIndicators")
    INDUSTRY_INDICATORS("IndustryIndicators"),
    @XmlEnumValue("IndustryOverview")
    INDUSTRY_OVERVIEW("IndustryOverview"),
    @XmlEnumValue("IndustryWebsites")
    INDUSTRY_WEBSITES("IndustryWebsites"),
    @XmlEnumValue("QuarterlyIndustryUpdate")
    QUARTERLY_INDUSTRY_UPDATE("QuarterlyIndustryUpdate"),
    @XmlEnumValue("TrendsAndOpportunities")
    TRENDS_AND_OPPORTUNITIES("TrendsAndOpportunities"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("FastFacts")
    FAST_FACTS("FastFacts");
    private final String value;

    IndustryChapterNameEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndustryChapterNameEnum fromValue(String v) {
        for (IndustryChapterNameEnum c: IndustryChapterNameEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
