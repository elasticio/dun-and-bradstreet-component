
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dnb.services.customproduct package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TradeDataAvailabilityDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TradeDataAvailabilityDetail");
    private final static QName _PaydexScoreHistoryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaydexScoreHistoryType");
    private final static QName _RetrieveProductResponseDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RetrieveProductResponseDetail");
    private final static QName _SupplierDetailForNotes_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierDetailForNotes");
    private final static QName _LienType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LienType");
    private final static QName _PastDuePercentageCycleSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PastDuePercentageCycleSummary");
    private final static QName _BorrowerAnalyticsCycleSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BorrowerAnalyticsCycleSummary");
    private final static QName _Role_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Role");
    private final static QName _KeyFinancialFiguresOverview_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "KeyFinancialFiguresOverview");
    private final static QName _SupplierDetailForCustomerProvidedInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierDetailForCustomerProvidedInformation");
    private final static QName _FormerOrganizationPrimaryNameType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FormerOrganizationPrimaryNameType");
    private final static QName _LettersOfCreditAccountSummaryDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LettersOfCreditAccountSummaryDetailType");
    private final static QName _LegalEventBaseType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LegalEventBaseType");
    private final static QName _OrganizationIdentificationNumberType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrganizationIdentificationNumberType");
    private final static QName _ChapterContentDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ChapterContentDetail");
    private final static QName _RelatedPartyDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RelatedPartyDetail");
    private final static QName _CurrentAssets_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CurrentAssets");
    private final static QName _PaymentExperienceSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaymentExperienceSummary");
    private final static QName _Financial_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Financial");
    private final static QName _UploadSupplierDocumentRequest_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "UploadSupplierDocumentRequest");
    private final static QName _AccountantDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AccountantDetails");
    private final static QName _FinancingStatementFilingPeriodSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancingStatementFilingPeriodSummary");
    private final static QName _RolePalyerAddressType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RolePalyerAddressType");
    private final static QName _SupplierDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierDetail");
    private final static QName _TextEntryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TextEntryType");
    private final static QName _FinancialStatementHeaderGrowthRate_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialStatementHeaderGrowthRate");
    private final static QName _SimpleAddress_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SimpleAddress");
    private final static QName _FormerPrimaryAddress_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FormerPrimaryAddress");
    private final static QName _UCCFilingType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "UCCFilingType");
    private final static QName _GlobalFailureRiskScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GlobalFailureRiskScoreType");
    private final static QName _TaxDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TaxDetailType");
    private final static QName _SubsequentEventDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubsequentEventDetail");
    private final static QName _FilingInquiryDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FilingInquiryDetail");
    private final static QName _IndustryPaymentExperienceSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IndustryPaymentExperienceSummaryType");
    private final static QName _CreditRangePaymentExperienceSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CreditRangePaymentExperienceSummaryType");
    private final static QName _PeriodSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PeriodSummaryType");
    private final static QName _PrincipalReferenceText_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PrincipalReferenceText");
    private final static QName _GetSupplierListResponse_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GetSupplierListResponse");
    private final static QName _PortfolioComparisonScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PortfolioComparisonScoreType");
    private final static QName _PrincipalSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PrincipalSummaryType");
    private final static QName _SubjectAddress_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectAddress");
    private final static QName _WorldWatchHeadlineDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "WorldWatchHeadlineDetails");
    private final static QName _SubjectAddressUsageTenureDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectAddressUsageTenureDetail");
    private final static QName _IndividualNameType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IndividualNameType");
    private final static QName _SuitType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SuitType");
    private final static QName _SummarizedSlowType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SummarizedSlowType");
    private final static QName _DNBStringType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DNBStringType");
    private final static QName _ParentEventsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ParentEventsType");
    private final static QName _CurrentPayment_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CurrentPayment");
    private final static QName _RegionAddressLine_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RegionAddressLine");
    private final static QName _ShareholderForRegisterSupplier_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ShareholderForRegisterSupplier");
    private final static QName _Shareholder_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Shareholder");
    private final static QName _IssuerInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IssuerInformation");
    private final static QName _PaydexScoreIndustryNormsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaydexScoreIndustryNormsType");
    private final static QName _ShareCapitalDetailsHistoryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ShareCapitalDetailsHistoryType");
    private final static QName _BusinessAgeNorm_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BusinessAgeNorm");
    private final static QName _CashFlowStatement_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CashFlowStatement");
    private final static QName _TotalPaymentsCountCycleSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TotalPaymentsCountCycleSummary");
    private final static QName _JudgmentType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "JudgmentType");
    private final static QName _ClaimSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ClaimSummary");
    private final static QName _FinancialStatementCommentsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialStatementCommentsType");
    private final static QName _GlobalCurrentAssets_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GlobalCurrentAssets");
    private final static QName _SupplierPerformanceScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierPerformanceScoreType");
    private final static QName _SmallBusinessFinancialExchangeType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SmallBusinessFinancialExchangeType");
    private final static QName _PremisesUsageDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PremisesUsageDetail");
    private final static QName _DNBDecodedStringNewType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DNBDecodedStringNewType");
    private final static QName _InquiryDetailForAlert_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "InquiryDetailForAlert");
    private final static QName _USPatriotActComplianceRiskScore_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "USPatriotActComplianceRiskScore");
    private final static QName _AlertDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AlertDetail");
    private final static QName _OperatingStatusComment_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OperatingStatusComment");
    private final static QName _CreditBureauSpecification_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CreditBureauSpecification");
    private final static QName _GetSupplierRegistrationBatchStatusRequestDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GetSupplierRegistrationBatchStatusRequestDetail");
    private final static QName _PoliticalDistrict_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PoliticalDistrict");
    private final static QName _Rating_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Rating");
    private final static QName _TelecommunicationNumberType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TelecommunicationNumberType");
    private final static QName _ChildAssociation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ChildAssociation");
    private final static QName _PremisesInternalUnitDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PremisesInternalUnitDetailType");
    private final static QName _RegisterSupplierRequest_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RegisterSupplierRequest");
    private final static QName _CommercialCardAccountPeriodSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CommercialCardAccountPeriodSummaryType");
    private final static QName _MatchResult_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "MatchResult");
    private final static QName _FreeFormStatementItem_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FreeFormStatementItem");
    private final static QName _BorrowerAnalyticsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BorrowerAnalyticsType");
    private final static QName _CustomerFileDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CustomerFileDetails");
    private final static QName _StatementHeaderType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "StatementHeaderType");
    private final static QName _OrganizationPrimaryNameType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrganizationPrimaryNameType");
    private final static QName _RegistrationSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RegistrationSummary");
    private final static QName _GetDataResponse_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GetDataResponse");
    private final static QName _SpecialInvestigationInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SpecialInvestigationInformation");
    private final static QName _ResponseTransactionDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ResponseTransactionDetail");
    private final static QName _Officers_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Officers");
    private final static QName _SBRIScore_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SBRIScore");
    private final static QName _TransactionResult_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TransactionResult");
    private final static QName _AddSupplierNotesRequest_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AddSupplierNotesRequest");
    private final static QName _AmountsPayable_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AmountsPayable");
    private final static QName _CompositePaydexScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CompositePaydexScoreType");
    private final static QName _Compensation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Compensation");
    private final static QName _EmployeeCategoryDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "EmployeeCategoryDetails");
    private final static QName _ResponseArchiveDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ResponseArchiveDetail");
    private final static QName _ContactInterview_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ContactInterview");
    private final static QName _SearchBaseAddressType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SearchBaseAddressType");
    private final static QName _TerritorialSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TerritorialSummary");
    private final static QName _BaseEventType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BaseEventType");
    private final static QName _RequestedPublicFilingDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RequestedPublicFilingDetail");
    private final static QName _AirportConcessionDisadvantagedBusinessEnterpriseDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AirportConcessionDisadvantagedBusinessEnterpriseDetail");
    private final static QName _SubjectHeader_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectHeader");
    private final static QName _ThirdPartyAssessmenUnavailableReason_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ThirdPartyAssessmenUnavailableReason");
    private final static QName _LegalFormDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LegalFormDetailsType");
    private final static QName _GrowthRates_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GrowthRates");
    private final static QName _InclusionCriteria_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "InclusionCriteria");
    private final static QName _RegulationDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RegulationDetail");
    private final static QName _DNBStringType128_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DNBStringType_128");
    private final static QName _PaymentDetailsDisclaimerInfo_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaymentDetailsDisclaimerInfo");
    private final static QName _SupplierAddressDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierAddressDetail");
    private final static QName _TelecommunicationNumberSimpleType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TelecommunicationNumberSimpleType");
    private final static QName _ClaimType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ClaimType");
    private final static QName _OtherLegalEventInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OtherLegalEventInformation");
    private final static QName _RolePlayerTextEntry_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RolePlayerTextEntry");
    private final static QName _OrganizationSizeDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrganizationSizeDetail");
    private final static QName _Product_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Product");
    private final static QName _DocumentFilingRequirementDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DocumentFilingRequirementDetails");
    private final static QName _EventDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "EventDetail");
    private final static QName _GlobalStandardCashFlowStatement_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GlobalStandardCashFlowStatement");
    private final static QName _CurrentManagementResponsibility_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CurrentManagementResponsibility");
    private final static QName _DataProviderSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DataProviderSummaryType");
    private final static QName _SocioEconomicReferenceDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SocioEconomicReferenceDetailType");
    private final static QName _PurchaserDerivedDataCoveragePayments_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PurchaserDerivedDataCoveragePayments");
    private final static QName _NotesToAccounts_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NotesToAccounts");
    private final static QName _PaymentExperienceType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaymentExperienceType");
    private final static QName _AccountSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AccountSummaryType");
    private final static QName _EventResult_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "EventResult");
    private final static QName _ProfileSubChapterDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ProfileSubChapterDetail");
    private final static QName _IndustryCreditScoringSpecification_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IndustryCreditScoringSpecification");
    private final static QName _FinancialNetRevenue_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialNetRevenue");
    private final static QName _UpwardAssociation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "UpwardAssociation");
    private final static QName _DNBStringType256_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DNBStringType256");
    private final static QName _SupplierEvaluationRiskScore_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierEvaluationRiskScore");
    private final static QName _LeaseAccountPeriodSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LeaseAccountPeriodSummaryType");
    private final static QName _PrincipalIdentificationNumberType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PrincipalIdentificationNumberType");
    private final static QName _DebarmentsInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DebarmentsInformation");
    private final static QName _RegulatorDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RegulatorDetail");
    private final static QName _DUNSAuditTrail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DUNSAuditTrail");
    private final static QName _BankAccount_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BankAccount");
    private final static QName _LienSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LienSummaryType");
    private final static QName _InsolvencyProcessSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "InsolvencyProcessSummaryType");
    private final static QName _Directors_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Directors");
    private final static QName _RolePlayerDetailsBaseType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RolePlayerDetailsBaseType");
    private final static QName _InquirerIndustrySummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "InquirerIndustrySummaryType");
    private final static QName _SubjectComplianceDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectComplianceDetail");
    private final static QName _VehicleDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "VehicleDetailsType");
    private final static QName _ReferenceDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ReferenceDetail");
    private final static QName _NotesToAccountsStatementItem_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NotesToAccountsStatementItem");
    private final static QName _BusinessTrading_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BusinessTrading");
    private final static QName _SocialNetworkingDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SocialNetworkingDetail");
    private final static QName _ImportDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ImportDetailsType");
    private final static QName _ThirdPartyDataType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ThirdPartyDataType");
    private final static QName _WebPageAddressType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "WebPageAddressType");
    private final static QName _TradingTermsDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TradingTermsDetailsType");
    private final static QName _IndustryCodeSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IndustryCodeSummaryType");
    private final static QName _OverallSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OverallSummary");
    private final static QName _RequestedOrganizationChildLinkageSpecification_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RequestedOrganizationChildLinkageSpecification");
    private final static QName _GetSupplierListResponseDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GetSupplierListResponseDetail");
    private final static QName _TaxPaymentAssessment_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TaxPaymentAssessment");
    private final static QName _OtherFinancingEvent_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OtherFinancingEvent");
    private final static QName _OtherThirdPartyInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OtherThirdPartyInformation");
    private final static QName _LegalEventPeriodSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LegalEventPeriodSummaryType");
    private final static QName _CreditorCategorizationDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CreditorCategorizationDetail");
    private final static QName _FinancialRatioIndustryNormCategory_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialRatioIndustryNormCategory");
    private final static QName _SupplierThirdPartyAssessment_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierThirdPartyAssessment");
    private final static QName _BaseProfitAndLossStatementType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BaseProfitAndLossStatementType");
    private final static QName _SubjectPersonalDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectPersonalDetail");
    private final static QName _InstallmentAccountPeriodSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "InstallmentAccountPeriodSummaryType");
    private final static QName _ObjectAttachmentForResponse_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ObjectAttachmentForResponse");
    private final static QName _AccountantOpinion_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AccountantOpinion");
    private final static QName _PrimaryIndustryCodeType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PrimaryIndustryCodeType");
    private final static QName _PurchaserDerivedPlacedForCollectionPayments_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PurchaserDerivedPlacedForCollectionPayments");
    private final static QName _SubscribedToLetterOfLiability_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubscribedToLetterOfLiability");
    private final static QName _NoteDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NoteDetail");
    private final static QName _RetrieveProductRequest_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RetrieveProductRequest");
    private final static QName _ShareCapitalTrendDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ShareCapitalTrendDetails");
    private final static QName _InquiryIndustryCodeType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "InquiryIndustryCodeType");
    private final static QName _IssuedLetterOfLiability_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IssuedLetterOfLiability");
    private final static QName _OtherActivitiesType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OtherActivitiesType");
    private final static QName _FinancialRatioCategory_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialRatioCategory");
    private final static QName _FinancialRatios_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialRatios");
    private final static QName _LowerQuartile_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LowerQuartile");
    private final static QName _PreviousNonEmploymentDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PreviousNonEmploymentDetailsType");
    private final static QName _ScoreReferenceType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ScoreReferenceType");
    private final static QName _LocationProfileDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LocationProfileDetail");
    private final static QName _ScoreReason_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ScoreReason");
    private final static QName _SocioEconomicCharacteristicType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SocioEconomicCharacteristicType");
    private final static QName _RatingReason_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RatingReason");
    private final static QName _SupplierRiskScore_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierRiskScore");
    private final static QName _CourtType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CourtType");
    private final static QName _OrderProductResponse_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrderProductResponse");
    private final static QName _BorrowerAnalyticsAccountSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BorrowerAnalyticsAccountSummary");
    private final static QName _PaymentExperienceSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaymentExperienceSummaryType");
    private final static QName _ProfileLocation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ProfileLocation");
    private final static QName _MedianQuartile_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "MedianQuartile");
    private final static QName _SubjectNameDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectNameDetail");
    private final static QName _ScoreNormType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ScoreNormType");
    private final static QName _FinancialAccountSummaryDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialAccountSummaryDetailType");
    private final static QName _PaymentDataSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaymentDataSummaryType");
    private final static QName _SatisfactoryPayments_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SatisfactoryPayments");
    private final static QName _FiscalPeriodDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FiscalPeriodDetails");
    private final static QName _OpenEndedCreditLineAccountSummaryDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OpenEndedCreditLineAccountSummaryDetailType");
    private final static QName _UserDetailForSupplier_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "UserDetailForSupplier");
    private final static QName _InquiryDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "InquiryDetail");
    private final static QName _GetSupplierListRequest_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GetSupplierListRequest");
    private final static QName _ChapterConversionDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ChapterConversionDetailsType");
    private final static QName _ComplianceAddressDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ComplianceAddressDetail");
    private final static QName _CountryRiskDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CountryRiskDetails");
    private final static QName _UploadSupplierDocumentResponse_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "UploadSupplierDocumentResponse");
    private final static QName _DataProviderDetailForAirportConcession_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DataProviderDetailForAirportConcession");
    private final static QName _NamePrefix_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NamePrefix");
    private final static QName _StatementHeaderDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "StatementHeaderDetails");
    private final static QName _ActivityDetailsForCommercialCollectionClaims_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ActivityDetailsForCommercialCollectionClaims");
    private final static QName _Telecommunication_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Telecommunication");
    private final static QName _GuarantorDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GuarantorDetails");
    private final static QName _FilingOrganizationName_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FilingOrganizationName");
    private final static QName _SubjectQueueHistoryDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectQueueHistoryDetail");
    private final static QName _AccountDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AccountDetail");
    private final static QName _PaymentSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaymentSummaryType");
    private final static QName _FamilyRelationship_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FamilyRelationship");
    private final static QName _NormDimension_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NormDimension");
    private final static QName _KFRIndustryQuartilesType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "KFRIndustryQuartilesType");
    private final static QName _DecisionParameter_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DecisionParameter");
    private final static QName _LitigationRolePlayerType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LitigationRolePlayerType");
    private final static QName _DNBCreditLimitRecommendationType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DNBCreditLimitRecommendationType");
    private final static QName _ContactResult_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ContactResult");
    private final static QName _ParentAssociation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ParentAssociation");
    private final static QName _SubjectHandling_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectHandling");
    private final static QName _SpendBehaviorType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SpendBehaviorType");
    private final static QName _AgencyDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AgencyDetailType");
    private final static QName _MatchBasis_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "MatchBasis");
    private final static QName _SupplierBatchFileDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierBatchFileDetail");
    private final static QName _CurrentPaydexScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CurrentPaydexScoreType");
    private final static QName _GlobalStandardProfitAndLossStatement_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GlobalStandardProfitAndLossStatement");
    private final static QName _SupplierRegistrationAddress_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierRegistrationAddress");
    private final static QName _FinancingStatementFilingInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancingStatementFilingInformation");
    private final static QName _OrganizationIdentificationNumberSimpleType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrganizationIdentificationNumberSimpleType");
    private final static QName _LegalFormDetailsHistory_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LegalFormDetailsHistory");
    private final static QName _LegalEventReason_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LegalEventReason");
    private final static QName _RegisterSupplierInquiryDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RegisterSupplierInquiryDetail");
    private final static QName _OrganizationNameBaseType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrganizationNameBaseType");
    private final static QName _OverallViabilityScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OverallViabilityScoreType");
    private final static QName _ParentLegalEventsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ParentLegalEventsType");
    private final static QName _TelexNumberType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TelexNumberType");
    private final static QName _LinesOfCreditAccountPeriodSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LinesOfCreditAccountPeriodSummaryType");
    private final static QName _PurchaserDerivedDiscountTermsPayments_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PurchaserDerivedDiscountTermsPayments");
    private final static QName _IndustryProfile_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IndustryProfile");
    private final static QName _CommunicationEventTextualComponents_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CommunicationEventTextualComponents");
    private final static QName _Position_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Position");
    private final static QName _BorrowerAnalyticsOverallSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BorrowerAnalyticsOverallSummary");
    private final static QName _SummarizedPastDuePeriodViewType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SummarizedPastDuePeriodViewType");
    private final static QName _BankruptcyType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BankruptcyType");
    private final static QName _ImpactDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ImpactDetailType");
    private final static QName _DocumentFilingDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DocumentFilingDetails");
    private final static QName _LegalEventAssociationType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LegalEventAssociationType");
    private final static QName _CountrySanctionDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CountrySanctionDetail");
    private final static QName _TransferDUNSNumberRegistration_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TransferDUNSNumberRegistration");
    private final static QName _UploadSupplierDocumentRequestDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "UploadSupplierDocumentRequestDetail");
    private final static QName _ClassScoreNormType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ClassScoreNormType");
    private final static QName _BankReference_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BankReference");
    private final static QName _DamagedAssetsDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DamagedAssetsDetailType");
    private final static QName _GuarantorDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GuarantorDetailsType");
    private final static QName _LongTermAssets_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LongTermAssets");
    private final static QName _OrderProductResponseDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrderProductResponseDetail");
    private final static QName _PositionForPrincipalOfPrincipal_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PositionForPrincipalOfPrincipal");
    private final static QName _PaymentDataSummaryViewType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaymentDataSummaryViewType");
    private final static QName _PrincipalsAndManagement_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PrincipalsAndManagement");
    private final static QName _RegisteredAddressForSBFE_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RegisteredAddressForSBFE");
    private final static QName _RevolvingAccountPeriodSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RevolvingAccountPeriodSummaryType");
    private final static QName _AssetGroupDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AssetGroupDetailType");
    private final static QName _OwnershipEthnicityType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OwnershipEthnicityType");
    private final static QName _StreetAddressLine_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "StreetAddressLine");
    private final static QName _ChildrenSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ChildrenSummary");
    private final static QName _InquirySummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "InquirySummaryType");
    private final static QName _NationalPercentileIndustryNorm_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NationalPercentileIndustryNorm");
    private final static QName _PurchaserDerivedCashPayments_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PurchaserDerivedCashPayments");
    private final static QName _FreeFormEvent_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FreeFormEvent");
    private final static QName _CommercialCollectionClaimDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CommercialCollectionClaimDetails");
    private final static QName _MessageGroup_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "MessageGroup");
    private final static QName _EmployeeDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "EmployeeDetailsType");
    private final static QName _RegisterSupplierSpecification_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RegisterSupplierSpecification");
    private final static QName _BoardMemberService_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BoardMemberService");
    private final static QName _DataProviderDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DataProviderDetail");
    private final static QName _GuarantorAddress_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GuarantorAddress");
    private final static QName _DataDepthDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DataDepthDetailType");
    private final static QName _BusinessHistoryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BusinessHistoryType");
    private final static QName _StockPeriodSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "StockPeriodSummary");
    private final static QName _PreviousSelfEmploymentDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PreviousSelfEmploymentDetailsType");
    private final static QName _FilingExpirationDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FilingExpirationDetails");
    private final static QName _PurchaserDerivedPaymentsByCreditRange_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PurchaserDerivedPaymentsByCreditRange");
    private final static QName _ResponsibleAreaForPrincipalOfPrincipal_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ResponsibleAreaForPrincipalOfPrincipal");
    private final static QName _SubscriberInfomation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubscriberInfomation");
    private final static QName _ResponsibleAreaForCorporateDirectorship_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ResponsibleAreaForCorporateDirectorship");
    private final static QName _AddSupplierNotesRequestDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AddSupplierNotesRequestDetail");
    private final static QName _SubjectIsAgentDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectIsAgentDetailsType");
    private final static QName _Text_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Text");
    private final static QName _OtherFinancialEventInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OtherFinancialEventInformation");
    private final static QName _LocationDetailForAlert_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LocationDetailForAlert");
    private final static QName _Events_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Events");
    private final static QName _MortgagesAndChargesInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "MortgagesAndChargesInformation");
    private final static QName _CurrentPaymentSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CurrentPaymentSummary");
    private final static QName _StatusReportDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "StatusReportDetail");
    private final static QName _ProvisionsAndDeferredTaxes_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ProvisionsAndDeferredTaxes");
    private final static QName _SpendAmountRangeSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SpendAmountRangeSummaryType");
    private final static QName _PremisesAreaDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PremisesAreaDetail");
    private final static QName _PurchaserDerivedPaymentsWithHighCredit_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PurchaserDerivedPaymentsWithHighCredit");
    private final static QName _CustomScore_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CustomScore");
    private final static QName _ObjectAttachment_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ObjectAttachment");
    private final static QName _OrganizationDNBPresentationRegistrationNumber_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrganizationDNBPresentationRegistrationNumber");
    private final static QName _GlobalRiskScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GlobalRiskScoreType");
    private final static QName _PremisesUsageFunctionDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PremisesUsageFunctionDetail");
    private final static QName _PastDuePaymentCycleSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PastDuePaymentCycleSummaryType");
    private final static QName _PremisesArea_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PremisesArea");
    private final static QName _Organization_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Organization");
    private final static QName _GetDataRequest_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GetDataRequest");
    private final static QName _InquiryReferenceDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "InquiryReferenceDetail");
    private final static QName _FilingOfficeDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FilingOfficeDetails");
    private final static QName _CertifiedSmallBusinessDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CertifiedSmallBusinessDetail");
    private final static QName _EntityMatchDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "EntityMatchDetail");
    private final static QName _ArchiveDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ArchiveDetail");
    private final static QName _LetterofLiabilitySummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LetterofLiabilitySummaryType");
    private final static QName _PaydexScoreSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaydexScoreSummaryType");
    private final static QName _PrincipalDetailsRequestType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PrincipalDetailsRequestType");
    private final static QName _Individual_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Individual");
    private final static QName _BusinessSizeNorm_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BusinessSizeNorm");
    private final static QName _RolePlayer_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RolePlayer");
    private final static QName _BusinessSignalsSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BusinessSignalsSummaryType");
    private final static QName _IndustryCode_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IndustryCode");
    private final static QName _SBFEPoweredScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SBFEPoweredScoreType");
    private final static QName _SpecialInvestigationDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SpecialInvestigationDetail");
    private final static QName _GlobalBalanceSheetType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GlobalBalanceSheetType");
    private final static QName _SignificantEvents_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SignificantEvents");
    private final static QName _ComplianceDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ComplianceDetail");
    private final static QName _GetSupplierRegistrationBatchStatusResponse_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GetSupplierRegistrationBatchStatusResponse");
    private final static QName _GlobalAssets_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GlobalAssets");
    private final static QName _Liabilities_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Liabilities");
    private final static QName _ScoreOverrideReason_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ScoreOverrideReason");
    private final static QName _MiscellaneousDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "MiscellaneousDetails");
    private final static QName _CommercialCollectionClaims_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CommercialCollectionClaims");
    private final static QName _SummarizedPastDueType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SummarizedPastDueType");
    private final static QName _CommercialCardAccountSummaryDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CommercialCardAccountSummaryDetailType");
    private final static QName _LineOfBusinessDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LineOfBusinessDetailsType");
    private final static QName _ClaimInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ClaimInformation");
    private final static QName _Competitors_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Competitors");
    private final static QName _ScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ScoreType");
    private final static QName _BankExperienceSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BankExperienceSummary");
    private final static QName _RetrieveProductRequestDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RetrieveProductRequestDetail");
    private final static QName _AccountSummaryDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AccountSummaryDetailType");
    private final static QName _CurrentCreditRangePaydexScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CurrentCreditRangePaydexScoreType");
    private final static QName _FinancialRatioItem_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialRatioItem");
    private final static QName _SummarizedPastDue_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SummarizedPastDue");
    private final static QName _PurchaserDerivedNoPaymentMannerPayments_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PurchaserDerivedNoPaymentMannerPayments");
    private final static QName _CompensationDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CompensationDetail");
    private final static QName _RolePlayerName_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RolePlayerName");
    private final static QName _FilingStatusDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FilingStatusDetail");
    private final static QName _IndustryPaymentExperienceType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IndustryPaymentExperienceType");
    private final static QName _OrganizationProfileDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrganizationProfileDetailType");
    private final static QName _GrowthRateNorm_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GrowthRateNorm");
    private final static QName _InquiryDetailForSupplierBatch_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "InquiryDetailForSupplierBatch");
    private final static QName _MinorityOwnedDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "MinorityOwnedDetails");
    private final static QName _PurchaserDerivedPaymentsToSupplierIndustry_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PurchaserDerivedPaymentsToSupplierIndustry");
    private final static QName _FullName_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FullName");
    private final static QName _DNBStandardRatingType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DNBStandardRatingType");
    private final static QName _FinancialEventBaseType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialEventBaseType");
    private final static QName _TotalPastDueCycleSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TotalPastDueCycleSummary");
    private final static QName _PaydexScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaydexScoreType");
    private final static QName _SearchByFilingNameFilingLocation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SearchByFilingNameFilingLocation");
    private final static QName _ContactEvent_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ContactEvent");
    private final static QName _CustomerDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CustomerDetailsType");
    private final static QName _CommunicationResult_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CommunicationResult");
    private final static QName _HigherQuartile_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "HigherQuartile");
    private final static QName _RiskIncidencePercentageIndustryNorm_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RiskIncidencePercentageIndustryNorm");
    private final static QName _InquirySummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "InquirySummary");
    private final static QName _MailAddressType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "MailAddressType");
    private final static QName _Location_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Location");
    private final static QName _LongTermLiabilities_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LongTermLiabilities");
    private final static QName _RiskIncidence_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RiskIncidence");
    private final static QName _SupplierPrincipal_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierPrincipal");
    private final static QName _LeaseAccountSummaryDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LeaseAccountSummaryDetailType");
    private final static QName _MortgagesAndChargesSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "MortgagesAndChargesSummary");
    private final static QName _StockExchangeDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "StockExchangeDetails");
    private final static QName _CommentGroupType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CommentGroupType");
    private final static QName _NoteDetailForResponse_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NoteDetailForResponse");
    private final static QName _RemedyFiled_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RemedyFiled");
    private final static QName _PrincipalAssociation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PrincipalAssociation");
    private final static QName _Subject_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Subject");
    private final static QName _ImportCountryDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ImportCountryDetails");
    private final static QName _Request_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Request");
    private final static QName _PrincipalBirthAddressType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PrincipalBirthAddressType");
    private final static QName _UCCFilingInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "UCCFilingInformation");
    private final static QName _SupplierQueueDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierQueueDetail");
    private final static QName _InformationConfirmation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "InformationConfirmation");
    private final static QName _FinancialRelationship_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialRelationship");
    private final static QName _Assets_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Assets");
    private final static QName _News_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "News");
    private final static QName _RetrieveProductArchiveDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RetrieveProductArchiveDetail");
    private final static QName _FinancingEvents_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancingEvents");
    private final static QName _MatchGradeSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "MatchGradeSummaryType");
    private final static QName _ImpactedChildOrganizationType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ImpactedChildOrganizationType");
    private final static QName _OrganizationNameTypeForPrimaryRegistered_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrganizationNameTypeForPrimaryRegistered");
    private final static QName _NonspecificAddress_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NonspecificAddress");
    private final static QName _OrganizationIdentificationNumberDetailsHistory_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrganizationIdentificationNumberDetailsHistory");
    private final static QName _MortgagesAndChargesType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "MortgagesAndChargesType");
    private final static QName _LinesOfCreditAccountSummaryDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LinesOfCreditAccountSummaryDetailType");
    private final static QName _StatementItem_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "StatementItem");
    private final static QName _SubjectName_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectName");
    private final static QName _OrganizationName_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrganizationName");
    private final static QName _AssetArticleDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AssetArticleDetailType");
    private final static QName _OperatingStatusDetailHistory_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OperatingStatusDetailHistory");
    private final static QName _SuitInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SuitInformation");
    private final static QName _CapitalStockDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CapitalStockDetails");
    private final static QName _ScoreCommentary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ScoreCommentary");
    private final static QName _BusinessSignalsPeriodSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BusinessSignalsPeriodSummaryType");
    private final static QName _PurchaserDerivedPaymentPeriodSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PurchaserDerivedPaymentPeriodSummary");
    private final static QName _Equity_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Equity");
    private final static QName _ResponsibleArea_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ResponsibleArea");
    private final static QName _IndustryNormType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IndustryNormType");
    private final static QName _AmountType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AmountType");
    private final static QName _GetSupplierRegistrationBatchStatusResponseDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GetSupplierRegistrationBatchStatusResponseDetail");
    private final static QName _BankIdentificationNumberDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BankIdentificationNumberDetailType");
    private final static QName _FormerOrganizationRegisteredNameType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FormerOrganizationRegisteredNameType");
    private final static QName _SubjectAddressType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectAddressType");
    private final static QName _FamilyTreeMemberRole_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FamilyTreeMemberRole");
    private final static QName _BankruptcyFinancialStatement_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BankruptcyFinancialStatement");
    private final static QName _CreditRangeSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CreditRangeSummaryType");
    private final static QName _DNBRatingDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DNBRatingDetails");
    private final static QName _PaymentMannerSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaymentMannerSummaryType");
    private final static QName _SupplierRecordStatusSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierRecordStatusSummary");
    private final static QName _LocationDetailForAirportConcession_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LocationDetailForAirportConcession");
    private final static QName _DetailedTradeInformationSpecification_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DetailedTradeInformationSpecification");
    private final static QName _FinancialRatioNorm_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialRatioNorm");
    private final static QName _NormType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NormType");
    private final static QName _PeakPeriodDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PeakPeriodDetailsType");
    private final static QName _LocationProfile_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LocationProfile");
    private final static QName _RegisteredDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RegisteredDetail");
    private final static QName _PrimaryAddressType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PrimaryAddressType");
    private final static QName _NonspecificParameterDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NonspecificParameterDetail");
    private final static QName _DomesticMarketTerritoryDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DomesticMarketTerritoryDetailsType");
    private final static QName _SpecialEventType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SpecialEventType");
    private final static QName _CustomerMarketDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CustomerMarketDetails");
    private final static QName _SummarizedPastDueTypeForDetailedTrade_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SummarizedPastDueTypeForDetailedTrade");
    private final static QName _IndustryCodeType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IndustryCodeType");
    private final static QName _FinancialStatement_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialStatement");
    private final static QName _LoanAccountPeriodSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LoanAccountPeriodSummaryType");
    private final static QName _TradeExperiencePaymentSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TradeExperiencePaymentSummary");
    private final static QName _Competitor_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Competitor");
    private final static QName _ExtraordinaryNetRevenue_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ExtraordinaryNetRevenue");
    private final static QName _GlobalEquity_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GlobalEquity");
    private final static QName _PurchaserDerivedUnfavorablePayments_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PurchaserDerivedUnfavorablePayments");
    private final static QName _RetrieveProductResponse_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RetrieveProductResponse");
    private final static QName _FilingPartyType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FilingPartyType");
    private final static QName _Activity_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Activity");
    private final static QName _OrganizationDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrganizationDetail");
    private final static QName _FormerManagementResponsibility_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FormerManagementResponsibility");
    private final static QName _DNBDecodedStringType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DNBDecodedStringType");
    private final static QName _LinkedOrganizationLocationSpecification_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LinkedOrganizationLocationSpecification");
    private final static QName _ThirdPartyAssessment_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ThirdPartyAssessment");
    private final static QName _BasePositionType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BasePositionType");
    private final static QName _JudgmentInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "JudgmentInformation");
    private final static QName _LinkageSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LinkageSummary");
    private final static QName _AccountFiguresDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AccountFiguresDetail");
    private final static QName _DataTopicSpecification_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DataTopicSpecification");
    private final static QName _FilingRolePlayerDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FilingRolePlayerDetails");
    private final static QName _BankContactType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BankContactType");
    private final static QName _FinancingStatementFiling_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancingStatementFiling");
    private final static QName _ThirdPartyInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ThirdPartyInformation");
    private final static QName _BorrowerAnalytics_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BorrowerAnalytics");
    private final static QName _OperatingStatusDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OperatingStatusDetail");
    private final static QName _OrganizationRegisteredNameType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrganizationRegisteredNameType");
    private final static QName _AccountHolderInformationType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AccountHolderInformationType");
    private final static QName _PublicFilingHeaderType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PublicFilingHeaderType");
    private final static QName _ProductResponseInquiryDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ProductResponseInquiryDetail");
    private final static QName _IndustryCodeDescriptionType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IndustryCodeDescriptionType");
    private final static QName _RegisteredAddressNewType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RegisteredAddressNewType");
    private final static QName _LegalEventSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LegalEventSummaryType");
    private final static QName _FinancialStatementExplanation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialStatementExplanation");
    private final static QName _SmallDisadvantagedBusinessDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SmallDisadvantagedBusinessDetail");
    private final static QName _SubjectRecordDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectRecordDetail");
    private final static QName _UnclassifiedAccountSummaryDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "UnclassifiedAccountSummaryDetailType");
    private final static QName _PaymentHistorySummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaymentHistorySummary");
    private final static QName _MatchQualityInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "MatchQualityInformation");
    private final static QName _OverallPaymentHistorySummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OverallPaymentHistorySummary");
    private final static QName _Association_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Association");
    private final static QName _GrowthRateItem_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GrowthRateItem");
    private final static QName _GuaranteeDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GuaranteeDetails");
    private final static QName _FilingDetailTextEntry_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FilingDetailTextEntry");
    private final static QName _SpendCategorySummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SpendCategorySummaryType");
    private final static QName _DNBDateType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DNBDateType");
    private final static QName _RolePlayerDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RolePlayerDetailsType");
    private final static QName _ExportDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ExportDetailsType");
    private final static QName _SupplierListInquiryDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierListInquiryDetail");
    private final static QName _JudicialActionSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "JudicialActionSummaryType");
    private final static QName _Bank_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Bank");
    private final static QName _JobTitle_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "JobTitle");
    private final static QName _RegistrationNumberStatusText_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RegistrationNumberStatusText");
    private final static QName _PaymentsCountCycleSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaymentsCountCycleSummary");
    private final static QName _IndustryCommercialCreditScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IndustryCommercialCreditScoreType");
    private final static QName _PremisesConstructionMaterialDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PremisesConstructionMaterialDetail");
    private final static QName _PrincipalSanctionDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PrincipalSanctionDetail");
    private final static QName _ParentFinancialStatement_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ParentFinancialStatement");
    private final static QName _RegisterSupplierRequestDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RegisterSupplierRequestDetail");
    private final static QName _RequestAddress_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RequestAddress");
    private final static QName _ResponseIndustryCodeType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ResponseIndustryCodeType");
    private final static QName _StockTradingDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "StockTradingDetail");
    private final static QName _DivisionDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DivisionDetail");
    private final static QName _StatementItemType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "StatementItemType");
    private final static QName _FinancialRatiosIndustryNorms_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialRatiosIndustryNorms");
    private final static QName _LienInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LienInformation");
    private final static QName _NewsSpecification_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NewsSpecification");
    private final static QName _OrganizationThirdPartyAssessment_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrganizationThirdPartyAssessment");
    private final static QName _ParentOrganizationForSpecialInvestigation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ParentOrganizationForSpecialInvestigation");
    private final static QName _PurchaserDerivedData_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PurchaserDerivedData");
    private final static QName _PremisesExternallUnitDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PremisesExternallUnitDetailType");
    private final static QName _OrderProductRequest_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrderProductRequest");
    private final static QName _DNBViabilityRatingType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DNBViabilityRatingType");
    private final static QName _InternetReferenceDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "InternetReferenceDetail");
    private final static QName _DebarmentsSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DebarmentsSummaryType");
    private final static QName _CustomerAccountSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CustomerAccountSummary");
    private final static QName _SupplierShareholderType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierShareholderType");
    private final static QName _PrincipalOfPrincipalDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PrincipalOfPrincipalDetailsType");
    private final static QName _PremisesDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PremisesDetail");
    private final static QName _SuitSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SuitSummaryType");
    private final static QName _OrderProductRequestDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OrderProductRequestDetail");
    private final static QName _NameSuffix_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NameSuffix");
    private final static QName _UploadSupplierDocumentResponseDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "UploadSupplierDocumentResponseDetail");
    private final static QName _FormerRegisteredAddress_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FormerRegisteredAddress");
    private final static QName _CorporateDirectorshipType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CorporateDirectorshipType");
    private final static QName _GetSupplierListRequestDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GetSupplierListRequestDetail");
    private final static QName _FinancingDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancingDetails");
    private final static QName _GlobalLiabilities_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GlobalLiabilities");
    private final static QName _OperatingNetRevenue_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OperatingNetRevenue");
    private final static QName _SupplierName_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierName");
    private final static QName _CurrentLiabilities_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CurrentLiabilities");
    private final static QName _SocialMediaSpecification_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SocialMediaSpecification");
    private final static QName _Response_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Response");
    private final static QName _EmployeeFigures_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "EmployeeFigures");
    private final static QName _InsolvencyProcessinformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "InsolvencyProcessinformation");
    private final static QName _BankruptcyInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BankruptcyInformation");
    private final static QName _GlobalLongTermAssets_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GlobalLongTermAssets");
    private final static QName _LawSuitType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LawSuitType");
    private final static QName _PastDuePaymentType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PastDuePaymentType");
    private final static QName _PaydexScoreNorms_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaydexScoreNorms");
    private final static QName _EmailAddressType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "EmailAddressType");
    private final static QName _SupplierStabilityIndexScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierStabilityIndexScoreType");
    private final static QName _NetworthReconciliation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NetworthReconciliation");
    private final static QName _PaymentHistory_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaymentHistory");
    private final static QName _NormsIndustryCodeType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NormsIndustryCodeType");
    private final static QName _ProductSpecification_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ProductSpecification");
    private final static QName _DataSufficiency_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DataSufficiency");
    private final static QName _ImpactedPremisesDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ImpactedPremisesDetailType");
    private final static QName _Management_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Management");
    private final static QName _RequestTransactionDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RequestTransactionDetail");
    private final static QName _SupplierAssessment_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SupplierAssessment");
    private final static QName _FinancialAmountType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialAmountType");
    private final static QName _ShareholderSpecification_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ShareholderSpecification");
    private final static QName _SubDivisionDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubDivisionDetailType");
    private final static QName _Purchaser_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Purchaser");
    private final static QName _QueueDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "QueueDetail");
    private final static QName _YearsInBusinessDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "YearsInBusinessDetail");
    private final static QName _Message_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Message");
    private final static QName _TotalLossPredictorScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TotalLossPredictorScoreType");
    private final static QName _Assessment_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Assessment");
    private final static QName _CustomerProvidedSubjectInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CustomerProvidedSubjectInformation");
    private final static QName _LetterOfLiabilityInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LetterOfLiabilityInformation");
    private final static QName _LettersOfCreditAccountPeriodSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LettersOfCreditAccountPeriodSummaryType");
    private final static QName _Ownership_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Ownership");
    private final static QName _CommercialCreditScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CommercialCreditScoreType");
    private final static QName _SubjectUsesAgentDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectUsesAgentDetailsType");
    private final static QName _CollateralDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CollateralDetailType");
    private final static QName _SBFEScoreReasonType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SBFEScoreReasonType");
    private final static QName _SubjectAddressUsageFinancialItemType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectAddressUsageFinancialItemType");
    private final static QName _TriplePlayScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TriplePlayScoreType");
    private final static QName _SecuredFilingsInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SecuredFilingsInformation");
    private final static QName _FinancialAssetArticle_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialAssetArticle");
    private final static QName _Banking_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Banking");
    private final static QName _BaseBalanceSheetType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BaseBalanceSheetType");
    private final static QName _DNBScore_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DNBScore");
    private final static QName _PrincipalDetailForLinkage_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PrincipalDetailForLinkage");
    private final static QName _SocialMediaDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SocialMediaDetail");
    private final static QName _ExportCountryDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ExportCountryDetails");
    private final static QName _StockTradingInformation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "StockTradingInformation");
    private final static QName _ManagementResponsibilityText_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ManagementResponsibilityText");
    private final static QName _ContractsSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ContractsSummary");
    private final static QName _CreditDecisionDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CreditDecisionDetail");
    private final static QName _AccountPayment_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AccountPayment");
    private final static QName _EmploymentBiography_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "EmploymentBiography");
    private final static QName _PastDueCycleSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PastDueCycleSummary");
    private final static QName _RegisteredAddressType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RegisteredAddressType");
    private final static QName _ManagementFinancialTrendData_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ManagementFinancialTrendData");
    private final static QName _ScoreNormNewType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ScoreNormNewType");
    private final static QName _FilingOrganizationNameBaseType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FilingOrganizationNameBaseType");
    private final static QName _SubjectIdentificationNumberType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubjectIdentificationNumberType");
    private final static QName _PurchaserDerivedNetTermsPayments_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PurchaserDerivedNetTermsPayments");
    private final static QName _SubChapterContentDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SubChapterContentDetail");
    private final static QName _DNBStandardRatingTypeForPrincipal_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "DNBStandardRatingTypeForPrincipal");
    private final static QName _UnclassifiedAccountPeriodSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "UnclassifiedAccountPeriodSummaryType");
    private final static QName _CreditDecisionSpecification_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CreditDecisionSpecification");
    private final static QName _LitigationCourtDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LitigationCourtDetail");
    private final static QName _FamilyTreeAssociation_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FamilyTreeAssociation");
    private final static QName _SocioEconomicIdentification_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SocioEconomicIdentification");
    private final static QName _GeographicNormType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GeographicNormType");
    private final static QName _TextEntry_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "TextEntry");
    private final static QName _ViabilityScoreType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ViabilityScoreType");
    private final static QName _UCCFilingSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "UCCFilingSummaryType");
    private final static QName _PaymentMannerExperienceSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PaymentMannerExperienceSummaryType");
    private final static QName _PositionForCorporateDirectorship_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "PositionForCorporateDirectorship");
    private final static QName _SocioEconomicCharacteristicDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SocioEconomicCharacteristicDetail");
    private final static QName _GetSupplierRegistrationBatchStatusRequest_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GetSupplierRegistrationBatchStatusRequest");
    private final static QName _IndustryProfileDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IndustryProfileDetail");
    private final static QName _Principal_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Principal");
    private final static QName _NewsDetails_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "NewsDetails");
    private final static QName _ThirdPartyAssessmentReason_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ThirdPartyAssessmentReason");
    private final static QName _IndustryChapterDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "IndustryChapterDetail");
    private final static QName _AssetArticleSummary_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AssetArticleSummary");
    private final static QName _Linkage_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "Linkage");
    private final static QName _SanctionDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "SanctionDetail");
    private final static QName _ResultMessage_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ResultMessage");
    private final static QName _AccountDetailsSectionType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "AccountDetailsSectionType");
    private final static QName _RatingOverrideReason_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "RatingOverrideReason");
    private final static QName _ShareCapitalDetailsType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ShareCapitalDetailsType");
    private final static QName _GlobalUltimateOrganizationForSupplier_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "GlobalUltimateOrganizationForSupplier");
    private final static QName _LegalEvents_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LegalEvents");
    private final static QName _CustomerProvidedSubjectNameType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CustomerProvidedSubjectNameType");
    private final static QName _ComparedToFinancialStatementHeaderForGrowthRate_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ComparedToFinancialStatementHeaderForGrowthRate");
    private final static QName _CompanySanctionDetail_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "CompanySanctionDetail");
    private final static QName _LoanAccountSummaryDetailType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "LoanAccountSummaryDetailType");
    private final static QName _OpenEndedCreditLineAccountPeriodSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "OpenEndedCreditLineAccountPeriodSummaryType");
    private final static QName _BaseAddressType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "BaseAddressType");
    private final static QName _FinancialAccountPeriodSummaryType_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "FinancialAccountPeriodSummaryType");
    private final static QName _ActivitiesAndOperations_QNAME = new QName("http://services.dnb.com/CustomProductServiceV2.0", "ActivitiesAndOperations");
    private final static QName _AccountSummaryTypeTotalAvailableCreditAmount_QNAME = new QName("", "TotalAvailableCreditAmount");
    private final static QName _AccountSummaryTypeTotalCurrentCreditLineAmount_QNAME = new QName("", "TotalCurrentCreditLineAmount");
    private final static QName _AccountSummaryTypeTotalCurrentBalanceAmount_QNAME = new QName("", "TotalCurrentBalanceAmount");
    private final static QName _AccountSummaryTypeTotalBalloonAmount_QNAME = new QName("", "TotalBalloonAmount");
    private final static QName _PastDuePercentageCycleSummaryPastDuePercentage_QNAME = new QName("", "PastDuePercentage");
    private final static QName _AccountDetailHighBalanceAmount_QNAME = new QName("", "HighBalanceAmount");
    private final static QName _AccountDetailLenderID_QNAME = new QName("", "LenderID");
    private final static QName _AccountDetailLenderName_QNAME = new QName("", "LenderName");
    private final static QName _AccountDetailAvailableCreditAmount_QNAME = new QName("", "AvailableCreditAmount");
    private final static QName _AccountDetailLastPaymentDate_QNAME = new QName("", "LastPaymentDate");
    private final static QName _AccountDetailMaturityDate_QNAME = new QName("", "MaturityDate");
    private final static QName _AccountDetailPaymentReportedDate_QNAME = new QName("", "PaymentReportedDate");
    private final static QName _AccountDetailOriginalAmount_QNAME = new QName("", "OriginalAmount");
    private final static QName _AccountDetailOpenedDate_QNAME = new QName("", "OpenedDate");
    private final static QName _AccountDetailBalloonAmount_QNAME = new QName("", "BalloonAmount");
    private final static QName _AccountDetailPaymentTypeText_QNAME = new QName("", "PaymentTypeText");
    private final static QName _AccountDetailAccountRelationshipText_QNAME = new QName("", "AccountRelationshipText");
    private final static QName _AccountDetailVoluntarilyClosedIndicator_QNAME = new QName("", "VoluntarilyClosedIndicator");
    private final static QName _AccountDetailBalloonPaymentDate_QNAME = new QName("", "BalloonPaymentDate");
    private final static QName _AccountDetailOpenAccountIndicator_QNAME = new QName("", "OpenAccountIndicator");
    private final static QName _AccountDetailCurrentCreditLineAmount_QNAME = new QName("", "CurrentCreditLineAmount");
    private final static QName _AccountDetailClosedDate_QNAME = new QName("", "ClosedDate");
    private final static QName _AccountDetailSecuredAccountIndicator_QNAME = new QName("", "SecuredAccountIndicator");
    private final static QName _AccountDetailCurrentBalanceAmount_QNAME = new QName("", "CurrentBalanceAmount");
    private final static QName _AccountDetailCollateralTypeText_QNAME = new QName("", "CollateralTypeText");
    private final static QName _AccountDetailPaymentFrequencyText_QNAME = new QName("", "PaymentFrequencyText");
    private final static QName _OverallSummaryTotalPastDueAmount_QNAME = new QName("", "TotalPastDueAmount");
    private final static QName _OverallSummaryTotalMinimumPaymentAmount_QNAME = new QName("", "TotalMinimumPaymentAmount");
    private final static QName _OverallSummaryTotalCurrentDueAmount_QNAME = new QName("", "TotalCurrentDueAmount");
    private final static QName _MiscellaneousDetailsCommentText_QNAME = new QName("", "CommentText");
    private final static QName _GuaranteeDetailsGuaranteedPaymentIndicator_QNAME = new QName("", "GuaranteedPaymentIndicator");
    private final static QName _GuaranteeDetailsAccountTypeText_QNAME = new QName("", "AccountTypeText");
    private final static QName _GuaranteeDetailsGuarantorsCount_QNAME = new QName("", "GuarantorsCount");
    private final static QName _CurrentPaymentCurrentDueAmount_QNAME = new QName("", "CurrentDueAmount");
    private final static QName _CurrentPaymentMinimumPaymentAmount_QNAME = new QName("", "MinimumPaymentAmount");
    private final static QName _PaymentHistorySummaryTotalNumberOfPaymentsPeriod_QNAME = new QName("", "TotalNumberOfPaymentsPeriod");
    private final static QName _PaymentHistorySummaryExperiencesTotalCount_QNAME = new QName("", "ExperiencesTotalCount");
    private final static QName _PaymentHistorySummaryTotalPaymentsCount_QNAME = new QName("", "TotalPaymentsCount");
    private final static QName _PaymentHistorySummaryPaymentPeriod_QNAME = new QName("", "PaymentPeriod");
    private final static QName _PaymentHistorySummaryTotalOnTimePaymentsCount_QNAME = new QName("", "TotalOnTimePaymentsCount");
    private final static QName _PaymentHistorySummaryPaymentWithinTermsCount_QNAME = new QName("", "PaymentWithinTermsCount");
    private final static QName _PaymentHistorySummaryTotalChargeOffAmount_QNAME = new QName("", "TotalChargeOffAmount");
    private final static QName _PaymentHistorySummaryTotalChargeOffRecoveredAmount_QNAME = new QName("", "TotalChargeOffRecoveredAmount");
    private final static QName _PaymentsCountCycleSummaryPastDuePaymentCount_QNAME = new QName("", "PastDuePaymentCount");
    private final static QName _GuarantorDetailsGovernmentGuaranteedProgramTypeText_QNAME = new QName("", "GovernmentGuaranteedProgramTypeText");
    private final static QName _GuarantorDetailsOwnershipPercentage_QNAME = new QName("", "OwnershipPercentage");
    private final static QName _GuarantorDetailsGuarantorTypeText_QNAME = new QName("", "GuarantorTypeText");
    private final static QName _GuarantorDetailsGuaranteePercentage_QNAME = new QName("", "GuaranteePercentage");
    private final static QName _GuarantorDetailsGuarantorName_QNAME = new QName("", "GuarantorName");
    private final static QName _OverallPaymentHistorySummaryOnTimePaymentsPercentage_QNAME = new QName("", "OnTimePaymentsPercentage");
    private final static QName _OverallPaymentHistorySummaryTotalChargeOffPaymentsCount_QNAME = new QName("", "TotalChargeOffPaymentsCount");
    private final static QName _PaymentHistoryChargeOffDate_QNAME = new QName("", "ChargeOffDate");
    private final static QName _PaymentHistoryPaymentHistoryPattern_QNAME = new QName("", "PaymentHistoryPattern");
    private final static QName _PaymentHistoryOnTimePaymentsCount_QNAME = new QName("", "OnTimePaymentsCount");
    private final static QName _PaymentHistoryChargeOffAmount_QNAME = new QName("", "ChargeOffAmount");
    private final static QName _PaymentHistoryNumberOfPaymentsPeriod_QNAME = new QName("", "NumberOfPaymentsPeriod");
    private final static QName _PaymentHistoryChargeOffRecoveredAmount_QNAME = new QName("", "ChargeOffRecoveredAmount");
    private final static QName _PastDueCycleSummaryPastDueAmount_QNAME = new QName("", "PastDueAmount");
    private final static QName _TotalPaymentsCountCycleSummaryTotalPastDuePaymentCount_QNAME = new QName("", "TotalPastDuePaymentCount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dnb.services.customproduct
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderProductRequestDetail }
     * 
     */
    public OrderProductRequestDetail createOrderProductRequestDetail() {
        return new OrderProductRequestDetail();
    }

    /**
     * Create an instance of {@link InclusionCriteria }
     * 
     */
    public InclusionCriteria createInclusionCriteria() {
        return new InclusionCriteria();
    }

    /**
     * Create an instance of {@link RegulationDetail }
     * 
     */
    public RegulationDetail createRegulationDetail() {
        return new RegulationDetail();
    }

    /**
     * Create an instance of {@link DNBStringType128 }
     * 
     */
    public DNBStringType128 createDNBStringType128() {
        return new DNBStringType128();
    }

    /**
     * Create an instance of {@link OrganizationSizeDetail }
     * 
     */
    public OrganizationSizeDetail createOrganizationSizeDetail() {
        return new OrganizationSizeDetail();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link DocumentFilingRequirementDetails }
     * 
     */
    public DocumentFilingRequirementDetails createDocumentFilingRequirementDetails() {
        return new DocumentFilingRequirementDetails();
    }

    /**
     * Create an instance of {@link EventDetail }
     * 
     */
    public EventDetail createEventDetail() {
        return new EventDetail();
    }

    /**
     * Create an instance of {@link GlobalStandardCashFlowStatement }
     * 
     */
    public GlobalStandardCashFlowStatement createGlobalStandardCashFlowStatement() {
        return new GlobalStandardCashFlowStatement();
    }

    /**
     * Create an instance of {@link CurrentManagementResponsibility }
     * 
     */
    public CurrentManagementResponsibility createCurrentManagementResponsibility() {
        return new CurrentManagementResponsibility();
    }

    /**
     * Create an instance of {@link PaymentDetailsDisclaimerInfo }
     * 
     */
    public PaymentDetailsDisclaimerInfo createPaymentDetailsDisclaimerInfo() {
        return new PaymentDetailsDisclaimerInfo();
    }

    /**
     * Create an instance of {@link SupplierAddressDetail }
     * 
     */
    public SupplierAddressDetail createSupplierAddressDetail() {
        return new SupplierAddressDetail();
    }

    /**
     * Create an instance of {@link TelecommunicationNumberSimpleType }
     * 
     */
    public TelecommunicationNumberSimpleType createTelecommunicationNumberSimpleType() {
        return new TelecommunicationNumberSimpleType();
    }

    /**
     * Create an instance of {@link ClaimType }
     * 
     */
    public ClaimType createClaimType() {
        return new ClaimType();
    }

    /**
     * Create an instance of {@link OtherLegalEventInformation }
     * 
     */
    public OtherLegalEventInformation createOtherLegalEventInformation() {
        return new OtherLegalEventInformation();
    }

    /**
     * Create an instance of {@link RolePlayerTextEntry }
     * 
     */
    public RolePlayerTextEntry createRolePlayerTextEntry() {
        return new RolePlayerTextEntry();
    }

    /**
     * Create an instance of {@link EmployeeCategoryDetails }
     * 
     */
    public EmployeeCategoryDetails createEmployeeCategoryDetails() {
        return new EmployeeCategoryDetails();
    }

    /**
     * Create an instance of {@link ResponseArchiveDetail }
     * 
     */
    public ResponseArchiveDetail createResponseArchiveDetail() {
        return new ResponseArchiveDetail();
    }

    /**
     * Create an instance of {@link ContactInterview }
     * 
     */
    public ContactInterview createContactInterview() {
        return new ContactInterview();
    }

    /**
     * Create an instance of {@link CompositePaydexScoreType }
     * 
     */
    public CompositePaydexScoreType createCompositePaydexScoreType() {
        return new CompositePaydexScoreType();
    }

    /**
     * Create an instance of {@link Compensation }
     * 
     */
    public Compensation createCompensation() {
        return new Compensation();
    }

    /**
     * Create an instance of {@link SubjectHeader }
     * 
     */
    public SubjectHeader createSubjectHeader() {
        return new SubjectHeader();
    }

    /**
     * Create an instance of {@link ThirdPartyAssessmenUnavailableReason }
     * 
     */
    public ThirdPartyAssessmenUnavailableReason createThirdPartyAssessmenUnavailableReason() {
        return new ThirdPartyAssessmenUnavailableReason();
    }

    /**
     * Create an instance of {@link LegalFormDetailsType }
     * 
     */
    public LegalFormDetailsType createLegalFormDetailsType() {
        return new LegalFormDetailsType();
    }

    /**
     * Create an instance of {@link GrowthRates }
     * 
     */
    public GrowthRates createGrowthRates() {
        return new GrowthRates();
    }

    /**
     * Create an instance of {@link SearchBaseAddressType }
     * 
     */
    public SearchBaseAddressType createSearchBaseAddressType() {
        return new SearchBaseAddressType();
    }

    /**
     * Create an instance of {@link TerritorialSummary }
     * 
     */
    public TerritorialSummary createTerritorialSummary() {
        return new TerritorialSummary();
    }

    /**
     * Create an instance of {@link BaseEventType }
     * 
     */
    public BaseEventType createBaseEventType() {
        return new BaseEventType();
    }

    /**
     * Create an instance of {@link RequestedPublicFilingDetail }
     * 
     */
    public RequestedPublicFilingDetail createRequestedPublicFilingDetail() {
        return new RequestedPublicFilingDetail();
    }

    /**
     * Create an instance of {@link AirportConcessionDisadvantagedBusinessEnterpriseDetail }
     * 
     */
    public AirportConcessionDisadvantagedBusinessEnterpriseDetail createAirportConcessionDisadvantagedBusinessEnterpriseDetail() {
        return new AirportConcessionDisadvantagedBusinessEnterpriseDetail();
    }

    /**
     * Create an instance of {@link Officers }
     * 
     */
    public Officers createOfficers() {
        return new Officers();
    }

    /**
     * Create an instance of {@link SBRIScore }
     * 
     */
    public SBRIScore createSBRIScore() {
        return new SBRIScore();
    }

    /**
     * Create an instance of {@link TransactionResult }
     * 
     */
    public TransactionResult createTransactionResult() {
        return new TransactionResult();
    }

    /**
     * Create an instance of {@link ResponseTransactionDetail }
     * 
     */
    public ResponseTransactionDetail createResponseTransactionDetail() {
        return new ResponseTransactionDetail();
    }

    /**
     * Create an instance of {@link AddSupplierNotesRequest }
     * 
     */
    public AddSupplierNotesRequest createAddSupplierNotesRequest() {
        return new AddSupplierNotesRequest();
    }

    /**
     * Create an instance of {@link AmountsPayable }
     * 
     */
    public AmountsPayable createAmountsPayable() {
        return new AmountsPayable();
    }

    /**
     * Create an instance of {@link CustomerFileDetails }
     * 
     */
    public CustomerFileDetails createCustomerFileDetails() {
        return new CustomerFileDetails();
    }

    /**
     * Create an instance of {@link StatementHeaderType }
     * 
     */
    public StatementHeaderType createStatementHeaderType() {
        return new StatementHeaderType();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link SpecialInvestigationInformation }
     * 
     */
    public SpecialInvestigationInformation createSpecialInvestigationInformation() {
        return new SpecialInvestigationInformation();
    }

    /**
     * Create an instance of {@link OrganizationPrimaryNameType }
     * 
     */
    public OrganizationPrimaryNameType createOrganizationPrimaryNameType() {
        return new OrganizationPrimaryNameType();
    }

    /**
     * Create an instance of {@link RegistrationSummary }
     * 
     */
    public RegistrationSummary createRegistrationSummary() {
        return new RegistrationSummary();
    }

    /**
     * Create an instance of {@link ThirdPartyDataType }
     * 
     */
    public ThirdPartyDataType createThirdPartyDataType() {
        return new ThirdPartyDataType();
    }

    /**
     * Create an instance of {@link WebPageAddressType }
     * 
     */
    public WebPageAddressType createWebPageAddressType() {
        return new WebPageAddressType();
    }

    /**
     * Create an instance of {@link TradingTermsDetailsType }
     * 
     */
    public TradingTermsDetailsType createTradingTermsDetailsType() {
        return new TradingTermsDetailsType();
    }

    /**
     * Create an instance of {@link BusinessTrading }
     * 
     */
    public BusinessTrading createBusinessTrading() {
        return new BusinessTrading();
    }

    /**
     * Create an instance of {@link SocialNetworkingDetail }
     * 
     */
    public SocialNetworkingDetail createSocialNetworkingDetail() {
        return new SocialNetworkingDetail();
    }

    /**
     * Create an instance of {@link ImportDetailsType }
     * 
     */
    public ImportDetailsType createImportDetailsType() {
        return new ImportDetailsType();
    }

    /**
     * Create an instance of {@link RequestedOrganizationChildLinkageSpecification }
     * 
     */
    public RequestedOrganizationChildLinkageSpecification createRequestedOrganizationChildLinkageSpecification() {
        return new RequestedOrganizationChildLinkageSpecification();
    }

    /**
     * Create an instance of {@link GetSupplierListResponseDetail }
     * 
     */
    public GetSupplierListResponseDetail createGetSupplierListResponseDetail() {
        return new GetSupplierListResponseDetail();
    }

    /**
     * Create an instance of {@link TaxPaymentAssessment }
     * 
     */
    public TaxPaymentAssessment createTaxPaymentAssessment() {
        return new TaxPaymentAssessment();
    }

    /**
     * Create an instance of {@link IndustryCodeSummaryType }
     * 
     */
    public IndustryCodeSummaryType createIndustryCodeSummaryType() {
        return new IndustryCodeSummaryType();
    }

    /**
     * Create an instance of {@link OverallSummary }
     * 
     */
    public OverallSummary createOverallSummary() {
        return new OverallSummary();
    }

    /**
     * Create an instance of {@link InquirerIndustrySummaryType }
     * 
     */
    public InquirerIndustrySummaryType createInquirerIndustrySummaryType() {
        return new InquirerIndustrySummaryType();
    }

    /**
     * Create an instance of {@link InsolvencyProcessSummaryType }
     * 
     */
    public InsolvencyProcessSummaryType createInsolvencyProcessSummaryType() {
        return new InsolvencyProcessSummaryType();
    }

    /**
     * Create an instance of {@link Directors }
     * 
     */
    public Directors createDirectors() {
        return new Directors();
    }

    /**
     * Create an instance of {@link RolePlayerDetailsBaseType }
     * 
     */
    public RolePlayerDetailsBaseType createRolePlayerDetailsBaseType() {
        return new RolePlayerDetailsBaseType();
    }

    /**
     * Create an instance of {@link ReferenceDetail }
     * 
     */
    public ReferenceDetail createReferenceDetail() {
        return new ReferenceDetail();
    }

    /**
     * Create an instance of {@link NotesToAccountsStatementItem }
     * 
     */
    public NotesToAccountsStatementItem createNotesToAccountsStatementItem() {
        return new NotesToAccountsStatementItem();
    }

    /**
     * Create an instance of {@link SubjectComplianceDetail }
     * 
     */
    public SubjectComplianceDetail createSubjectComplianceDetail() {
        return new SubjectComplianceDetail();
    }

    /**
     * Create an instance of {@link VehicleDetailsType }
     * 
     */
    public VehicleDetailsType createVehicleDetailsType() {
        return new VehicleDetailsType();
    }

    /**
     * Create an instance of {@link LeaseAccountPeriodSummaryType }
     * 
     */
    public LeaseAccountPeriodSummaryType createLeaseAccountPeriodSummaryType() {
        return new LeaseAccountPeriodSummaryType();
    }

    /**
     * Create an instance of {@link PrincipalIdentificationNumberType }
     * 
     */
    public PrincipalIdentificationNumberType createPrincipalIdentificationNumberType() {
        return new PrincipalIdentificationNumberType();
    }

    /**
     * Create an instance of {@link UpwardAssociation }
     * 
     */
    public UpwardAssociation createUpwardAssociation() {
        return new UpwardAssociation();
    }

    /**
     * Create an instance of {@link DNBStringType256 }
     * 
     */
    public DNBStringType256 createDNBStringType256() {
        return new DNBStringType256();
    }

    /**
     * Create an instance of {@link SupplierEvaluationRiskScore }
     * 
     */
    public SupplierEvaluationRiskScore createSupplierEvaluationRiskScore() {
        return new SupplierEvaluationRiskScore();
    }

    /**
     * Create an instance of {@link RegulatorDetail }
     * 
     */
    public RegulatorDetail createRegulatorDetail() {
        return new RegulatorDetail();
    }

    /**
     * Create an instance of {@link DUNSAuditTrail }
     * 
     */
    public DUNSAuditTrail createDUNSAuditTrail() {
        return new DUNSAuditTrail();
    }

    /**
     * Create an instance of {@link BankAccount }
     * 
     */
    public BankAccount createBankAccount() {
        return new BankAccount();
    }

    /**
     * Create an instance of {@link LienSummaryType }
     * 
     */
    public LienSummaryType createLienSummaryType() {
        return new LienSummaryType();
    }

    /**
     * Create an instance of {@link DebarmentsInformation }
     * 
     */
    public DebarmentsInformation createDebarmentsInformation() {
        return new DebarmentsInformation();
    }

    /**
     * Create an instance of {@link NotesToAccounts }
     * 
     */
    public NotesToAccounts createNotesToAccounts() {
        return new NotesToAccounts();
    }

    /**
     * Create an instance of {@link PaymentExperienceType }
     * 
     */
    public PaymentExperienceType createPaymentExperienceType() {
        return new PaymentExperienceType();
    }

    /**
     * Create an instance of {@link AccountSummaryType }
     * 
     */
    public AccountSummaryType createAccountSummaryType() {
        return new AccountSummaryType();
    }

    /**
     * Create an instance of {@link EventResult }
     * 
     */
    public EventResult createEventResult() {
        return new EventResult();
    }

    /**
     * Create an instance of {@link ProfileSubChapterDetail }
     * 
     */
    public ProfileSubChapterDetail createProfileSubChapterDetail() {
        return new ProfileSubChapterDetail();
    }

    /**
     * Create an instance of {@link DataProviderSummaryType }
     * 
     */
    public DataProviderSummaryType createDataProviderSummaryType() {
        return new DataProviderSummaryType();
    }

    /**
     * Create an instance of {@link SocioEconomicReferenceDetailType }
     * 
     */
    public SocioEconomicReferenceDetailType createSocioEconomicReferenceDetailType() {
        return new SocioEconomicReferenceDetailType();
    }

    /**
     * Create an instance of {@link PurchaserDerivedDataCoveragePayments }
     * 
     */
    public PurchaserDerivedDataCoveragePayments createPurchaserDerivedDataCoveragePayments() {
        return new PurchaserDerivedDataCoveragePayments();
    }

    /**
     * Create an instance of {@link FinancialNetRevenue }
     * 
     */
    public FinancialNetRevenue createFinancialNetRevenue() {
        return new FinancialNetRevenue();
    }

    /**
     * Create an instance of {@link IndustryCreditScoringSpecification }
     * 
     */
    public IndustryCreditScoringSpecification createIndustryCreditScoringSpecification() {
        return new IndustryCreditScoringSpecification();
    }

    /**
     * Create an instance of {@link CreditRangePaymentExperienceSummaryType }
     * 
     */
    public CreditRangePaymentExperienceSummaryType createCreditRangePaymentExperienceSummaryType() {
        return new CreditRangePaymentExperienceSummaryType();
    }

    /**
     * Create an instance of {@link FilingInquiryDetail }
     * 
     */
    public FilingInquiryDetail createFilingInquiryDetail() {
        return new FilingInquiryDetail();
    }

    /**
     * Create an instance of {@link IndustryPaymentExperienceSummaryType }
     * 
     */
    public IndustryPaymentExperienceSummaryType createIndustryPaymentExperienceSummaryType() {
        return new IndustryPaymentExperienceSummaryType();
    }

    /**
     * Create an instance of {@link SubjectAddressUsageTenureDetail }
     * 
     */
    public SubjectAddressUsageTenureDetail createSubjectAddressUsageTenureDetail() {
        return new SubjectAddressUsageTenureDetail();
    }

    /**
     * Create an instance of {@link IndividualNameType }
     * 
     */
    public IndividualNameType createIndividualNameType() {
        return new IndividualNameType();
    }

    /**
     * Create an instance of {@link PeriodSummaryType }
     * 
     */
    public PeriodSummaryType createPeriodSummaryType() {
        return new PeriodSummaryType();
    }

    /**
     * Create an instance of {@link PrincipalReferenceText }
     * 
     */
    public PrincipalReferenceText createPrincipalReferenceText() {
        return new PrincipalReferenceText();
    }

    /**
     * Create an instance of {@link GetSupplierListResponse }
     * 
     */
    public GetSupplierListResponse createGetSupplierListResponse() {
        return new GetSupplierListResponse();
    }

    /**
     * Create an instance of {@link PortfolioComparisonScoreType }
     * 
     */
    public PortfolioComparisonScoreType createPortfolioComparisonScoreType() {
        return new PortfolioComparisonScoreType();
    }

    /**
     * Create an instance of {@link PrincipalSummaryType }
     * 
     */
    public PrincipalSummaryType createPrincipalSummaryType() {
        return new PrincipalSummaryType();
    }

    /**
     * Create an instance of {@link SubjectAddress }
     * 
     */
    public SubjectAddress createSubjectAddress() {
        return new SubjectAddress();
    }

    /**
     * Create an instance of {@link WorldWatchHeadlineDetails }
     * 
     */
    public WorldWatchHeadlineDetails createWorldWatchHeadlineDetails() {
        return new WorldWatchHeadlineDetails();
    }

    /**
     * Create an instance of {@link TextEntryType }
     * 
     */
    public TextEntryType createTextEntryType() {
        return new TextEntryType();
    }

    /**
     * Create an instance of {@link AccountantDetails }
     * 
     */
    public AccountantDetails createAccountantDetails() {
        return new AccountantDetails();
    }

    /**
     * Create an instance of {@link FinancingStatementFilingPeriodSummary }
     * 
     */
    public FinancingStatementFilingPeriodSummary createFinancingStatementFilingPeriodSummary() {
        return new FinancingStatementFilingPeriodSummary();
    }

    /**
     * Create an instance of {@link RolePalyerAddressType }
     * 
     */
    public RolePalyerAddressType createRolePalyerAddressType() {
        return new RolePalyerAddressType();
    }

    /**
     * Create an instance of {@link SupplierDetail }
     * 
     */
    public SupplierDetail createSupplierDetail() {
        return new SupplierDetail();
    }

    /**
     * Create an instance of {@link GlobalFailureRiskScoreType }
     * 
     */
    public GlobalFailureRiskScoreType createGlobalFailureRiskScoreType() {
        return new GlobalFailureRiskScoreType();
    }

    /**
     * Create an instance of {@link TaxDetailType }
     * 
     */
    public TaxDetailType createTaxDetailType() {
        return new TaxDetailType();
    }

    /**
     * Create an instance of {@link SubsequentEventDetail }
     * 
     */
    public SubsequentEventDetail createSubsequentEventDetail() {
        return new SubsequentEventDetail();
    }

    /**
     * Create an instance of {@link FinancialStatementHeaderGrowthRate }
     * 
     */
    public FinancialStatementHeaderGrowthRate createFinancialStatementHeaderGrowthRate() {
        return new FinancialStatementHeaderGrowthRate();
    }

    /**
     * Create an instance of {@link SimpleAddress }
     * 
     */
    public SimpleAddress createSimpleAddress() {
        return new SimpleAddress();
    }

    /**
     * Create an instance of {@link FormerPrimaryAddress }
     * 
     */
    public FormerPrimaryAddress createFormerPrimaryAddress() {
        return new FormerPrimaryAddress();
    }

    /**
     * Create an instance of {@link UCCFilingType }
     * 
     */
    public UCCFilingType createUCCFilingType() {
        return new UCCFilingType();
    }

    /**
     * Create an instance of {@link RelatedPartyDetail }
     * 
     */
    public RelatedPartyDetail createRelatedPartyDetail() {
        return new RelatedPartyDetail();
    }

    /**
     * Create an instance of {@link ChapterContentDetail }
     * 
     */
    public ChapterContentDetail createChapterContentDetail() {
        return new ChapterContentDetail();
    }

    /**
     * Create an instance of {@link Financial }
     * 
     */
    public Financial createFinancial() {
        return new Financial();
    }

    /**
     * Create an instance of {@link UploadSupplierDocumentRequest }
     * 
     */
    public UploadSupplierDocumentRequest createUploadSupplierDocumentRequest() {
        return new UploadSupplierDocumentRequest();
    }

    /**
     * Create an instance of {@link CurrentAssets }
     * 
     */
    public CurrentAssets createCurrentAssets() {
        return new CurrentAssets();
    }

    /**
     * Create an instance of {@link PaymentExperienceSummary }
     * 
     */
    public PaymentExperienceSummary createPaymentExperienceSummary() {
        return new PaymentExperienceSummary();
    }

    /**
     * Create an instance of {@link BorrowerAnalyticsCycleSummary }
     * 
     */
    public BorrowerAnalyticsCycleSummary createBorrowerAnalyticsCycleSummary() {
        return new BorrowerAnalyticsCycleSummary();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link KeyFinancialFiguresOverview }
     * 
     */
    public KeyFinancialFiguresOverview createKeyFinancialFiguresOverview() {
        return new KeyFinancialFiguresOverview();
    }

    /**
     * Create an instance of {@link TradeDataAvailabilityDetail }
     * 
     */
    public TradeDataAvailabilityDetail createTradeDataAvailabilityDetail() {
        return new TradeDataAvailabilityDetail();
    }

    /**
     * Create an instance of {@link PaydexScoreHistoryType }
     * 
     */
    public PaydexScoreHistoryType createPaydexScoreHistoryType() {
        return new PaydexScoreHistoryType();
    }

    /**
     * Create an instance of {@link RetrieveProductResponseDetail }
     * 
     */
    public RetrieveProductResponseDetail createRetrieveProductResponseDetail() {
        return new RetrieveProductResponseDetail();
    }

    /**
     * Create an instance of {@link SupplierDetailForNotes }
     * 
     */
    public SupplierDetailForNotes createSupplierDetailForNotes() {
        return new SupplierDetailForNotes();
    }

    /**
     * Create an instance of {@link LienType }
     * 
     */
    public LienType createLienType() {
        return new LienType();
    }

    /**
     * Create an instance of {@link PastDuePercentageCycleSummary }
     * 
     */
    public PastDuePercentageCycleSummary createPastDuePercentageCycleSummary() {
        return new PastDuePercentageCycleSummary();
    }

    /**
     * Create an instance of {@link LettersOfCreditAccountSummaryDetailType }
     * 
     */
    public LettersOfCreditAccountSummaryDetailType createLettersOfCreditAccountSummaryDetailType() {
        return new LettersOfCreditAccountSummaryDetailType();
    }

    /**
     * Create an instance of {@link LegalEventBaseType }
     * 
     */
    public LegalEventBaseType createLegalEventBaseType() {
        return new LegalEventBaseType();
    }

    /**
     * Create an instance of {@link OrganizationIdentificationNumberType }
     * 
     */
    public OrganizationIdentificationNumberType createOrganizationIdentificationNumberType() {
        return new OrganizationIdentificationNumberType();
    }

    /**
     * Create an instance of {@link SupplierDetailForCustomerProvidedInformation }
     * 
     */
    public SupplierDetailForCustomerProvidedInformation createSupplierDetailForCustomerProvidedInformation() {
        return new SupplierDetailForCustomerProvidedInformation();
    }

    /**
     * Create an instance of {@link FormerOrganizationPrimaryNameType }
     * 
     */
    public FormerOrganizationPrimaryNameType createFormerOrganizationPrimaryNameType() {
        return new FormerOrganizationPrimaryNameType();
    }

    /**
     * Create an instance of {@link ChildAssociation }
     * 
     */
    public ChildAssociation createChildAssociation() {
        return new ChildAssociation();
    }

    /**
     * Create an instance of {@link PremisesInternalUnitDetailType }
     * 
     */
    public PremisesInternalUnitDetailType createPremisesInternalUnitDetailType() {
        return new PremisesInternalUnitDetailType();
    }

    /**
     * Create an instance of {@link RegisterSupplierRequest }
     * 
     */
    public RegisterSupplierRequest createRegisterSupplierRequest() {
        return new RegisterSupplierRequest();
    }

    /**
     * Create an instance of {@link Rating }
     * 
     */
    public Rating createRating() {
        return new Rating();
    }

    /**
     * Create an instance of {@link TelecommunicationNumberType }
     * 
     */
    public TelecommunicationNumberType createTelecommunicationNumberType() {
        return new TelecommunicationNumberType();
    }

    /**
     * Create an instance of {@link FreeFormStatementItem }
     * 
     */
    public FreeFormStatementItem createFreeFormStatementItem() {
        return new FreeFormStatementItem();
    }

    /**
     * Create an instance of {@link BorrowerAnalyticsType }
     * 
     */
    public BorrowerAnalyticsType createBorrowerAnalyticsType() {
        return new BorrowerAnalyticsType();
    }

    /**
     * Create an instance of {@link CommercialCardAccountPeriodSummaryType }
     * 
     */
    public CommercialCardAccountPeriodSummaryType createCommercialCardAccountPeriodSummaryType() {
        return new CommercialCardAccountPeriodSummaryType();
    }

    /**
     * Create an instance of {@link MatchResult }
     * 
     */
    public MatchResult createMatchResult() {
        return new MatchResult();
    }

    /**
     * Create an instance of {@link SupplierPerformanceScoreType }
     * 
     */
    public SupplierPerformanceScoreType createSupplierPerformanceScoreType() {
        return new SupplierPerformanceScoreType();
    }

    /**
     * Create an instance of {@link SmallBusinessFinancialExchangeType }
     * 
     */
    public SmallBusinessFinancialExchangeType createSmallBusinessFinancialExchangeType() {
        return new SmallBusinessFinancialExchangeType();
    }

    /**
     * Create an instance of {@link ClaimSummary }
     * 
     */
    public ClaimSummary createClaimSummary() {
        return new ClaimSummary();
    }

    /**
     * Create an instance of {@link FinancialStatementCommentsType }
     * 
     */
    public FinancialStatementCommentsType createFinancialStatementCommentsType() {
        return new FinancialStatementCommentsType();
    }

    /**
     * Create an instance of {@link GlobalCurrentAssets }
     * 
     */
    public GlobalCurrentAssets createGlobalCurrentAssets() {
        return new GlobalCurrentAssets();
    }

    /**
     * Create an instance of {@link USPatriotActComplianceRiskScore }
     * 
     */
    public USPatriotActComplianceRiskScore createUSPatriotActComplianceRiskScore() {
        return new USPatriotActComplianceRiskScore();
    }

    /**
     * Create an instance of {@link AlertDetail }
     * 
     */
    public AlertDetail createAlertDetail() {
        return new AlertDetail();
    }

    /**
     * Create an instance of {@link OperatingStatusComment }
     * 
     */
    public OperatingStatusComment createOperatingStatusComment() {
        return new OperatingStatusComment();
    }

    /**
     * Create an instance of {@link CreditBureauSpecification }
     * 
     */
    public CreditBureauSpecification createCreditBureauSpecification() {
        return new CreditBureauSpecification();
    }

    /**
     * Create an instance of {@link GetSupplierRegistrationBatchStatusRequestDetail }
     * 
     */
    public GetSupplierRegistrationBatchStatusRequestDetail createGetSupplierRegistrationBatchStatusRequestDetail() {
        return new GetSupplierRegistrationBatchStatusRequestDetail();
    }

    /**
     * Create an instance of {@link PoliticalDistrict }
     * 
     */
    public PoliticalDistrict createPoliticalDistrict() {
        return new PoliticalDistrict();
    }

    /**
     * Create an instance of {@link PremisesUsageDetail }
     * 
     */
    public PremisesUsageDetail createPremisesUsageDetail() {
        return new PremisesUsageDetail();
    }

    /**
     * Create an instance of {@link DNBDecodedStringNewType }
     * 
     */
    public DNBDecodedStringNewType createDNBDecodedStringNewType() {
        return new DNBDecodedStringNewType();
    }

    /**
     * Create an instance of {@link InquiryDetailForAlert }
     * 
     */
    public InquiryDetailForAlert createInquiryDetailForAlert() {
        return new InquiryDetailForAlert();
    }

    /**
     * Create an instance of {@link IssuerInformation }
     * 
     */
    public IssuerInformation createIssuerInformation() {
        return new IssuerInformation();
    }

    /**
     * Create an instance of {@link PaydexScoreIndustryNormsType }
     * 
     */
    public PaydexScoreIndustryNormsType createPaydexScoreIndustryNormsType() {
        return new PaydexScoreIndustryNormsType();
    }

    /**
     * Create an instance of {@link ShareCapitalDetailsHistoryType }
     * 
     */
    public ShareCapitalDetailsHistoryType createShareCapitalDetailsHistoryType() {
        return new ShareCapitalDetailsHistoryType();
    }

    /**
     * Create an instance of {@link Shareholder }
     * 
     */
    public Shareholder createShareholder() {
        return new Shareholder();
    }

    /**
     * Create an instance of {@link TotalPaymentsCountCycleSummary }
     * 
     */
    public TotalPaymentsCountCycleSummary createTotalPaymentsCountCycleSummary() {
        return new TotalPaymentsCountCycleSummary();
    }

    /**
     * Create an instance of {@link JudgmentType }
     * 
     */
    public JudgmentType createJudgmentType() {
        return new JudgmentType();
    }

    /**
     * Create an instance of {@link BusinessAgeNorm }
     * 
     */
    public BusinessAgeNorm createBusinessAgeNorm() {
        return new BusinessAgeNorm();
    }

    /**
     * Create an instance of {@link CashFlowStatement }
     * 
     */
    public CashFlowStatement createCashFlowStatement() {
        return new CashFlowStatement();
    }

    /**
     * Create an instance of {@link DNBStringType }
     * 
     */
    public DNBStringType createDNBStringType() {
        return new DNBStringType();
    }

    /**
     * Create an instance of {@link ParentEventsType }
     * 
     */
    public ParentEventsType createParentEventsType() {
        return new ParentEventsType();
    }

    /**
     * Create an instance of {@link CurrentPayment }
     * 
     */
    public CurrentPayment createCurrentPayment() {
        return new CurrentPayment();
    }

    /**
     * Create an instance of {@link SuitType }
     * 
     */
    public SuitType createSuitType() {
        return new SuitType();
    }

    /**
     * Create an instance of {@link SummarizedSlowType }
     * 
     */
    public SummarizedSlowType createSummarizedSlowType() {
        return new SummarizedSlowType();
    }

    /**
     * Create an instance of {@link RegionAddressLine }
     * 
     */
    public RegionAddressLine createRegionAddressLine() {
        return new RegionAddressLine();
    }

    /**
     * Create an instance of {@link ShareholderForRegisterSupplier }
     * 
     */
    public ShareholderForRegisterSupplier createShareholderForRegisterSupplier() {
        return new ShareholderForRegisterSupplier();
    }

    /**
     * Create an instance of {@link InquirySummaryType }
     * 
     */
    public InquirySummaryType createInquirySummaryType() {
        return new InquirySummaryType();
    }

    /**
     * Create an instance of {@link NationalPercentileIndustryNorm }
     * 
     */
    public NationalPercentileIndustryNorm createNationalPercentileIndustryNorm() {
        return new NationalPercentileIndustryNorm();
    }

    /**
     * Create an instance of {@link PurchaserDerivedCashPayments }
     * 
     */
    public PurchaserDerivedCashPayments createPurchaserDerivedCashPayments() {
        return new PurchaserDerivedCashPayments();
    }

    /**
     * Create an instance of {@link OwnershipEthnicityType }
     * 
     */
    public OwnershipEthnicityType createOwnershipEthnicityType() {
        return new OwnershipEthnicityType();
    }

    /**
     * Create an instance of {@link StreetAddressLine }
     * 
     */
    public StreetAddressLine createStreetAddressLine() {
        return new StreetAddressLine();
    }

    /**
     * Create an instance of {@link ChildrenSummary }
     * 
     */
    public ChildrenSummary createChildrenSummary() {
        return new ChildrenSummary();
    }

    /**
     * Create an instance of {@link MessageGroup }
     * 
     */
    public MessageGroup createMessageGroup() {
        return new MessageGroup();
    }

    /**
     * Create an instance of {@link EmployeeDetailsType }
     * 
     */
    public EmployeeDetailsType createEmployeeDetailsType() {
        return new EmployeeDetailsType();
    }

    /**
     * Create an instance of {@link RegisterSupplierSpecification }
     * 
     */
    public RegisterSupplierSpecification createRegisterSupplierSpecification() {
        return new RegisterSupplierSpecification();
    }

    /**
     * Create an instance of {@link BoardMemberService }
     * 
     */
    public BoardMemberService createBoardMemberService() {
        return new BoardMemberService();
    }

    /**
     * Create an instance of {@link FreeFormEvent }
     * 
     */
    public FreeFormEvent createFreeFormEvent() {
        return new FreeFormEvent();
    }

    /**
     * Create an instance of {@link CommercialCollectionClaimDetails }
     * 
     */
    public CommercialCollectionClaimDetails createCommercialCollectionClaimDetails() {
        return new CommercialCollectionClaimDetails();
    }

    /**
     * Create an instance of {@link OrderProductResponseDetail }
     * 
     */
    public OrderProductResponseDetail createOrderProductResponseDetail() {
        return new OrderProductResponseDetail();
    }

    /**
     * Create an instance of {@link BankReference }
     * 
     */
    public BankReference createBankReference() {
        return new BankReference();
    }

    /**
     * Create an instance of {@link DamagedAssetsDetailType }
     * 
     */
    public DamagedAssetsDetailType createDamagedAssetsDetailType() {
        return new DamagedAssetsDetailType();
    }

    /**
     * Create an instance of {@link GuarantorDetailsType }
     * 
     */
    public GuarantorDetailsType createGuarantorDetailsType() {
        return new GuarantorDetailsType();
    }

    /**
     * Create an instance of {@link LongTermAssets }
     * 
     */
    public LongTermAssets createLongTermAssets() {
        return new LongTermAssets();
    }

    /**
     * Create an instance of {@link PaymentDataSummaryViewType }
     * 
     */
    public PaymentDataSummaryViewType createPaymentDataSummaryViewType() {
        return new PaymentDataSummaryViewType();
    }

    /**
     * Create an instance of {@link PrincipalsAndManagement }
     * 
     */
    public PrincipalsAndManagement createPrincipalsAndManagement() {
        return new PrincipalsAndManagement();
    }

    /**
     * Create an instance of {@link RegisteredAddressForSBFE }
     * 
     */
    public RegisteredAddressForSBFE createRegisteredAddressForSBFE() {
        return new RegisteredAddressForSBFE();
    }

    /**
     * Create an instance of {@link RevolvingAccountPeriodSummaryType }
     * 
     */
    public RevolvingAccountPeriodSummaryType createRevolvingAccountPeriodSummaryType() {
        return new RevolvingAccountPeriodSummaryType();
    }

    /**
     * Create an instance of {@link AssetGroupDetailType }
     * 
     */
    public AssetGroupDetailType createAssetGroupDetailType() {
        return new AssetGroupDetailType();
    }

    /**
     * Create an instance of {@link PositionForPrincipalOfPrincipal }
     * 
     */
    public PositionForPrincipalOfPrincipal createPositionForPrincipalOfPrincipal() {
        return new PositionForPrincipalOfPrincipal();
    }

    /**
     * Create an instance of {@link BorrowerAnalyticsOverallSummary }
     * 
     */
    public BorrowerAnalyticsOverallSummary createBorrowerAnalyticsOverallSummary() {
        return new BorrowerAnalyticsOverallSummary();
    }

    /**
     * Create an instance of {@link SummarizedPastDuePeriodViewType }
     * 
     */
    public SummarizedPastDuePeriodViewType createSummarizedPastDuePeriodViewType() {
        return new SummarizedPastDuePeriodViewType();
    }

    /**
     * Create an instance of {@link BankruptcyType }
     * 
     */
    public BankruptcyType createBankruptcyType() {
        return new BankruptcyType();
    }

    /**
     * Create an instance of {@link ImpactDetailType }
     * 
     */
    public ImpactDetailType createImpactDetailType() {
        return new ImpactDetailType();
    }

    /**
     * Create an instance of {@link IndustryProfile }
     * 
     */
    public IndustryProfile createIndustryProfile() {
        return new IndustryProfile();
    }

    /**
     * Create an instance of {@link CommunicationEventTextualComponents }
     * 
     */
    public CommunicationEventTextualComponents createCommunicationEventTextualComponents() {
        return new CommunicationEventTextualComponents();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link TransferDUNSNumberRegistration }
     * 
     */
    public TransferDUNSNumberRegistration createTransferDUNSNumberRegistration() {
        return new TransferDUNSNumberRegistration();
    }

    /**
     * Create an instance of {@link UploadSupplierDocumentRequestDetail }
     * 
     */
    public UploadSupplierDocumentRequestDetail createUploadSupplierDocumentRequestDetail() {
        return new UploadSupplierDocumentRequestDetail();
    }

    /**
     * Create an instance of {@link ClassScoreNormType }
     * 
     */
    public ClassScoreNormType createClassScoreNormType() {
        return new ClassScoreNormType();
    }

    /**
     * Create an instance of {@link DocumentFilingDetails }
     * 
     */
    public DocumentFilingDetails createDocumentFilingDetails() {
        return new DocumentFilingDetails();
    }

    /**
     * Create an instance of {@link LegalEventAssociationType }
     * 
     */
    public LegalEventAssociationType createLegalEventAssociationType() {
        return new LegalEventAssociationType();
    }

    /**
     * Create an instance of {@link CountrySanctionDetail }
     * 
     */
    public CountrySanctionDetail createCountrySanctionDetail() {
        return new CountrySanctionDetail();
    }

    /**
     * Create an instance of {@link ParentLegalEventsType }
     * 
     */
    public ParentLegalEventsType createParentLegalEventsType() {
        return new ParentLegalEventsType();
    }

    /**
     * Create an instance of {@link TelexNumberType }
     * 
     */
    public TelexNumberType createTelexNumberType() {
        return new TelexNumberType();
    }

    /**
     * Create an instance of {@link OrganizationNameBaseType }
     * 
     */
    public OrganizationNameBaseType createOrganizationNameBaseType() {
        return new OrganizationNameBaseType();
    }

    /**
     * Create an instance of {@link OverallViabilityScoreType }
     * 
     */
    public OverallViabilityScoreType createOverallViabilityScoreType() {
        return new OverallViabilityScoreType();
    }

    /**
     * Create an instance of {@link LinesOfCreditAccountPeriodSummaryType }
     * 
     */
    public LinesOfCreditAccountPeriodSummaryType createLinesOfCreditAccountPeriodSummaryType() {
        return new LinesOfCreditAccountPeriodSummaryType();
    }

    /**
     * Create an instance of {@link PurchaserDerivedDiscountTermsPayments }
     * 
     */
    public PurchaserDerivedDiscountTermsPayments createPurchaserDerivedDiscountTermsPayments() {
        return new PurchaserDerivedDiscountTermsPayments();
    }

    /**
     * Create an instance of {@link GlobalRiskScoreType }
     * 
     */
    public GlobalRiskScoreType createGlobalRiskScoreType() {
        return new GlobalRiskScoreType();
    }

    /**
     * Create an instance of {@link PremisesUsageFunctionDetail }
     * 
     */
    public PremisesUsageFunctionDetail createPremisesUsageFunctionDetail() {
        return new PremisesUsageFunctionDetail();
    }

    /**
     * Create an instance of {@link PastDuePaymentCycleSummaryType }
     * 
     */
    public PastDuePaymentCycleSummaryType createPastDuePaymentCycleSummaryType() {
        return new PastDuePaymentCycleSummaryType();
    }

    /**
     * Create an instance of {@link PremisesArea }
     * 
     */
    public PremisesArea createPremisesArea() {
        return new PremisesArea();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link CustomScore }
     * 
     */
    public CustomScore createCustomScore() {
        return new CustomScore();
    }

    /**
     * Create an instance of {@link ObjectAttachment }
     * 
     */
    public ObjectAttachment createObjectAttachment() {
        return new ObjectAttachment();
    }

    /**
     * Create an instance of {@link OrganizationDNBPresentationRegistrationNumber }
     * 
     */
    public OrganizationDNBPresentationRegistrationNumber createOrganizationDNBPresentationRegistrationNumber() {
        return new OrganizationDNBPresentationRegistrationNumber();
    }

    /**
     * Create an instance of {@link CertifiedSmallBusinessDetail }
     * 
     */
    public CertifiedSmallBusinessDetail createCertifiedSmallBusinessDetail() {
        return new CertifiedSmallBusinessDetail();
    }

    /**
     * Create an instance of {@link EntityMatchDetail }
     * 
     */
    public EntityMatchDetail createEntityMatchDetail() {
        return new EntityMatchDetail();
    }

    /**
     * Create an instance of {@link GetDataRequest }
     * 
     */
    public GetDataRequest createGetDataRequest() {
        return new GetDataRequest();
    }

    /**
     * Create an instance of {@link InquiryReferenceDetail }
     * 
     */
    public InquiryReferenceDetail createInquiryReferenceDetail() {
        return new InquiryReferenceDetail();
    }

    /**
     * Create an instance of {@link FilingOfficeDetails }
     * 
     */
    public FilingOfficeDetails createFilingOfficeDetails() {
        return new FilingOfficeDetails();
    }

    /**
     * Create an instance of {@link CurrentPaymentSummary }
     * 
     */
    public CurrentPaymentSummary createCurrentPaymentSummary() {
        return new CurrentPaymentSummary();
    }

    /**
     * Create an instance of {@link StatusReportDetail }
     * 
     */
    public StatusReportDetail createStatusReportDetail() {
        return new StatusReportDetail();
    }

    /**
     * Create an instance of {@link LocationDetailForAlert }
     * 
     */
    public LocationDetailForAlert createLocationDetailForAlert() {
        return new LocationDetailForAlert();
    }

    /**
     * Create an instance of {@link Events }
     * 
     */
    public Events createEvents() {
        return new Events();
    }

    /**
     * Create an instance of {@link MortgagesAndChargesInformation }
     * 
     */
    public MortgagesAndChargesInformation createMortgagesAndChargesInformation() {
        return new MortgagesAndChargesInformation();
    }

    /**
     * Create an instance of {@link PremisesAreaDetail }
     * 
     */
    public PremisesAreaDetail createPremisesAreaDetail() {
        return new PremisesAreaDetail();
    }

    /**
     * Create an instance of {@link PurchaserDerivedPaymentsWithHighCredit }
     * 
     */
    public PurchaserDerivedPaymentsWithHighCredit createPurchaserDerivedPaymentsWithHighCredit() {
        return new PurchaserDerivedPaymentsWithHighCredit();
    }

    /**
     * Create an instance of {@link ProvisionsAndDeferredTaxes }
     * 
     */
    public ProvisionsAndDeferredTaxes createProvisionsAndDeferredTaxes() {
        return new ProvisionsAndDeferredTaxes();
    }

    /**
     * Create an instance of {@link SpendAmountRangeSummaryType }
     * 
     */
    public SpendAmountRangeSummaryType createSpendAmountRangeSummaryType() {
        return new SpendAmountRangeSummaryType();
    }

    /**
     * Create an instance of {@link SubscriberInfomation }
     * 
     */
    public SubscriberInfomation createSubscriberInfomation() {
        return new SubscriberInfomation();
    }

    /**
     * Create an instance of {@link ResponsibleAreaForPrincipalOfPrincipal }
     * 
     */
    public ResponsibleAreaForPrincipalOfPrincipal createResponsibleAreaForPrincipalOfPrincipal() {
        return new ResponsibleAreaForPrincipalOfPrincipal();
    }

    /**
     * Create an instance of {@link AddSupplierNotesRequestDetail }
     * 
     */
    public AddSupplierNotesRequestDetail createAddSupplierNotesRequestDetail() {
        return new AddSupplierNotesRequestDetail();
    }

    /**
     * Create an instance of {@link SubjectIsAgentDetailsType }
     * 
     */
    public SubjectIsAgentDetailsType createSubjectIsAgentDetailsType() {
        return new SubjectIsAgentDetailsType();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link OtherFinancialEventInformation }
     * 
     */
    public OtherFinancialEventInformation createOtherFinancialEventInformation() {
        return new OtherFinancialEventInformation();
    }

    /**
     * Create an instance of {@link ResponsibleAreaForCorporateDirectorship }
     * 
     */
    public ResponsibleAreaForCorporateDirectorship createResponsibleAreaForCorporateDirectorship() {
        return new ResponsibleAreaForCorporateDirectorship();
    }

    /**
     * Create an instance of {@link DataDepthDetailType }
     * 
     */
    public DataDepthDetailType createDataDepthDetailType() {
        return new DataDepthDetailType();
    }

    /**
     * Create an instance of {@link DataProviderDetail }
     * 
     */
    public DataProviderDetail createDataProviderDetail() {
        return new DataProviderDetail();
    }

    /**
     * Create an instance of {@link GuarantorAddress }
     * 
     */
    public GuarantorAddress createGuarantorAddress() {
        return new GuarantorAddress();
    }

    /**
     * Create an instance of {@link FilingExpirationDetails }
     * 
     */
    public FilingExpirationDetails createFilingExpirationDetails() {
        return new FilingExpirationDetails();
    }

    /**
     * Create an instance of {@link PurchaserDerivedPaymentsByCreditRange }
     * 
     */
    public PurchaserDerivedPaymentsByCreditRange createPurchaserDerivedPaymentsByCreditRange() {
        return new PurchaserDerivedPaymentsByCreditRange();
    }

    /**
     * Create an instance of {@link BusinessHistoryType }
     * 
     */
    public BusinessHistoryType createBusinessHistoryType() {
        return new BusinessHistoryType();
    }

    /**
     * Create an instance of {@link StockPeriodSummary }
     * 
     */
    public StockPeriodSummary createStockPeriodSummary() {
        return new StockPeriodSummary();
    }

    /**
     * Create an instance of {@link PreviousSelfEmploymentDetailsType }
     * 
     */
    public PreviousSelfEmploymentDetailsType createPreviousSelfEmploymentDetailsType() {
        return new PreviousSelfEmploymentDetailsType();
    }

    /**
     * Create an instance of {@link PaymentExperienceSummaryType }
     * 
     */
    public PaymentExperienceSummaryType createPaymentExperienceSummaryType() {
        return new PaymentExperienceSummaryType();
    }

    /**
     * Create an instance of {@link ProfileLocation }
     * 
     */
    public ProfileLocation createProfileLocation() {
        return new ProfileLocation();
    }

    /**
     * Create an instance of {@link MedianQuartile }
     * 
     */
    public MedianQuartile createMedianQuartile() {
        return new MedianQuartile();
    }

    /**
     * Create an instance of {@link SubjectNameDetail }
     * 
     */
    public SubjectNameDetail createSubjectNameDetail() {
        return new SubjectNameDetail();
    }

    /**
     * Create an instance of {@link ScoreNormType }
     * 
     */
    public ScoreNormType createScoreNormType() {
        return new ScoreNormType();
    }

    /**
     * Create an instance of {@link SatisfactoryPayments }
     * 
     */
    public SatisfactoryPayments createSatisfactoryPayments() {
        return new SatisfactoryPayments();
    }

    /**
     * Create an instance of {@link FiscalPeriodDetails }
     * 
     */
    public FiscalPeriodDetails createFiscalPeriodDetails() {
        return new FiscalPeriodDetails();
    }

    /**
     * Create an instance of {@link FinancialAccountSummaryDetailType }
     * 
     */
    public FinancialAccountSummaryDetailType createFinancialAccountSummaryDetailType() {
        return new FinancialAccountSummaryDetailType();
    }

    /**
     * Create an instance of {@link PaymentDataSummaryType }
     * 
     */
    public PaymentDataSummaryType createPaymentDataSummaryType() {
        return new PaymentDataSummaryType();
    }

    /**
     * Create an instance of {@link CourtType }
     * 
     */
    public CourtType createCourtType() {
        return new CourtType();
    }

    /**
     * Create an instance of {@link OrderProductResponse }
     * 
     */
    public OrderProductResponse createOrderProductResponse() {
        return new OrderProductResponse();
    }

    /**
     * Create an instance of {@link RatingReason }
     * 
     */
    public RatingReason createRatingReason() {
        return new RatingReason();
    }

    /**
     * Create an instance of {@link SupplierRiskScore }
     * 
     */
    public SupplierRiskScore createSupplierRiskScore() {
        return new SupplierRiskScore();
    }

    /**
     * Create an instance of {@link BorrowerAnalyticsAccountSummary }
     * 
     */
    public BorrowerAnalyticsAccountSummary createBorrowerAnalyticsAccountSummary() {
        return new BorrowerAnalyticsAccountSummary();
    }

    /**
     * Create an instance of {@link FinancialRatioCategory }
     * 
     */
    public FinancialRatioCategory createFinancialRatioCategory() {
        return new FinancialRatioCategory();
    }

    /**
     * Create an instance of {@link IssuedLetterOfLiability }
     * 
     */
    public IssuedLetterOfLiability createIssuedLetterOfLiability() {
        return new IssuedLetterOfLiability();
    }

    /**
     * Create an instance of {@link OtherActivitiesType }
     * 
     */
    public OtherActivitiesType createOtherActivitiesType() {
        return new OtherActivitiesType();
    }

    /**
     * Create an instance of {@link ScoreReason }
     * 
     */
    public ScoreReason createScoreReason() {
        return new ScoreReason();
    }

    /**
     * Create an instance of {@link SocioEconomicCharacteristicType }
     * 
     */
    public SocioEconomicCharacteristicType createSocioEconomicCharacteristicType() {
        return new SocioEconomicCharacteristicType();
    }

    /**
     * Create an instance of {@link FinancialRatios }
     * 
     */
    public FinancialRatios createFinancialRatios() {
        return new FinancialRatios();
    }

    /**
     * Create an instance of {@link LowerQuartile }
     * 
     */
    public LowerQuartile createLowerQuartile() {
        return new LowerQuartile();
    }

    /**
     * Create an instance of {@link PreviousNonEmploymentDetailsType }
     * 
     */
    public PreviousNonEmploymentDetailsType createPreviousNonEmploymentDetailsType() {
        return new PreviousNonEmploymentDetailsType();
    }

    /**
     * Create an instance of {@link ScoreReferenceType }
     * 
     */
    public ScoreReferenceType createScoreReferenceType() {
        return new ScoreReferenceType();
    }

    /**
     * Create an instance of {@link LocationProfileDetail }
     * 
     */
    public LocationProfileDetail createLocationProfileDetail() {
        return new LocationProfileDetail();
    }

    /**
     * Create an instance of {@link CreditorCategorizationDetail }
     * 
     */
    public CreditorCategorizationDetail createCreditorCategorizationDetail() {
        return new CreditorCategorizationDetail();
    }

    /**
     * Create an instance of {@link FinancialRatioIndustryNormCategory }
     * 
     */
    public FinancialRatioIndustryNormCategory createFinancialRatioIndustryNormCategory() {
        return new FinancialRatioIndustryNormCategory();
    }

    /**
     * Create an instance of {@link SupplierThirdPartyAssessment }
     * 
     */
    public SupplierThirdPartyAssessment createSupplierThirdPartyAssessment() {
        return new SupplierThirdPartyAssessment();
    }

    /**
     * Create an instance of {@link OtherFinancingEvent }
     * 
     */
    public OtherFinancingEvent createOtherFinancingEvent() {
        return new OtherFinancingEvent();
    }

    /**
     * Create an instance of {@link OtherThirdPartyInformation }
     * 
     */
    public OtherThirdPartyInformation createOtherThirdPartyInformation() {
        return new OtherThirdPartyInformation();
    }

    /**
     * Create an instance of {@link LegalEventPeriodSummaryType }
     * 
     */
    public LegalEventPeriodSummaryType createLegalEventPeriodSummaryType() {
        return new LegalEventPeriodSummaryType();
    }

    /**
     * Create an instance of {@link AccountantOpinion }
     * 
     */
    public AccountantOpinion createAccountantOpinion() {
        return new AccountantOpinion();
    }

    /**
     * Create an instance of {@link PrimaryIndustryCodeType }
     * 
     */
    public PrimaryIndustryCodeType createPrimaryIndustryCodeType() {
        return new PrimaryIndustryCodeType();
    }

    /**
     * Create an instance of {@link PurchaserDerivedPlacedForCollectionPayments }
     * 
     */
    public PurchaserDerivedPlacedForCollectionPayments createPurchaserDerivedPlacedForCollectionPayments() {
        return new PurchaserDerivedPlacedForCollectionPayments();
    }

    /**
     * Create an instance of {@link SubscribedToLetterOfLiability }
     * 
     */
    public SubscribedToLetterOfLiability createSubscribedToLetterOfLiability() {
        return new SubscribedToLetterOfLiability();
    }

    /**
     * Create an instance of {@link NoteDetail }
     * 
     */
    public NoteDetail createNoteDetail() {
        return new NoteDetail();
    }

    /**
     * Create an instance of {@link RetrieveProductRequest }
     * 
     */
    public RetrieveProductRequest createRetrieveProductRequest() {
        return new RetrieveProductRequest();
    }

    /**
     * Create an instance of {@link ShareCapitalTrendDetails }
     * 
     */
    public ShareCapitalTrendDetails createShareCapitalTrendDetails() {
        return new ShareCapitalTrendDetails();
    }

    /**
     * Create an instance of {@link InquiryIndustryCodeType }
     * 
     */
    public InquiryIndustryCodeType createInquiryIndustryCodeType() {
        return new InquiryIndustryCodeType();
    }

    /**
     * Create an instance of {@link BaseProfitAndLossStatementType }
     * 
     */
    public BaseProfitAndLossStatementType createBaseProfitAndLossStatementType() {
        return new BaseProfitAndLossStatementType();
    }

    /**
     * Create an instance of {@link SubjectPersonalDetail }
     * 
     */
    public SubjectPersonalDetail createSubjectPersonalDetail() {
        return new SubjectPersonalDetail();
    }

    /**
     * Create an instance of {@link InstallmentAccountPeriodSummaryType }
     * 
     */
    public InstallmentAccountPeriodSummaryType createInstallmentAccountPeriodSummaryType() {
        return new InstallmentAccountPeriodSummaryType();
    }

    /**
     * Create an instance of {@link ObjectAttachmentForResponse }
     * 
     */
    public ObjectAttachmentForResponse createObjectAttachmentForResponse() {
        return new ObjectAttachmentForResponse();
    }

    /**
     * Create an instance of {@link SupplierBatchFileDetail }
     * 
     */
    public SupplierBatchFileDetail createSupplierBatchFileDetail() {
        return new SupplierBatchFileDetail();
    }

    /**
     * Create an instance of {@link SubjectHandling }
     * 
     */
    public SubjectHandling createSubjectHandling() {
        return new SubjectHandling();
    }

    /**
     * Create an instance of {@link SpendBehaviorType }
     * 
     */
    public SpendBehaviorType createSpendBehaviorType() {
        return new SpendBehaviorType();
    }

    /**
     * Create an instance of {@link AgencyDetailType }
     * 
     */
    public AgencyDetailType createAgencyDetailType() {
        return new AgencyDetailType();
    }

    /**
     * Create an instance of {@link MatchBasis }
     * 
     */
    public MatchBasis createMatchBasis() {
        return new MatchBasis();
    }

    /**
     * Create an instance of {@link FinancingStatementFilingInformation }
     * 
     */
    public FinancingStatementFilingInformation createFinancingStatementFilingInformation() {
        return new FinancingStatementFilingInformation();
    }

    /**
     * Create an instance of {@link OrganizationIdentificationNumberSimpleType }
     * 
     */
    public OrganizationIdentificationNumberSimpleType createOrganizationIdentificationNumberSimpleType() {
        return new OrganizationIdentificationNumberSimpleType();
    }

    /**
     * Create an instance of {@link LegalFormDetailsHistory }
     * 
     */
    public LegalFormDetailsHistory createLegalFormDetailsHistory() {
        return new LegalFormDetailsHistory();
    }

    /**
     * Create an instance of {@link LegalEventReason }
     * 
     */
    public LegalEventReason createLegalEventReason() {
        return new LegalEventReason();
    }

    /**
     * Create an instance of {@link RegisterSupplierInquiryDetail }
     * 
     */
    public RegisterSupplierInquiryDetail createRegisterSupplierInquiryDetail() {
        return new RegisterSupplierInquiryDetail();
    }

    /**
     * Create an instance of {@link CurrentPaydexScoreType }
     * 
     */
    public CurrentPaydexScoreType createCurrentPaydexScoreType() {
        return new CurrentPaydexScoreType();
    }

    /**
     * Create an instance of {@link GlobalStandardProfitAndLossStatement }
     * 
     */
    public GlobalStandardProfitAndLossStatement createGlobalStandardProfitAndLossStatement() {
        return new GlobalStandardProfitAndLossStatement();
    }

    /**
     * Create an instance of {@link SupplierRegistrationAddress }
     * 
     */
    public SupplierRegistrationAddress createSupplierRegistrationAddress() {
        return new SupplierRegistrationAddress();
    }

    /**
     * Create an instance of {@link KFRIndustryQuartilesType }
     * 
     */
    public KFRIndustryQuartilesType createKFRIndustryQuartilesType() {
        return new KFRIndustryQuartilesType();
    }

    /**
     * Create an instance of {@link DecisionParameter }
     * 
     */
    public DecisionParameter createDecisionParameter() {
        return new DecisionParameter();
    }

    /**
     * Create an instance of {@link LitigationRolePlayerType }
     * 
     */
    public LitigationRolePlayerType createLitigationRolePlayerType() {
        return new LitigationRolePlayerType();
    }

    /**
     * Create an instance of {@link AccountDetail }
     * 
     */
    public AccountDetail createAccountDetail() {
        return new AccountDetail();
    }

    /**
     * Create an instance of {@link PaymentSummaryType }
     * 
     */
    public PaymentSummaryType createPaymentSummaryType() {
        return new PaymentSummaryType();
    }

    /**
     * Create an instance of {@link FamilyRelationship }
     * 
     */
    public FamilyRelationship createFamilyRelationship() {
        return new FamilyRelationship();
    }

    /**
     * Create an instance of {@link NormDimension }
     * 
     */
    public NormDimension createNormDimension() {
        return new NormDimension();
    }

    /**
     * Create an instance of {@link ContactResult }
     * 
     */
    public ContactResult createContactResult() {
        return new ContactResult();
    }

    /**
     * Create an instance of {@link ParentAssociation }
     * 
     */
    public ParentAssociation createParentAssociation() {
        return new ParentAssociation();
    }

    /**
     * Create an instance of {@link DNBCreditLimitRecommendationType }
     * 
     */
    public DNBCreditLimitRecommendationType createDNBCreditLimitRecommendationType() {
        return new DNBCreditLimitRecommendationType();
    }

    /**
     * Create an instance of {@link DataProviderDetailForAirportConcession }
     * 
     */
    public DataProviderDetailForAirportConcession createDataProviderDetailForAirportConcession() {
        return new DataProviderDetailForAirportConcession();
    }

    /**
     * Create an instance of {@link NamePrefix }
     * 
     */
    public NamePrefix createNamePrefix() {
        return new NamePrefix();
    }

    /**
     * Create an instance of {@link StatementHeaderDetails }
     * 
     */
    public StatementHeaderDetails createStatementHeaderDetails() {
        return new StatementHeaderDetails();
    }

    /**
     * Create an instance of {@link Telecommunication }
     * 
     */
    public Telecommunication createTelecommunication() {
        return new Telecommunication();
    }

    /**
     * Create an instance of {@link GuarantorDetails }
     * 
     */
    public GuarantorDetails createGuarantorDetails() {
        return new GuarantorDetails();
    }

    /**
     * Create an instance of {@link FilingOrganizationName }
     * 
     */
    public FilingOrganizationName createFilingOrganizationName() {
        return new FilingOrganizationName();
    }

    /**
     * Create an instance of {@link SubjectQueueHistoryDetail }
     * 
     */
    public SubjectQueueHistoryDetail createSubjectQueueHistoryDetail() {
        return new SubjectQueueHistoryDetail();
    }

    /**
     * Create an instance of {@link ActivityDetailsForCommercialCollectionClaims }
     * 
     */
    public ActivityDetailsForCommercialCollectionClaims createActivityDetailsForCommercialCollectionClaims() {
        return new ActivityDetailsForCommercialCollectionClaims();
    }

    /**
     * Create an instance of {@link OpenEndedCreditLineAccountSummaryDetailType }
     * 
     */
    public OpenEndedCreditLineAccountSummaryDetailType createOpenEndedCreditLineAccountSummaryDetailType() {
        return new OpenEndedCreditLineAccountSummaryDetailType();
    }

    /**
     * Create an instance of {@link UserDetailForSupplier }
     * 
     */
    public UserDetailForSupplier createUserDetailForSupplier() {
        return new UserDetailForSupplier();
    }

    /**
     * Create an instance of {@link InquiryDetail }
     * 
     */
    public InquiryDetail createInquiryDetail() {
        return new InquiryDetail();
    }

    /**
     * Create an instance of {@link GetSupplierListRequest }
     * 
     */
    public GetSupplierListRequest createGetSupplierListRequest() {
        return new GetSupplierListRequest();
    }

    /**
     * Create an instance of {@link CountryRiskDetails }
     * 
     */
    public CountryRiskDetails createCountryRiskDetails() {
        return new CountryRiskDetails();
    }

    /**
     * Create an instance of {@link UploadSupplierDocumentResponse }
     * 
     */
    public UploadSupplierDocumentResponse createUploadSupplierDocumentResponse() {
        return new UploadSupplierDocumentResponse();
    }

    /**
     * Create an instance of {@link ChapterConversionDetailsType }
     * 
     */
    public ChapterConversionDetailsType createChapterConversionDetailsType() {
        return new ChapterConversionDetailsType();
    }

    /**
     * Create an instance of {@link ComplianceAddressDetail }
     * 
     */
    public ComplianceAddressDetail createComplianceAddressDetail() {
        return new ComplianceAddressDetail();
    }

    /**
     * Create an instance of {@link Competitor }
     * 
     */
    public Competitor createCompetitor() {
        return new Competitor();
    }

    /**
     * Create an instance of {@link ExtraordinaryNetRevenue }
     * 
     */
    public ExtraordinaryNetRevenue createExtraordinaryNetRevenue() {
        return new ExtraordinaryNetRevenue();
    }

    /**
     * Create an instance of {@link GlobalEquity }
     * 
     */
    public GlobalEquity createGlobalEquity() {
        return new GlobalEquity();
    }

    /**
     * Create an instance of {@link FinancialStatement }
     * 
     */
    public FinancialStatement createFinancialStatement() {
        return new FinancialStatement();
    }

    /**
     * Create an instance of {@link LoanAccountPeriodSummaryType }
     * 
     */
    public LoanAccountPeriodSummaryType createLoanAccountPeriodSummaryType() {
        return new LoanAccountPeriodSummaryType();
    }

    /**
     * Create an instance of {@link TradeExperiencePaymentSummary }
     * 
     */
    public TradeExperiencePaymentSummary createTradeExperiencePaymentSummary() {
        return new TradeExperiencePaymentSummary();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link OrganizationDetail }
     * 
     */
    public OrganizationDetail createOrganizationDetail() {
        return new OrganizationDetail();
    }

    /**
     * Create an instance of {@link PurchaserDerivedUnfavorablePayments }
     * 
     */
    public PurchaserDerivedUnfavorablePayments createPurchaserDerivedUnfavorablePayments() {
        return new PurchaserDerivedUnfavorablePayments();
    }

    /**
     * Create an instance of {@link RetrieveProductResponse }
     * 
     */
    public RetrieveProductResponse createRetrieveProductResponse() {
        return new RetrieveProductResponse();
    }

    /**
     * Create an instance of {@link FilingPartyType }
     * 
     */
    public FilingPartyType createFilingPartyType() {
        return new FilingPartyType();
    }

    /**
     * Create an instance of {@link DomesticMarketTerritoryDetailsType }
     * 
     */
    public DomesticMarketTerritoryDetailsType createDomesticMarketTerritoryDetailsType() {
        return new DomesticMarketTerritoryDetailsType();
    }

    /**
     * Create an instance of {@link NonspecificParameterDetail }
     * 
     */
    public NonspecificParameterDetail createNonspecificParameterDetail() {
        return new NonspecificParameterDetail();
    }

    /**
     * Create an instance of {@link SummarizedPastDueTypeForDetailedTrade }
     * 
     */
    public SummarizedPastDueTypeForDetailedTrade createSummarizedPastDueTypeForDetailedTrade() {
        return new SummarizedPastDueTypeForDetailedTrade();
    }

    /**
     * Create an instance of {@link IndustryCodeType }
     * 
     */
    public IndustryCodeType createIndustryCodeType() {
        return new IndustryCodeType();
    }

    /**
     * Create an instance of {@link SpecialEventType }
     * 
     */
    public SpecialEventType createSpecialEventType() {
        return new SpecialEventType();
    }

    /**
     * Create an instance of {@link CustomerMarketDetails }
     * 
     */
    public CustomerMarketDetails createCustomerMarketDetails() {
        return new CustomerMarketDetails();
    }

    /**
     * Create an instance of {@link BankruptcyFinancialStatement }
     * 
     */
    public BankruptcyFinancialStatement createBankruptcyFinancialStatement() {
        return new BankruptcyFinancialStatement();
    }

    /**
     * Create an instance of {@link CreditRangeSummaryType }
     * 
     */
    public CreditRangeSummaryType createCreditRangeSummaryType() {
        return new CreditRangeSummaryType();
    }

    /**
     * Create an instance of {@link DetailedTradeInformationSpecification }
     * 
     */
    public DetailedTradeInformationSpecification createDetailedTradeInformationSpecification() {
        return new DetailedTradeInformationSpecification();
    }

    /**
     * Create an instance of {@link FinancialRatioNorm }
     * 
     */
    public FinancialRatioNorm createFinancialRatioNorm() {
        return new FinancialRatioNorm();
    }

    /**
     * Create an instance of {@link NormType }
     * 
     */
    public NormType createNormType() {
        return new NormType();
    }

    /**
     * Create an instance of {@link PeakPeriodDetailsType }
     * 
     */
    public PeakPeriodDetailsType createPeakPeriodDetailsType() {
        return new PeakPeriodDetailsType();
    }

    /**
     * Create an instance of {@link LocationProfile }
     * 
     */
    public LocationProfile createLocationProfile() {
        return new LocationProfile();
    }

    /**
     * Create an instance of {@link RegisteredDetail }
     * 
     */
    public RegisteredDetail createRegisteredDetail() {
        return new RegisteredDetail();
    }

    /**
     * Create an instance of {@link PrimaryAddressType }
     * 
     */
    public PrimaryAddressType createPrimaryAddressType() {
        return new PrimaryAddressType();
    }

    /**
     * Create an instance of {@link DNBRatingDetails }
     * 
     */
    public DNBRatingDetails createDNBRatingDetails() {
        return new DNBRatingDetails();
    }

    /**
     * Create an instance of {@link PaymentMannerSummaryType }
     * 
     */
    public PaymentMannerSummaryType createPaymentMannerSummaryType() {
        return new PaymentMannerSummaryType();
    }

    /**
     * Create an instance of {@link SupplierRecordStatusSummary }
     * 
     */
    public SupplierRecordStatusSummary createSupplierRecordStatusSummary() {
        return new SupplierRecordStatusSummary();
    }

    /**
     * Create an instance of {@link LocationDetailForAirportConcession }
     * 
     */
    public LocationDetailForAirportConcession createLocationDetailForAirportConcession() {
        return new LocationDetailForAirportConcession();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link GetSupplierRegistrationBatchStatusResponseDetail }
     * 
     */
    public GetSupplierRegistrationBatchStatusResponseDetail createGetSupplierRegistrationBatchStatusResponseDetail() {
        return new GetSupplierRegistrationBatchStatusResponseDetail();
    }

    /**
     * Create an instance of {@link FamilyTreeMemberRole }
     * 
     */
    public FamilyTreeMemberRole createFamilyTreeMemberRole() {
        return new FamilyTreeMemberRole();
    }

    /**
     * Create an instance of {@link BankIdentificationNumberDetailType }
     * 
     */
    public BankIdentificationNumberDetailType createBankIdentificationNumberDetailType() {
        return new BankIdentificationNumberDetailType();
    }

    /**
     * Create an instance of {@link FormerOrganizationRegisteredNameType }
     * 
     */
    public FormerOrganizationRegisteredNameType createFormerOrganizationRegisteredNameType() {
        return new FormerOrganizationRegisteredNameType();
    }

    /**
     * Create an instance of {@link SubjectAddressType }
     * 
     */
    public SubjectAddressType createSubjectAddressType() {
        return new SubjectAddressType();
    }

    /**
     * Create an instance of {@link JudicialActionSummaryType }
     * 
     */
    public JudicialActionSummaryType createJudicialActionSummaryType() {
        return new JudicialActionSummaryType();
    }

    /**
     * Create an instance of {@link Bank }
     * 
     */
    public Bank createBank() {
        return new Bank();
    }

    /**
     * Create an instance of {@link RolePlayerDetailsType }
     * 
     */
    public RolePlayerDetailsType createRolePlayerDetailsType() {
        return new RolePlayerDetailsType();
    }

    /**
     * Create an instance of {@link ExportDetailsType }
     * 
     */
    public ExportDetailsType createExportDetailsType() {
        return new ExportDetailsType();
    }

    /**
     * Create an instance of {@link SupplierListInquiryDetail }
     * 
     */
    public SupplierListInquiryDetail createSupplierListInquiryDetail() {
        return new SupplierListInquiryDetail();
    }

    /**
     * Create an instance of {@link PaymentsCountCycleSummary }
     * 
     */
    public PaymentsCountCycleSummary createPaymentsCountCycleSummary() {
        return new PaymentsCountCycleSummary();
    }

    /**
     * Create an instance of {@link IndustryCommercialCreditScoreType }
     * 
     */
    public IndustryCommercialCreditScoreType createIndustryCommercialCreditScoreType() {
        return new IndustryCommercialCreditScoreType();
    }

    /**
     * Create an instance of {@link JobTitle }
     * 
     */
    public JobTitle createJobTitle() {
        return new JobTitle();
    }

    /**
     * Create an instance of {@link RegistrationNumberStatusText }
     * 
     */
    public RegistrationNumberStatusText createRegistrationNumberStatusText() {
        return new RegistrationNumberStatusText();
    }

    /**
     * Create an instance of {@link MatchQualityInformation }
     * 
     */
    public MatchQualityInformation createMatchQualityInformation() {
        return new MatchQualityInformation();
    }

    /**
     * Create an instance of {@link OverallPaymentHistorySummary }
     * 
     */
    public OverallPaymentHistorySummary createOverallPaymentHistorySummary() {
        return new OverallPaymentHistorySummary();
    }

    /**
     * Create an instance of {@link Association }
     * 
     */
    public Association createAssociation() {
        return new Association();
    }

    /**
     * Create an instance of {@link UnclassifiedAccountSummaryDetailType }
     * 
     */
    public UnclassifiedAccountSummaryDetailType createUnclassifiedAccountSummaryDetailType() {
        return new UnclassifiedAccountSummaryDetailType();
    }

    /**
     * Create an instance of {@link PaymentHistorySummary }
     * 
     */
    public PaymentHistorySummary createPaymentHistorySummary() {
        return new PaymentHistorySummary();
    }

    /**
     * Create an instance of {@link GuaranteeDetails }
     * 
     */
    public GuaranteeDetails createGuaranteeDetails() {
        return new GuaranteeDetails();
    }

    /**
     * Create an instance of {@link FilingDetailTextEntry }
     * 
     */
    public FilingDetailTextEntry createFilingDetailTextEntry() {
        return new FilingDetailTextEntry();
    }

    /**
     * Create an instance of {@link SpendCategorySummaryType }
     * 
     */
    public SpendCategorySummaryType createSpendCategorySummaryType() {
        return new SpendCategorySummaryType();
    }

    /**
     * Create an instance of {@link DNBDateType }
     * 
     */
    public DNBDateType createDNBDateType() {
        return new DNBDateType();
    }

    /**
     * Create an instance of {@link GrowthRateItem }
     * 
     */
    public GrowthRateItem createGrowthRateItem() {
        return new GrowthRateItem();
    }

    /**
     * Create an instance of {@link PublicFilingHeaderType }
     * 
     */
    public PublicFilingHeaderType createPublicFilingHeaderType() {
        return new PublicFilingHeaderType();
    }

    /**
     * Create an instance of {@link ProductResponseInquiryDetail }
     * 
     */
    public ProductResponseInquiryDetail createProductResponseInquiryDetail() {
        return new ProductResponseInquiryDetail();
    }

    /**
     * Create an instance of {@link AccountHolderInformationType }
     * 
     */
    public AccountHolderInformationType createAccountHolderInformationType() {
        return new AccountHolderInformationType();
    }

    /**
     * Create an instance of {@link FinancialStatementExplanation }
     * 
     */
    public FinancialStatementExplanation createFinancialStatementExplanation() {
        return new FinancialStatementExplanation();
    }

    /**
     * Create an instance of {@link SmallDisadvantagedBusinessDetail }
     * 
     */
    public SmallDisadvantagedBusinessDetail createSmallDisadvantagedBusinessDetail() {
        return new SmallDisadvantagedBusinessDetail();
    }

    /**
     * Create an instance of {@link SubjectRecordDetail }
     * 
     */
    public SubjectRecordDetail createSubjectRecordDetail() {
        return new SubjectRecordDetail();
    }

    /**
     * Create an instance of {@link IndustryCodeDescriptionType }
     * 
     */
    public IndustryCodeDescriptionType createIndustryCodeDescriptionType() {
        return new IndustryCodeDescriptionType();
    }

    /**
     * Create an instance of {@link RegisteredAddressNewType }
     * 
     */
    public RegisteredAddressNewType createRegisteredAddressNewType() {
        return new RegisteredAddressNewType();
    }

    /**
     * Create an instance of {@link LegalEventSummaryType }
     * 
     */
    public LegalEventSummaryType createLegalEventSummaryType() {
        return new LegalEventSummaryType();
    }

    /**
     * Create an instance of {@link BasePositionType }
     * 
     */
    public BasePositionType createBasePositionType() {
        return new BasePositionType();
    }

    /**
     * Create an instance of {@link JudgmentInformation }
     * 
     */
    public JudgmentInformation createJudgmentInformation() {
        return new JudgmentInformation();
    }

    /**
     * Create an instance of {@link LinkageSummary }
     * 
     */
    public LinkageSummary createLinkageSummary() {
        return new LinkageSummary();
    }

    /**
     * Create an instance of {@link FormerManagementResponsibility }
     * 
     */
    public FormerManagementResponsibility createFormerManagementResponsibility() {
        return new FormerManagementResponsibility();
    }

    /**
     * Create an instance of {@link DNBDecodedStringType }
     * 
     */
    public DNBDecodedStringType createDNBDecodedStringType() {
        return new DNBDecodedStringType();
    }

    /**
     * Create an instance of {@link LinkedOrganizationLocationSpecification }
     * 
     */
    public LinkedOrganizationLocationSpecification createLinkedOrganizationLocationSpecification() {
        return new LinkedOrganizationLocationSpecification();
    }

    /**
     * Create an instance of {@link ThirdPartyAssessment }
     * 
     */
    public ThirdPartyAssessment createThirdPartyAssessment() {
        return new ThirdPartyAssessment();
    }

    /**
     * Create an instance of {@link FinancingStatementFiling }
     * 
     */
    public FinancingStatementFiling createFinancingStatementFiling() {
        return new FinancingStatementFiling();
    }

    /**
     * Create an instance of {@link ThirdPartyInformation }
     * 
     */
    public ThirdPartyInformation createThirdPartyInformation() {
        return new ThirdPartyInformation();
    }

    /**
     * Create an instance of {@link BorrowerAnalytics }
     * 
     */
    public BorrowerAnalytics createBorrowerAnalytics() {
        return new BorrowerAnalytics();
    }

    /**
     * Create an instance of {@link OperatingStatusDetail }
     * 
     */
    public OperatingStatusDetail createOperatingStatusDetail() {
        return new OperatingStatusDetail();
    }

    /**
     * Create an instance of {@link OrganizationRegisteredNameType }
     * 
     */
    public OrganizationRegisteredNameType createOrganizationRegisteredNameType() {
        return new OrganizationRegisteredNameType();
    }

    /**
     * Create an instance of {@link AccountFiguresDetail }
     * 
     */
    public AccountFiguresDetail createAccountFiguresDetail() {
        return new AccountFiguresDetail();
    }

    /**
     * Create an instance of {@link DataTopicSpecification }
     * 
     */
    public DataTopicSpecification createDataTopicSpecification() {
        return new DataTopicSpecification();
    }

    /**
     * Create an instance of {@link FilingRolePlayerDetails }
     * 
     */
    public FilingRolePlayerDetails createFilingRolePlayerDetails() {
        return new FilingRolePlayerDetails();
    }

    /**
     * Create an instance of {@link BankContactType }
     * 
     */
    public BankContactType createBankContactType() {
        return new BankContactType();
    }

    /**
     * Create an instance of {@link AccountSummaryDetailType }
     * 
     */
    public AccountSummaryDetailType createAccountSummaryDetailType() {
        return new AccountSummaryDetailType();
    }

    /**
     * Create an instance of {@link CurrentCreditRangePaydexScoreType }
     * 
     */
    public CurrentCreditRangePaydexScoreType createCurrentCreditRangePaydexScoreType() {
        return new CurrentCreditRangePaydexScoreType();
    }

    /**
     * Create an instance of {@link FinancialRatioItem }
     * 
     */
    public FinancialRatioItem createFinancialRatioItem() {
        return new FinancialRatioItem();
    }

    /**
     * Create an instance of {@link SummarizedPastDue }
     * 
     */
    public SummarizedPastDue createSummarizedPastDue() {
        return new SummarizedPastDue();
    }

    /**
     * Create an instance of {@link PurchaserDerivedNoPaymentMannerPayments }
     * 
     */
    public PurchaserDerivedNoPaymentMannerPayments createPurchaserDerivedNoPaymentMannerPayments() {
        return new PurchaserDerivedNoPaymentMannerPayments();
    }

    /**
     * Create an instance of {@link CompensationDetail }
     * 
     */
    public CompensationDetail createCompensationDetail() {
        return new CompensationDetail();
    }

    /**
     * Create an instance of {@link RolePlayerName }
     * 
     */
    public RolePlayerName createRolePlayerName() {
        return new RolePlayerName();
    }

    /**
     * Create an instance of {@link BankExperienceSummary }
     * 
     */
    public BankExperienceSummary createBankExperienceSummary() {
        return new BankExperienceSummary();
    }

    /**
     * Create an instance of {@link RetrieveProductRequestDetail }
     * 
     */
    public RetrieveProductRequestDetail createRetrieveProductRequestDetail() {
        return new RetrieveProductRequestDetail();
    }

    /**
     * Create an instance of {@link OrganizationProfileDetailType }
     * 
     */
    public OrganizationProfileDetailType createOrganizationProfileDetailType() {
        return new OrganizationProfileDetailType();
    }

    /**
     * Create an instance of {@link GrowthRateNorm }
     * 
     */
    public GrowthRateNorm createGrowthRateNorm() {
        return new GrowthRateNorm();
    }

    /**
     * Create an instance of {@link InquiryDetailForSupplierBatch }
     * 
     */
    public InquiryDetailForSupplierBatch createInquiryDetailForSupplierBatch() {
        return new InquiryDetailForSupplierBatch();
    }

    /**
     * Create an instance of {@link MinorityOwnedDetails }
     * 
     */
    public MinorityOwnedDetails createMinorityOwnedDetails() {
        return new MinorityOwnedDetails();
    }

    /**
     * Create an instance of {@link FilingStatusDetail }
     * 
     */
    public FilingStatusDetail createFilingStatusDetail() {
        return new FilingStatusDetail();
    }

    /**
     * Create an instance of {@link IndustryPaymentExperienceType }
     * 
     */
    public IndustryPaymentExperienceType createIndustryPaymentExperienceType() {
        return new IndustryPaymentExperienceType();
    }

    /**
     * Create an instance of {@link CommercialCollectionClaims }
     * 
     */
    public CommercialCollectionClaims createCommercialCollectionClaims() {
        return new CommercialCollectionClaims();
    }

    /**
     * Create an instance of {@link SummarizedPastDueType }
     * 
     */
    public SummarizedPastDueType createSummarizedPastDueType() {
        return new SummarizedPastDueType();
    }

    /**
     * Create an instance of {@link CommercialCardAccountSummaryDetailType }
     * 
     */
    public CommercialCardAccountSummaryDetailType createCommercialCardAccountSummaryDetailType() {
        return new CommercialCardAccountSummaryDetailType();
    }

    /**
     * Create an instance of {@link GlobalAssets }
     * 
     */
    public GlobalAssets createGlobalAssets() {
        return new GlobalAssets();
    }

    /**
     * Create an instance of {@link Liabilities }
     * 
     */
    public Liabilities createLiabilities() {
        return new Liabilities();
    }

    /**
     * Create an instance of {@link ScoreOverrideReason }
     * 
     */
    public ScoreOverrideReason createScoreOverrideReason() {
        return new ScoreOverrideReason();
    }

    /**
     * Create an instance of {@link MiscellaneousDetails }
     * 
     */
    public MiscellaneousDetails createMiscellaneousDetails() {
        return new MiscellaneousDetails();
    }

    /**
     * Create an instance of {@link ClaimInformation }
     * 
     */
    public ClaimInformation createClaimInformation() {
        return new ClaimInformation();
    }

    /**
     * Create an instance of {@link Competitors }
     * 
     */
    public Competitors createCompetitors() {
        return new Competitors();
    }

    /**
     * Create an instance of {@link ScoreType }
     * 
     */
    public ScoreType createScoreType() {
        return new ScoreType();
    }

    /**
     * Create an instance of {@link LineOfBusinessDetailsType }
     * 
     */
    public LineOfBusinessDetailsType createLineOfBusinessDetailsType() {
        return new LineOfBusinessDetailsType();
    }

    /**
     * Create an instance of {@link IndustryCode }
     * 
     */
    public IndustryCode createIndustryCode() {
        return new IndustryCode();
    }

    /**
     * Create an instance of {@link SBFEPoweredScoreType }
     * 
     */
    public SBFEPoweredScoreType createSBFEPoweredScoreType() {
        return new SBFEPoweredScoreType();
    }

    /**
     * Create an instance of {@link SpecialInvestigationDetail }
     * 
     */
    public SpecialInvestigationDetail createSpecialInvestigationDetail() {
        return new SpecialInvestigationDetail();
    }

    /**
     * Create an instance of {@link ComplianceDetail }
     * 
     */
    public ComplianceDetail createComplianceDetail() {
        return new ComplianceDetail();
    }

    /**
     * Create an instance of {@link GetSupplierRegistrationBatchStatusResponse }
     * 
     */
    public GetSupplierRegistrationBatchStatusResponse createGetSupplierRegistrationBatchStatusResponse() {
        return new GetSupplierRegistrationBatchStatusResponse();
    }

    /**
     * Create an instance of {@link GlobalBalanceSheetType }
     * 
     */
    public GlobalBalanceSheetType createGlobalBalanceSheetType() {
        return new GlobalBalanceSheetType();
    }

    /**
     * Create an instance of {@link SignificantEvents }
     * 
     */
    public SignificantEvents createSignificantEvents() {
        return new SignificantEvents();
    }

    /**
     * Create an instance of {@link ArchiveDetail }
     * 
     */
    public ArchiveDetail createArchiveDetail() {
        return new ArchiveDetail();
    }

    /**
     * Create an instance of {@link LetterofLiabilitySummaryType }
     * 
     */
    public LetterofLiabilitySummaryType createLetterofLiabilitySummaryType() {
        return new LetterofLiabilitySummaryType();
    }

    /**
     * Create an instance of {@link PaydexScoreSummaryType }
     * 
     */
    public PaydexScoreSummaryType createPaydexScoreSummaryType() {
        return new PaydexScoreSummaryType();
    }

    /**
     * Create an instance of {@link PrincipalDetailsRequestType }
     * 
     */
    public PrincipalDetailsRequestType createPrincipalDetailsRequestType() {
        return new PrincipalDetailsRequestType();
    }

    /**
     * Create an instance of {@link Individual }
     * 
     */
    public Individual createIndividual() {
        return new Individual();
    }

    /**
     * Create an instance of {@link BusinessSignalsSummaryType }
     * 
     */
    public BusinessSignalsSummaryType createBusinessSignalsSummaryType() {
        return new BusinessSignalsSummaryType();
    }

    /**
     * Create an instance of {@link BusinessSizeNorm }
     * 
     */
    public BusinessSizeNorm createBusinessSizeNorm() {
        return new BusinessSizeNorm();
    }

    /**
     * Create an instance of {@link RolePlayer }
     * 
     */
    public RolePlayer createRolePlayer() {
        return new RolePlayer();
    }

    /**
     * Create an instance of {@link OrganizationName }
     * 
     */
    public OrganizationName createOrganizationName() {
        return new OrganizationName();
    }

    /**
     * Create an instance of {@link AssetArticleDetailType }
     * 
     */
    public AssetArticleDetailType createAssetArticleDetailType() {
        return new AssetArticleDetailType();
    }

    /**
     * Create an instance of {@link OperatingStatusDetailHistory }
     * 
     */
    public OperatingStatusDetailHistory createOperatingStatusDetailHistory() {
        return new OperatingStatusDetailHistory();
    }

    /**
     * Create an instance of {@link SuitInformation }
     * 
     */
    public SuitInformation createSuitInformation() {
        return new SuitInformation();
    }

    /**
     * Create an instance of {@link CapitalStockDetails }
     * 
     */
    public CapitalStockDetails createCapitalStockDetails() {
        return new CapitalStockDetails();
    }

    /**
     * Create an instance of {@link ScoreCommentary }
     * 
     */
    public ScoreCommentary createScoreCommentary() {
        return new ScoreCommentary();
    }

    /**
     * Create an instance of {@link Equity }
     * 
     */
    public Equity createEquity() {
        return new Equity();
    }

    /**
     * Create an instance of {@link ResponsibleArea }
     * 
     */
    public ResponsibleArea createResponsibleArea() {
        return new ResponsibleArea();
    }

    /**
     * Create an instance of {@link IndustryNormType }
     * 
     */
    public IndustryNormType createIndustryNormType() {
        return new IndustryNormType();
    }

    /**
     * Create an instance of {@link BusinessSignalsPeriodSummaryType }
     * 
     */
    public BusinessSignalsPeriodSummaryType createBusinessSignalsPeriodSummaryType() {
        return new BusinessSignalsPeriodSummaryType();
    }

    /**
     * Create an instance of {@link PurchaserDerivedPaymentPeriodSummary }
     * 
     */
    public PurchaserDerivedPaymentPeriodSummary createPurchaserDerivedPaymentPeriodSummary() {
        return new PurchaserDerivedPaymentPeriodSummary();
    }

    /**
     * Create an instance of {@link FinancingEvents }
     * 
     */
    public FinancingEvents createFinancingEvents() {
        return new FinancingEvents();
    }

    /**
     * Create an instance of {@link MatchGradeSummaryType }
     * 
     */
    public MatchGradeSummaryType createMatchGradeSummaryType() {
        return new MatchGradeSummaryType();
    }

    /**
     * Create an instance of {@link FinancialRelationship }
     * 
     */
    public FinancialRelationship createFinancialRelationship() {
        return new FinancialRelationship();
    }

    /**
     * Create an instance of {@link Assets }
     * 
     */
    public Assets createAssets() {
        return new Assets();
    }

    /**
     * Create an instance of {@link News }
     * 
     */
    public News createNews() {
        return new News();
    }

    /**
     * Create an instance of {@link RetrieveProductArchiveDetail }
     * 
     */
    public RetrieveProductArchiveDetail createRetrieveProductArchiveDetail() {
        return new RetrieveProductArchiveDetail();
    }

    /**
     * Create an instance of {@link MortgagesAndChargesType }
     * 
     */
    public MortgagesAndChargesType createMortgagesAndChargesType() {
        return new MortgagesAndChargesType();
    }

    /**
     * Create an instance of {@link LinesOfCreditAccountSummaryDetailType }
     * 
     */
    public LinesOfCreditAccountSummaryDetailType createLinesOfCreditAccountSummaryDetailType() {
        return new LinesOfCreditAccountSummaryDetailType();
    }

    /**
     * Create an instance of {@link StatementItem }
     * 
     */
    public StatementItem createStatementItem() {
        return new StatementItem();
    }

    /**
     * Create an instance of {@link ImpactedChildOrganizationType }
     * 
     */
    public ImpactedChildOrganizationType createImpactedChildOrganizationType() {
        return new ImpactedChildOrganizationType();
    }

    /**
     * Create an instance of {@link OrganizationNameTypeForPrimaryRegistered }
     * 
     */
    public OrganizationNameTypeForPrimaryRegistered createOrganizationNameTypeForPrimaryRegistered() {
        return new OrganizationNameTypeForPrimaryRegistered();
    }

    /**
     * Create an instance of {@link NonspecificAddress }
     * 
     */
    public NonspecificAddress createNonspecificAddress() {
        return new NonspecificAddress();
    }

    /**
     * Create an instance of {@link OrganizationIdentificationNumberDetailsHistory }
     * 
     */
    public OrganizationIdentificationNumberDetailsHistory createOrganizationIdentificationNumberDetailsHistory() {
        return new OrganizationIdentificationNumberDetailsHistory();
    }

    /**
     * Create an instance of {@link CommentGroupType }
     * 
     */
    public CommentGroupType createCommentGroupType() {
        return new CommentGroupType();
    }

    /**
     * Create an instance of {@link NoteDetailForResponse }
     * 
     */
    public NoteDetailForResponse createNoteDetailForResponse() {
        return new NoteDetailForResponse();
    }

    /**
     * Create an instance of {@link RemedyFiled }
     * 
     */
    public RemedyFiled createRemedyFiled() {
        return new RemedyFiled();
    }

    /**
     * Create an instance of {@link SupplierPrincipal }
     * 
     */
    public SupplierPrincipal createSupplierPrincipal() {
        return new SupplierPrincipal();
    }

    /**
     * Create an instance of {@link LeaseAccountSummaryDetailType }
     * 
     */
    public LeaseAccountSummaryDetailType createLeaseAccountSummaryDetailType() {
        return new LeaseAccountSummaryDetailType();
    }

    /**
     * Create an instance of {@link MortgagesAndChargesSummary }
     * 
     */
    public MortgagesAndChargesSummary createMortgagesAndChargesSummary() {
        return new MortgagesAndChargesSummary();
    }

    /**
     * Create an instance of {@link StockExchangeDetails }
     * 
     */
    public StockExchangeDetails createStockExchangeDetails() {
        return new StockExchangeDetails();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link PrincipalBirthAddressType }
     * 
     */
    public PrincipalBirthAddressType createPrincipalBirthAddressType() {
        return new PrincipalBirthAddressType();
    }

    /**
     * Create an instance of {@link UCCFilingInformation }
     * 
     */
    public UCCFilingInformation createUCCFilingInformation() {
        return new UCCFilingInformation();
    }

    /**
     * Create an instance of {@link SupplierQueueDetail }
     * 
     */
    public SupplierQueueDetail createSupplierQueueDetail() {
        return new SupplierQueueDetail();
    }

    /**
     * Create an instance of {@link InformationConfirmation }
     * 
     */
    public InformationConfirmation createInformationConfirmation() {
        return new InformationConfirmation();
    }

    /**
     * Create an instance of {@link PrincipalAssociation }
     * 
     */
    public PrincipalAssociation createPrincipalAssociation() {
        return new PrincipalAssociation();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Create an instance of {@link ImportCountryDetails }
     * 
     */
    public ImportCountryDetails createImportCountryDetails() {
        return new ImportCountryDetails();
    }

    /**
     * Create an instance of {@link DNBStandardRatingType }
     * 
     */
    public DNBStandardRatingType createDNBStandardRatingType() {
        return new DNBStandardRatingType();
    }

    /**
     * Create an instance of {@link FinancialEventBaseType }
     * 
     */
    public FinancialEventBaseType createFinancialEventBaseType() {
        return new FinancialEventBaseType();
    }

    /**
     * Create an instance of {@link TotalPastDueCycleSummary }
     * 
     */
    public TotalPastDueCycleSummary createTotalPastDueCycleSummary() {
        return new TotalPastDueCycleSummary();
    }

    /**
     * Create an instance of {@link PaydexScoreType }
     * 
     */
    public PaydexScoreType createPaydexScoreType() {
        return new PaydexScoreType();
    }

    /**
     * Create an instance of {@link SearchByFilingNameFilingLocation }
     * 
     */
    public SearchByFilingNameFilingLocation createSearchByFilingNameFilingLocation() {
        return new SearchByFilingNameFilingLocation();
    }

    /**
     * Create an instance of {@link ContactEvent }
     * 
     */
    public ContactEvent createContactEvent() {
        return new ContactEvent();
    }

    /**
     * Create an instance of {@link CustomerDetailsType }
     * 
     */
    public CustomerDetailsType createCustomerDetailsType() {
        return new CustomerDetailsType();
    }

    /**
     * Create an instance of {@link PurchaserDerivedPaymentsToSupplierIndustry }
     * 
     */
    public PurchaserDerivedPaymentsToSupplierIndustry createPurchaserDerivedPaymentsToSupplierIndustry() {
        return new PurchaserDerivedPaymentsToSupplierIndustry();
    }

    /**
     * Create an instance of {@link FullName }
     * 
     */
    public FullName createFullName() {
        return new FullName();
    }

    /**
     * Create an instance of {@link RiskIncidence }
     * 
     */
    public RiskIncidence createRiskIncidence() {
        return new RiskIncidence();
    }

    /**
     * Create an instance of {@link CommunicationResult }
     * 
     */
    public CommunicationResult createCommunicationResult() {
        return new CommunicationResult();
    }

    /**
     * Create an instance of {@link HigherQuartile }
     * 
     */
    public HigherQuartile createHigherQuartile() {
        return new HigherQuartile();
    }

    /**
     * Create an instance of {@link RiskIncidencePercentageIndustryNorm }
     * 
     */
    public RiskIncidencePercentageIndustryNorm createRiskIncidencePercentageIndustryNorm() {
        return new RiskIncidencePercentageIndustryNorm();
    }

    /**
     * Create an instance of {@link InquirySummary }
     * 
     */
    public InquirySummary createInquirySummary() {
        return new InquirySummary();
    }

    /**
     * Create an instance of {@link MailAddressType }
     * 
     */
    public MailAddressType createMailAddressType() {
        return new MailAddressType();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link LongTermLiabilities }
     * 
     */
    public LongTermLiabilities createLongTermLiabilities() {
        return new LongTermLiabilities();
    }

    /**
     * Create an instance of {@link FamilyTreeAssociation }
     * 
     */
    public FamilyTreeAssociation createFamilyTreeAssociation() {
        return new FamilyTreeAssociation();
    }

    /**
     * Create an instance of {@link SocioEconomicIdentification }
     * 
     */
    public SocioEconomicIdentification createSocioEconomicIdentification() {
        return new SocioEconomicIdentification();
    }

    /**
     * Create an instance of {@link SubChapterContentDetail }
     * 
     */
    public SubChapterContentDetail createSubChapterContentDetail() {
        return new SubChapterContentDetail();
    }

    /**
     * Create an instance of {@link DNBStandardRatingTypeForPrincipal }
     * 
     */
    public DNBStandardRatingTypeForPrincipal createDNBStandardRatingTypeForPrincipal() {
        return new DNBStandardRatingTypeForPrincipal();
    }

    /**
     * Create an instance of {@link UnclassifiedAccountPeriodSummaryType }
     * 
     */
    public UnclassifiedAccountPeriodSummaryType createUnclassifiedAccountPeriodSummaryType() {
        return new UnclassifiedAccountPeriodSummaryType();
    }

    /**
     * Create an instance of {@link CreditDecisionSpecification }
     * 
     */
    public CreditDecisionSpecification createCreditDecisionSpecification() {
        return new CreditDecisionSpecification();
    }

    /**
     * Create an instance of {@link LitigationCourtDetail }
     * 
     */
    public LitigationCourtDetail createLitigationCourtDetail() {
        return new LitigationCourtDetail();
    }

    /**
     * Create an instance of {@link ViabilityScoreType }
     * 
     */
    public ViabilityScoreType createViabilityScoreType() {
        return new ViabilityScoreType();
    }

    /**
     * Create an instance of {@link GeographicNormType }
     * 
     */
    public GeographicNormType createGeographicNormType() {
        return new GeographicNormType();
    }

    /**
     * Create an instance of {@link TextEntry }
     * 
     */
    public TextEntry createTextEntry() {
        return new TextEntry();
    }

    /**
     * Create an instance of {@link RegisteredAddressType }
     * 
     */
    public RegisteredAddressType createRegisteredAddressType() {
        return new RegisteredAddressType();
    }

    /**
     * Create an instance of {@link AccountPayment }
     * 
     */
    public AccountPayment createAccountPayment() {
        return new AccountPayment();
    }

    /**
     * Create an instance of {@link EmploymentBiography }
     * 
     */
    public EmploymentBiography createEmploymentBiography() {
        return new EmploymentBiography();
    }

    /**
     * Create an instance of {@link PastDueCycleSummary }
     * 
     */
    public PastDueCycleSummary createPastDueCycleSummary() {
        return new PastDueCycleSummary();
    }

    /**
     * Create an instance of {@link FilingOrganizationNameBaseType }
     * 
     */
    public FilingOrganizationNameBaseType createFilingOrganizationNameBaseType() {
        return new FilingOrganizationNameBaseType();
    }

    /**
     * Create an instance of {@link SubjectIdentificationNumberType }
     * 
     */
    public SubjectIdentificationNumberType createSubjectIdentificationNumberType() {
        return new SubjectIdentificationNumberType();
    }

    /**
     * Create an instance of {@link PurchaserDerivedNetTermsPayments }
     * 
     */
    public PurchaserDerivedNetTermsPayments createPurchaserDerivedNetTermsPayments() {
        return new PurchaserDerivedNetTermsPayments();
    }

    /**
     * Create an instance of {@link ManagementFinancialTrendData }
     * 
     */
    public ManagementFinancialTrendData createManagementFinancialTrendData() {
        return new ManagementFinancialTrendData();
    }

    /**
     * Create an instance of {@link ScoreNormNewType }
     * 
     */
    public ScoreNormNewType createScoreNormNewType() {
        return new ScoreNormNewType();
    }

    /**
     * Create an instance of {@link BaseBalanceSheetType }
     * 
     */
    public BaseBalanceSheetType createBaseBalanceSheetType() {
        return new BaseBalanceSheetType();
    }

    /**
     * Create an instance of {@link Banking }
     * 
     */
    public Banking createBanking() {
        return new Banking();
    }

    /**
     * Create an instance of {@link SocialMediaDetail }
     * 
     */
    public SocialMediaDetail createSocialMediaDetail() {
        return new SocialMediaDetail();
    }

    /**
     * Create an instance of {@link ExportCountryDetails }
     * 
     */
    public ExportCountryDetails createExportCountryDetails() {
        return new ExportCountryDetails();
    }

    /**
     * Create an instance of {@link StockTradingInformation }
     * 
     */
    public StockTradingInformation createStockTradingInformation() {
        return new StockTradingInformation();
    }

    /**
     * Create an instance of {@link ManagementResponsibilityText }
     * 
     */
    public ManagementResponsibilityText createManagementResponsibilityText() {
        return new ManagementResponsibilityText();
    }

    /**
     * Create an instance of {@link ContractsSummary }
     * 
     */
    public ContractsSummary createContractsSummary() {
        return new ContractsSummary();
    }

    /**
     * Create an instance of {@link CreditDecisionDetail }
     * 
     */
    public CreditDecisionDetail createCreditDecisionDetail() {
        return new CreditDecisionDetail();
    }

    /**
     * Create an instance of {@link DNBScore }
     * 
     */
    public DNBScore createDNBScore() {
        return new DNBScore();
    }

    /**
     * Create an instance of {@link PrincipalDetailForLinkage }
     * 
     */
    public PrincipalDetailForLinkage createPrincipalDetailForLinkage() {
        return new PrincipalDetailForLinkage();
    }

    /**
     * Create an instance of {@link CollateralDetailType }
     * 
     */
    public CollateralDetailType createCollateralDetailType() {
        return new CollateralDetailType();
    }

    /**
     * Create an instance of {@link SBFEScoreReasonType }
     * 
     */
    public SBFEScoreReasonType createSBFEScoreReasonType() {
        return new SBFEScoreReasonType();
    }

    /**
     * Create an instance of {@link SubjectAddressUsageFinancialItemType }
     * 
     */
    public SubjectAddressUsageFinancialItemType createSubjectAddressUsageFinancialItemType() {
        return new SubjectAddressUsageFinancialItemType();
    }

    /**
     * Create an instance of {@link CommercialCreditScoreType }
     * 
     */
    public CommercialCreditScoreType createCommercialCreditScoreType() {
        return new CommercialCreditScoreType();
    }

    /**
     * Create an instance of {@link SubjectUsesAgentDetailsType }
     * 
     */
    public SubjectUsesAgentDetailsType createSubjectUsesAgentDetailsType() {
        return new SubjectUsesAgentDetailsType();
    }

    /**
     * Create an instance of {@link FinancialAssetArticle }
     * 
     */
    public FinancialAssetArticle createFinancialAssetArticle() {
        return new FinancialAssetArticle();
    }

    /**
     * Create an instance of {@link TriplePlayScoreType }
     * 
     */
    public TriplePlayScoreType createTriplePlayScoreType() {
        return new TriplePlayScoreType();
    }

    /**
     * Create an instance of {@link SecuredFilingsInformation }
     * 
     */
    public SecuredFilingsInformation createSecuredFilingsInformation() {
        return new SecuredFilingsInformation();
    }

    /**
     * Create an instance of {@link BaseAddressType }
     * 
     */
    public BaseAddressType createBaseAddressType() {
        return new BaseAddressType();
    }

    /**
     * Create an instance of {@link LoanAccountSummaryDetailType }
     * 
     */
    public LoanAccountSummaryDetailType createLoanAccountSummaryDetailType() {
        return new LoanAccountSummaryDetailType();
    }

    /**
     * Create an instance of {@link OpenEndedCreditLineAccountPeriodSummaryType }
     * 
     */
    public OpenEndedCreditLineAccountPeriodSummaryType createOpenEndedCreditLineAccountPeriodSummaryType() {
        return new OpenEndedCreditLineAccountPeriodSummaryType();
    }

    /**
     * Create an instance of {@link ActivitiesAndOperations }
     * 
     */
    public ActivitiesAndOperations createActivitiesAndOperations() {
        return new ActivitiesAndOperations();
    }

    /**
     * Create an instance of {@link FinancialAccountPeriodSummaryType }
     * 
     */
    public FinancialAccountPeriodSummaryType createFinancialAccountPeriodSummaryType() {
        return new FinancialAccountPeriodSummaryType();
    }

    /**
     * Create an instance of {@link CustomerProvidedSubjectNameType }
     * 
     */
    public CustomerProvidedSubjectNameType createCustomerProvidedSubjectNameType() {
        return new CustomerProvidedSubjectNameType();
    }

    /**
     * Create an instance of {@link GlobalUltimateOrganizationForSupplier }
     * 
     */
    public GlobalUltimateOrganizationForSupplier createGlobalUltimateOrganizationForSupplier() {
        return new GlobalUltimateOrganizationForSupplier();
    }

    /**
     * Create an instance of {@link LegalEvents }
     * 
     */
    public LegalEvents createLegalEvents() {
        return new LegalEvents();
    }

    /**
     * Create an instance of {@link ComparedToFinancialStatementHeaderForGrowthRate }
     * 
     */
    public ComparedToFinancialStatementHeaderForGrowthRate createComparedToFinancialStatementHeaderForGrowthRate() {
        return new ComparedToFinancialStatementHeaderForGrowthRate();
    }

    /**
     * Create an instance of {@link CompanySanctionDetail }
     * 
     */
    public CompanySanctionDetail createCompanySanctionDetail() {
        return new CompanySanctionDetail();
    }

    /**
     * Create an instance of {@link IndustryChapterDetail }
     * 
     */
    public IndustryChapterDetail createIndustryChapterDetail() {
        return new IndustryChapterDetail();
    }

    /**
     * Create an instance of {@link AssetArticleSummary }
     * 
     */
    public AssetArticleSummary createAssetArticleSummary() {
        return new AssetArticleSummary();
    }

    /**
     * Create an instance of {@link Linkage }
     * 
     */
    public Linkage createLinkage() {
        return new Linkage();
    }

    /**
     * Create an instance of {@link SanctionDetail }
     * 
     */
    public SanctionDetail createSanctionDetail() {
        return new SanctionDetail();
    }

    /**
     * Create an instance of {@link ThirdPartyAssessmentReason }
     * 
     */
    public ThirdPartyAssessmentReason createThirdPartyAssessmentReason() {
        return new ThirdPartyAssessmentReason();
    }

    /**
     * Create an instance of {@link ResultMessage }
     * 
     */
    public ResultMessage createResultMessage() {
        return new ResultMessage();
    }

    /**
     * Create an instance of {@link AccountDetailsSectionType }
     * 
     */
    public AccountDetailsSectionType createAccountDetailsSectionType() {
        return new AccountDetailsSectionType();
    }

    /**
     * Create an instance of {@link RatingOverrideReason }
     * 
     */
    public RatingOverrideReason createRatingOverrideReason() {
        return new RatingOverrideReason();
    }

    /**
     * Create an instance of {@link ShareCapitalDetailsType }
     * 
     */
    public ShareCapitalDetailsType createShareCapitalDetailsType() {
        return new ShareCapitalDetailsType();
    }

    /**
     * Create an instance of {@link PaymentMannerExperienceSummaryType }
     * 
     */
    public PaymentMannerExperienceSummaryType createPaymentMannerExperienceSummaryType() {
        return new PaymentMannerExperienceSummaryType();
    }

    /**
     * Create an instance of {@link PositionForCorporateDirectorship }
     * 
     */
    public PositionForCorporateDirectorship createPositionForCorporateDirectorship() {
        return new PositionForCorporateDirectorship();
    }

    /**
     * Create an instance of {@link SocioEconomicCharacteristicDetail }
     * 
     */
    public SocioEconomicCharacteristicDetail createSocioEconomicCharacteristicDetail() {
        return new SocioEconomicCharacteristicDetail();
    }

    /**
     * Create an instance of {@link UCCFilingSummaryType }
     * 
     */
    public UCCFilingSummaryType createUCCFilingSummaryType() {
        return new UCCFilingSummaryType();
    }

    /**
     * Create an instance of {@link GetSupplierRegistrationBatchStatusRequest }
     * 
     */
    public GetSupplierRegistrationBatchStatusRequest createGetSupplierRegistrationBatchStatusRequest() {
        return new GetSupplierRegistrationBatchStatusRequest();
    }

    /**
     * Create an instance of {@link IndustryProfileDetail }
     * 
     */
    public IndustryProfileDetail createIndustryProfileDetail() {
        return new IndustryProfileDetail();
    }

    /**
     * Create an instance of {@link Principal }
     * 
     */
    public Principal createPrincipal() {
        return new Principal();
    }

    /**
     * Create an instance of {@link NewsDetails }
     * 
     */
    public NewsDetails createNewsDetails() {
        return new NewsDetails();
    }

    /**
     * Create an instance of {@link FinancingDetails }
     * 
     */
    public FinancingDetails createFinancingDetails() {
        return new FinancingDetails();
    }

    /**
     * Create an instance of {@link FormerRegisteredAddress }
     * 
     */
    public FormerRegisteredAddress createFormerRegisteredAddress() {
        return new FormerRegisteredAddress();
    }

    /**
     * Create an instance of {@link CorporateDirectorshipType }
     * 
     */
    public CorporateDirectorshipType createCorporateDirectorshipType() {
        return new CorporateDirectorshipType();
    }

    /**
     * Create an instance of {@link GetSupplierListRequestDetail }
     * 
     */
    public GetSupplierListRequestDetail createGetSupplierListRequestDetail() {
        return new GetSupplierListRequestDetail();
    }

    /**
     * Create an instance of {@link OperatingNetRevenue }
     * 
     */
    public OperatingNetRevenue createOperatingNetRevenue() {
        return new OperatingNetRevenue();
    }

    /**
     * Create an instance of {@link GlobalLiabilities }
     * 
     */
    public GlobalLiabilities createGlobalLiabilities() {
        return new GlobalLiabilities();
    }

    /**
     * Create an instance of {@link PrincipalOfPrincipalDetailsType }
     * 
     */
    public PrincipalOfPrincipalDetailsType createPrincipalOfPrincipalDetailsType() {
        return new PrincipalOfPrincipalDetailsType();
    }

    /**
     * Create an instance of {@link SupplierShareholderType }
     * 
     */
    public SupplierShareholderType createSupplierShareholderType() {
        return new SupplierShareholderType();
    }

    /**
     * Create an instance of {@link NameSuffix }
     * 
     */
    public NameSuffix createNameSuffix() {
        return new NameSuffix();
    }

    /**
     * Create an instance of {@link UploadSupplierDocumentResponseDetail }
     * 
     */
    public UploadSupplierDocumentResponseDetail createUploadSupplierDocumentResponseDetail() {
        return new UploadSupplierDocumentResponseDetail();
    }

    /**
     * Create an instance of {@link PremisesDetail }
     * 
     */
    public PremisesDetail createPremisesDetail() {
        return new PremisesDetail();
    }

    /**
     * Create an instance of {@link SuitSummaryType }
     * 
     */
    public SuitSummaryType createSuitSummaryType() {
        return new SuitSummaryType();
    }

    /**
     * Create an instance of {@link OrganizationThirdPartyAssessment }
     * 
     */
    public OrganizationThirdPartyAssessment createOrganizationThirdPartyAssessment() {
        return new OrganizationThirdPartyAssessment();
    }

    /**
     * Create an instance of {@link ParentOrganizationForSpecialInvestigation }
     * 
     */
    public ParentOrganizationForSpecialInvestigation createParentOrganizationForSpecialInvestigation() {
        return new ParentOrganizationForSpecialInvestigation();
    }

    /**
     * Create an instance of {@link PurchaserDerivedData }
     * 
     */
    public PurchaserDerivedData createPurchaserDerivedData() {
        return new PurchaserDerivedData();
    }

    /**
     * Create an instance of {@link StatementItemType }
     * 
     */
    public StatementItemType createStatementItemType() {
        return new StatementItemType();
    }

    /**
     * Create an instance of {@link FinancialRatiosIndustryNorms }
     * 
     */
    public FinancialRatiosIndustryNorms createFinancialRatiosIndustryNorms() {
        return new FinancialRatiosIndustryNorms();
    }

    /**
     * Create an instance of {@link LienInformation }
     * 
     */
    public LienInformation createLienInformation() {
        return new LienInformation();
    }

    /**
     * Create an instance of {@link NewsSpecification }
     * 
     */
    public NewsSpecification createNewsSpecification() {
        return new NewsSpecification();
    }

    /**
     * Create an instance of {@link DebarmentsSummaryType }
     * 
     */
    public DebarmentsSummaryType createDebarmentsSummaryType() {
        return new DebarmentsSummaryType();
    }

    /**
     * Create an instance of {@link CustomerAccountSummary }
     * 
     */
    public CustomerAccountSummary createCustomerAccountSummary() {
        return new CustomerAccountSummary();
    }

    /**
     * Create an instance of {@link PremisesExternallUnitDetailType }
     * 
     */
    public PremisesExternallUnitDetailType createPremisesExternallUnitDetailType() {
        return new PremisesExternallUnitDetailType();
    }

    /**
     * Create an instance of {@link OrderProductRequest }
     * 
     */
    public OrderProductRequest createOrderProductRequest() {
        return new OrderProductRequest();
    }

    /**
     * Create an instance of {@link DNBViabilityRatingType }
     * 
     */
    public DNBViabilityRatingType createDNBViabilityRatingType() {
        return new DNBViabilityRatingType();
    }

    /**
     * Create an instance of {@link InternetReferenceDetail }
     * 
     */
    public InternetReferenceDetail createInternetReferenceDetail() {
        return new InternetReferenceDetail();
    }

    /**
     * Create an instance of {@link PremisesConstructionMaterialDetail }
     * 
     */
    public PremisesConstructionMaterialDetail createPremisesConstructionMaterialDetail() {
        return new PremisesConstructionMaterialDetail();
    }

    /**
     * Create an instance of {@link PrincipalSanctionDetail }
     * 
     */
    public PrincipalSanctionDetail createPrincipalSanctionDetail() {
        return new PrincipalSanctionDetail();
    }

    /**
     * Create an instance of {@link ResponseIndustryCodeType }
     * 
     */
    public ResponseIndustryCodeType createResponseIndustryCodeType() {
        return new ResponseIndustryCodeType();
    }

    /**
     * Create an instance of {@link StockTradingDetail }
     * 
     */
    public StockTradingDetail createStockTradingDetail() {
        return new StockTradingDetail();
    }

    /**
     * Create an instance of {@link DivisionDetail }
     * 
     */
    public DivisionDetail createDivisionDetail() {
        return new DivisionDetail();
    }

    /**
     * Create an instance of {@link ParentFinancialStatement }
     * 
     */
    public ParentFinancialStatement createParentFinancialStatement() {
        return new ParentFinancialStatement();
    }

    /**
     * Create an instance of {@link RegisterSupplierRequestDetail }
     * 
     */
    public RegisterSupplierRequestDetail createRegisterSupplierRequestDetail() {
        return new RegisterSupplierRequestDetail();
    }

    /**
     * Create an instance of {@link RequestAddress }
     * 
     */
    public RequestAddress createRequestAddress() {
        return new RequestAddress();
    }

    /**
     * Create an instance of {@link LetterOfLiabilityInformation }
     * 
     */
    public LetterOfLiabilityInformation createLetterOfLiabilityInformation() {
        return new LetterOfLiabilityInformation();
    }

    /**
     * Create an instance of {@link LettersOfCreditAccountPeriodSummaryType }
     * 
     */
    public LettersOfCreditAccountPeriodSummaryType createLettersOfCreditAccountPeriodSummaryType() {
        return new LettersOfCreditAccountPeriodSummaryType();
    }

    /**
     * Create an instance of {@link Ownership }
     * 
     */
    public Ownership createOwnership() {
        return new Ownership();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link TotalLossPredictorScoreType }
     * 
     */
    public TotalLossPredictorScoreType createTotalLossPredictorScoreType() {
        return new TotalLossPredictorScoreType();
    }

    /**
     * Create an instance of {@link Assessment }
     * 
     */
    public Assessment createAssessment() {
        return new Assessment();
    }

    /**
     * Create an instance of {@link CustomerProvidedSubjectInformation }
     * 
     */
    public CustomerProvidedSubjectInformation createCustomerProvidedSubjectInformation() {
        return new CustomerProvidedSubjectInformation();
    }

    /**
     * Create an instance of {@link SupplierAssessment }
     * 
     */
    public SupplierAssessment createSupplierAssessment() {
        return new SupplierAssessment();
    }

    /**
     * Create an instance of {@link FinancialAmountType }
     * 
     */
    public FinancialAmountType createFinancialAmountType() {
        return new FinancialAmountType();
    }

    /**
     * Create an instance of {@link RequestTransactionDetail }
     * 
     */
    public RequestTransactionDetail createRequestTransactionDetail() {
        return new RequestTransactionDetail();
    }

    /**
     * Create an instance of {@link Purchaser }
     * 
     */
    public Purchaser createPurchaser() {
        return new Purchaser();
    }

    /**
     * Create an instance of {@link QueueDetail }
     * 
     */
    public QueueDetail createQueueDetail() {
        return new QueueDetail();
    }

    /**
     * Create an instance of {@link YearsInBusinessDetail }
     * 
     */
    public YearsInBusinessDetail createYearsInBusinessDetail() {
        return new YearsInBusinessDetail();
    }

    /**
     * Create an instance of {@link ShareholderSpecification }
     * 
     */
    public ShareholderSpecification createShareholderSpecification() {
        return new ShareholderSpecification();
    }

    /**
     * Create an instance of {@link SubDivisionDetailType }
     * 
     */
    public SubDivisionDetailType createSubDivisionDetailType() {
        return new SubDivisionDetailType();
    }

    /**
     * Create an instance of {@link NetworthReconciliation }
     * 
     */
    public NetworthReconciliation createNetworthReconciliation() {
        return new NetworthReconciliation();
    }

    /**
     * Create an instance of {@link PaymentHistory }
     * 
     */
    public PaymentHistory createPaymentHistory() {
        return new PaymentHistory();
    }

    /**
     * Create an instance of {@link DataSufficiency }
     * 
     */
    public DataSufficiency createDataSufficiency() {
        return new DataSufficiency();
    }

    /**
     * Create an instance of {@link ImpactedPremisesDetailType }
     * 
     */
    public ImpactedPremisesDetailType createImpactedPremisesDetailType() {
        return new ImpactedPremisesDetailType();
    }

    /**
     * Create an instance of {@link Management }
     * 
     */
    public Management createManagement() {
        return new Management();
    }

    /**
     * Create an instance of {@link NormsIndustryCodeType }
     * 
     */
    public NormsIndustryCodeType createNormsIndustryCodeType() {
        return new NormsIndustryCodeType();
    }

    /**
     * Create an instance of {@link ProductSpecification }
     * 
     */
    public ProductSpecification createProductSpecification() {
        return new ProductSpecification();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link EmployeeFigures }
     * 
     */
    public EmployeeFigures createEmployeeFigures() {
        return new EmployeeFigures();
    }

    /**
     * Create an instance of {@link InsolvencyProcessinformation }
     * 
     */
    public InsolvencyProcessinformation createInsolvencyProcessinformation() {
        return new InsolvencyProcessinformation();
    }

    /**
     * Create an instance of {@link BankruptcyInformation }
     * 
     */
    public BankruptcyInformation createBankruptcyInformation() {
        return new BankruptcyInformation();
    }

    /**
     * Create an instance of {@link GlobalLongTermAssets }
     * 
     */
    public GlobalLongTermAssets createGlobalLongTermAssets() {
        return new GlobalLongTermAssets();
    }

    /**
     * Create an instance of {@link LawSuitType }
     * 
     */
    public LawSuitType createLawSuitType() {
        return new LawSuitType();
    }

    /**
     * Create an instance of {@link SupplierName }
     * 
     */
    public SupplierName createSupplierName() {
        return new SupplierName();
    }

    /**
     * Create an instance of {@link CurrentLiabilities }
     * 
     */
    public CurrentLiabilities createCurrentLiabilities() {
        return new CurrentLiabilities();
    }

    /**
     * Create an instance of {@link SocialMediaSpecification }
     * 
     */
    public SocialMediaSpecification createSocialMediaSpecification() {
        return new SocialMediaSpecification();
    }

    /**
     * Create an instance of {@link PaydexScoreNorms }
     * 
     */
    public PaydexScoreNorms createPaydexScoreNorms() {
        return new PaydexScoreNorms();
    }

    /**
     * Create an instance of {@link EmailAddressType }
     * 
     */
    public EmailAddressType createEmailAddressType() {
        return new EmailAddressType();
    }

    /**
     * Create an instance of {@link SupplierStabilityIndexScoreType }
     * 
     */
    public SupplierStabilityIndexScoreType createSupplierStabilityIndexScoreType() {
        return new SupplierStabilityIndexScoreType();
    }

    /**
     * Create an instance of {@link PastDuePaymentType }
     * 
     */
    public PastDuePaymentType createPastDuePaymentType() {
        return new PastDuePaymentType();
    }

    /**
     * Create an instance of {@link OrderProductRequestDetail.CustomScoreSpecification }
     * 
     */
    public OrderProductRequestDetail.CustomScoreSpecification createOrderProductRequestDetailCustomScoreSpecification() {
        return new OrderProductRequestDetail.CustomScoreSpecification();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeDataAvailabilityDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TradeDataAvailabilityDetail")
    public JAXBElement<TradeDataAvailabilityDetail> createTradeDataAvailabilityDetail(TradeDataAvailabilityDetail value) {
        return new JAXBElement<TradeDataAvailabilityDetail>(_TradeDataAvailabilityDetail_QNAME, TradeDataAvailabilityDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaydexScoreHistoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaydexScoreHistoryType")
    public JAXBElement<PaydexScoreHistoryType> createPaydexScoreHistoryType(PaydexScoreHistoryType value) {
        return new JAXBElement<PaydexScoreHistoryType>(_PaydexScoreHistoryType_QNAME, PaydexScoreHistoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveProductResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RetrieveProductResponseDetail")
    public JAXBElement<RetrieveProductResponseDetail> createRetrieveProductResponseDetail(RetrieveProductResponseDetail value) {
        return new JAXBElement<RetrieveProductResponseDetail>(_RetrieveProductResponseDetail_QNAME, RetrieveProductResponseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierDetailForNotes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierDetailForNotes")
    public JAXBElement<SupplierDetailForNotes> createSupplierDetailForNotes(SupplierDetailForNotes value) {
        return new JAXBElement<SupplierDetailForNotes>(_SupplierDetailForNotes_QNAME, SupplierDetailForNotes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LienType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LienType")
    public JAXBElement<LienType> createLienType(LienType value) {
        return new JAXBElement<LienType>(_LienType_QNAME, LienType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PastDuePercentageCycleSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PastDuePercentageCycleSummary")
    public JAXBElement<PastDuePercentageCycleSummary> createPastDuePercentageCycleSummary(PastDuePercentageCycleSummary value) {
        return new JAXBElement<PastDuePercentageCycleSummary>(_PastDuePercentageCycleSummary_QNAME, PastDuePercentageCycleSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrowerAnalyticsCycleSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BorrowerAnalyticsCycleSummary")
    public JAXBElement<BorrowerAnalyticsCycleSummary> createBorrowerAnalyticsCycleSummary(BorrowerAnalyticsCycleSummary value) {
        return new JAXBElement<BorrowerAnalyticsCycleSummary>(_BorrowerAnalyticsCycleSummary_QNAME, BorrowerAnalyticsCycleSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Role }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Role")
    public JAXBElement<Role> createRole(Role value) {
        return new JAXBElement<Role>(_Role_QNAME, Role.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyFinancialFiguresOverview }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "KeyFinancialFiguresOverview")
    public JAXBElement<KeyFinancialFiguresOverview> createKeyFinancialFiguresOverview(KeyFinancialFiguresOverview value) {
        return new JAXBElement<KeyFinancialFiguresOverview>(_KeyFinancialFiguresOverview_QNAME, KeyFinancialFiguresOverview.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierDetailForCustomerProvidedInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierDetailForCustomerProvidedInformation")
    public JAXBElement<SupplierDetailForCustomerProvidedInformation> createSupplierDetailForCustomerProvidedInformation(SupplierDetailForCustomerProvidedInformation value) {
        return new JAXBElement<SupplierDetailForCustomerProvidedInformation>(_SupplierDetailForCustomerProvidedInformation_QNAME, SupplierDetailForCustomerProvidedInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormerOrganizationPrimaryNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FormerOrganizationPrimaryNameType")
    public JAXBElement<FormerOrganizationPrimaryNameType> createFormerOrganizationPrimaryNameType(FormerOrganizationPrimaryNameType value) {
        return new JAXBElement<FormerOrganizationPrimaryNameType>(_FormerOrganizationPrimaryNameType_QNAME, FormerOrganizationPrimaryNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LettersOfCreditAccountSummaryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LettersOfCreditAccountSummaryDetailType")
    public JAXBElement<LettersOfCreditAccountSummaryDetailType> createLettersOfCreditAccountSummaryDetailType(LettersOfCreditAccountSummaryDetailType value) {
        return new JAXBElement<LettersOfCreditAccountSummaryDetailType>(_LettersOfCreditAccountSummaryDetailType_QNAME, LettersOfCreditAccountSummaryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalEventBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LegalEventBaseType")
    public JAXBElement<LegalEventBaseType> createLegalEventBaseType(LegalEventBaseType value) {
        return new JAXBElement<LegalEventBaseType>(_LegalEventBaseType_QNAME, LegalEventBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationIdentificationNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrganizationIdentificationNumberType")
    public JAXBElement<OrganizationIdentificationNumberType> createOrganizationIdentificationNumberType(OrganizationIdentificationNumberType value) {
        return new JAXBElement<OrganizationIdentificationNumberType>(_OrganizationIdentificationNumberType_QNAME, OrganizationIdentificationNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChapterContentDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ChapterContentDetail")
    public JAXBElement<ChapterContentDetail> createChapterContentDetail(ChapterContentDetail value) {
        return new JAXBElement<ChapterContentDetail>(_ChapterContentDetail_QNAME, ChapterContentDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedPartyDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RelatedPartyDetail")
    public JAXBElement<RelatedPartyDetail> createRelatedPartyDetail(RelatedPartyDetail value) {
        return new JAXBElement<RelatedPartyDetail>(_RelatedPartyDetail_QNAME, RelatedPartyDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentAssets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CurrentAssets")
    public JAXBElement<CurrentAssets> createCurrentAssets(CurrentAssets value) {
        return new JAXBElement<CurrentAssets>(_CurrentAssets_QNAME, CurrentAssets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentExperienceSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaymentExperienceSummary")
    public JAXBElement<PaymentExperienceSummary> createPaymentExperienceSummary(PaymentExperienceSummary value) {
        return new JAXBElement<PaymentExperienceSummary>(_PaymentExperienceSummary_QNAME, PaymentExperienceSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Financial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Financial")
    public JAXBElement<Financial> createFinancial(Financial value) {
        return new JAXBElement<Financial>(_Financial_QNAME, Financial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadSupplierDocumentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "UploadSupplierDocumentRequest")
    public JAXBElement<UploadSupplierDocumentRequest> createUploadSupplierDocumentRequest(UploadSupplierDocumentRequest value) {
        return new JAXBElement<UploadSupplierDocumentRequest>(_UploadSupplierDocumentRequest_QNAME, UploadSupplierDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountantDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AccountantDetails")
    public JAXBElement<AccountantDetails> createAccountantDetails(AccountantDetails value) {
        return new JAXBElement<AccountantDetails>(_AccountantDetails_QNAME, AccountantDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancingStatementFilingPeriodSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancingStatementFilingPeriodSummary")
    public JAXBElement<FinancingStatementFilingPeriodSummary> createFinancingStatementFilingPeriodSummary(FinancingStatementFilingPeriodSummary value) {
        return new JAXBElement<FinancingStatementFilingPeriodSummary>(_FinancingStatementFilingPeriodSummary_QNAME, FinancingStatementFilingPeriodSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RolePalyerAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RolePalyerAddressType")
    public JAXBElement<RolePalyerAddressType> createRolePalyerAddressType(RolePalyerAddressType value) {
        return new JAXBElement<RolePalyerAddressType>(_RolePalyerAddressType_QNAME, RolePalyerAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierDetail")
    public JAXBElement<SupplierDetail> createSupplierDetail(SupplierDetail value) {
        return new JAXBElement<SupplierDetail>(_SupplierDetail_QNAME, SupplierDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TextEntryType")
    public JAXBElement<TextEntryType> createTextEntryType(TextEntryType value) {
        return new JAXBElement<TextEntryType>(_TextEntryType_QNAME, TextEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialStatementHeaderGrowthRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialStatementHeaderGrowthRate")
    public JAXBElement<FinancialStatementHeaderGrowthRate> createFinancialStatementHeaderGrowthRate(FinancialStatementHeaderGrowthRate value) {
        return new JAXBElement<FinancialStatementHeaderGrowthRate>(_FinancialStatementHeaderGrowthRate_QNAME, FinancialStatementHeaderGrowthRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SimpleAddress")
    public JAXBElement<SimpleAddress> createSimpleAddress(SimpleAddress value) {
        return new JAXBElement<SimpleAddress>(_SimpleAddress_QNAME, SimpleAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormerPrimaryAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FormerPrimaryAddress")
    public JAXBElement<FormerPrimaryAddress> createFormerPrimaryAddress(FormerPrimaryAddress value) {
        return new JAXBElement<FormerPrimaryAddress>(_FormerPrimaryAddress_QNAME, FormerPrimaryAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UCCFilingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "UCCFilingType")
    public JAXBElement<UCCFilingType> createUCCFilingType(UCCFilingType value) {
        return new JAXBElement<UCCFilingType>(_UCCFilingType_QNAME, UCCFilingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalFailureRiskScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GlobalFailureRiskScoreType")
    public JAXBElement<GlobalFailureRiskScoreType> createGlobalFailureRiskScoreType(GlobalFailureRiskScoreType value) {
        return new JAXBElement<GlobalFailureRiskScoreType>(_GlobalFailureRiskScoreType_QNAME, GlobalFailureRiskScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TaxDetailType")
    public JAXBElement<TaxDetailType> createTaxDetailType(TaxDetailType value) {
        return new JAXBElement<TaxDetailType>(_TaxDetailType_QNAME, TaxDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubsequentEventDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubsequentEventDetail")
    public JAXBElement<SubsequentEventDetail> createSubsequentEventDetail(SubsequentEventDetail value) {
        return new JAXBElement<SubsequentEventDetail>(_SubsequentEventDetail_QNAME, SubsequentEventDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilingInquiryDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FilingInquiryDetail")
    public JAXBElement<FilingInquiryDetail> createFilingInquiryDetail(FilingInquiryDetail value) {
        return new JAXBElement<FilingInquiryDetail>(_FilingInquiryDetail_QNAME, FilingInquiryDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustryPaymentExperienceSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IndustryPaymentExperienceSummaryType")
    public JAXBElement<IndustryPaymentExperienceSummaryType> createIndustryPaymentExperienceSummaryType(IndustryPaymentExperienceSummaryType value) {
        return new JAXBElement<IndustryPaymentExperienceSummaryType>(_IndustryPaymentExperienceSummaryType_QNAME, IndustryPaymentExperienceSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditRangePaymentExperienceSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CreditRangePaymentExperienceSummaryType")
    public JAXBElement<CreditRangePaymentExperienceSummaryType> createCreditRangePaymentExperienceSummaryType(CreditRangePaymentExperienceSummaryType value) {
        return new JAXBElement<CreditRangePaymentExperienceSummaryType>(_CreditRangePaymentExperienceSummaryType_QNAME, CreditRangePaymentExperienceSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PeriodSummaryType")
    public JAXBElement<PeriodSummaryType> createPeriodSummaryType(PeriodSummaryType value) {
        return new JAXBElement<PeriodSummaryType>(_PeriodSummaryType_QNAME, PeriodSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalReferenceText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PrincipalReferenceText")
    public JAXBElement<PrincipalReferenceText> createPrincipalReferenceText(PrincipalReferenceText value) {
        return new JAXBElement<PrincipalReferenceText>(_PrincipalReferenceText_QNAME, PrincipalReferenceText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GetSupplierListResponse")
    public JAXBElement<GetSupplierListResponse> createGetSupplierListResponse(GetSupplierListResponse value) {
        return new JAXBElement<GetSupplierListResponse>(_GetSupplierListResponse_QNAME, GetSupplierListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortfolioComparisonScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PortfolioComparisonScoreType")
    public JAXBElement<PortfolioComparisonScoreType> createPortfolioComparisonScoreType(PortfolioComparisonScoreType value) {
        return new JAXBElement<PortfolioComparisonScoreType>(_PortfolioComparisonScoreType_QNAME, PortfolioComparisonScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PrincipalSummaryType")
    public JAXBElement<PrincipalSummaryType> createPrincipalSummaryType(PrincipalSummaryType value) {
        return new JAXBElement<PrincipalSummaryType>(_PrincipalSummaryType_QNAME, PrincipalSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectAddress")
    public JAXBElement<SubjectAddress> createSubjectAddress(SubjectAddress value) {
        return new JAXBElement<SubjectAddress>(_SubjectAddress_QNAME, SubjectAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorldWatchHeadlineDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "WorldWatchHeadlineDetails")
    public JAXBElement<WorldWatchHeadlineDetails> createWorldWatchHeadlineDetails(WorldWatchHeadlineDetails value) {
        return new JAXBElement<WorldWatchHeadlineDetails>(_WorldWatchHeadlineDetails_QNAME, WorldWatchHeadlineDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectAddressUsageTenureDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectAddressUsageTenureDetail")
    public JAXBElement<SubjectAddressUsageTenureDetail> createSubjectAddressUsageTenureDetail(SubjectAddressUsageTenureDetail value) {
        return new JAXBElement<SubjectAddressUsageTenureDetail>(_SubjectAddressUsageTenureDetail_QNAME, SubjectAddressUsageTenureDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IndividualNameType")
    public JAXBElement<IndividualNameType> createIndividualNameType(IndividualNameType value) {
        return new JAXBElement<IndividualNameType>(_IndividualNameType_QNAME, IndividualNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SuitType")
    public JAXBElement<SuitType> createSuitType(SuitType value) {
        return new JAXBElement<SuitType>(_SuitType_QNAME, SuitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummarizedSlowType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SummarizedSlowType")
    public JAXBElement<SummarizedSlowType> createSummarizedSlowType(SummarizedSlowType value) {
        return new JAXBElement<SummarizedSlowType>(_SummarizedSlowType_QNAME, SummarizedSlowType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DNBStringType")
    public JAXBElement<DNBStringType> createDNBStringType(DNBStringType value) {
        return new JAXBElement<DNBStringType>(_DNBStringType_QNAME, DNBStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParentEventsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ParentEventsType")
    public JAXBElement<ParentEventsType> createParentEventsType(ParentEventsType value) {
        return new JAXBElement<ParentEventsType>(_ParentEventsType_QNAME, ParentEventsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CurrentPayment")
    public JAXBElement<CurrentPayment> createCurrentPayment(CurrentPayment value) {
        return new JAXBElement<CurrentPayment>(_CurrentPayment_QNAME, CurrentPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionAddressLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RegionAddressLine")
    public JAXBElement<RegionAddressLine> createRegionAddressLine(RegionAddressLine value) {
        return new JAXBElement<RegionAddressLine>(_RegionAddressLine_QNAME, RegionAddressLine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareholderForRegisterSupplier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ShareholderForRegisterSupplier")
    public JAXBElement<ShareholderForRegisterSupplier> createShareholderForRegisterSupplier(ShareholderForRegisterSupplier value) {
        return new JAXBElement<ShareholderForRegisterSupplier>(_ShareholderForRegisterSupplier_QNAME, ShareholderForRegisterSupplier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Shareholder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Shareholder")
    public JAXBElement<Shareholder> createShareholder(Shareholder value) {
        return new JAXBElement<Shareholder>(_Shareholder_QNAME, Shareholder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuerInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IssuerInformation")
    public JAXBElement<IssuerInformation> createIssuerInformation(IssuerInformation value) {
        return new JAXBElement<IssuerInformation>(_IssuerInformation_QNAME, IssuerInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaydexScoreIndustryNormsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaydexScoreIndustryNormsType")
    public JAXBElement<PaydexScoreIndustryNormsType> createPaydexScoreIndustryNormsType(PaydexScoreIndustryNormsType value) {
        return new JAXBElement<PaydexScoreIndustryNormsType>(_PaydexScoreIndustryNormsType_QNAME, PaydexScoreIndustryNormsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareCapitalDetailsHistoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ShareCapitalDetailsHistoryType")
    public JAXBElement<ShareCapitalDetailsHistoryType> createShareCapitalDetailsHistoryType(ShareCapitalDetailsHistoryType value) {
        return new JAXBElement<ShareCapitalDetailsHistoryType>(_ShareCapitalDetailsHistoryType_QNAME, ShareCapitalDetailsHistoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessAgeNorm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BusinessAgeNorm")
    public JAXBElement<BusinessAgeNorm> createBusinessAgeNorm(BusinessAgeNorm value) {
        return new JAXBElement<BusinessAgeNorm>(_BusinessAgeNorm_QNAME, BusinessAgeNorm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashFlowStatement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CashFlowStatement")
    public JAXBElement<CashFlowStatement> createCashFlowStatement(CashFlowStatement value) {
        return new JAXBElement<CashFlowStatement>(_CashFlowStatement_QNAME, CashFlowStatement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalPaymentsCountCycleSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TotalPaymentsCountCycleSummary")
    public JAXBElement<TotalPaymentsCountCycleSummary> createTotalPaymentsCountCycleSummary(TotalPaymentsCountCycleSummary value) {
        return new JAXBElement<TotalPaymentsCountCycleSummary>(_TotalPaymentsCountCycleSummary_QNAME, TotalPaymentsCountCycleSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JudgmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "JudgmentType")
    public JAXBElement<JudgmentType> createJudgmentType(JudgmentType value) {
        return new JAXBElement<JudgmentType>(_JudgmentType_QNAME, JudgmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ClaimSummary")
    public JAXBElement<ClaimSummary> createClaimSummary(ClaimSummary value) {
        return new JAXBElement<ClaimSummary>(_ClaimSummary_QNAME, ClaimSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialStatementCommentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialStatementCommentsType")
    public JAXBElement<FinancialStatementCommentsType> createFinancialStatementCommentsType(FinancialStatementCommentsType value) {
        return new JAXBElement<FinancialStatementCommentsType>(_FinancialStatementCommentsType_QNAME, FinancialStatementCommentsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalCurrentAssets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GlobalCurrentAssets")
    public JAXBElement<GlobalCurrentAssets> createGlobalCurrentAssets(GlobalCurrentAssets value) {
        return new JAXBElement<GlobalCurrentAssets>(_GlobalCurrentAssets_QNAME, GlobalCurrentAssets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierPerformanceScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierPerformanceScoreType")
    public JAXBElement<SupplierPerformanceScoreType> createSupplierPerformanceScoreType(SupplierPerformanceScoreType value) {
        return new JAXBElement<SupplierPerformanceScoreType>(_SupplierPerformanceScoreType_QNAME, SupplierPerformanceScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallBusinessFinancialExchangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SmallBusinessFinancialExchangeType")
    public JAXBElement<SmallBusinessFinancialExchangeType> createSmallBusinessFinancialExchangeType(SmallBusinessFinancialExchangeType value) {
        return new JAXBElement<SmallBusinessFinancialExchangeType>(_SmallBusinessFinancialExchangeType_QNAME, SmallBusinessFinancialExchangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PremisesUsageDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PremisesUsageDetail")
    public JAXBElement<PremisesUsageDetail> createPremisesUsageDetail(PremisesUsageDetail value) {
        return new JAXBElement<PremisesUsageDetail>(_PremisesUsageDetail_QNAME, PremisesUsageDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringNewType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DNBDecodedStringNewType")
    public JAXBElement<DNBDecodedStringNewType> createDNBDecodedStringNewType(DNBDecodedStringNewType value) {
        return new JAXBElement<DNBDecodedStringNewType>(_DNBDecodedStringNewType_QNAME, DNBDecodedStringNewType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InquiryDetailForAlert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "InquiryDetailForAlert")
    public JAXBElement<InquiryDetailForAlert> createInquiryDetailForAlert(InquiryDetailForAlert value) {
        return new JAXBElement<InquiryDetailForAlert>(_InquiryDetailForAlert_QNAME, InquiryDetailForAlert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USPatriotActComplianceRiskScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "USPatriotActComplianceRiskScore")
    public JAXBElement<USPatriotActComplianceRiskScore> createUSPatriotActComplianceRiskScore(USPatriotActComplianceRiskScore value) {
        return new JAXBElement<USPatriotActComplianceRiskScore>(_USPatriotActComplianceRiskScore_QNAME, USPatriotActComplianceRiskScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AlertDetail")
    public JAXBElement<AlertDetail> createAlertDetail(AlertDetail value) {
        return new JAXBElement<AlertDetail>(_AlertDetail_QNAME, AlertDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingStatusComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OperatingStatusComment")
    public JAXBElement<OperatingStatusComment> createOperatingStatusComment(OperatingStatusComment value) {
        return new JAXBElement<OperatingStatusComment>(_OperatingStatusComment_QNAME, OperatingStatusComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditBureauSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CreditBureauSpecification")
    public JAXBElement<CreditBureauSpecification> createCreditBureauSpecification(CreditBureauSpecification value) {
        return new JAXBElement<CreditBureauSpecification>(_CreditBureauSpecification_QNAME, CreditBureauSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierRegistrationBatchStatusRequestDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GetSupplierRegistrationBatchStatusRequestDetail")
    public JAXBElement<GetSupplierRegistrationBatchStatusRequestDetail> createGetSupplierRegistrationBatchStatusRequestDetail(GetSupplierRegistrationBatchStatusRequestDetail value) {
        return new JAXBElement<GetSupplierRegistrationBatchStatusRequestDetail>(_GetSupplierRegistrationBatchStatusRequestDetail_QNAME, GetSupplierRegistrationBatchStatusRequestDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PoliticalDistrict }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PoliticalDistrict")
    public JAXBElement<PoliticalDistrict> createPoliticalDistrict(PoliticalDistrict value) {
        return new JAXBElement<PoliticalDistrict>(_PoliticalDistrict_QNAME, PoliticalDistrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rating }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Rating")
    public JAXBElement<Rating> createRating(Rating value) {
        return new JAXBElement<Rating>(_Rating_QNAME, Rating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelecommunicationNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TelecommunicationNumberType")
    public JAXBElement<TelecommunicationNumberType> createTelecommunicationNumberType(TelecommunicationNumberType value) {
        return new JAXBElement<TelecommunicationNumberType>(_TelecommunicationNumberType_QNAME, TelecommunicationNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChildAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ChildAssociation")
    public JAXBElement<ChildAssociation> createChildAssociation(ChildAssociation value) {
        return new JAXBElement<ChildAssociation>(_ChildAssociation_QNAME, ChildAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PremisesInternalUnitDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PremisesInternalUnitDetailType")
    public JAXBElement<PremisesInternalUnitDetailType> createPremisesInternalUnitDetailType(PremisesInternalUnitDetailType value) {
        return new JAXBElement<PremisesInternalUnitDetailType>(_PremisesInternalUnitDetailType_QNAME, PremisesInternalUnitDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterSupplierRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RegisterSupplierRequest")
    public JAXBElement<RegisterSupplierRequest> createRegisterSupplierRequest(RegisterSupplierRequest value) {
        return new JAXBElement<RegisterSupplierRequest>(_RegisterSupplierRequest_QNAME, RegisterSupplierRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommercialCardAccountPeriodSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CommercialCardAccountPeriodSummaryType")
    public JAXBElement<CommercialCardAccountPeriodSummaryType> createCommercialCardAccountPeriodSummaryType(CommercialCardAccountPeriodSummaryType value) {
        return new JAXBElement<CommercialCardAccountPeriodSummaryType>(_CommercialCardAccountPeriodSummaryType_QNAME, CommercialCardAccountPeriodSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "MatchResult")
    public JAXBElement<MatchResult> createMatchResult(MatchResult value) {
        return new JAXBElement<MatchResult>(_MatchResult_QNAME, MatchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeFormStatementItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FreeFormStatementItem")
    public JAXBElement<FreeFormStatementItem> createFreeFormStatementItem(FreeFormStatementItem value) {
        return new JAXBElement<FreeFormStatementItem>(_FreeFormStatementItem_QNAME, FreeFormStatementItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrowerAnalyticsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BorrowerAnalyticsType")
    public JAXBElement<BorrowerAnalyticsType> createBorrowerAnalyticsType(BorrowerAnalyticsType value) {
        return new JAXBElement<BorrowerAnalyticsType>(_BorrowerAnalyticsType_QNAME, BorrowerAnalyticsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerFileDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CustomerFileDetails")
    public JAXBElement<CustomerFileDetails> createCustomerFileDetails(CustomerFileDetails value) {
        return new JAXBElement<CustomerFileDetails>(_CustomerFileDetails_QNAME, CustomerFileDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatementHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "StatementHeaderType")
    public JAXBElement<StatementHeaderType> createStatementHeaderType(StatementHeaderType value) {
        return new JAXBElement<StatementHeaderType>(_StatementHeaderType_QNAME, StatementHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationPrimaryNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrganizationPrimaryNameType")
    public JAXBElement<OrganizationPrimaryNameType> createOrganizationPrimaryNameType(OrganizationPrimaryNameType value) {
        return new JAXBElement<OrganizationPrimaryNameType>(_OrganizationPrimaryNameType_QNAME, OrganizationPrimaryNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RegistrationSummary")
    public JAXBElement<RegistrationSummary> createRegistrationSummary(RegistrationSummary value) {
        return new JAXBElement<RegistrationSummary>(_RegistrationSummary_QNAME, RegistrationSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GetDataResponse")
    public JAXBElement<GetDataResponse> createGetDataResponse(GetDataResponse value) {
        return new JAXBElement<GetDataResponse>(_GetDataResponse_QNAME, GetDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialInvestigationInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SpecialInvestigationInformation")
    public JAXBElement<SpecialInvestigationInformation> createSpecialInvestigationInformation(SpecialInvestigationInformation value) {
        return new JAXBElement<SpecialInvestigationInformation>(_SpecialInvestigationInformation_QNAME, SpecialInvestigationInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseTransactionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ResponseTransactionDetail")
    public JAXBElement<ResponseTransactionDetail> createResponseTransactionDetail(ResponseTransactionDetail value) {
        return new JAXBElement<ResponseTransactionDetail>(_ResponseTransactionDetail_QNAME, ResponseTransactionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Officers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Officers")
    public JAXBElement<Officers> createOfficers(Officers value) {
        return new JAXBElement<Officers>(_Officers_QNAME, Officers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SBRIScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SBRIScore")
    public JAXBElement<SBRIScore> createSBRIScore(SBRIScore value) {
        return new JAXBElement<SBRIScore>(_SBRIScore_QNAME, SBRIScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TransactionResult")
    public JAXBElement<TransactionResult> createTransactionResult(TransactionResult value) {
        return new JAXBElement<TransactionResult>(_TransactionResult_QNAME, TransactionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSupplierNotesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AddSupplierNotesRequest")
    public JAXBElement<AddSupplierNotesRequest> createAddSupplierNotesRequest(AddSupplierNotesRequest value) {
        return new JAXBElement<AddSupplierNotesRequest>(_AddSupplierNotesRequest_QNAME, AddSupplierNotesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountsPayable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AmountsPayable")
    public JAXBElement<AmountsPayable> createAmountsPayable(AmountsPayable value) {
        return new JAXBElement<AmountsPayable>(_AmountsPayable_QNAME, AmountsPayable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositePaydexScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CompositePaydexScoreType")
    public JAXBElement<CompositePaydexScoreType> createCompositePaydexScoreType(CompositePaydexScoreType value) {
        return new JAXBElement<CompositePaydexScoreType>(_CompositePaydexScoreType_QNAME, CompositePaydexScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compensation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Compensation")
    public JAXBElement<Compensation> createCompensation(Compensation value) {
        return new JAXBElement<Compensation>(_Compensation_QNAME, Compensation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeCategoryDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "EmployeeCategoryDetails")
    public JAXBElement<EmployeeCategoryDetails> createEmployeeCategoryDetails(EmployeeCategoryDetails value) {
        return new JAXBElement<EmployeeCategoryDetails>(_EmployeeCategoryDetails_QNAME, EmployeeCategoryDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseArchiveDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ResponseArchiveDetail")
    public JAXBElement<ResponseArchiveDetail> createResponseArchiveDetail(ResponseArchiveDetail value) {
        return new JAXBElement<ResponseArchiveDetail>(_ResponseArchiveDetail_QNAME, ResponseArchiveDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactInterview }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ContactInterview")
    public JAXBElement<ContactInterview> createContactInterview(ContactInterview value) {
        return new JAXBElement<ContactInterview>(_ContactInterview_QNAME, ContactInterview.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBaseAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SearchBaseAddressType")
    public JAXBElement<SearchBaseAddressType> createSearchBaseAddressType(SearchBaseAddressType value) {
        return new JAXBElement<SearchBaseAddressType>(_SearchBaseAddressType_QNAME, SearchBaseAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerritorialSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TerritorialSummary")
    public JAXBElement<TerritorialSummary> createTerritorialSummary(TerritorialSummary value) {
        return new JAXBElement<TerritorialSummary>(_TerritorialSummary_QNAME, TerritorialSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BaseEventType")
    public JAXBElement<BaseEventType> createBaseEventType(BaseEventType value) {
        return new JAXBElement<BaseEventType>(_BaseEventType_QNAME, BaseEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedPublicFilingDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RequestedPublicFilingDetail")
    public JAXBElement<RequestedPublicFilingDetail> createRequestedPublicFilingDetail(RequestedPublicFilingDetail value) {
        return new JAXBElement<RequestedPublicFilingDetail>(_RequestedPublicFilingDetail_QNAME, RequestedPublicFilingDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportConcessionDisadvantagedBusinessEnterpriseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AirportConcessionDisadvantagedBusinessEnterpriseDetail")
    public JAXBElement<AirportConcessionDisadvantagedBusinessEnterpriseDetail> createAirportConcessionDisadvantagedBusinessEnterpriseDetail(AirportConcessionDisadvantagedBusinessEnterpriseDetail value) {
        return new JAXBElement<AirportConcessionDisadvantagedBusinessEnterpriseDetail>(_AirportConcessionDisadvantagedBusinessEnterpriseDetail_QNAME, AirportConcessionDisadvantagedBusinessEnterpriseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectHeader")
    public JAXBElement<SubjectHeader> createSubjectHeader(SubjectHeader value) {
        return new JAXBElement<SubjectHeader>(_SubjectHeader_QNAME, SubjectHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThirdPartyAssessmenUnavailableReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ThirdPartyAssessmenUnavailableReason")
    public JAXBElement<ThirdPartyAssessmenUnavailableReason> createThirdPartyAssessmenUnavailableReason(ThirdPartyAssessmenUnavailableReason value) {
        return new JAXBElement<ThirdPartyAssessmenUnavailableReason>(_ThirdPartyAssessmenUnavailableReason_QNAME, ThirdPartyAssessmenUnavailableReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalFormDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LegalFormDetailsType")
    public JAXBElement<LegalFormDetailsType> createLegalFormDetailsType(LegalFormDetailsType value) {
        return new JAXBElement<LegalFormDetailsType>(_LegalFormDetailsType_QNAME, LegalFormDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrowthRates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GrowthRates")
    public JAXBElement<GrowthRates> createGrowthRates(GrowthRates value) {
        return new JAXBElement<GrowthRates>(_GrowthRates_QNAME, GrowthRates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InclusionCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "InclusionCriteria")
    public JAXBElement<InclusionCriteria> createInclusionCriteria(InclusionCriteria value) {
        return new JAXBElement<InclusionCriteria>(_InclusionCriteria_QNAME, InclusionCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegulationDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RegulationDetail")
    public JAXBElement<RegulationDetail> createRegulationDetail(RegulationDetail value) {
        return new JAXBElement<RegulationDetail>(_RegulationDetail_QNAME, RegulationDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBStringType128 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DNBStringType_128")
    public JAXBElement<DNBStringType128> createDNBStringType128(DNBStringType128 value) {
        return new JAXBElement<DNBStringType128>(_DNBStringType128_QNAME, DNBStringType128 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDetailsDisclaimerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaymentDetailsDisclaimerInfo")
    public JAXBElement<PaymentDetailsDisclaimerInfo> createPaymentDetailsDisclaimerInfo(PaymentDetailsDisclaimerInfo value) {
        return new JAXBElement<PaymentDetailsDisclaimerInfo>(_PaymentDetailsDisclaimerInfo_QNAME, PaymentDetailsDisclaimerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierAddressDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierAddressDetail")
    public JAXBElement<SupplierAddressDetail> createSupplierAddressDetail(SupplierAddressDetail value) {
        return new JAXBElement<SupplierAddressDetail>(_SupplierAddressDetail_QNAME, SupplierAddressDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelecommunicationNumberSimpleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TelecommunicationNumberSimpleType")
    public JAXBElement<TelecommunicationNumberSimpleType> createTelecommunicationNumberSimpleType(TelecommunicationNumberSimpleType value) {
        return new JAXBElement<TelecommunicationNumberSimpleType>(_TelecommunicationNumberSimpleType_QNAME, TelecommunicationNumberSimpleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ClaimType")
    public JAXBElement<ClaimType> createClaimType(ClaimType value) {
        return new JAXBElement<ClaimType>(_ClaimType_QNAME, ClaimType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherLegalEventInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OtherLegalEventInformation")
    public JAXBElement<OtherLegalEventInformation> createOtherLegalEventInformation(OtherLegalEventInformation value) {
        return new JAXBElement<OtherLegalEventInformation>(_OtherLegalEventInformation_QNAME, OtherLegalEventInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RolePlayerTextEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RolePlayerTextEntry")
    public JAXBElement<RolePlayerTextEntry> createRolePlayerTextEntry(RolePlayerTextEntry value) {
        return new JAXBElement<RolePlayerTextEntry>(_RolePlayerTextEntry_QNAME, RolePlayerTextEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationSizeDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrganizationSizeDetail")
    public JAXBElement<OrganizationSizeDetail> createOrganizationSizeDetail(OrganizationSizeDetail value) {
        return new JAXBElement<OrganizationSizeDetail>(_OrganizationSizeDetail_QNAME, OrganizationSizeDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentFilingRequirementDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DocumentFilingRequirementDetails")
    public JAXBElement<DocumentFilingRequirementDetails> createDocumentFilingRequirementDetails(DocumentFilingRequirementDetails value) {
        return new JAXBElement<DocumentFilingRequirementDetails>(_DocumentFilingRequirementDetails_QNAME, DocumentFilingRequirementDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "EventDetail")
    public JAXBElement<EventDetail> createEventDetail(EventDetail value) {
        return new JAXBElement<EventDetail>(_EventDetail_QNAME, EventDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalStandardCashFlowStatement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GlobalStandardCashFlowStatement")
    public JAXBElement<GlobalStandardCashFlowStatement> createGlobalStandardCashFlowStatement(GlobalStandardCashFlowStatement value) {
        return new JAXBElement<GlobalStandardCashFlowStatement>(_GlobalStandardCashFlowStatement_QNAME, GlobalStandardCashFlowStatement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentManagementResponsibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CurrentManagementResponsibility")
    public JAXBElement<CurrentManagementResponsibility> createCurrentManagementResponsibility(CurrentManagementResponsibility value) {
        return new JAXBElement<CurrentManagementResponsibility>(_CurrentManagementResponsibility_QNAME, CurrentManagementResponsibility.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataProviderSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DataProviderSummaryType")
    public JAXBElement<DataProviderSummaryType> createDataProviderSummaryType(DataProviderSummaryType value) {
        return new JAXBElement<DataProviderSummaryType>(_DataProviderSummaryType_QNAME, DataProviderSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocioEconomicReferenceDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SocioEconomicReferenceDetailType")
    public JAXBElement<SocioEconomicReferenceDetailType> createSocioEconomicReferenceDetailType(SocioEconomicReferenceDetailType value) {
        return new JAXBElement<SocioEconomicReferenceDetailType>(_SocioEconomicReferenceDetailType_QNAME, SocioEconomicReferenceDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaserDerivedDataCoveragePayments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PurchaserDerivedDataCoveragePayments")
    public JAXBElement<PurchaserDerivedDataCoveragePayments> createPurchaserDerivedDataCoveragePayments(PurchaserDerivedDataCoveragePayments value) {
        return new JAXBElement<PurchaserDerivedDataCoveragePayments>(_PurchaserDerivedDataCoveragePayments_QNAME, PurchaserDerivedDataCoveragePayments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotesToAccounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NotesToAccounts")
    public JAXBElement<NotesToAccounts> createNotesToAccounts(NotesToAccounts value) {
        return new JAXBElement<NotesToAccounts>(_NotesToAccounts_QNAME, NotesToAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentExperienceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaymentExperienceType")
    public JAXBElement<PaymentExperienceType> createPaymentExperienceType(PaymentExperienceType value) {
        return new JAXBElement<PaymentExperienceType>(_PaymentExperienceType_QNAME, PaymentExperienceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AccountSummaryType")
    public JAXBElement<AccountSummaryType> createAccountSummaryType(AccountSummaryType value) {
        return new JAXBElement<AccountSummaryType>(_AccountSummaryType_QNAME, AccountSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "EventResult")
    public JAXBElement<EventResult> createEventResult(EventResult value) {
        return new JAXBElement<EventResult>(_EventResult_QNAME, EventResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileSubChapterDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ProfileSubChapterDetail")
    public JAXBElement<ProfileSubChapterDetail> createProfileSubChapterDetail(ProfileSubChapterDetail value) {
        return new JAXBElement<ProfileSubChapterDetail>(_ProfileSubChapterDetail_QNAME, ProfileSubChapterDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustryCreditScoringSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IndustryCreditScoringSpecification")
    public JAXBElement<IndustryCreditScoringSpecification> createIndustryCreditScoringSpecification(IndustryCreditScoringSpecification value) {
        return new JAXBElement<IndustryCreditScoringSpecification>(_IndustryCreditScoringSpecification_QNAME, IndustryCreditScoringSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialNetRevenue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialNetRevenue")
    public JAXBElement<FinancialNetRevenue> createFinancialNetRevenue(FinancialNetRevenue value) {
        return new JAXBElement<FinancialNetRevenue>(_FinancialNetRevenue_QNAME, FinancialNetRevenue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpwardAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "UpwardAssociation")
    public JAXBElement<UpwardAssociation> createUpwardAssociation(UpwardAssociation value) {
        return new JAXBElement<UpwardAssociation>(_UpwardAssociation_QNAME, UpwardAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBStringType256 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DNBStringType256")
    public JAXBElement<DNBStringType256> createDNBStringType256(DNBStringType256 value) {
        return new JAXBElement<DNBStringType256>(_DNBStringType256_QNAME, DNBStringType256 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierEvaluationRiskScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierEvaluationRiskScore")
    public JAXBElement<SupplierEvaluationRiskScore> createSupplierEvaluationRiskScore(SupplierEvaluationRiskScore value) {
        return new JAXBElement<SupplierEvaluationRiskScore>(_SupplierEvaluationRiskScore_QNAME, SupplierEvaluationRiskScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeaseAccountPeriodSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LeaseAccountPeriodSummaryType")
    public JAXBElement<LeaseAccountPeriodSummaryType> createLeaseAccountPeriodSummaryType(LeaseAccountPeriodSummaryType value) {
        return new JAXBElement<LeaseAccountPeriodSummaryType>(_LeaseAccountPeriodSummaryType_QNAME, LeaseAccountPeriodSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalIdentificationNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PrincipalIdentificationNumberType")
    public JAXBElement<PrincipalIdentificationNumberType> createPrincipalIdentificationNumberType(PrincipalIdentificationNumberType value) {
        return new JAXBElement<PrincipalIdentificationNumberType>(_PrincipalIdentificationNumberType_QNAME, PrincipalIdentificationNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebarmentsInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DebarmentsInformation")
    public JAXBElement<DebarmentsInformation> createDebarmentsInformation(DebarmentsInformation value) {
        return new JAXBElement<DebarmentsInformation>(_DebarmentsInformation_QNAME, DebarmentsInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegulatorDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RegulatorDetail")
    public JAXBElement<RegulatorDetail> createRegulatorDetail(RegulatorDetail value) {
        return new JAXBElement<RegulatorDetail>(_RegulatorDetail_QNAME, RegulatorDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DUNSAuditTrail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DUNSAuditTrail")
    public JAXBElement<DUNSAuditTrail> createDUNSAuditTrail(DUNSAuditTrail value) {
        return new JAXBElement<DUNSAuditTrail>(_DUNSAuditTrail_QNAME, DUNSAuditTrail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BankAccount")
    public JAXBElement<BankAccount> createBankAccount(BankAccount value) {
        return new JAXBElement<BankAccount>(_BankAccount_QNAME, BankAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LienSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LienSummaryType")
    public JAXBElement<LienSummaryType> createLienSummaryType(LienSummaryType value) {
        return new JAXBElement<LienSummaryType>(_LienSummaryType_QNAME, LienSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsolvencyProcessSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "InsolvencyProcessSummaryType")
    public JAXBElement<InsolvencyProcessSummaryType> createInsolvencyProcessSummaryType(InsolvencyProcessSummaryType value) {
        return new JAXBElement<InsolvencyProcessSummaryType>(_InsolvencyProcessSummaryType_QNAME, InsolvencyProcessSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Directors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Directors")
    public JAXBElement<Directors> createDirectors(Directors value) {
        return new JAXBElement<Directors>(_Directors_QNAME, Directors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RolePlayerDetailsBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RolePlayerDetailsBaseType")
    public JAXBElement<RolePlayerDetailsBaseType> createRolePlayerDetailsBaseType(RolePlayerDetailsBaseType value) {
        return new JAXBElement<RolePlayerDetailsBaseType>(_RolePlayerDetailsBaseType_QNAME, RolePlayerDetailsBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InquirerIndustrySummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "InquirerIndustrySummaryType")
    public JAXBElement<InquirerIndustrySummaryType> createInquirerIndustrySummaryType(InquirerIndustrySummaryType value) {
        return new JAXBElement<InquirerIndustrySummaryType>(_InquirerIndustrySummaryType_QNAME, InquirerIndustrySummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectComplianceDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectComplianceDetail")
    public JAXBElement<SubjectComplianceDetail> createSubjectComplianceDetail(SubjectComplianceDetail value) {
        return new JAXBElement<SubjectComplianceDetail>(_SubjectComplianceDetail_QNAME, SubjectComplianceDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "VehicleDetailsType")
    public JAXBElement<VehicleDetailsType> createVehicleDetailsType(VehicleDetailsType value) {
        return new JAXBElement<VehicleDetailsType>(_VehicleDetailsType_QNAME, VehicleDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ReferenceDetail")
    public JAXBElement<ReferenceDetail> createReferenceDetail(ReferenceDetail value) {
        return new JAXBElement<ReferenceDetail>(_ReferenceDetail_QNAME, ReferenceDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotesToAccountsStatementItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NotesToAccountsStatementItem")
    public JAXBElement<NotesToAccountsStatementItem> createNotesToAccountsStatementItem(NotesToAccountsStatementItem value) {
        return new JAXBElement<NotesToAccountsStatementItem>(_NotesToAccountsStatementItem_QNAME, NotesToAccountsStatementItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessTrading }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BusinessTrading")
    public JAXBElement<BusinessTrading> createBusinessTrading(BusinessTrading value) {
        return new JAXBElement<BusinessTrading>(_BusinessTrading_QNAME, BusinessTrading.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialNetworkingDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SocialNetworkingDetail")
    public JAXBElement<SocialNetworkingDetail> createSocialNetworkingDetail(SocialNetworkingDetail value) {
        return new JAXBElement<SocialNetworkingDetail>(_SocialNetworkingDetail_QNAME, SocialNetworkingDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ImportDetailsType")
    public JAXBElement<ImportDetailsType> createImportDetailsType(ImportDetailsType value) {
        return new JAXBElement<ImportDetailsType>(_ImportDetailsType_QNAME, ImportDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThirdPartyDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ThirdPartyDataType")
    public JAXBElement<ThirdPartyDataType> createThirdPartyDataType(ThirdPartyDataType value) {
        return new JAXBElement<ThirdPartyDataType>(_ThirdPartyDataType_QNAME, ThirdPartyDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebPageAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "WebPageAddressType")
    public JAXBElement<WebPageAddressType> createWebPageAddressType(WebPageAddressType value) {
        return new JAXBElement<WebPageAddressType>(_WebPageAddressType_QNAME, WebPageAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradingTermsDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TradingTermsDetailsType")
    public JAXBElement<TradingTermsDetailsType> createTradingTermsDetailsType(TradingTermsDetailsType value) {
        return new JAXBElement<TradingTermsDetailsType>(_TradingTermsDetailsType_QNAME, TradingTermsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustryCodeSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IndustryCodeSummaryType")
    public JAXBElement<IndustryCodeSummaryType> createIndustryCodeSummaryType(IndustryCodeSummaryType value) {
        return new JAXBElement<IndustryCodeSummaryType>(_IndustryCodeSummaryType_QNAME, IndustryCodeSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverallSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OverallSummary")
    public JAXBElement<OverallSummary> createOverallSummary(OverallSummary value) {
        return new JAXBElement<OverallSummary>(_OverallSummary_QNAME, OverallSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedOrganizationChildLinkageSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RequestedOrganizationChildLinkageSpecification")
    public JAXBElement<RequestedOrganizationChildLinkageSpecification> createRequestedOrganizationChildLinkageSpecification(RequestedOrganizationChildLinkageSpecification value) {
        return new JAXBElement<RequestedOrganizationChildLinkageSpecification>(_RequestedOrganizationChildLinkageSpecification_QNAME, RequestedOrganizationChildLinkageSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierListResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GetSupplierListResponseDetail")
    public JAXBElement<GetSupplierListResponseDetail> createGetSupplierListResponseDetail(GetSupplierListResponseDetail value) {
        return new JAXBElement<GetSupplierListResponseDetail>(_GetSupplierListResponseDetail_QNAME, GetSupplierListResponseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxPaymentAssessment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TaxPaymentAssessment")
    public JAXBElement<TaxPaymentAssessment> createTaxPaymentAssessment(TaxPaymentAssessment value) {
        return new JAXBElement<TaxPaymentAssessment>(_TaxPaymentAssessment_QNAME, TaxPaymentAssessment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherFinancingEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OtherFinancingEvent")
    public JAXBElement<OtherFinancingEvent> createOtherFinancingEvent(OtherFinancingEvent value) {
        return new JAXBElement<OtherFinancingEvent>(_OtherFinancingEvent_QNAME, OtherFinancingEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherThirdPartyInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OtherThirdPartyInformation")
    public JAXBElement<OtherThirdPartyInformation> createOtherThirdPartyInformation(OtherThirdPartyInformation value) {
        return new JAXBElement<OtherThirdPartyInformation>(_OtherThirdPartyInformation_QNAME, OtherThirdPartyInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalEventPeriodSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LegalEventPeriodSummaryType")
    public JAXBElement<LegalEventPeriodSummaryType> createLegalEventPeriodSummaryType(LegalEventPeriodSummaryType value) {
        return new JAXBElement<LegalEventPeriodSummaryType>(_LegalEventPeriodSummaryType_QNAME, LegalEventPeriodSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditorCategorizationDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CreditorCategorizationDetail")
    public JAXBElement<CreditorCategorizationDetail> createCreditorCategorizationDetail(CreditorCategorizationDetail value) {
        return new JAXBElement<CreditorCategorizationDetail>(_CreditorCategorizationDetail_QNAME, CreditorCategorizationDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialRatioIndustryNormCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialRatioIndustryNormCategory")
    public JAXBElement<FinancialRatioIndustryNormCategory> createFinancialRatioIndustryNormCategory(FinancialRatioIndustryNormCategory value) {
        return new JAXBElement<FinancialRatioIndustryNormCategory>(_FinancialRatioIndustryNormCategory_QNAME, FinancialRatioIndustryNormCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierThirdPartyAssessment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierThirdPartyAssessment")
    public JAXBElement<SupplierThirdPartyAssessment> createSupplierThirdPartyAssessment(SupplierThirdPartyAssessment value) {
        return new JAXBElement<SupplierThirdPartyAssessment>(_SupplierThirdPartyAssessment_QNAME, SupplierThirdPartyAssessment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseProfitAndLossStatementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BaseProfitAndLossStatementType")
    public JAXBElement<BaseProfitAndLossStatementType> createBaseProfitAndLossStatementType(BaseProfitAndLossStatementType value) {
        return new JAXBElement<BaseProfitAndLossStatementType>(_BaseProfitAndLossStatementType_QNAME, BaseProfitAndLossStatementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectPersonalDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectPersonalDetail")
    public JAXBElement<SubjectPersonalDetail> createSubjectPersonalDetail(SubjectPersonalDetail value) {
        return new JAXBElement<SubjectPersonalDetail>(_SubjectPersonalDetail_QNAME, SubjectPersonalDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstallmentAccountPeriodSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "InstallmentAccountPeriodSummaryType")
    public JAXBElement<InstallmentAccountPeriodSummaryType> createInstallmentAccountPeriodSummaryType(InstallmentAccountPeriodSummaryType value) {
        return new JAXBElement<InstallmentAccountPeriodSummaryType>(_InstallmentAccountPeriodSummaryType_QNAME, InstallmentAccountPeriodSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectAttachmentForResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ObjectAttachmentForResponse")
    public JAXBElement<ObjectAttachmentForResponse> createObjectAttachmentForResponse(ObjectAttachmentForResponse value) {
        return new JAXBElement<ObjectAttachmentForResponse>(_ObjectAttachmentForResponse_QNAME, ObjectAttachmentForResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountantOpinion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AccountantOpinion")
    public JAXBElement<AccountantOpinion> createAccountantOpinion(AccountantOpinion value) {
        return new JAXBElement<AccountantOpinion>(_AccountantOpinion_QNAME, AccountantOpinion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimaryIndustryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PrimaryIndustryCodeType")
    public JAXBElement<PrimaryIndustryCodeType> createPrimaryIndustryCodeType(PrimaryIndustryCodeType value) {
        return new JAXBElement<PrimaryIndustryCodeType>(_PrimaryIndustryCodeType_QNAME, PrimaryIndustryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaserDerivedPlacedForCollectionPayments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PurchaserDerivedPlacedForCollectionPayments")
    public JAXBElement<PurchaserDerivedPlacedForCollectionPayments> createPurchaserDerivedPlacedForCollectionPayments(PurchaserDerivedPlacedForCollectionPayments value) {
        return new JAXBElement<PurchaserDerivedPlacedForCollectionPayments>(_PurchaserDerivedPlacedForCollectionPayments_QNAME, PurchaserDerivedPlacedForCollectionPayments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribedToLetterOfLiability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubscribedToLetterOfLiability")
    public JAXBElement<SubscribedToLetterOfLiability> createSubscribedToLetterOfLiability(SubscribedToLetterOfLiability value) {
        return new JAXBElement<SubscribedToLetterOfLiability>(_SubscribedToLetterOfLiability_QNAME, SubscribedToLetterOfLiability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NoteDetail")
    public JAXBElement<NoteDetail> createNoteDetail(NoteDetail value) {
        return new JAXBElement<NoteDetail>(_NoteDetail_QNAME, NoteDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveProductRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RetrieveProductRequest")
    public JAXBElement<RetrieveProductRequest> createRetrieveProductRequest(RetrieveProductRequest value) {
        return new JAXBElement<RetrieveProductRequest>(_RetrieveProductRequest_QNAME, RetrieveProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareCapitalTrendDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ShareCapitalTrendDetails")
    public JAXBElement<ShareCapitalTrendDetails> createShareCapitalTrendDetails(ShareCapitalTrendDetails value) {
        return new JAXBElement<ShareCapitalTrendDetails>(_ShareCapitalTrendDetails_QNAME, ShareCapitalTrendDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InquiryIndustryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "InquiryIndustryCodeType")
    public JAXBElement<InquiryIndustryCodeType> createInquiryIndustryCodeType(InquiryIndustryCodeType value) {
        return new JAXBElement<InquiryIndustryCodeType>(_InquiryIndustryCodeType_QNAME, InquiryIndustryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuedLetterOfLiability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IssuedLetterOfLiability")
    public JAXBElement<IssuedLetterOfLiability> createIssuedLetterOfLiability(IssuedLetterOfLiability value) {
        return new JAXBElement<IssuedLetterOfLiability>(_IssuedLetterOfLiability_QNAME, IssuedLetterOfLiability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherActivitiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OtherActivitiesType")
    public JAXBElement<OtherActivitiesType> createOtherActivitiesType(OtherActivitiesType value) {
        return new JAXBElement<OtherActivitiesType>(_OtherActivitiesType_QNAME, OtherActivitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialRatioCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialRatioCategory")
    public JAXBElement<FinancialRatioCategory> createFinancialRatioCategory(FinancialRatioCategory value) {
        return new JAXBElement<FinancialRatioCategory>(_FinancialRatioCategory_QNAME, FinancialRatioCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialRatios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialRatios")
    public JAXBElement<FinancialRatios> createFinancialRatios(FinancialRatios value) {
        return new JAXBElement<FinancialRatios>(_FinancialRatios_QNAME, FinancialRatios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LowerQuartile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LowerQuartile")
    public JAXBElement<LowerQuartile> createLowerQuartile(LowerQuartile value) {
        return new JAXBElement<LowerQuartile>(_LowerQuartile_QNAME, LowerQuartile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreviousNonEmploymentDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PreviousNonEmploymentDetailsType")
    public JAXBElement<PreviousNonEmploymentDetailsType> createPreviousNonEmploymentDetailsType(PreviousNonEmploymentDetailsType value) {
        return new JAXBElement<PreviousNonEmploymentDetailsType>(_PreviousNonEmploymentDetailsType_QNAME, PreviousNonEmploymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ScoreReferenceType")
    public JAXBElement<ScoreReferenceType> createScoreReferenceType(ScoreReferenceType value) {
        return new JAXBElement<ScoreReferenceType>(_ScoreReferenceType_QNAME, ScoreReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationProfileDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LocationProfileDetail")
    public JAXBElement<LocationProfileDetail> createLocationProfileDetail(LocationProfileDetail value) {
        return new JAXBElement<LocationProfileDetail>(_LocationProfileDetail_QNAME, LocationProfileDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ScoreReason")
    public JAXBElement<ScoreReason> createScoreReason(ScoreReason value) {
        return new JAXBElement<ScoreReason>(_ScoreReason_QNAME, ScoreReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocioEconomicCharacteristicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SocioEconomicCharacteristicType")
    public JAXBElement<SocioEconomicCharacteristicType> createSocioEconomicCharacteristicType(SocioEconomicCharacteristicType value) {
        return new JAXBElement<SocioEconomicCharacteristicType>(_SocioEconomicCharacteristicType_QNAME, SocioEconomicCharacteristicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatingReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RatingReason")
    public JAXBElement<RatingReason> createRatingReason(RatingReason value) {
        return new JAXBElement<RatingReason>(_RatingReason_QNAME, RatingReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierRiskScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierRiskScore")
    public JAXBElement<SupplierRiskScore> createSupplierRiskScore(SupplierRiskScore value) {
        return new JAXBElement<SupplierRiskScore>(_SupplierRiskScore_QNAME, SupplierRiskScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CourtType")
    public JAXBElement<CourtType> createCourtType(CourtType value) {
        return new JAXBElement<CourtType>(_CourtType_QNAME, CourtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrderProductResponse")
    public JAXBElement<OrderProductResponse> createOrderProductResponse(OrderProductResponse value) {
        return new JAXBElement<OrderProductResponse>(_OrderProductResponse_QNAME, OrderProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrowerAnalyticsAccountSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BorrowerAnalyticsAccountSummary")
    public JAXBElement<BorrowerAnalyticsAccountSummary> createBorrowerAnalyticsAccountSummary(BorrowerAnalyticsAccountSummary value) {
        return new JAXBElement<BorrowerAnalyticsAccountSummary>(_BorrowerAnalyticsAccountSummary_QNAME, BorrowerAnalyticsAccountSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentExperienceSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaymentExperienceSummaryType")
    public JAXBElement<PaymentExperienceSummaryType> createPaymentExperienceSummaryType(PaymentExperienceSummaryType value) {
        return new JAXBElement<PaymentExperienceSummaryType>(_PaymentExperienceSummaryType_QNAME, PaymentExperienceSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ProfileLocation")
    public JAXBElement<ProfileLocation> createProfileLocation(ProfileLocation value) {
        return new JAXBElement<ProfileLocation>(_ProfileLocation_QNAME, ProfileLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedianQuartile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "MedianQuartile")
    public JAXBElement<MedianQuartile> createMedianQuartile(MedianQuartile value) {
        return new JAXBElement<MedianQuartile>(_MedianQuartile_QNAME, MedianQuartile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectNameDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectNameDetail")
    public JAXBElement<SubjectNameDetail> createSubjectNameDetail(SubjectNameDetail value) {
        return new JAXBElement<SubjectNameDetail>(_SubjectNameDetail_QNAME, SubjectNameDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreNormType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ScoreNormType")
    public JAXBElement<ScoreNormType> createScoreNormType(ScoreNormType value) {
        return new JAXBElement<ScoreNormType>(_ScoreNormType_QNAME, ScoreNormType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAccountSummaryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialAccountSummaryDetailType")
    public JAXBElement<FinancialAccountSummaryDetailType> createFinancialAccountSummaryDetailType(FinancialAccountSummaryDetailType value) {
        return new JAXBElement<FinancialAccountSummaryDetailType>(_FinancialAccountSummaryDetailType_QNAME, FinancialAccountSummaryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDataSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaymentDataSummaryType")
    public JAXBElement<PaymentDataSummaryType> createPaymentDataSummaryType(PaymentDataSummaryType value) {
        return new JAXBElement<PaymentDataSummaryType>(_PaymentDataSummaryType_QNAME, PaymentDataSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SatisfactoryPayments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SatisfactoryPayments")
    public JAXBElement<SatisfactoryPayments> createSatisfactoryPayments(SatisfactoryPayments value) {
        return new JAXBElement<SatisfactoryPayments>(_SatisfactoryPayments_QNAME, SatisfactoryPayments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiscalPeriodDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FiscalPeriodDetails")
    public JAXBElement<FiscalPeriodDetails> createFiscalPeriodDetails(FiscalPeriodDetails value) {
        return new JAXBElement<FiscalPeriodDetails>(_FiscalPeriodDetails_QNAME, FiscalPeriodDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenEndedCreditLineAccountSummaryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OpenEndedCreditLineAccountSummaryDetailType")
    public JAXBElement<OpenEndedCreditLineAccountSummaryDetailType> createOpenEndedCreditLineAccountSummaryDetailType(OpenEndedCreditLineAccountSummaryDetailType value) {
        return new JAXBElement<OpenEndedCreditLineAccountSummaryDetailType>(_OpenEndedCreditLineAccountSummaryDetailType_QNAME, OpenEndedCreditLineAccountSummaryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailForSupplier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "UserDetailForSupplier")
    public JAXBElement<UserDetailForSupplier> createUserDetailForSupplier(UserDetailForSupplier value) {
        return new JAXBElement<UserDetailForSupplier>(_UserDetailForSupplier_QNAME, UserDetailForSupplier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InquiryDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "InquiryDetail")
    public JAXBElement<InquiryDetail> createInquiryDetail(InquiryDetail value) {
        return new JAXBElement<InquiryDetail>(_InquiryDetail_QNAME, InquiryDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GetSupplierListRequest")
    public JAXBElement<GetSupplierListRequest> createGetSupplierListRequest(GetSupplierListRequest value) {
        return new JAXBElement<GetSupplierListRequest>(_GetSupplierListRequest_QNAME, GetSupplierListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChapterConversionDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ChapterConversionDetailsType")
    public JAXBElement<ChapterConversionDetailsType> createChapterConversionDetailsType(ChapterConversionDetailsType value) {
        return new JAXBElement<ChapterConversionDetailsType>(_ChapterConversionDetailsType_QNAME, ChapterConversionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplianceAddressDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ComplianceAddressDetail")
    public JAXBElement<ComplianceAddressDetail> createComplianceAddressDetail(ComplianceAddressDetail value) {
        return new JAXBElement<ComplianceAddressDetail>(_ComplianceAddressDetail_QNAME, ComplianceAddressDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryRiskDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CountryRiskDetails")
    public JAXBElement<CountryRiskDetails> createCountryRiskDetails(CountryRiskDetails value) {
        return new JAXBElement<CountryRiskDetails>(_CountryRiskDetails_QNAME, CountryRiskDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadSupplierDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "UploadSupplierDocumentResponse")
    public JAXBElement<UploadSupplierDocumentResponse> createUploadSupplierDocumentResponse(UploadSupplierDocumentResponse value) {
        return new JAXBElement<UploadSupplierDocumentResponse>(_UploadSupplierDocumentResponse_QNAME, UploadSupplierDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataProviderDetailForAirportConcession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DataProviderDetailForAirportConcession")
    public JAXBElement<DataProviderDetailForAirportConcession> createDataProviderDetailForAirportConcession(DataProviderDetailForAirportConcession value) {
        return new JAXBElement<DataProviderDetailForAirportConcession>(_DataProviderDetailForAirportConcession_QNAME, DataProviderDetailForAirportConcession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamePrefix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NamePrefix")
    public JAXBElement<NamePrefix> createNamePrefix(NamePrefix value) {
        return new JAXBElement<NamePrefix>(_NamePrefix_QNAME, NamePrefix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatementHeaderDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "StatementHeaderDetails")
    public JAXBElement<StatementHeaderDetails> createStatementHeaderDetails(StatementHeaderDetails value) {
        return new JAXBElement<StatementHeaderDetails>(_StatementHeaderDetails_QNAME, StatementHeaderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityDetailsForCommercialCollectionClaims }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ActivityDetailsForCommercialCollectionClaims")
    public JAXBElement<ActivityDetailsForCommercialCollectionClaims> createActivityDetailsForCommercialCollectionClaims(ActivityDetailsForCommercialCollectionClaims value) {
        return new JAXBElement<ActivityDetailsForCommercialCollectionClaims>(_ActivityDetailsForCommercialCollectionClaims_QNAME, ActivityDetailsForCommercialCollectionClaims.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Telecommunication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Telecommunication")
    public JAXBElement<Telecommunication> createTelecommunication(Telecommunication value) {
        return new JAXBElement<Telecommunication>(_Telecommunication_QNAME, Telecommunication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuarantorDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GuarantorDetails")
    public JAXBElement<GuarantorDetails> createGuarantorDetails(GuarantorDetails value) {
        return new JAXBElement<GuarantorDetails>(_GuarantorDetails_QNAME, GuarantorDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilingOrganizationName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FilingOrganizationName")
    public JAXBElement<FilingOrganizationName> createFilingOrganizationName(FilingOrganizationName value) {
        return new JAXBElement<FilingOrganizationName>(_FilingOrganizationName_QNAME, FilingOrganizationName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectQueueHistoryDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectQueueHistoryDetail")
    public JAXBElement<SubjectQueueHistoryDetail> createSubjectQueueHistoryDetail(SubjectQueueHistoryDetail value) {
        return new JAXBElement<SubjectQueueHistoryDetail>(_SubjectQueueHistoryDetail_QNAME, SubjectQueueHistoryDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AccountDetail")
    public JAXBElement<AccountDetail> createAccountDetail(AccountDetail value) {
        return new JAXBElement<AccountDetail>(_AccountDetail_QNAME, AccountDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaymentSummaryType")
    public JAXBElement<PaymentSummaryType> createPaymentSummaryType(PaymentSummaryType value) {
        return new JAXBElement<PaymentSummaryType>(_PaymentSummaryType_QNAME, PaymentSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FamilyRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FamilyRelationship")
    public JAXBElement<FamilyRelationship> createFamilyRelationship(FamilyRelationship value) {
        return new JAXBElement<FamilyRelationship>(_FamilyRelationship_QNAME, FamilyRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NormDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NormDimension")
    public JAXBElement<NormDimension> createNormDimension(NormDimension value) {
        return new JAXBElement<NormDimension>(_NormDimension_QNAME, NormDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KFRIndustryQuartilesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "KFRIndustryQuartilesType")
    public JAXBElement<KFRIndustryQuartilesType> createKFRIndustryQuartilesType(KFRIndustryQuartilesType value) {
        return new JAXBElement<KFRIndustryQuartilesType>(_KFRIndustryQuartilesType_QNAME, KFRIndustryQuartilesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecisionParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DecisionParameter")
    public JAXBElement<DecisionParameter> createDecisionParameter(DecisionParameter value) {
        return new JAXBElement<DecisionParameter>(_DecisionParameter_QNAME, DecisionParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LitigationRolePlayerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LitigationRolePlayerType")
    public JAXBElement<LitigationRolePlayerType> createLitigationRolePlayerType(LitigationRolePlayerType value) {
        return new JAXBElement<LitigationRolePlayerType>(_LitigationRolePlayerType_QNAME, LitigationRolePlayerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBCreditLimitRecommendationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DNBCreditLimitRecommendationType")
    public JAXBElement<DNBCreditLimitRecommendationType> createDNBCreditLimitRecommendationType(DNBCreditLimitRecommendationType value) {
        return new JAXBElement<DNBCreditLimitRecommendationType>(_DNBCreditLimitRecommendationType_QNAME, DNBCreditLimitRecommendationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ContactResult")
    public JAXBElement<ContactResult> createContactResult(ContactResult value) {
        return new JAXBElement<ContactResult>(_ContactResult_QNAME, ContactResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParentAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ParentAssociation")
    public JAXBElement<ParentAssociation> createParentAssociation(ParentAssociation value) {
        return new JAXBElement<ParentAssociation>(_ParentAssociation_QNAME, ParentAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectHandling }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectHandling")
    public JAXBElement<SubjectHandling> createSubjectHandling(SubjectHandling value) {
        return new JAXBElement<SubjectHandling>(_SubjectHandling_QNAME, SubjectHandling.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpendBehaviorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SpendBehaviorType")
    public JAXBElement<SpendBehaviorType> createSpendBehaviorType(SpendBehaviorType value) {
        return new JAXBElement<SpendBehaviorType>(_SpendBehaviorType_QNAME, SpendBehaviorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgencyDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AgencyDetailType")
    public JAXBElement<AgencyDetailType> createAgencyDetailType(AgencyDetailType value) {
        return new JAXBElement<AgencyDetailType>(_AgencyDetailType_QNAME, AgencyDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchBasis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "MatchBasis")
    public JAXBElement<MatchBasis> createMatchBasis(MatchBasis value) {
        return new JAXBElement<MatchBasis>(_MatchBasis_QNAME, MatchBasis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierBatchFileDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierBatchFileDetail")
    public JAXBElement<SupplierBatchFileDetail> createSupplierBatchFileDetail(SupplierBatchFileDetail value) {
        return new JAXBElement<SupplierBatchFileDetail>(_SupplierBatchFileDetail_QNAME, SupplierBatchFileDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentPaydexScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CurrentPaydexScoreType")
    public JAXBElement<CurrentPaydexScoreType> createCurrentPaydexScoreType(CurrentPaydexScoreType value) {
        return new JAXBElement<CurrentPaydexScoreType>(_CurrentPaydexScoreType_QNAME, CurrentPaydexScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalStandardProfitAndLossStatement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GlobalStandardProfitAndLossStatement")
    public JAXBElement<GlobalStandardProfitAndLossStatement> createGlobalStandardProfitAndLossStatement(GlobalStandardProfitAndLossStatement value) {
        return new JAXBElement<GlobalStandardProfitAndLossStatement>(_GlobalStandardProfitAndLossStatement_QNAME, GlobalStandardProfitAndLossStatement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierRegistrationAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierRegistrationAddress")
    public JAXBElement<SupplierRegistrationAddress> createSupplierRegistrationAddress(SupplierRegistrationAddress value) {
        return new JAXBElement<SupplierRegistrationAddress>(_SupplierRegistrationAddress_QNAME, SupplierRegistrationAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancingStatementFilingInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancingStatementFilingInformation")
    public JAXBElement<FinancingStatementFilingInformation> createFinancingStatementFilingInformation(FinancingStatementFilingInformation value) {
        return new JAXBElement<FinancingStatementFilingInformation>(_FinancingStatementFilingInformation_QNAME, FinancingStatementFilingInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationIdentificationNumberSimpleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrganizationIdentificationNumberSimpleType")
    public JAXBElement<OrganizationIdentificationNumberSimpleType> createOrganizationIdentificationNumberSimpleType(OrganizationIdentificationNumberSimpleType value) {
        return new JAXBElement<OrganizationIdentificationNumberSimpleType>(_OrganizationIdentificationNumberSimpleType_QNAME, OrganizationIdentificationNumberSimpleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalFormDetailsHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LegalFormDetailsHistory")
    public JAXBElement<LegalFormDetailsHistory> createLegalFormDetailsHistory(LegalFormDetailsHistory value) {
        return new JAXBElement<LegalFormDetailsHistory>(_LegalFormDetailsHistory_QNAME, LegalFormDetailsHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalEventReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LegalEventReason")
    public JAXBElement<LegalEventReason> createLegalEventReason(LegalEventReason value) {
        return new JAXBElement<LegalEventReason>(_LegalEventReason_QNAME, LegalEventReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterSupplierInquiryDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RegisterSupplierInquiryDetail")
    public JAXBElement<RegisterSupplierInquiryDetail> createRegisterSupplierInquiryDetail(RegisterSupplierInquiryDetail value) {
        return new JAXBElement<RegisterSupplierInquiryDetail>(_RegisterSupplierInquiryDetail_QNAME, RegisterSupplierInquiryDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationNameBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrganizationNameBaseType")
    public JAXBElement<OrganizationNameBaseType> createOrganizationNameBaseType(OrganizationNameBaseType value) {
        return new JAXBElement<OrganizationNameBaseType>(_OrganizationNameBaseType_QNAME, OrganizationNameBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverallViabilityScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OverallViabilityScoreType")
    public JAXBElement<OverallViabilityScoreType> createOverallViabilityScoreType(OverallViabilityScoreType value) {
        return new JAXBElement<OverallViabilityScoreType>(_OverallViabilityScoreType_QNAME, OverallViabilityScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParentLegalEventsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ParentLegalEventsType")
    public JAXBElement<ParentLegalEventsType> createParentLegalEventsType(ParentLegalEventsType value) {
        return new JAXBElement<ParentLegalEventsType>(_ParentLegalEventsType_QNAME, ParentLegalEventsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelexNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TelexNumberType")
    public JAXBElement<TelexNumberType> createTelexNumberType(TelexNumberType value) {
        return new JAXBElement<TelexNumberType>(_TelexNumberType_QNAME, TelexNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinesOfCreditAccountPeriodSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LinesOfCreditAccountPeriodSummaryType")
    public JAXBElement<LinesOfCreditAccountPeriodSummaryType> createLinesOfCreditAccountPeriodSummaryType(LinesOfCreditAccountPeriodSummaryType value) {
        return new JAXBElement<LinesOfCreditAccountPeriodSummaryType>(_LinesOfCreditAccountPeriodSummaryType_QNAME, LinesOfCreditAccountPeriodSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaserDerivedDiscountTermsPayments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PurchaserDerivedDiscountTermsPayments")
    public JAXBElement<PurchaserDerivedDiscountTermsPayments> createPurchaserDerivedDiscountTermsPayments(PurchaserDerivedDiscountTermsPayments value) {
        return new JAXBElement<PurchaserDerivedDiscountTermsPayments>(_PurchaserDerivedDiscountTermsPayments_QNAME, PurchaserDerivedDiscountTermsPayments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustryProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IndustryProfile")
    public JAXBElement<IndustryProfile> createIndustryProfile(IndustryProfile value) {
        return new JAXBElement<IndustryProfile>(_IndustryProfile_QNAME, IndustryProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationEventTextualComponents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CommunicationEventTextualComponents")
    public JAXBElement<CommunicationEventTextualComponents> createCommunicationEventTextualComponents(CommunicationEventTextualComponents value) {
        return new JAXBElement<CommunicationEventTextualComponents>(_CommunicationEventTextualComponents_QNAME, CommunicationEventTextualComponents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Position }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Position")
    public JAXBElement<Position> createPosition(Position value) {
        return new JAXBElement<Position>(_Position_QNAME, Position.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrowerAnalyticsOverallSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BorrowerAnalyticsOverallSummary")
    public JAXBElement<BorrowerAnalyticsOverallSummary> createBorrowerAnalyticsOverallSummary(BorrowerAnalyticsOverallSummary value) {
        return new JAXBElement<BorrowerAnalyticsOverallSummary>(_BorrowerAnalyticsOverallSummary_QNAME, BorrowerAnalyticsOverallSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummarizedPastDuePeriodViewType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SummarizedPastDuePeriodViewType")
    public JAXBElement<SummarizedPastDuePeriodViewType> createSummarizedPastDuePeriodViewType(SummarizedPastDuePeriodViewType value) {
        return new JAXBElement<SummarizedPastDuePeriodViewType>(_SummarizedPastDuePeriodViewType_QNAME, SummarizedPastDuePeriodViewType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankruptcyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BankruptcyType")
    public JAXBElement<BankruptcyType> createBankruptcyType(BankruptcyType value) {
        return new JAXBElement<BankruptcyType>(_BankruptcyType_QNAME, BankruptcyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpactDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ImpactDetailType")
    public JAXBElement<ImpactDetailType> createImpactDetailType(ImpactDetailType value) {
        return new JAXBElement<ImpactDetailType>(_ImpactDetailType_QNAME, ImpactDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentFilingDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DocumentFilingDetails")
    public JAXBElement<DocumentFilingDetails> createDocumentFilingDetails(DocumentFilingDetails value) {
        return new JAXBElement<DocumentFilingDetails>(_DocumentFilingDetails_QNAME, DocumentFilingDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalEventAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LegalEventAssociationType")
    public JAXBElement<LegalEventAssociationType> createLegalEventAssociationType(LegalEventAssociationType value) {
        return new JAXBElement<LegalEventAssociationType>(_LegalEventAssociationType_QNAME, LegalEventAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountrySanctionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CountrySanctionDetail")
    public JAXBElement<CountrySanctionDetail> createCountrySanctionDetail(CountrySanctionDetail value) {
        return new JAXBElement<CountrySanctionDetail>(_CountrySanctionDetail_QNAME, CountrySanctionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferDUNSNumberRegistration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TransferDUNSNumberRegistration")
    public JAXBElement<TransferDUNSNumberRegistration> createTransferDUNSNumberRegistration(TransferDUNSNumberRegistration value) {
        return new JAXBElement<TransferDUNSNumberRegistration>(_TransferDUNSNumberRegistration_QNAME, TransferDUNSNumberRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadSupplierDocumentRequestDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "UploadSupplierDocumentRequestDetail")
    public JAXBElement<UploadSupplierDocumentRequestDetail> createUploadSupplierDocumentRequestDetail(UploadSupplierDocumentRequestDetail value) {
        return new JAXBElement<UploadSupplierDocumentRequestDetail>(_UploadSupplierDocumentRequestDetail_QNAME, UploadSupplierDocumentRequestDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassScoreNormType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ClassScoreNormType")
    public JAXBElement<ClassScoreNormType> createClassScoreNormType(ClassScoreNormType value) {
        return new JAXBElement<ClassScoreNormType>(_ClassScoreNormType_QNAME, ClassScoreNormType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BankReference")
    public JAXBElement<BankReference> createBankReference(BankReference value) {
        return new JAXBElement<BankReference>(_BankReference_QNAME, BankReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DamagedAssetsDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DamagedAssetsDetailType")
    public JAXBElement<DamagedAssetsDetailType> createDamagedAssetsDetailType(DamagedAssetsDetailType value) {
        return new JAXBElement<DamagedAssetsDetailType>(_DamagedAssetsDetailType_QNAME, DamagedAssetsDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuarantorDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GuarantorDetailsType")
    public JAXBElement<GuarantorDetailsType> createGuarantorDetailsType(GuarantorDetailsType value) {
        return new JAXBElement<GuarantorDetailsType>(_GuarantorDetailsType_QNAME, GuarantorDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LongTermAssets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LongTermAssets")
    public JAXBElement<LongTermAssets> createLongTermAssets(LongTermAssets value) {
        return new JAXBElement<LongTermAssets>(_LongTermAssets_QNAME, LongTermAssets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderProductResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrderProductResponseDetail")
    public JAXBElement<OrderProductResponseDetail> createOrderProductResponseDetail(OrderProductResponseDetail value) {
        return new JAXBElement<OrderProductResponseDetail>(_OrderProductResponseDetail_QNAME, OrderProductResponseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionForPrincipalOfPrincipal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PositionForPrincipalOfPrincipal")
    public JAXBElement<PositionForPrincipalOfPrincipal> createPositionForPrincipalOfPrincipal(PositionForPrincipalOfPrincipal value) {
        return new JAXBElement<PositionForPrincipalOfPrincipal>(_PositionForPrincipalOfPrincipal_QNAME, PositionForPrincipalOfPrincipal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDataSummaryViewType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaymentDataSummaryViewType")
    public JAXBElement<PaymentDataSummaryViewType> createPaymentDataSummaryViewType(PaymentDataSummaryViewType value) {
        return new JAXBElement<PaymentDataSummaryViewType>(_PaymentDataSummaryViewType_QNAME, PaymentDataSummaryViewType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalsAndManagement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PrincipalsAndManagement")
    public JAXBElement<PrincipalsAndManagement> createPrincipalsAndManagement(PrincipalsAndManagement value) {
        return new JAXBElement<PrincipalsAndManagement>(_PrincipalsAndManagement_QNAME, PrincipalsAndManagement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisteredAddressForSBFE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RegisteredAddressForSBFE")
    public JAXBElement<RegisteredAddressForSBFE> createRegisteredAddressForSBFE(RegisteredAddressForSBFE value) {
        return new JAXBElement<RegisteredAddressForSBFE>(_RegisteredAddressForSBFE_QNAME, RegisteredAddressForSBFE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevolvingAccountPeriodSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RevolvingAccountPeriodSummaryType")
    public JAXBElement<RevolvingAccountPeriodSummaryType> createRevolvingAccountPeriodSummaryType(RevolvingAccountPeriodSummaryType value) {
        return new JAXBElement<RevolvingAccountPeriodSummaryType>(_RevolvingAccountPeriodSummaryType_QNAME, RevolvingAccountPeriodSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetGroupDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AssetGroupDetailType")
    public JAXBElement<AssetGroupDetailType> createAssetGroupDetailType(AssetGroupDetailType value) {
        return new JAXBElement<AssetGroupDetailType>(_AssetGroupDetailType_QNAME, AssetGroupDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnershipEthnicityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OwnershipEthnicityType")
    public JAXBElement<OwnershipEthnicityType> createOwnershipEthnicityType(OwnershipEthnicityType value) {
        return new JAXBElement<OwnershipEthnicityType>(_OwnershipEthnicityType_QNAME, OwnershipEthnicityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreetAddressLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "StreetAddressLine")
    public JAXBElement<StreetAddressLine> createStreetAddressLine(StreetAddressLine value) {
        return new JAXBElement<StreetAddressLine>(_StreetAddressLine_QNAME, StreetAddressLine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChildrenSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ChildrenSummary")
    public JAXBElement<ChildrenSummary> createChildrenSummary(ChildrenSummary value) {
        return new JAXBElement<ChildrenSummary>(_ChildrenSummary_QNAME, ChildrenSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InquirySummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "InquirySummaryType")
    public JAXBElement<InquirySummaryType> createInquirySummaryType(InquirySummaryType value) {
        return new JAXBElement<InquirySummaryType>(_InquirySummaryType_QNAME, InquirySummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NationalPercentileIndustryNorm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NationalPercentileIndustryNorm")
    public JAXBElement<NationalPercentileIndustryNorm> createNationalPercentileIndustryNorm(NationalPercentileIndustryNorm value) {
        return new JAXBElement<NationalPercentileIndustryNorm>(_NationalPercentileIndustryNorm_QNAME, NationalPercentileIndustryNorm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaserDerivedCashPayments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PurchaserDerivedCashPayments")
    public JAXBElement<PurchaserDerivedCashPayments> createPurchaserDerivedCashPayments(PurchaserDerivedCashPayments value) {
        return new JAXBElement<PurchaserDerivedCashPayments>(_PurchaserDerivedCashPayments_QNAME, PurchaserDerivedCashPayments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeFormEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FreeFormEvent")
    public JAXBElement<FreeFormEvent> createFreeFormEvent(FreeFormEvent value) {
        return new JAXBElement<FreeFormEvent>(_FreeFormEvent_QNAME, FreeFormEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommercialCollectionClaimDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CommercialCollectionClaimDetails")
    public JAXBElement<CommercialCollectionClaimDetails> createCommercialCollectionClaimDetails(CommercialCollectionClaimDetails value) {
        return new JAXBElement<CommercialCollectionClaimDetails>(_CommercialCollectionClaimDetails_QNAME, CommercialCollectionClaimDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "MessageGroup")
    public JAXBElement<MessageGroup> createMessageGroup(MessageGroup value) {
        return new JAXBElement<MessageGroup>(_MessageGroup_QNAME, MessageGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "EmployeeDetailsType")
    public JAXBElement<EmployeeDetailsType> createEmployeeDetailsType(EmployeeDetailsType value) {
        return new JAXBElement<EmployeeDetailsType>(_EmployeeDetailsType_QNAME, EmployeeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterSupplierSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RegisterSupplierSpecification")
    public JAXBElement<RegisterSupplierSpecification> createRegisterSupplierSpecification(RegisterSupplierSpecification value) {
        return new JAXBElement<RegisterSupplierSpecification>(_RegisterSupplierSpecification_QNAME, RegisterSupplierSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoardMemberService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BoardMemberService")
    public JAXBElement<BoardMemberService> createBoardMemberService(BoardMemberService value) {
        return new JAXBElement<BoardMemberService>(_BoardMemberService_QNAME, BoardMemberService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataProviderDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DataProviderDetail")
    public JAXBElement<DataProviderDetail> createDataProviderDetail(DataProviderDetail value) {
        return new JAXBElement<DataProviderDetail>(_DataProviderDetail_QNAME, DataProviderDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuarantorAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GuarantorAddress")
    public JAXBElement<GuarantorAddress> createGuarantorAddress(GuarantorAddress value) {
        return new JAXBElement<GuarantorAddress>(_GuarantorAddress_QNAME, GuarantorAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataDepthDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DataDepthDetailType")
    public JAXBElement<DataDepthDetailType> createDataDepthDetailType(DataDepthDetailType value) {
        return new JAXBElement<DataDepthDetailType>(_DataDepthDetailType_QNAME, DataDepthDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessHistoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BusinessHistoryType")
    public JAXBElement<BusinessHistoryType> createBusinessHistoryType(BusinessHistoryType value) {
        return new JAXBElement<BusinessHistoryType>(_BusinessHistoryType_QNAME, BusinessHistoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockPeriodSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "StockPeriodSummary")
    public JAXBElement<StockPeriodSummary> createStockPeriodSummary(StockPeriodSummary value) {
        return new JAXBElement<StockPeriodSummary>(_StockPeriodSummary_QNAME, StockPeriodSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreviousSelfEmploymentDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PreviousSelfEmploymentDetailsType")
    public JAXBElement<PreviousSelfEmploymentDetailsType> createPreviousSelfEmploymentDetailsType(PreviousSelfEmploymentDetailsType value) {
        return new JAXBElement<PreviousSelfEmploymentDetailsType>(_PreviousSelfEmploymentDetailsType_QNAME, PreviousSelfEmploymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilingExpirationDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FilingExpirationDetails")
    public JAXBElement<FilingExpirationDetails> createFilingExpirationDetails(FilingExpirationDetails value) {
        return new JAXBElement<FilingExpirationDetails>(_FilingExpirationDetails_QNAME, FilingExpirationDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaserDerivedPaymentsByCreditRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PurchaserDerivedPaymentsByCreditRange")
    public JAXBElement<PurchaserDerivedPaymentsByCreditRange> createPurchaserDerivedPaymentsByCreditRange(PurchaserDerivedPaymentsByCreditRange value) {
        return new JAXBElement<PurchaserDerivedPaymentsByCreditRange>(_PurchaserDerivedPaymentsByCreditRange_QNAME, PurchaserDerivedPaymentsByCreditRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsibleAreaForPrincipalOfPrincipal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ResponsibleAreaForPrincipalOfPrincipal")
    public JAXBElement<ResponsibleAreaForPrincipalOfPrincipal> createResponsibleAreaForPrincipalOfPrincipal(ResponsibleAreaForPrincipalOfPrincipal value) {
        return new JAXBElement<ResponsibleAreaForPrincipalOfPrincipal>(_ResponsibleAreaForPrincipalOfPrincipal_QNAME, ResponsibleAreaForPrincipalOfPrincipal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriberInfomation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubscriberInfomation")
    public JAXBElement<SubscriberInfomation> createSubscriberInfomation(SubscriberInfomation value) {
        return new JAXBElement<SubscriberInfomation>(_SubscriberInfomation_QNAME, SubscriberInfomation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsibleAreaForCorporateDirectorship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ResponsibleAreaForCorporateDirectorship")
    public JAXBElement<ResponsibleAreaForCorporateDirectorship> createResponsibleAreaForCorporateDirectorship(ResponsibleAreaForCorporateDirectorship value) {
        return new JAXBElement<ResponsibleAreaForCorporateDirectorship>(_ResponsibleAreaForCorporateDirectorship_QNAME, ResponsibleAreaForCorporateDirectorship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSupplierNotesRequestDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AddSupplierNotesRequestDetail")
    public JAXBElement<AddSupplierNotesRequestDetail> createAddSupplierNotesRequestDetail(AddSupplierNotesRequestDetail value) {
        return new JAXBElement<AddSupplierNotesRequestDetail>(_AddSupplierNotesRequestDetail_QNAME, AddSupplierNotesRequestDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectIsAgentDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectIsAgentDetailsType")
    public JAXBElement<SubjectIsAgentDetailsType> createSubjectIsAgentDetailsType(SubjectIsAgentDetailsType value) {
        return new JAXBElement<SubjectIsAgentDetailsType>(_SubjectIsAgentDetailsType_QNAME, SubjectIsAgentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Text")
    public JAXBElement<Text> createText(Text value) {
        return new JAXBElement<Text>(_Text_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherFinancialEventInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OtherFinancialEventInformation")
    public JAXBElement<OtherFinancialEventInformation> createOtherFinancialEventInformation(OtherFinancialEventInformation value) {
        return new JAXBElement<OtherFinancialEventInformation>(_OtherFinancialEventInformation_QNAME, OtherFinancialEventInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationDetailForAlert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LocationDetailForAlert")
    public JAXBElement<LocationDetailForAlert> createLocationDetailForAlert(LocationDetailForAlert value) {
        return new JAXBElement<LocationDetailForAlert>(_LocationDetailForAlert_QNAME, LocationDetailForAlert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Events }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Events")
    public JAXBElement<Events> createEvents(Events value) {
        return new JAXBElement<Events>(_Events_QNAME, Events.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MortgagesAndChargesInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "MortgagesAndChargesInformation")
    public JAXBElement<MortgagesAndChargesInformation> createMortgagesAndChargesInformation(MortgagesAndChargesInformation value) {
        return new JAXBElement<MortgagesAndChargesInformation>(_MortgagesAndChargesInformation_QNAME, MortgagesAndChargesInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentPaymentSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CurrentPaymentSummary")
    public JAXBElement<CurrentPaymentSummary> createCurrentPaymentSummary(CurrentPaymentSummary value) {
        return new JAXBElement<CurrentPaymentSummary>(_CurrentPaymentSummary_QNAME, CurrentPaymentSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusReportDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "StatusReportDetail")
    public JAXBElement<StatusReportDetail> createStatusReportDetail(StatusReportDetail value) {
        return new JAXBElement<StatusReportDetail>(_StatusReportDetail_QNAME, StatusReportDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvisionsAndDeferredTaxes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ProvisionsAndDeferredTaxes")
    public JAXBElement<ProvisionsAndDeferredTaxes> createProvisionsAndDeferredTaxes(ProvisionsAndDeferredTaxes value) {
        return new JAXBElement<ProvisionsAndDeferredTaxes>(_ProvisionsAndDeferredTaxes_QNAME, ProvisionsAndDeferredTaxes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpendAmountRangeSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SpendAmountRangeSummaryType")
    public JAXBElement<SpendAmountRangeSummaryType> createSpendAmountRangeSummaryType(SpendAmountRangeSummaryType value) {
        return new JAXBElement<SpendAmountRangeSummaryType>(_SpendAmountRangeSummaryType_QNAME, SpendAmountRangeSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PremisesAreaDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PremisesAreaDetail")
    public JAXBElement<PremisesAreaDetail> createPremisesAreaDetail(PremisesAreaDetail value) {
        return new JAXBElement<PremisesAreaDetail>(_PremisesAreaDetail_QNAME, PremisesAreaDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaserDerivedPaymentsWithHighCredit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PurchaserDerivedPaymentsWithHighCredit")
    public JAXBElement<PurchaserDerivedPaymentsWithHighCredit> createPurchaserDerivedPaymentsWithHighCredit(PurchaserDerivedPaymentsWithHighCredit value) {
        return new JAXBElement<PurchaserDerivedPaymentsWithHighCredit>(_PurchaserDerivedPaymentsWithHighCredit_QNAME, PurchaserDerivedPaymentsWithHighCredit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CustomScore")
    public JAXBElement<CustomScore> createCustomScore(CustomScore value) {
        return new JAXBElement<CustomScore>(_CustomScore_QNAME, CustomScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ObjectAttachment")
    public JAXBElement<ObjectAttachment> createObjectAttachment(ObjectAttachment value) {
        return new JAXBElement<ObjectAttachment>(_ObjectAttachment_QNAME, ObjectAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationDNBPresentationRegistrationNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrganizationDNBPresentationRegistrationNumber")
    public JAXBElement<OrganizationDNBPresentationRegistrationNumber> createOrganizationDNBPresentationRegistrationNumber(OrganizationDNBPresentationRegistrationNumber value) {
        return new JAXBElement<OrganizationDNBPresentationRegistrationNumber>(_OrganizationDNBPresentationRegistrationNumber_QNAME, OrganizationDNBPresentationRegistrationNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalRiskScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GlobalRiskScoreType")
    public JAXBElement<GlobalRiskScoreType> createGlobalRiskScoreType(GlobalRiskScoreType value) {
        return new JAXBElement<GlobalRiskScoreType>(_GlobalRiskScoreType_QNAME, GlobalRiskScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PremisesUsageFunctionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PremisesUsageFunctionDetail")
    public JAXBElement<PremisesUsageFunctionDetail> createPremisesUsageFunctionDetail(PremisesUsageFunctionDetail value) {
        return new JAXBElement<PremisesUsageFunctionDetail>(_PremisesUsageFunctionDetail_QNAME, PremisesUsageFunctionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PastDuePaymentCycleSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PastDuePaymentCycleSummaryType")
    public JAXBElement<PastDuePaymentCycleSummaryType> createPastDuePaymentCycleSummaryType(PastDuePaymentCycleSummaryType value) {
        return new JAXBElement<PastDuePaymentCycleSummaryType>(_PastDuePaymentCycleSummaryType_QNAME, PastDuePaymentCycleSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PremisesArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PremisesArea")
    public JAXBElement<PremisesArea> createPremisesArea(PremisesArea value) {
        return new JAXBElement<PremisesArea>(_PremisesArea_QNAME, PremisesArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Organization")
    public JAXBElement<Organization> createOrganization(Organization value) {
        return new JAXBElement<Organization>(_Organization_QNAME, Organization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GetDataRequest")
    public JAXBElement<GetDataRequest> createGetDataRequest(GetDataRequest value) {
        return new JAXBElement<GetDataRequest>(_GetDataRequest_QNAME, GetDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InquiryReferenceDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "InquiryReferenceDetail")
    public JAXBElement<InquiryReferenceDetail> createInquiryReferenceDetail(InquiryReferenceDetail value) {
        return new JAXBElement<InquiryReferenceDetail>(_InquiryReferenceDetail_QNAME, InquiryReferenceDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilingOfficeDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FilingOfficeDetails")
    public JAXBElement<FilingOfficeDetails> createFilingOfficeDetails(FilingOfficeDetails value) {
        return new JAXBElement<FilingOfficeDetails>(_FilingOfficeDetails_QNAME, FilingOfficeDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertifiedSmallBusinessDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CertifiedSmallBusinessDetail")
    public JAXBElement<CertifiedSmallBusinessDetail> createCertifiedSmallBusinessDetail(CertifiedSmallBusinessDetail value) {
        return new JAXBElement<CertifiedSmallBusinessDetail>(_CertifiedSmallBusinessDetail_QNAME, CertifiedSmallBusinessDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityMatchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "EntityMatchDetail")
    public JAXBElement<EntityMatchDetail> createEntityMatchDetail(EntityMatchDetail value) {
        return new JAXBElement<EntityMatchDetail>(_EntityMatchDetail_QNAME, EntityMatchDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ArchiveDetail")
    public JAXBElement<ArchiveDetail> createArchiveDetail(ArchiveDetail value) {
        return new JAXBElement<ArchiveDetail>(_ArchiveDetail_QNAME, ArchiveDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LetterofLiabilitySummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LetterofLiabilitySummaryType")
    public JAXBElement<LetterofLiabilitySummaryType> createLetterofLiabilitySummaryType(LetterofLiabilitySummaryType value) {
        return new JAXBElement<LetterofLiabilitySummaryType>(_LetterofLiabilitySummaryType_QNAME, LetterofLiabilitySummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaydexScoreSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaydexScoreSummaryType")
    public JAXBElement<PaydexScoreSummaryType> createPaydexScoreSummaryType(PaydexScoreSummaryType value) {
        return new JAXBElement<PaydexScoreSummaryType>(_PaydexScoreSummaryType_QNAME, PaydexScoreSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PrincipalDetailsRequestType")
    public JAXBElement<PrincipalDetailsRequestType> createPrincipalDetailsRequestType(PrincipalDetailsRequestType value) {
        return new JAXBElement<PrincipalDetailsRequestType>(_PrincipalDetailsRequestType_QNAME, PrincipalDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Individual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Individual")
    public JAXBElement<Individual> createIndividual(Individual value) {
        return new JAXBElement<Individual>(_Individual_QNAME, Individual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessSizeNorm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BusinessSizeNorm")
    public JAXBElement<BusinessSizeNorm> createBusinessSizeNorm(BusinessSizeNorm value) {
        return new JAXBElement<BusinessSizeNorm>(_BusinessSizeNorm_QNAME, BusinessSizeNorm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RolePlayer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RolePlayer")
    public JAXBElement<RolePlayer> createRolePlayer(RolePlayer value) {
        return new JAXBElement<RolePlayer>(_RolePlayer_QNAME, RolePlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessSignalsSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BusinessSignalsSummaryType")
    public JAXBElement<BusinessSignalsSummaryType> createBusinessSignalsSummaryType(BusinessSignalsSummaryType value) {
        return new JAXBElement<BusinessSignalsSummaryType>(_BusinessSignalsSummaryType_QNAME, BusinessSignalsSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IndustryCode")
    public JAXBElement<IndustryCode> createIndustryCode(IndustryCode value) {
        return new JAXBElement<IndustryCode>(_IndustryCode_QNAME, IndustryCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SBFEPoweredScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SBFEPoweredScoreType")
    public JAXBElement<SBFEPoweredScoreType> createSBFEPoweredScoreType(SBFEPoweredScoreType value) {
        return new JAXBElement<SBFEPoweredScoreType>(_SBFEPoweredScoreType_QNAME, SBFEPoweredScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialInvestigationDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SpecialInvestigationDetail")
    public JAXBElement<SpecialInvestigationDetail> createSpecialInvestigationDetail(SpecialInvestigationDetail value) {
        return new JAXBElement<SpecialInvestigationDetail>(_SpecialInvestigationDetail_QNAME, SpecialInvestigationDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalBalanceSheetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GlobalBalanceSheetType")
    public JAXBElement<GlobalBalanceSheetType> createGlobalBalanceSheetType(GlobalBalanceSheetType value) {
        return new JAXBElement<GlobalBalanceSheetType>(_GlobalBalanceSheetType_QNAME, GlobalBalanceSheetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignificantEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SignificantEvents")
    public JAXBElement<SignificantEvents> createSignificantEvents(SignificantEvents value) {
        return new JAXBElement<SignificantEvents>(_SignificantEvents_QNAME, SignificantEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplianceDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ComplianceDetail")
    public JAXBElement<ComplianceDetail> createComplianceDetail(ComplianceDetail value) {
        return new JAXBElement<ComplianceDetail>(_ComplianceDetail_QNAME, ComplianceDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierRegistrationBatchStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GetSupplierRegistrationBatchStatusResponse")
    public JAXBElement<GetSupplierRegistrationBatchStatusResponse> createGetSupplierRegistrationBatchStatusResponse(GetSupplierRegistrationBatchStatusResponse value) {
        return new JAXBElement<GetSupplierRegistrationBatchStatusResponse>(_GetSupplierRegistrationBatchStatusResponse_QNAME, GetSupplierRegistrationBatchStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalAssets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GlobalAssets")
    public JAXBElement<GlobalAssets> createGlobalAssets(GlobalAssets value) {
        return new JAXBElement<GlobalAssets>(_GlobalAssets_QNAME, GlobalAssets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Liabilities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Liabilities")
    public JAXBElement<Liabilities> createLiabilities(Liabilities value) {
        return new JAXBElement<Liabilities>(_Liabilities_QNAME, Liabilities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreOverrideReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ScoreOverrideReason")
    public JAXBElement<ScoreOverrideReason> createScoreOverrideReason(ScoreOverrideReason value) {
        return new JAXBElement<ScoreOverrideReason>(_ScoreOverrideReason_QNAME, ScoreOverrideReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiscellaneousDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "MiscellaneousDetails")
    public JAXBElement<MiscellaneousDetails> createMiscellaneousDetails(MiscellaneousDetails value) {
        return new JAXBElement<MiscellaneousDetails>(_MiscellaneousDetails_QNAME, MiscellaneousDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommercialCollectionClaims }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CommercialCollectionClaims")
    public JAXBElement<CommercialCollectionClaims> createCommercialCollectionClaims(CommercialCollectionClaims value) {
        return new JAXBElement<CommercialCollectionClaims>(_CommercialCollectionClaims_QNAME, CommercialCollectionClaims.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummarizedPastDueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SummarizedPastDueType")
    public JAXBElement<SummarizedPastDueType> createSummarizedPastDueType(SummarizedPastDueType value) {
        return new JAXBElement<SummarizedPastDueType>(_SummarizedPastDueType_QNAME, SummarizedPastDueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommercialCardAccountSummaryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CommercialCardAccountSummaryDetailType")
    public JAXBElement<CommercialCardAccountSummaryDetailType> createCommercialCardAccountSummaryDetailType(CommercialCardAccountSummaryDetailType value) {
        return new JAXBElement<CommercialCardAccountSummaryDetailType>(_CommercialCardAccountSummaryDetailType_QNAME, CommercialCardAccountSummaryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineOfBusinessDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LineOfBusinessDetailsType")
    public JAXBElement<LineOfBusinessDetailsType> createLineOfBusinessDetailsType(LineOfBusinessDetailsType value) {
        return new JAXBElement<LineOfBusinessDetailsType>(_LineOfBusinessDetailsType_QNAME, LineOfBusinessDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ClaimInformation")
    public JAXBElement<ClaimInformation> createClaimInformation(ClaimInformation value) {
        return new JAXBElement<ClaimInformation>(_ClaimInformation_QNAME, ClaimInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Competitors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Competitors")
    public JAXBElement<Competitors> createCompetitors(Competitors value) {
        return new JAXBElement<Competitors>(_Competitors_QNAME, Competitors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ScoreType")
    public JAXBElement<ScoreType> createScoreType(ScoreType value) {
        return new JAXBElement<ScoreType>(_ScoreType_QNAME, ScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankExperienceSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BankExperienceSummary")
    public JAXBElement<BankExperienceSummary> createBankExperienceSummary(BankExperienceSummary value) {
        return new JAXBElement<BankExperienceSummary>(_BankExperienceSummary_QNAME, BankExperienceSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveProductRequestDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RetrieveProductRequestDetail")
    public JAXBElement<RetrieveProductRequestDetail> createRetrieveProductRequestDetail(RetrieveProductRequestDetail value) {
        return new JAXBElement<RetrieveProductRequestDetail>(_RetrieveProductRequestDetail_QNAME, RetrieveProductRequestDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountSummaryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AccountSummaryDetailType")
    public JAXBElement<AccountSummaryDetailType> createAccountSummaryDetailType(AccountSummaryDetailType value) {
        return new JAXBElement<AccountSummaryDetailType>(_AccountSummaryDetailType_QNAME, AccountSummaryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentCreditRangePaydexScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CurrentCreditRangePaydexScoreType")
    public JAXBElement<CurrentCreditRangePaydexScoreType> createCurrentCreditRangePaydexScoreType(CurrentCreditRangePaydexScoreType value) {
        return new JAXBElement<CurrentCreditRangePaydexScoreType>(_CurrentCreditRangePaydexScoreType_QNAME, CurrentCreditRangePaydexScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialRatioItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialRatioItem")
    public JAXBElement<FinancialRatioItem> createFinancialRatioItem(FinancialRatioItem value) {
        return new JAXBElement<FinancialRatioItem>(_FinancialRatioItem_QNAME, FinancialRatioItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummarizedPastDue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SummarizedPastDue")
    public JAXBElement<SummarizedPastDue> createSummarizedPastDue(SummarizedPastDue value) {
        return new JAXBElement<SummarizedPastDue>(_SummarizedPastDue_QNAME, SummarizedPastDue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaserDerivedNoPaymentMannerPayments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PurchaserDerivedNoPaymentMannerPayments")
    public JAXBElement<PurchaserDerivedNoPaymentMannerPayments> createPurchaserDerivedNoPaymentMannerPayments(PurchaserDerivedNoPaymentMannerPayments value) {
        return new JAXBElement<PurchaserDerivedNoPaymentMannerPayments>(_PurchaserDerivedNoPaymentMannerPayments_QNAME, PurchaserDerivedNoPaymentMannerPayments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompensationDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CompensationDetail")
    public JAXBElement<CompensationDetail> createCompensationDetail(CompensationDetail value) {
        return new JAXBElement<CompensationDetail>(_CompensationDetail_QNAME, CompensationDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RolePlayerName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RolePlayerName")
    public JAXBElement<RolePlayerName> createRolePlayerName(RolePlayerName value) {
        return new JAXBElement<RolePlayerName>(_RolePlayerName_QNAME, RolePlayerName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilingStatusDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FilingStatusDetail")
    public JAXBElement<FilingStatusDetail> createFilingStatusDetail(FilingStatusDetail value) {
        return new JAXBElement<FilingStatusDetail>(_FilingStatusDetail_QNAME, FilingStatusDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustryPaymentExperienceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IndustryPaymentExperienceType")
    public JAXBElement<IndustryPaymentExperienceType> createIndustryPaymentExperienceType(IndustryPaymentExperienceType value) {
        return new JAXBElement<IndustryPaymentExperienceType>(_IndustryPaymentExperienceType_QNAME, IndustryPaymentExperienceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationProfileDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrganizationProfileDetailType")
    public JAXBElement<OrganizationProfileDetailType> createOrganizationProfileDetailType(OrganizationProfileDetailType value) {
        return new JAXBElement<OrganizationProfileDetailType>(_OrganizationProfileDetailType_QNAME, OrganizationProfileDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrowthRateNorm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GrowthRateNorm")
    public JAXBElement<GrowthRateNorm> createGrowthRateNorm(GrowthRateNorm value) {
        return new JAXBElement<GrowthRateNorm>(_GrowthRateNorm_QNAME, GrowthRateNorm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InquiryDetailForSupplierBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "InquiryDetailForSupplierBatch")
    public JAXBElement<InquiryDetailForSupplierBatch> createInquiryDetailForSupplierBatch(InquiryDetailForSupplierBatch value) {
        return new JAXBElement<InquiryDetailForSupplierBatch>(_InquiryDetailForSupplierBatch_QNAME, InquiryDetailForSupplierBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinorityOwnedDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "MinorityOwnedDetails")
    public JAXBElement<MinorityOwnedDetails> createMinorityOwnedDetails(MinorityOwnedDetails value) {
        return new JAXBElement<MinorityOwnedDetails>(_MinorityOwnedDetails_QNAME, MinorityOwnedDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaserDerivedPaymentsToSupplierIndustry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PurchaserDerivedPaymentsToSupplierIndustry")
    public JAXBElement<PurchaserDerivedPaymentsToSupplierIndustry> createPurchaserDerivedPaymentsToSupplierIndustry(PurchaserDerivedPaymentsToSupplierIndustry value) {
        return new JAXBElement<PurchaserDerivedPaymentsToSupplierIndustry>(_PurchaserDerivedPaymentsToSupplierIndustry_QNAME, PurchaserDerivedPaymentsToSupplierIndustry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FullName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FullName")
    public JAXBElement<FullName> createFullName(FullName value) {
        return new JAXBElement<FullName>(_FullName_QNAME, FullName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBStandardRatingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DNBStandardRatingType")
    public JAXBElement<DNBStandardRatingType> createDNBStandardRatingType(DNBStandardRatingType value) {
        return new JAXBElement<DNBStandardRatingType>(_DNBStandardRatingType_QNAME, DNBStandardRatingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialEventBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialEventBaseType")
    public JAXBElement<FinancialEventBaseType> createFinancialEventBaseType(FinancialEventBaseType value) {
        return new JAXBElement<FinancialEventBaseType>(_FinancialEventBaseType_QNAME, FinancialEventBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalPastDueCycleSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TotalPastDueCycleSummary")
    public JAXBElement<TotalPastDueCycleSummary> createTotalPastDueCycleSummary(TotalPastDueCycleSummary value) {
        return new JAXBElement<TotalPastDueCycleSummary>(_TotalPastDueCycleSummary_QNAME, TotalPastDueCycleSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaydexScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaydexScoreType")
    public JAXBElement<PaydexScoreType> createPaydexScoreType(PaydexScoreType value) {
        return new JAXBElement<PaydexScoreType>(_PaydexScoreType_QNAME, PaydexScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByFilingNameFilingLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SearchByFilingNameFilingLocation")
    public JAXBElement<SearchByFilingNameFilingLocation> createSearchByFilingNameFilingLocation(SearchByFilingNameFilingLocation value) {
        return new JAXBElement<SearchByFilingNameFilingLocation>(_SearchByFilingNameFilingLocation_QNAME, SearchByFilingNameFilingLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ContactEvent")
    public JAXBElement<ContactEvent> createContactEvent(ContactEvent value) {
        return new JAXBElement<ContactEvent>(_ContactEvent_QNAME, ContactEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CustomerDetailsType")
    public JAXBElement<CustomerDetailsType> createCustomerDetailsType(CustomerDetailsType value) {
        return new JAXBElement<CustomerDetailsType>(_CustomerDetailsType_QNAME, CustomerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CommunicationResult")
    public JAXBElement<CommunicationResult> createCommunicationResult(CommunicationResult value) {
        return new JAXBElement<CommunicationResult>(_CommunicationResult_QNAME, CommunicationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HigherQuartile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "HigherQuartile")
    public JAXBElement<HigherQuartile> createHigherQuartile(HigherQuartile value) {
        return new JAXBElement<HigherQuartile>(_HigherQuartile_QNAME, HigherQuartile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RiskIncidencePercentageIndustryNorm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RiskIncidencePercentageIndustryNorm")
    public JAXBElement<RiskIncidencePercentageIndustryNorm> createRiskIncidencePercentageIndustryNorm(RiskIncidencePercentageIndustryNorm value) {
        return new JAXBElement<RiskIncidencePercentageIndustryNorm>(_RiskIncidencePercentageIndustryNorm_QNAME, RiskIncidencePercentageIndustryNorm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InquirySummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "InquirySummary")
    public JAXBElement<InquirySummary> createInquirySummary(InquirySummary value) {
        return new JAXBElement<InquirySummary>(_InquirySummary_QNAME, InquirySummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "MailAddressType")
    public JAXBElement<MailAddressType> createMailAddressType(MailAddressType value) {
        return new JAXBElement<MailAddressType>(_MailAddressType_QNAME, MailAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Location")
    public JAXBElement<Location> createLocation(Location value) {
        return new JAXBElement<Location>(_Location_QNAME, Location.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LongTermLiabilities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LongTermLiabilities")
    public JAXBElement<LongTermLiabilities> createLongTermLiabilities(LongTermLiabilities value) {
        return new JAXBElement<LongTermLiabilities>(_LongTermLiabilities_QNAME, LongTermLiabilities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RiskIncidence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RiskIncidence")
    public JAXBElement<RiskIncidence> createRiskIncidence(RiskIncidence value) {
        return new JAXBElement<RiskIncidence>(_RiskIncidence_QNAME, RiskIncidence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierPrincipal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierPrincipal")
    public JAXBElement<SupplierPrincipal> createSupplierPrincipal(SupplierPrincipal value) {
        return new JAXBElement<SupplierPrincipal>(_SupplierPrincipal_QNAME, SupplierPrincipal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeaseAccountSummaryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LeaseAccountSummaryDetailType")
    public JAXBElement<LeaseAccountSummaryDetailType> createLeaseAccountSummaryDetailType(LeaseAccountSummaryDetailType value) {
        return new JAXBElement<LeaseAccountSummaryDetailType>(_LeaseAccountSummaryDetailType_QNAME, LeaseAccountSummaryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MortgagesAndChargesSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "MortgagesAndChargesSummary")
    public JAXBElement<MortgagesAndChargesSummary> createMortgagesAndChargesSummary(MortgagesAndChargesSummary value) {
        return new JAXBElement<MortgagesAndChargesSummary>(_MortgagesAndChargesSummary_QNAME, MortgagesAndChargesSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockExchangeDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "StockExchangeDetails")
    public JAXBElement<StockExchangeDetails> createStockExchangeDetails(StockExchangeDetails value) {
        return new JAXBElement<StockExchangeDetails>(_StockExchangeDetails_QNAME, StockExchangeDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommentGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CommentGroupType")
    public JAXBElement<CommentGroupType> createCommentGroupType(CommentGroupType value) {
        return new JAXBElement<CommentGroupType>(_CommentGroupType_QNAME, CommentGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteDetailForResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NoteDetailForResponse")
    public JAXBElement<NoteDetailForResponse> createNoteDetailForResponse(NoteDetailForResponse value) {
        return new JAXBElement<NoteDetailForResponse>(_NoteDetailForResponse_QNAME, NoteDetailForResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemedyFiled }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RemedyFiled")
    public JAXBElement<RemedyFiled> createRemedyFiled(RemedyFiled value) {
        return new JAXBElement<RemedyFiled>(_RemedyFiled_QNAME, RemedyFiled.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PrincipalAssociation")
    public JAXBElement<PrincipalAssociation> createPrincipalAssociation(PrincipalAssociation value) {
        return new JAXBElement<PrincipalAssociation>(_PrincipalAssociation_QNAME, PrincipalAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Subject")
    public JAXBElement<Subject> createSubject(Subject value) {
        return new JAXBElement<Subject>(_Subject_QNAME, Subject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportCountryDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ImportCountryDetails")
    public JAXBElement<ImportCountryDetails> createImportCountryDetails(ImportCountryDetails value) {
        return new JAXBElement<ImportCountryDetails>(_ImportCountryDetails_QNAME, ImportCountryDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Request")
    public JAXBElement<Request> createRequest(Request value) {
        return new JAXBElement<Request>(_Request_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalBirthAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PrincipalBirthAddressType")
    public JAXBElement<PrincipalBirthAddressType> createPrincipalBirthAddressType(PrincipalBirthAddressType value) {
        return new JAXBElement<PrincipalBirthAddressType>(_PrincipalBirthAddressType_QNAME, PrincipalBirthAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UCCFilingInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "UCCFilingInformation")
    public JAXBElement<UCCFilingInformation> createUCCFilingInformation(UCCFilingInformation value) {
        return new JAXBElement<UCCFilingInformation>(_UCCFilingInformation_QNAME, UCCFilingInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierQueueDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierQueueDetail")
    public JAXBElement<SupplierQueueDetail> createSupplierQueueDetail(SupplierQueueDetail value) {
        return new JAXBElement<SupplierQueueDetail>(_SupplierQueueDetail_QNAME, SupplierQueueDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformationConfirmation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "InformationConfirmation")
    public JAXBElement<InformationConfirmation> createInformationConfirmation(InformationConfirmation value) {
        return new JAXBElement<InformationConfirmation>(_InformationConfirmation_QNAME, InformationConfirmation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialRelationship")
    public JAXBElement<FinancialRelationship> createFinancialRelationship(FinancialRelationship value) {
        return new JAXBElement<FinancialRelationship>(_FinancialRelationship_QNAME, FinancialRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Assets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Assets")
    public JAXBElement<Assets> createAssets(Assets value) {
        return new JAXBElement<Assets>(_Assets_QNAME, Assets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link News }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "News")
    public JAXBElement<News> createNews(News value) {
        return new JAXBElement<News>(_News_QNAME, News.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveProductArchiveDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RetrieveProductArchiveDetail")
    public JAXBElement<RetrieveProductArchiveDetail> createRetrieveProductArchiveDetail(RetrieveProductArchiveDetail value) {
        return new JAXBElement<RetrieveProductArchiveDetail>(_RetrieveProductArchiveDetail_QNAME, RetrieveProductArchiveDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancingEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancingEvents")
    public JAXBElement<FinancingEvents> createFinancingEvents(FinancingEvents value) {
        return new JAXBElement<FinancingEvents>(_FinancingEvents_QNAME, FinancingEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchGradeSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "MatchGradeSummaryType")
    public JAXBElement<MatchGradeSummaryType> createMatchGradeSummaryType(MatchGradeSummaryType value) {
        return new JAXBElement<MatchGradeSummaryType>(_MatchGradeSummaryType_QNAME, MatchGradeSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpactedChildOrganizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ImpactedChildOrganizationType")
    public JAXBElement<ImpactedChildOrganizationType> createImpactedChildOrganizationType(ImpactedChildOrganizationType value) {
        return new JAXBElement<ImpactedChildOrganizationType>(_ImpactedChildOrganizationType_QNAME, ImpactedChildOrganizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationNameTypeForPrimaryRegistered }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrganizationNameTypeForPrimaryRegistered")
    public JAXBElement<OrganizationNameTypeForPrimaryRegistered> createOrganizationNameTypeForPrimaryRegistered(OrganizationNameTypeForPrimaryRegistered value) {
        return new JAXBElement<OrganizationNameTypeForPrimaryRegistered>(_OrganizationNameTypeForPrimaryRegistered_QNAME, OrganizationNameTypeForPrimaryRegistered.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonspecificAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NonspecificAddress")
    public JAXBElement<NonspecificAddress> createNonspecificAddress(NonspecificAddress value) {
        return new JAXBElement<NonspecificAddress>(_NonspecificAddress_QNAME, NonspecificAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationIdentificationNumberDetailsHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrganizationIdentificationNumberDetailsHistory")
    public JAXBElement<OrganizationIdentificationNumberDetailsHistory> createOrganizationIdentificationNumberDetailsHistory(OrganizationIdentificationNumberDetailsHistory value) {
        return new JAXBElement<OrganizationIdentificationNumberDetailsHistory>(_OrganizationIdentificationNumberDetailsHistory_QNAME, OrganizationIdentificationNumberDetailsHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MortgagesAndChargesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "MortgagesAndChargesType")
    public JAXBElement<MortgagesAndChargesType> createMortgagesAndChargesType(MortgagesAndChargesType value) {
        return new JAXBElement<MortgagesAndChargesType>(_MortgagesAndChargesType_QNAME, MortgagesAndChargesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinesOfCreditAccountSummaryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LinesOfCreditAccountSummaryDetailType")
    public JAXBElement<LinesOfCreditAccountSummaryDetailType> createLinesOfCreditAccountSummaryDetailType(LinesOfCreditAccountSummaryDetailType value) {
        return new JAXBElement<LinesOfCreditAccountSummaryDetailType>(_LinesOfCreditAccountSummaryDetailType_QNAME, LinesOfCreditAccountSummaryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatementItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "StatementItem")
    public JAXBElement<StatementItem> createStatementItem(StatementItem value) {
        return new JAXBElement<StatementItem>(_StatementItem_QNAME, StatementItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectName")
    public JAXBElement<SubjectName> createSubjectName(SubjectName value) {
        return new JAXBElement<SubjectName>(_SubjectName_QNAME, SubjectName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrganizationName")
    public JAXBElement<OrganizationName> createOrganizationName(OrganizationName value) {
        return new JAXBElement<OrganizationName>(_OrganizationName_QNAME, OrganizationName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetArticleDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AssetArticleDetailType")
    public JAXBElement<AssetArticleDetailType> createAssetArticleDetailType(AssetArticleDetailType value) {
        return new JAXBElement<AssetArticleDetailType>(_AssetArticleDetailType_QNAME, AssetArticleDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingStatusDetailHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OperatingStatusDetailHistory")
    public JAXBElement<OperatingStatusDetailHistory> createOperatingStatusDetailHistory(OperatingStatusDetailHistory value) {
        return new JAXBElement<OperatingStatusDetailHistory>(_OperatingStatusDetailHistory_QNAME, OperatingStatusDetailHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuitInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SuitInformation")
    public JAXBElement<SuitInformation> createSuitInformation(SuitInformation value) {
        return new JAXBElement<SuitInformation>(_SuitInformation_QNAME, SuitInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapitalStockDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CapitalStockDetails")
    public JAXBElement<CapitalStockDetails> createCapitalStockDetails(CapitalStockDetails value) {
        return new JAXBElement<CapitalStockDetails>(_CapitalStockDetails_QNAME, CapitalStockDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreCommentary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ScoreCommentary")
    public JAXBElement<ScoreCommentary> createScoreCommentary(ScoreCommentary value) {
        return new JAXBElement<ScoreCommentary>(_ScoreCommentary_QNAME, ScoreCommentary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessSignalsPeriodSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BusinessSignalsPeriodSummaryType")
    public JAXBElement<BusinessSignalsPeriodSummaryType> createBusinessSignalsPeriodSummaryType(BusinessSignalsPeriodSummaryType value) {
        return new JAXBElement<BusinessSignalsPeriodSummaryType>(_BusinessSignalsPeriodSummaryType_QNAME, BusinessSignalsPeriodSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaserDerivedPaymentPeriodSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PurchaserDerivedPaymentPeriodSummary")
    public JAXBElement<PurchaserDerivedPaymentPeriodSummary> createPurchaserDerivedPaymentPeriodSummary(PurchaserDerivedPaymentPeriodSummary value) {
        return new JAXBElement<PurchaserDerivedPaymentPeriodSummary>(_PurchaserDerivedPaymentPeriodSummary_QNAME, PurchaserDerivedPaymentPeriodSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Equity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Equity")
    public JAXBElement<Equity> createEquity(Equity value) {
        return new JAXBElement<Equity>(_Equity_QNAME, Equity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsibleArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ResponsibleArea")
    public JAXBElement<ResponsibleArea> createResponsibleArea(ResponsibleArea value) {
        return new JAXBElement<ResponsibleArea>(_ResponsibleArea_QNAME, ResponsibleArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustryNormType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IndustryNormType")
    public JAXBElement<IndustryNormType> createIndustryNormType(IndustryNormType value) {
        return new JAXBElement<IndustryNormType>(_IndustryNormType_QNAME, IndustryNormType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AmountType")
    public JAXBElement<AmountType> createAmountType(AmountType value) {
        return new JAXBElement<AmountType>(_AmountType_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierRegistrationBatchStatusResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GetSupplierRegistrationBatchStatusResponseDetail")
    public JAXBElement<GetSupplierRegistrationBatchStatusResponseDetail> createGetSupplierRegistrationBatchStatusResponseDetail(GetSupplierRegistrationBatchStatusResponseDetail value) {
        return new JAXBElement<GetSupplierRegistrationBatchStatusResponseDetail>(_GetSupplierRegistrationBatchStatusResponseDetail_QNAME, GetSupplierRegistrationBatchStatusResponseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankIdentificationNumberDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BankIdentificationNumberDetailType")
    public JAXBElement<BankIdentificationNumberDetailType> createBankIdentificationNumberDetailType(BankIdentificationNumberDetailType value) {
        return new JAXBElement<BankIdentificationNumberDetailType>(_BankIdentificationNumberDetailType_QNAME, BankIdentificationNumberDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormerOrganizationRegisteredNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FormerOrganizationRegisteredNameType")
    public JAXBElement<FormerOrganizationRegisteredNameType> createFormerOrganizationRegisteredNameType(FormerOrganizationRegisteredNameType value) {
        return new JAXBElement<FormerOrganizationRegisteredNameType>(_FormerOrganizationRegisteredNameType_QNAME, FormerOrganizationRegisteredNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectAddressType")
    public JAXBElement<SubjectAddressType> createSubjectAddressType(SubjectAddressType value) {
        return new JAXBElement<SubjectAddressType>(_SubjectAddressType_QNAME, SubjectAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FamilyTreeMemberRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FamilyTreeMemberRole")
    public JAXBElement<FamilyTreeMemberRole> createFamilyTreeMemberRole(FamilyTreeMemberRole value) {
        return new JAXBElement<FamilyTreeMemberRole>(_FamilyTreeMemberRole_QNAME, FamilyTreeMemberRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankruptcyFinancialStatement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BankruptcyFinancialStatement")
    public JAXBElement<BankruptcyFinancialStatement> createBankruptcyFinancialStatement(BankruptcyFinancialStatement value) {
        return new JAXBElement<BankruptcyFinancialStatement>(_BankruptcyFinancialStatement_QNAME, BankruptcyFinancialStatement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditRangeSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CreditRangeSummaryType")
    public JAXBElement<CreditRangeSummaryType> createCreditRangeSummaryType(CreditRangeSummaryType value) {
        return new JAXBElement<CreditRangeSummaryType>(_CreditRangeSummaryType_QNAME, CreditRangeSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBRatingDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DNBRatingDetails")
    public JAXBElement<DNBRatingDetails> createDNBRatingDetails(DNBRatingDetails value) {
        return new JAXBElement<DNBRatingDetails>(_DNBRatingDetails_QNAME, DNBRatingDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMannerSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaymentMannerSummaryType")
    public JAXBElement<PaymentMannerSummaryType> createPaymentMannerSummaryType(PaymentMannerSummaryType value) {
        return new JAXBElement<PaymentMannerSummaryType>(_PaymentMannerSummaryType_QNAME, PaymentMannerSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierRecordStatusSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierRecordStatusSummary")
    public JAXBElement<SupplierRecordStatusSummary> createSupplierRecordStatusSummary(SupplierRecordStatusSummary value) {
        return new JAXBElement<SupplierRecordStatusSummary>(_SupplierRecordStatusSummary_QNAME, SupplierRecordStatusSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationDetailForAirportConcession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LocationDetailForAirportConcession")
    public JAXBElement<LocationDetailForAirportConcession> createLocationDetailForAirportConcession(LocationDetailForAirportConcession value) {
        return new JAXBElement<LocationDetailForAirportConcession>(_LocationDetailForAirportConcession_QNAME, LocationDetailForAirportConcession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailedTradeInformationSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DetailedTradeInformationSpecification")
    public JAXBElement<DetailedTradeInformationSpecification> createDetailedTradeInformationSpecification(DetailedTradeInformationSpecification value) {
        return new JAXBElement<DetailedTradeInformationSpecification>(_DetailedTradeInformationSpecification_QNAME, DetailedTradeInformationSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialRatioNorm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialRatioNorm")
    public JAXBElement<FinancialRatioNorm> createFinancialRatioNorm(FinancialRatioNorm value) {
        return new JAXBElement<FinancialRatioNorm>(_FinancialRatioNorm_QNAME, FinancialRatioNorm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NormType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NormType")
    public JAXBElement<NormType> createNormType(NormType value) {
        return new JAXBElement<NormType>(_NormType_QNAME, NormType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeakPeriodDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PeakPeriodDetailsType")
    public JAXBElement<PeakPeriodDetailsType> createPeakPeriodDetailsType(PeakPeriodDetailsType value) {
        return new JAXBElement<PeakPeriodDetailsType>(_PeakPeriodDetailsType_QNAME, PeakPeriodDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LocationProfile")
    public JAXBElement<LocationProfile> createLocationProfile(LocationProfile value) {
        return new JAXBElement<LocationProfile>(_LocationProfile_QNAME, LocationProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisteredDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RegisteredDetail")
    public JAXBElement<RegisteredDetail> createRegisteredDetail(RegisteredDetail value) {
        return new JAXBElement<RegisteredDetail>(_RegisteredDetail_QNAME, RegisteredDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimaryAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PrimaryAddressType")
    public JAXBElement<PrimaryAddressType> createPrimaryAddressType(PrimaryAddressType value) {
        return new JAXBElement<PrimaryAddressType>(_PrimaryAddressType_QNAME, PrimaryAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonspecificParameterDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NonspecificParameterDetail")
    public JAXBElement<NonspecificParameterDetail> createNonspecificParameterDetail(NonspecificParameterDetail value) {
        return new JAXBElement<NonspecificParameterDetail>(_NonspecificParameterDetail_QNAME, NonspecificParameterDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomesticMarketTerritoryDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DomesticMarketTerritoryDetailsType")
    public JAXBElement<DomesticMarketTerritoryDetailsType> createDomesticMarketTerritoryDetailsType(DomesticMarketTerritoryDetailsType value) {
        return new JAXBElement<DomesticMarketTerritoryDetailsType>(_DomesticMarketTerritoryDetailsType_QNAME, DomesticMarketTerritoryDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SpecialEventType")
    public JAXBElement<SpecialEventType> createSpecialEventType(SpecialEventType value) {
        return new JAXBElement<SpecialEventType>(_SpecialEventType_QNAME, SpecialEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerMarketDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CustomerMarketDetails")
    public JAXBElement<CustomerMarketDetails> createCustomerMarketDetails(CustomerMarketDetails value) {
        return new JAXBElement<CustomerMarketDetails>(_CustomerMarketDetails_QNAME, CustomerMarketDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummarizedPastDueTypeForDetailedTrade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SummarizedPastDueTypeForDetailedTrade")
    public JAXBElement<SummarizedPastDueTypeForDetailedTrade> createSummarizedPastDueTypeForDetailedTrade(SummarizedPastDueTypeForDetailedTrade value) {
        return new JAXBElement<SummarizedPastDueTypeForDetailedTrade>(_SummarizedPastDueTypeForDetailedTrade_QNAME, SummarizedPastDueTypeForDetailedTrade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IndustryCodeType")
    public JAXBElement<IndustryCodeType> createIndustryCodeType(IndustryCodeType value) {
        return new JAXBElement<IndustryCodeType>(_IndustryCodeType_QNAME, IndustryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialStatement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialStatement")
    public JAXBElement<FinancialStatement> createFinancialStatement(FinancialStatement value) {
        return new JAXBElement<FinancialStatement>(_FinancialStatement_QNAME, FinancialStatement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanAccountPeriodSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LoanAccountPeriodSummaryType")
    public JAXBElement<LoanAccountPeriodSummaryType> createLoanAccountPeriodSummaryType(LoanAccountPeriodSummaryType value) {
        return new JAXBElement<LoanAccountPeriodSummaryType>(_LoanAccountPeriodSummaryType_QNAME, LoanAccountPeriodSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeExperiencePaymentSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TradeExperiencePaymentSummary")
    public JAXBElement<TradeExperiencePaymentSummary> createTradeExperiencePaymentSummary(TradeExperiencePaymentSummary value) {
        return new JAXBElement<TradeExperiencePaymentSummary>(_TradeExperiencePaymentSummary_QNAME, TradeExperiencePaymentSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Competitor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Competitor")
    public JAXBElement<Competitor> createCompetitor(Competitor value) {
        return new JAXBElement<Competitor>(_Competitor_QNAME, Competitor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraordinaryNetRevenue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ExtraordinaryNetRevenue")
    public JAXBElement<ExtraordinaryNetRevenue> createExtraordinaryNetRevenue(ExtraordinaryNetRevenue value) {
        return new JAXBElement<ExtraordinaryNetRevenue>(_ExtraordinaryNetRevenue_QNAME, ExtraordinaryNetRevenue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalEquity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GlobalEquity")
    public JAXBElement<GlobalEquity> createGlobalEquity(GlobalEquity value) {
        return new JAXBElement<GlobalEquity>(_GlobalEquity_QNAME, GlobalEquity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaserDerivedUnfavorablePayments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PurchaserDerivedUnfavorablePayments")
    public JAXBElement<PurchaserDerivedUnfavorablePayments> createPurchaserDerivedUnfavorablePayments(PurchaserDerivedUnfavorablePayments value) {
        return new JAXBElement<PurchaserDerivedUnfavorablePayments>(_PurchaserDerivedUnfavorablePayments_QNAME, PurchaserDerivedUnfavorablePayments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RetrieveProductResponse")
    public JAXBElement<RetrieveProductResponse> createRetrieveProductResponse(RetrieveProductResponse value) {
        return new JAXBElement<RetrieveProductResponse>(_RetrieveProductResponse_QNAME, RetrieveProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilingPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FilingPartyType")
    public JAXBElement<FilingPartyType> createFilingPartyType(FilingPartyType value) {
        return new JAXBElement<FilingPartyType>(_FilingPartyType_QNAME, FilingPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Activity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Activity")
    public JAXBElement<Activity> createActivity(Activity value) {
        return new JAXBElement<Activity>(_Activity_QNAME, Activity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrganizationDetail")
    public JAXBElement<OrganizationDetail> createOrganizationDetail(OrganizationDetail value) {
        return new JAXBElement<OrganizationDetail>(_OrganizationDetail_QNAME, OrganizationDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormerManagementResponsibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FormerManagementResponsibility")
    public JAXBElement<FormerManagementResponsibility> createFormerManagementResponsibility(FormerManagementResponsibility value) {
        return new JAXBElement<FormerManagementResponsibility>(_FormerManagementResponsibility_QNAME, FormerManagementResponsibility.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DNBDecodedStringType")
    public JAXBElement<DNBDecodedStringType> createDNBDecodedStringType(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_DNBDecodedStringType_QNAME, DNBDecodedStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkedOrganizationLocationSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LinkedOrganizationLocationSpecification")
    public JAXBElement<LinkedOrganizationLocationSpecification> createLinkedOrganizationLocationSpecification(LinkedOrganizationLocationSpecification value) {
        return new JAXBElement<LinkedOrganizationLocationSpecification>(_LinkedOrganizationLocationSpecification_QNAME, LinkedOrganizationLocationSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThirdPartyAssessment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ThirdPartyAssessment")
    public JAXBElement<ThirdPartyAssessment> createThirdPartyAssessment(ThirdPartyAssessment value) {
        return new JAXBElement<ThirdPartyAssessment>(_ThirdPartyAssessment_QNAME, ThirdPartyAssessment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasePositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BasePositionType")
    public JAXBElement<BasePositionType> createBasePositionType(BasePositionType value) {
        return new JAXBElement<BasePositionType>(_BasePositionType_QNAME, BasePositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JudgmentInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "JudgmentInformation")
    public JAXBElement<JudgmentInformation> createJudgmentInformation(JudgmentInformation value) {
        return new JAXBElement<JudgmentInformation>(_JudgmentInformation_QNAME, JudgmentInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkageSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LinkageSummary")
    public JAXBElement<LinkageSummary> createLinkageSummary(LinkageSummary value) {
        return new JAXBElement<LinkageSummary>(_LinkageSummary_QNAME, LinkageSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountFiguresDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AccountFiguresDetail")
    public JAXBElement<AccountFiguresDetail> createAccountFiguresDetail(AccountFiguresDetail value) {
        return new JAXBElement<AccountFiguresDetail>(_AccountFiguresDetail_QNAME, AccountFiguresDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTopicSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DataTopicSpecification")
    public JAXBElement<DataTopicSpecification> createDataTopicSpecification(DataTopicSpecification value) {
        return new JAXBElement<DataTopicSpecification>(_DataTopicSpecification_QNAME, DataTopicSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilingRolePlayerDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FilingRolePlayerDetails")
    public JAXBElement<FilingRolePlayerDetails> createFilingRolePlayerDetails(FilingRolePlayerDetails value) {
        return new JAXBElement<FilingRolePlayerDetails>(_FilingRolePlayerDetails_QNAME, FilingRolePlayerDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BankContactType")
    public JAXBElement<BankContactType> createBankContactType(BankContactType value) {
        return new JAXBElement<BankContactType>(_BankContactType_QNAME, BankContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancingStatementFiling }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancingStatementFiling")
    public JAXBElement<FinancingStatementFiling> createFinancingStatementFiling(FinancingStatementFiling value) {
        return new JAXBElement<FinancingStatementFiling>(_FinancingStatementFiling_QNAME, FinancingStatementFiling.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThirdPartyInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ThirdPartyInformation")
    public JAXBElement<ThirdPartyInformation> createThirdPartyInformation(ThirdPartyInformation value) {
        return new JAXBElement<ThirdPartyInformation>(_ThirdPartyInformation_QNAME, ThirdPartyInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrowerAnalytics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BorrowerAnalytics")
    public JAXBElement<BorrowerAnalytics> createBorrowerAnalytics(BorrowerAnalytics value) {
        return new JAXBElement<BorrowerAnalytics>(_BorrowerAnalytics_QNAME, BorrowerAnalytics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingStatusDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OperatingStatusDetail")
    public JAXBElement<OperatingStatusDetail> createOperatingStatusDetail(OperatingStatusDetail value) {
        return new JAXBElement<OperatingStatusDetail>(_OperatingStatusDetail_QNAME, OperatingStatusDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationRegisteredNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrganizationRegisteredNameType")
    public JAXBElement<OrganizationRegisteredNameType> createOrganizationRegisteredNameType(OrganizationRegisteredNameType value) {
        return new JAXBElement<OrganizationRegisteredNameType>(_OrganizationRegisteredNameType_QNAME, OrganizationRegisteredNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountHolderInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AccountHolderInformationType")
    public JAXBElement<AccountHolderInformationType> createAccountHolderInformationType(AccountHolderInformationType value) {
        return new JAXBElement<AccountHolderInformationType>(_AccountHolderInformationType_QNAME, AccountHolderInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicFilingHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PublicFilingHeaderType")
    public JAXBElement<PublicFilingHeaderType> createPublicFilingHeaderType(PublicFilingHeaderType value) {
        return new JAXBElement<PublicFilingHeaderType>(_PublicFilingHeaderType_QNAME, PublicFilingHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductResponseInquiryDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ProductResponseInquiryDetail")
    public JAXBElement<ProductResponseInquiryDetail> createProductResponseInquiryDetail(ProductResponseInquiryDetail value) {
        return new JAXBElement<ProductResponseInquiryDetail>(_ProductResponseInquiryDetail_QNAME, ProductResponseInquiryDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustryCodeDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IndustryCodeDescriptionType")
    public JAXBElement<IndustryCodeDescriptionType> createIndustryCodeDescriptionType(IndustryCodeDescriptionType value) {
        return new JAXBElement<IndustryCodeDescriptionType>(_IndustryCodeDescriptionType_QNAME, IndustryCodeDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisteredAddressNewType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RegisteredAddressNewType")
    public JAXBElement<RegisteredAddressNewType> createRegisteredAddressNewType(RegisteredAddressNewType value) {
        return new JAXBElement<RegisteredAddressNewType>(_RegisteredAddressNewType_QNAME, RegisteredAddressNewType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalEventSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LegalEventSummaryType")
    public JAXBElement<LegalEventSummaryType> createLegalEventSummaryType(LegalEventSummaryType value) {
        return new JAXBElement<LegalEventSummaryType>(_LegalEventSummaryType_QNAME, LegalEventSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialStatementExplanation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialStatementExplanation")
    public JAXBElement<FinancialStatementExplanation> createFinancialStatementExplanation(FinancialStatementExplanation value) {
        return new JAXBElement<FinancialStatementExplanation>(_FinancialStatementExplanation_QNAME, FinancialStatementExplanation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallDisadvantagedBusinessDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SmallDisadvantagedBusinessDetail")
    public JAXBElement<SmallDisadvantagedBusinessDetail> createSmallDisadvantagedBusinessDetail(SmallDisadvantagedBusinessDetail value) {
        return new JAXBElement<SmallDisadvantagedBusinessDetail>(_SmallDisadvantagedBusinessDetail_QNAME, SmallDisadvantagedBusinessDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectRecordDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectRecordDetail")
    public JAXBElement<SubjectRecordDetail> createSubjectRecordDetail(SubjectRecordDetail value) {
        return new JAXBElement<SubjectRecordDetail>(_SubjectRecordDetail_QNAME, SubjectRecordDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnclassifiedAccountSummaryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "UnclassifiedAccountSummaryDetailType")
    public JAXBElement<UnclassifiedAccountSummaryDetailType> createUnclassifiedAccountSummaryDetailType(UnclassifiedAccountSummaryDetailType value) {
        return new JAXBElement<UnclassifiedAccountSummaryDetailType>(_UnclassifiedAccountSummaryDetailType_QNAME, UnclassifiedAccountSummaryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentHistorySummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaymentHistorySummary")
    public JAXBElement<PaymentHistorySummary> createPaymentHistorySummary(PaymentHistorySummary value) {
        return new JAXBElement<PaymentHistorySummary>(_PaymentHistorySummary_QNAME, PaymentHistorySummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchQualityInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "MatchQualityInformation")
    public JAXBElement<MatchQualityInformation> createMatchQualityInformation(MatchQualityInformation value) {
        return new JAXBElement<MatchQualityInformation>(_MatchQualityInformation_QNAME, MatchQualityInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverallPaymentHistorySummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OverallPaymentHistorySummary")
    public JAXBElement<OverallPaymentHistorySummary> createOverallPaymentHistorySummary(OverallPaymentHistorySummary value) {
        return new JAXBElement<OverallPaymentHistorySummary>(_OverallPaymentHistorySummary_QNAME, OverallPaymentHistorySummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Association }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Association")
    public JAXBElement<Association> createAssociation(Association value) {
        return new JAXBElement<Association>(_Association_QNAME, Association.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrowthRateItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GrowthRateItem")
    public JAXBElement<GrowthRateItem> createGrowthRateItem(GrowthRateItem value) {
        return new JAXBElement<GrowthRateItem>(_GrowthRateItem_QNAME, GrowthRateItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuaranteeDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GuaranteeDetails")
    public JAXBElement<GuaranteeDetails> createGuaranteeDetails(GuaranteeDetails value) {
        return new JAXBElement<GuaranteeDetails>(_GuaranteeDetails_QNAME, GuaranteeDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilingDetailTextEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FilingDetailTextEntry")
    public JAXBElement<FilingDetailTextEntry> createFilingDetailTextEntry(FilingDetailTextEntry value) {
        return new JAXBElement<FilingDetailTextEntry>(_FilingDetailTextEntry_QNAME, FilingDetailTextEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpendCategorySummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SpendCategorySummaryType")
    public JAXBElement<SpendCategorySummaryType> createSpendCategorySummaryType(SpendCategorySummaryType value) {
        return new JAXBElement<SpendCategorySummaryType>(_SpendCategorySummaryType_QNAME, SpendCategorySummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DNBDateType")
    public JAXBElement<DNBDateType> createDNBDateType(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_DNBDateType_QNAME, DNBDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RolePlayerDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RolePlayerDetailsType")
    public JAXBElement<RolePlayerDetailsType> createRolePlayerDetailsType(RolePlayerDetailsType value) {
        return new JAXBElement<RolePlayerDetailsType>(_RolePlayerDetailsType_QNAME, RolePlayerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ExportDetailsType")
    public JAXBElement<ExportDetailsType> createExportDetailsType(ExportDetailsType value) {
        return new JAXBElement<ExportDetailsType>(_ExportDetailsType_QNAME, ExportDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierListInquiryDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierListInquiryDetail")
    public JAXBElement<SupplierListInquiryDetail> createSupplierListInquiryDetail(SupplierListInquiryDetail value) {
        return new JAXBElement<SupplierListInquiryDetail>(_SupplierListInquiryDetail_QNAME, SupplierListInquiryDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JudicialActionSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "JudicialActionSummaryType")
    public JAXBElement<JudicialActionSummaryType> createJudicialActionSummaryType(JudicialActionSummaryType value) {
        return new JAXBElement<JudicialActionSummaryType>(_JudicialActionSummaryType_QNAME, JudicialActionSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bank }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Bank")
    public JAXBElement<Bank> createBank(Bank value) {
        return new JAXBElement<Bank>(_Bank_QNAME, Bank.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JobTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "JobTitle")
    public JAXBElement<JobTitle> createJobTitle(JobTitle value) {
        return new JAXBElement<JobTitle>(_JobTitle_QNAME, JobTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationNumberStatusText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RegistrationNumberStatusText")
    public JAXBElement<RegistrationNumberStatusText> createRegistrationNumberStatusText(RegistrationNumberStatusText value) {
        return new JAXBElement<RegistrationNumberStatusText>(_RegistrationNumberStatusText_QNAME, RegistrationNumberStatusText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentsCountCycleSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaymentsCountCycleSummary")
    public JAXBElement<PaymentsCountCycleSummary> createPaymentsCountCycleSummary(PaymentsCountCycleSummary value) {
        return new JAXBElement<PaymentsCountCycleSummary>(_PaymentsCountCycleSummary_QNAME, PaymentsCountCycleSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustryCommercialCreditScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IndustryCommercialCreditScoreType")
    public JAXBElement<IndustryCommercialCreditScoreType> createIndustryCommercialCreditScoreType(IndustryCommercialCreditScoreType value) {
        return new JAXBElement<IndustryCommercialCreditScoreType>(_IndustryCommercialCreditScoreType_QNAME, IndustryCommercialCreditScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PremisesConstructionMaterialDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PremisesConstructionMaterialDetail")
    public JAXBElement<PremisesConstructionMaterialDetail> createPremisesConstructionMaterialDetail(PremisesConstructionMaterialDetail value) {
        return new JAXBElement<PremisesConstructionMaterialDetail>(_PremisesConstructionMaterialDetail_QNAME, PremisesConstructionMaterialDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalSanctionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PrincipalSanctionDetail")
    public JAXBElement<PrincipalSanctionDetail> createPrincipalSanctionDetail(PrincipalSanctionDetail value) {
        return new JAXBElement<PrincipalSanctionDetail>(_PrincipalSanctionDetail_QNAME, PrincipalSanctionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParentFinancialStatement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ParentFinancialStatement")
    public JAXBElement<ParentFinancialStatement> createParentFinancialStatement(ParentFinancialStatement value) {
        return new JAXBElement<ParentFinancialStatement>(_ParentFinancialStatement_QNAME, ParentFinancialStatement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterSupplierRequestDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RegisterSupplierRequestDetail")
    public JAXBElement<RegisterSupplierRequestDetail> createRegisterSupplierRequestDetail(RegisterSupplierRequestDetail value) {
        return new JAXBElement<RegisterSupplierRequestDetail>(_RegisterSupplierRequestDetail_QNAME, RegisterSupplierRequestDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RequestAddress")
    public JAXBElement<RequestAddress> createRequestAddress(RequestAddress value) {
        return new JAXBElement<RequestAddress>(_RequestAddress_QNAME, RequestAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseIndustryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ResponseIndustryCodeType")
    public JAXBElement<ResponseIndustryCodeType> createResponseIndustryCodeType(ResponseIndustryCodeType value) {
        return new JAXBElement<ResponseIndustryCodeType>(_ResponseIndustryCodeType_QNAME, ResponseIndustryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockTradingDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "StockTradingDetail")
    public JAXBElement<StockTradingDetail> createStockTradingDetail(StockTradingDetail value) {
        return new JAXBElement<StockTradingDetail>(_StockTradingDetail_QNAME, StockTradingDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DivisionDetail")
    public JAXBElement<DivisionDetail> createDivisionDetail(DivisionDetail value) {
        return new JAXBElement<DivisionDetail>(_DivisionDetail_QNAME, DivisionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatementItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "StatementItemType")
    public JAXBElement<StatementItemType> createStatementItemType(StatementItemType value) {
        return new JAXBElement<StatementItemType>(_StatementItemType_QNAME, StatementItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialRatiosIndustryNorms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialRatiosIndustryNorms")
    public JAXBElement<FinancialRatiosIndustryNorms> createFinancialRatiosIndustryNorms(FinancialRatiosIndustryNorms value) {
        return new JAXBElement<FinancialRatiosIndustryNorms>(_FinancialRatiosIndustryNorms_QNAME, FinancialRatiosIndustryNorms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LienInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LienInformation")
    public JAXBElement<LienInformation> createLienInformation(LienInformation value) {
        return new JAXBElement<LienInformation>(_LienInformation_QNAME, LienInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewsSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NewsSpecification")
    public JAXBElement<NewsSpecification> createNewsSpecification(NewsSpecification value) {
        return new JAXBElement<NewsSpecification>(_NewsSpecification_QNAME, NewsSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationThirdPartyAssessment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrganizationThirdPartyAssessment")
    public JAXBElement<OrganizationThirdPartyAssessment> createOrganizationThirdPartyAssessment(OrganizationThirdPartyAssessment value) {
        return new JAXBElement<OrganizationThirdPartyAssessment>(_OrganizationThirdPartyAssessment_QNAME, OrganizationThirdPartyAssessment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParentOrganizationForSpecialInvestigation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ParentOrganizationForSpecialInvestigation")
    public JAXBElement<ParentOrganizationForSpecialInvestigation> createParentOrganizationForSpecialInvestigation(ParentOrganizationForSpecialInvestigation value) {
        return new JAXBElement<ParentOrganizationForSpecialInvestigation>(_ParentOrganizationForSpecialInvestigation_QNAME, ParentOrganizationForSpecialInvestigation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaserDerivedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PurchaserDerivedData")
    public JAXBElement<PurchaserDerivedData> createPurchaserDerivedData(PurchaserDerivedData value) {
        return new JAXBElement<PurchaserDerivedData>(_PurchaserDerivedData_QNAME, PurchaserDerivedData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PremisesExternallUnitDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PremisesExternallUnitDetailType")
    public JAXBElement<PremisesExternallUnitDetailType> createPremisesExternallUnitDetailType(PremisesExternallUnitDetailType value) {
        return new JAXBElement<PremisesExternallUnitDetailType>(_PremisesExternallUnitDetailType_QNAME, PremisesExternallUnitDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderProductRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrderProductRequest")
    public JAXBElement<OrderProductRequest> createOrderProductRequest(OrderProductRequest value) {
        return new JAXBElement<OrderProductRequest>(_OrderProductRequest_QNAME, OrderProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBViabilityRatingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DNBViabilityRatingType")
    public JAXBElement<DNBViabilityRatingType> createDNBViabilityRatingType(DNBViabilityRatingType value) {
        return new JAXBElement<DNBViabilityRatingType>(_DNBViabilityRatingType_QNAME, DNBViabilityRatingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternetReferenceDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "InternetReferenceDetail")
    public JAXBElement<InternetReferenceDetail> createInternetReferenceDetail(InternetReferenceDetail value) {
        return new JAXBElement<InternetReferenceDetail>(_InternetReferenceDetail_QNAME, InternetReferenceDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebarmentsSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DebarmentsSummaryType")
    public JAXBElement<DebarmentsSummaryType> createDebarmentsSummaryType(DebarmentsSummaryType value) {
        return new JAXBElement<DebarmentsSummaryType>(_DebarmentsSummaryType_QNAME, DebarmentsSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerAccountSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CustomerAccountSummary")
    public JAXBElement<CustomerAccountSummary> createCustomerAccountSummary(CustomerAccountSummary value) {
        return new JAXBElement<CustomerAccountSummary>(_CustomerAccountSummary_QNAME, CustomerAccountSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierShareholderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierShareholderType")
    public JAXBElement<SupplierShareholderType> createSupplierShareholderType(SupplierShareholderType value) {
        return new JAXBElement<SupplierShareholderType>(_SupplierShareholderType_QNAME, SupplierShareholderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalOfPrincipalDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PrincipalOfPrincipalDetailsType")
    public JAXBElement<PrincipalOfPrincipalDetailsType> createPrincipalOfPrincipalDetailsType(PrincipalOfPrincipalDetailsType value) {
        return new JAXBElement<PrincipalOfPrincipalDetailsType>(_PrincipalOfPrincipalDetailsType_QNAME, PrincipalOfPrincipalDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PremisesDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PremisesDetail")
    public JAXBElement<PremisesDetail> createPremisesDetail(PremisesDetail value) {
        return new JAXBElement<PremisesDetail>(_PremisesDetail_QNAME, PremisesDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuitSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SuitSummaryType")
    public JAXBElement<SuitSummaryType> createSuitSummaryType(SuitSummaryType value) {
        return new JAXBElement<SuitSummaryType>(_SuitSummaryType_QNAME, SuitSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderProductRequestDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OrderProductRequestDetail")
    public JAXBElement<OrderProductRequestDetail> createOrderProductRequestDetail(OrderProductRequestDetail value) {
        return new JAXBElement<OrderProductRequestDetail>(_OrderProductRequestDetail_QNAME, OrderProductRequestDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NameSuffix")
    public JAXBElement<NameSuffix> createNameSuffix(NameSuffix value) {
        return new JAXBElement<NameSuffix>(_NameSuffix_QNAME, NameSuffix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadSupplierDocumentResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "UploadSupplierDocumentResponseDetail")
    public JAXBElement<UploadSupplierDocumentResponseDetail> createUploadSupplierDocumentResponseDetail(UploadSupplierDocumentResponseDetail value) {
        return new JAXBElement<UploadSupplierDocumentResponseDetail>(_UploadSupplierDocumentResponseDetail_QNAME, UploadSupplierDocumentResponseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormerRegisteredAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FormerRegisteredAddress")
    public JAXBElement<FormerRegisteredAddress> createFormerRegisteredAddress(FormerRegisteredAddress value) {
        return new JAXBElement<FormerRegisteredAddress>(_FormerRegisteredAddress_QNAME, FormerRegisteredAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorporateDirectorshipType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CorporateDirectorshipType")
    public JAXBElement<CorporateDirectorshipType> createCorporateDirectorshipType(CorporateDirectorshipType value) {
        return new JAXBElement<CorporateDirectorshipType>(_CorporateDirectorshipType_QNAME, CorporateDirectorshipType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierListRequestDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GetSupplierListRequestDetail")
    public JAXBElement<GetSupplierListRequestDetail> createGetSupplierListRequestDetail(GetSupplierListRequestDetail value) {
        return new JAXBElement<GetSupplierListRequestDetail>(_GetSupplierListRequestDetail_QNAME, GetSupplierListRequestDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancingDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancingDetails")
    public JAXBElement<FinancingDetails> createFinancingDetails(FinancingDetails value) {
        return new JAXBElement<FinancingDetails>(_FinancingDetails_QNAME, FinancingDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalLiabilities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GlobalLiabilities")
    public JAXBElement<GlobalLiabilities> createGlobalLiabilities(GlobalLiabilities value) {
        return new JAXBElement<GlobalLiabilities>(_GlobalLiabilities_QNAME, GlobalLiabilities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingNetRevenue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OperatingNetRevenue")
    public JAXBElement<OperatingNetRevenue> createOperatingNetRevenue(OperatingNetRevenue value) {
        return new JAXBElement<OperatingNetRevenue>(_OperatingNetRevenue_QNAME, OperatingNetRevenue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierName")
    public JAXBElement<SupplierName> createSupplierName(SupplierName value) {
        return new JAXBElement<SupplierName>(_SupplierName_QNAME, SupplierName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentLiabilities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CurrentLiabilities")
    public JAXBElement<CurrentLiabilities> createCurrentLiabilities(CurrentLiabilities value) {
        return new JAXBElement<CurrentLiabilities>(_CurrentLiabilities_QNAME, CurrentLiabilities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialMediaSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SocialMediaSpecification")
    public JAXBElement<SocialMediaSpecification> createSocialMediaSpecification(SocialMediaSpecification value) {
        return new JAXBElement<SocialMediaSpecification>(_SocialMediaSpecification_QNAME, SocialMediaSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeFigures }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "EmployeeFigures")
    public JAXBElement<EmployeeFigures> createEmployeeFigures(EmployeeFigures value) {
        return new JAXBElement<EmployeeFigures>(_EmployeeFigures_QNAME, EmployeeFigures.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsolvencyProcessinformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "InsolvencyProcessinformation")
    public JAXBElement<InsolvencyProcessinformation> createInsolvencyProcessinformation(InsolvencyProcessinformation value) {
        return new JAXBElement<InsolvencyProcessinformation>(_InsolvencyProcessinformation_QNAME, InsolvencyProcessinformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankruptcyInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BankruptcyInformation")
    public JAXBElement<BankruptcyInformation> createBankruptcyInformation(BankruptcyInformation value) {
        return new JAXBElement<BankruptcyInformation>(_BankruptcyInformation_QNAME, BankruptcyInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalLongTermAssets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GlobalLongTermAssets")
    public JAXBElement<GlobalLongTermAssets> createGlobalLongTermAssets(GlobalLongTermAssets value) {
        return new JAXBElement<GlobalLongTermAssets>(_GlobalLongTermAssets_QNAME, GlobalLongTermAssets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LawSuitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LawSuitType")
    public JAXBElement<LawSuitType> createLawSuitType(LawSuitType value) {
        return new JAXBElement<LawSuitType>(_LawSuitType_QNAME, LawSuitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PastDuePaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PastDuePaymentType")
    public JAXBElement<PastDuePaymentType> createPastDuePaymentType(PastDuePaymentType value) {
        return new JAXBElement<PastDuePaymentType>(_PastDuePaymentType_QNAME, PastDuePaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaydexScoreNorms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaydexScoreNorms")
    public JAXBElement<PaydexScoreNorms> createPaydexScoreNorms(PaydexScoreNorms value) {
        return new JAXBElement<PaydexScoreNorms>(_PaydexScoreNorms_QNAME, PaydexScoreNorms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "EmailAddressType")
    public JAXBElement<EmailAddressType> createEmailAddressType(EmailAddressType value) {
        return new JAXBElement<EmailAddressType>(_EmailAddressType_QNAME, EmailAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierStabilityIndexScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierStabilityIndexScoreType")
    public JAXBElement<SupplierStabilityIndexScoreType> createSupplierStabilityIndexScoreType(SupplierStabilityIndexScoreType value) {
        return new JAXBElement<SupplierStabilityIndexScoreType>(_SupplierStabilityIndexScoreType_QNAME, SupplierStabilityIndexScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworthReconciliation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NetworthReconciliation")
    public JAXBElement<NetworthReconciliation> createNetworthReconciliation(NetworthReconciliation value) {
        return new JAXBElement<NetworthReconciliation>(_NetworthReconciliation_QNAME, NetworthReconciliation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaymentHistory")
    public JAXBElement<PaymentHistory> createPaymentHistory(PaymentHistory value) {
        return new JAXBElement<PaymentHistory>(_PaymentHistory_QNAME, PaymentHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NormsIndustryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NormsIndustryCodeType")
    public JAXBElement<NormsIndustryCodeType> createNormsIndustryCodeType(NormsIndustryCodeType value) {
        return new JAXBElement<NormsIndustryCodeType>(_NormsIndustryCodeType_QNAME, NormsIndustryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ProductSpecification")
    public JAXBElement<ProductSpecification> createProductSpecification(ProductSpecification value) {
        return new JAXBElement<ProductSpecification>(_ProductSpecification_QNAME, ProductSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSufficiency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DataSufficiency")
    public JAXBElement<DataSufficiency> createDataSufficiency(DataSufficiency value) {
        return new JAXBElement<DataSufficiency>(_DataSufficiency_QNAME, DataSufficiency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpactedPremisesDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ImpactedPremisesDetailType")
    public JAXBElement<ImpactedPremisesDetailType> createImpactedPremisesDetailType(ImpactedPremisesDetailType value) {
        return new JAXBElement<ImpactedPremisesDetailType>(_ImpactedPremisesDetailType_QNAME, ImpactedPremisesDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Management }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Management")
    public JAXBElement<Management> createManagement(Management value) {
        return new JAXBElement<Management>(_Management_QNAME, Management.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestTransactionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RequestTransactionDetail")
    public JAXBElement<RequestTransactionDetail> createRequestTransactionDetail(RequestTransactionDetail value) {
        return new JAXBElement<RequestTransactionDetail>(_RequestTransactionDetail_QNAME, RequestTransactionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierAssessment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SupplierAssessment")
    public JAXBElement<SupplierAssessment> createSupplierAssessment(SupplierAssessment value) {
        return new JAXBElement<SupplierAssessment>(_SupplierAssessment_QNAME, SupplierAssessment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialAmountType")
    public JAXBElement<FinancialAmountType> createFinancialAmountType(FinancialAmountType value) {
        return new JAXBElement<FinancialAmountType>(_FinancialAmountType_QNAME, FinancialAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareholderSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ShareholderSpecification")
    public JAXBElement<ShareholderSpecification> createShareholderSpecification(ShareholderSpecification value) {
        return new JAXBElement<ShareholderSpecification>(_ShareholderSpecification_QNAME, ShareholderSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubDivisionDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubDivisionDetailType")
    public JAXBElement<SubDivisionDetailType> createSubDivisionDetailType(SubDivisionDetailType value) {
        return new JAXBElement<SubDivisionDetailType>(_SubDivisionDetailType_QNAME, SubDivisionDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Purchaser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Purchaser")
    public JAXBElement<Purchaser> createPurchaser(Purchaser value) {
        return new JAXBElement<Purchaser>(_Purchaser_QNAME, Purchaser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueueDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "QueueDetail")
    public JAXBElement<QueueDetail> createQueueDetail(QueueDetail value) {
        return new JAXBElement<QueueDetail>(_QueueDetail_QNAME, QueueDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearsInBusinessDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "YearsInBusinessDetail")
    public JAXBElement<YearsInBusinessDetail> createYearsInBusinessDetail(YearsInBusinessDetail value) {
        return new JAXBElement<YearsInBusinessDetail>(_YearsInBusinessDetail_QNAME, YearsInBusinessDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalLossPredictorScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TotalLossPredictorScoreType")
    public JAXBElement<TotalLossPredictorScoreType> createTotalLossPredictorScoreType(TotalLossPredictorScoreType value) {
        return new JAXBElement<TotalLossPredictorScoreType>(_TotalLossPredictorScoreType_QNAME, TotalLossPredictorScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Assessment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Assessment")
    public JAXBElement<Assessment> createAssessment(Assessment value) {
        return new JAXBElement<Assessment>(_Assessment_QNAME, Assessment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProvidedSubjectInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CustomerProvidedSubjectInformation")
    public JAXBElement<CustomerProvidedSubjectInformation> createCustomerProvidedSubjectInformation(CustomerProvidedSubjectInformation value) {
        return new JAXBElement<CustomerProvidedSubjectInformation>(_CustomerProvidedSubjectInformation_QNAME, CustomerProvidedSubjectInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LetterOfLiabilityInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LetterOfLiabilityInformation")
    public JAXBElement<LetterOfLiabilityInformation> createLetterOfLiabilityInformation(LetterOfLiabilityInformation value) {
        return new JAXBElement<LetterOfLiabilityInformation>(_LetterOfLiabilityInformation_QNAME, LetterOfLiabilityInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LettersOfCreditAccountPeriodSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LettersOfCreditAccountPeriodSummaryType")
    public JAXBElement<LettersOfCreditAccountPeriodSummaryType> createLettersOfCreditAccountPeriodSummaryType(LettersOfCreditAccountPeriodSummaryType value) {
        return new JAXBElement<LettersOfCreditAccountPeriodSummaryType>(_LettersOfCreditAccountPeriodSummaryType_QNAME, LettersOfCreditAccountPeriodSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ownership }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Ownership")
    public JAXBElement<Ownership> createOwnership(Ownership value) {
        return new JAXBElement<Ownership>(_Ownership_QNAME, Ownership.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommercialCreditScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CommercialCreditScoreType")
    public JAXBElement<CommercialCreditScoreType> createCommercialCreditScoreType(CommercialCreditScoreType value) {
        return new JAXBElement<CommercialCreditScoreType>(_CommercialCreditScoreType_QNAME, CommercialCreditScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectUsesAgentDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectUsesAgentDetailsType")
    public JAXBElement<SubjectUsesAgentDetailsType> createSubjectUsesAgentDetailsType(SubjectUsesAgentDetailsType value) {
        return new JAXBElement<SubjectUsesAgentDetailsType>(_SubjectUsesAgentDetailsType_QNAME, SubjectUsesAgentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollateralDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CollateralDetailType")
    public JAXBElement<CollateralDetailType> createCollateralDetailType(CollateralDetailType value) {
        return new JAXBElement<CollateralDetailType>(_CollateralDetailType_QNAME, CollateralDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SBFEScoreReasonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SBFEScoreReasonType")
    public JAXBElement<SBFEScoreReasonType> createSBFEScoreReasonType(SBFEScoreReasonType value) {
        return new JAXBElement<SBFEScoreReasonType>(_SBFEScoreReasonType_QNAME, SBFEScoreReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectAddressUsageFinancialItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectAddressUsageFinancialItemType")
    public JAXBElement<SubjectAddressUsageFinancialItemType> createSubjectAddressUsageFinancialItemType(SubjectAddressUsageFinancialItemType value) {
        return new JAXBElement<SubjectAddressUsageFinancialItemType>(_SubjectAddressUsageFinancialItemType_QNAME, SubjectAddressUsageFinancialItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriplePlayScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TriplePlayScoreType")
    public JAXBElement<TriplePlayScoreType> createTriplePlayScoreType(TriplePlayScoreType value) {
        return new JAXBElement<TriplePlayScoreType>(_TriplePlayScoreType_QNAME, TriplePlayScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecuredFilingsInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SecuredFilingsInformation")
    public JAXBElement<SecuredFilingsInformation> createSecuredFilingsInformation(SecuredFilingsInformation value) {
        return new JAXBElement<SecuredFilingsInformation>(_SecuredFilingsInformation_QNAME, SecuredFilingsInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAssetArticle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialAssetArticle")
    public JAXBElement<FinancialAssetArticle> createFinancialAssetArticle(FinancialAssetArticle value) {
        return new JAXBElement<FinancialAssetArticle>(_FinancialAssetArticle_QNAME, FinancialAssetArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Banking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Banking")
    public JAXBElement<Banking> createBanking(Banking value) {
        return new JAXBElement<Banking>(_Banking_QNAME, Banking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseBalanceSheetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BaseBalanceSheetType")
    public JAXBElement<BaseBalanceSheetType> createBaseBalanceSheetType(BaseBalanceSheetType value) {
        return new JAXBElement<BaseBalanceSheetType>(_BaseBalanceSheetType_QNAME, BaseBalanceSheetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DNBScore")
    public JAXBElement<DNBScore> createDNBScore(DNBScore value) {
        return new JAXBElement<DNBScore>(_DNBScore_QNAME, DNBScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalDetailForLinkage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PrincipalDetailForLinkage")
    public JAXBElement<PrincipalDetailForLinkage> createPrincipalDetailForLinkage(PrincipalDetailForLinkage value) {
        return new JAXBElement<PrincipalDetailForLinkage>(_PrincipalDetailForLinkage_QNAME, PrincipalDetailForLinkage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialMediaDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SocialMediaDetail")
    public JAXBElement<SocialMediaDetail> createSocialMediaDetail(SocialMediaDetail value) {
        return new JAXBElement<SocialMediaDetail>(_SocialMediaDetail_QNAME, SocialMediaDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportCountryDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ExportCountryDetails")
    public JAXBElement<ExportCountryDetails> createExportCountryDetails(ExportCountryDetails value) {
        return new JAXBElement<ExportCountryDetails>(_ExportCountryDetails_QNAME, ExportCountryDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockTradingInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "StockTradingInformation")
    public JAXBElement<StockTradingInformation> createStockTradingInformation(StockTradingInformation value) {
        return new JAXBElement<StockTradingInformation>(_StockTradingInformation_QNAME, StockTradingInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagementResponsibilityText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ManagementResponsibilityText")
    public JAXBElement<ManagementResponsibilityText> createManagementResponsibilityText(ManagementResponsibilityText value) {
        return new JAXBElement<ManagementResponsibilityText>(_ManagementResponsibilityText_QNAME, ManagementResponsibilityText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractsSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ContractsSummary")
    public JAXBElement<ContractsSummary> createContractsSummary(ContractsSummary value) {
        return new JAXBElement<ContractsSummary>(_ContractsSummary_QNAME, ContractsSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditDecisionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CreditDecisionDetail")
    public JAXBElement<CreditDecisionDetail> createCreditDecisionDetail(CreditDecisionDetail value) {
        return new JAXBElement<CreditDecisionDetail>(_CreditDecisionDetail_QNAME, CreditDecisionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AccountPayment")
    public JAXBElement<AccountPayment> createAccountPayment(AccountPayment value) {
        return new JAXBElement<AccountPayment>(_AccountPayment_QNAME, AccountPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmploymentBiography }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "EmploymentBiography")
    public JAXBElement<EmploymentBiography> createEmploymentBiography(EmploymentBiography value) {
        return new JAXBElement<EmploymentBiography>(_EmploymentBiography_QNAME, EmploymentBiography.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PastDueCycleSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PastDueCycleSummary")
    public JAXBElement<PastDueCycleSummary> createPastDueCycleSummary(PastDueCycleSummary value) {
        return new JAXBElement<PastDueCycleSummary>(_PastDueCycleSummary_QNAME, PastDueCycleSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisteredAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RegisteredAddressType")
    public JAXBElement<RegisteredAddressType> createRegisteredAddressType(RegisteredAddressType value) {
        return new JAXBElement<RegisteredAddressType>(_RegisteredAddressType_QNAME, RegisteredAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagementFinancialTrendData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ManagementFinancialTrendData")
    public JAXBElement<ManagementFinancialTrendData> createManagementFinancialTrendData(ManagementFinancialTrendData value) {
        return new JAXBElement<ManagementFinancialTrendData>(_ManagementFinancialTrendData_QNAME, ManagementFinancialTrendData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreNormNewType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ScoreNormNewType")
    public JAXBElement<ScoreNormNewType> createScoreNormNewType(ScoreNormNewType value) {
        return new JAXBElement<ScoreNormNewType>(_ScoreNormNewType_QNAME, ScoreNormNewType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilingOrganizationNameBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FilingOrganizationNameBaseType")
    public JAXBElement<FilingOrganizationNameBaseType> createFilingOrganizationNameBaseType(FilingOrganizationNameBaseType value) {
        return new JAXBElement<FilingOrganizationNameBaseType>(_FilingOrganizationNameBaseType_QNAME, FilingOrganizationNameBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectIdentificationNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubjectIdentificationNumberType")
    public JAXBElement<SubjectIdentificationNumberType> createSubjectIdentificationNumberType(SubjectIdentificationNumberType value) {
        return new JAXBElement<SubjectIdentificationNumberType>(_SubjectIdentificationNumberType_QNAME, SubjectIdentificationNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaserDerivedNetTermsPayments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PurchaserDerivedNetTermsPayments")
    public JAXBElement<PurchaserDerivedNetTermsPayments> createPurchaserDerivedNetTermsPayments(PurchaserDerivedNetTermsPayments value) {
        return new JAXBElement<PurchaserDerivedNetTermsPayments>(_PurchaserDerivedNetTermsPayments_QNAME, PurchaserDerivedNetTermsPayments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubChapterContentDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SubChapterContentDetail")
    public JAXBElement<SubChapterContentDetail> createSubChapterContentDetail(SubChapterContentDetail value) {
        return new JAXBElement<SubChapterContentDetail>(_SubChapterContentDetail_QNAME, SubChapterContentDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBStandardRatingTypeForPrincipal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "DNBStandardRatingTypeForPrincipal")
    public JAXBElement<DNBStandardRatingTypeForPrincipal> createDNBStandardRatingTypeForPrincipal(DNBStandardRatingTypeForPrincipal value) {
        return new JAXBElement<DNBStandardRatingTypeForPrincipal>(_DNBStandardRatingTypeForPrincipal_QNAME, DNBStandardRatingTypeForPrincipal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnclassifiedAccountPeriodSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "UnclassifiedAccountPeriodSummaryType")
    public JAXBElement<UnclassifiedAccountPeriodSummaryType> createUnclassifiedAccountPeriodSummaryType(UnclassifiedAccountPeriodSummaryType value) {
        return new JAXBElement<UnclassifiedAccountPeriodSummaryType>(_UnclassifiedAccountPeriodSummaryType_QNAME, UnclassifiedAccountPeriodSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditDecisionSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CreditDecisionSpecification")
    public JAXBElement<CreditDecisionSpecification> createCreditDecisionSpecification(CreditDecisionSpecification value) {
        return new JAXBElement<CreditDecisionSpecification>(_CreditDecisionSpecification_QNAME, CreditDecisionSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LitigationCourtDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LitigationCourtDetail")
    public JAXBElement<LitigationCourtDetail> createLitigationCourtDetail(LitigationCourtDetail value) {
        return new JAXBElement<LitigationCourtDetail>(_LitigationCourtDetail_QNAME, LitigationCourtDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FamilyTreeAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FamilyTreeAssociation")
    public JAXBElement<FamilyTreeAssociation> createFamilyTreeAssociation(FamilyTreeAssociation value) {
        return new JAXBElement<FamilyTreeAssociation>(_FamilyTreeAssociation_QNAME, FamilyTreeAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocioEconomicIdentification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SocioEconomicIdentification")
    public JAXBElement<SocioEconomicIdentification> createSocioEconomicIdentification(SocioEconomicIdentification value) {
        return new JAXBElement<SocioEconomicIdentification>(_SocioEconomicIdentification_QNAME, SocioEconomicIdentification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicNormType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GeographicNormType")
    public JAXBElement<GeographicNormType> createGeographicNormType(GeographicNormType value) {
        return new JAXBElement<GeographicNormType>(_GeographicNormType_QNAME, GeographicNormType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "TextEntry")
    public JAXBElement<TextEntry> createTextEntry(TextEntry value) {
        return new JAXBElement<TextEntry>(_TextEntry_QNAME, TextEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViabilityScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ViabilityScoreType")
    public JAXBElement<ViabilityScoreType> createViabilityScoreType(ViabilityScoreType value) {
        return new JAXBElement<ViabilityScoreType>(_ViabilityScoreType_QNAME, ViabilityScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UCCFilingSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "UCCFilingSummaryType")
    public JAXBElement<UCCFilingSummaryType> createUCCFilingSummaryType(UCCFilingSummaryType value) {
        return new JAXBElement<UCCFilingSummaryType>(_UCCFilingSummaryType_QNAME, UCCFilingSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMannerExperienceSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PaymentMannerExperienceSummaryType")
    public JAXBElement<PaymentMannerExperienceSummaryType> createPaymentMannerExperienceSummaryType(PaymentMannerExperienceSummaryType value) {
        return new JAXBElement<PaymentMannerExperienceSummaryType>(_PaymentMannerExperienceSummaryType_QNAME, PaymentMannerExperienceSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionForCorporateDirectorship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "PositionForCorporateDirectorship")
    public JAXBElement<PositionForCorporateDirectorship> createPositionForCorporateDirectorship(PositionForCorporateDirectorship value) {
        return new JAXBElement<PositionForCorporateDirectorship>(_PositionForCorporateDirectorship_QNAME, PositionForCorporateDirectorship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocioEconomicCharacteristicDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SocioEconomicCharacteristicDetail")
    public JAXBElement<SocioEconomicCharacteristicDetail> createSocioEconomicCharacteristicDetail(SocioEconomicCharacteristicDetail value) {
        return new JAXBElement<SocioEconomicCharacteristicDetail>(_SocioEconomicCharacteristicDetail_QNAME, SocioEconomicCharacteristicDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierRegistrationBatchStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GetSupplierRegistrationBatchStatusRequest")
    public JAXBElement<GetSupplierRegistrationBatchStatusRequest> createGetSupplierRegistrationBatchStatusRequest(GetSupplierRegistrationBatchStatusRequest value) {
        return new JAXBElement<GetSupplierRegistrationBatchStatusRequest>(_GetSupplierRegistrationBatchStatusRequest_QNAME, GetSupplierRegistrationBatchStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustryProfileDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IndustryProfileDetail")
    public JAXBElement<IndustryProfileDetail> createIndustryProfileDetail(IndustryProfileDetail value) {
        return new JAXBElement<IndustryProfileDetail>(_IndustryProfileDetail_QNAME, IndustryProfileDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Principal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Principal")
    public JAXBElement<Principal> createPrincipal(Principal value) {
        return new JAXBElement<Principal>(_Principal_QNAME, Principal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewsDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "NewsDetails")
    public JAXBElement<NewsDetails> createNewsDetails(NewsDetails value) {
        return new JAXBElement<NewsDetails>(_NewsDetails_QNAME, NewsDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThirdPartyAssessmentReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ThirdPartyAssessmentReason")
    public JAXBElement<ThirdPartyAssessmentReason> createThirdPartyAssessmentReason(ThirdPartyAssessmentReason value) {
        return new JAXBElement<ThirdPartyAssessmentReason>(_ThirdPartyAssessmentReason_QNAME, ThirdPartyAssessmentReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustryChapterDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "IndustryChapterDetail")
    public JAXBElement<IndustryChapterDetail> createIndustryChapterDetail(IndustryChapterDetail value) {
        return new JAXBElement<IndustryChapterDetail>(_IndustryChapterDetail_QNAME, IndustryChapterDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetArticleSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AssetArticleSummary")
    public JAXBElement<AssetArticleSummary> createAssetArticleSummary(AssetArticleSummary value) {
        return new JAXBElement<AssetArticleSummary>(_AssetArticleSummary_QNAME, AssetArticleSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Linkage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "Linkage")
    public JAXBElement<Linkage> createLinkage(Linkage value) {
        return new JAXBElement<Linkage>(_Linkage_QNAME, Linkage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SanctionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "SanctionDetail")
    public JAXBElement<SanctionDetail> createSanctionDetail(SanctionDetail value) {
        return new JAXBElement<SanctionDetail>(_SanctionDetail_QNAME, SanctionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ResultMessage")
    public JAXBElement<ResultMessage> createResultMessage(ResultMessage value) {
        return new JAXBElement<ResultMessage>(_ResultMessage_QNAME, ResultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountDetailsSectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "AccountDetailsSectionType")
    public JAXBElement<AccountDetailsSectionType> createAccountDetailsSectionType(AccountDetailsSectionType value) {
        return new JAXBElement<AccountDetailsSectionType>(_AccountDetailsSectionType_QNAME, AccountDetailsSectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatingOverrideReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "RatingOverrideReason")
    public JAXBElement<RatingOverrideReason> createRatingOverrideReason(RatingOverrideReason value) {
        return new JAXBElement<RatingOverrideReason>(_RatingOverrideReason_QNAME, RatingOverrideReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareCapitalDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ShareCapitalDetailsType")
    public JAXBElement<ShareCapitalDetailsType> createShareCapitalDetailsType(ShareCapitalDetailsType value) {
        return new JAXBElement<ShareCapitalDetailsType>(_ShareCapitalDetailsType_QNAME, ShareCapitalDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalUltimateOrganizationForSupplier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "GlobalUltimateOrganizationForSupplier")
    public JAXBElement<GlobalUltimateOrganizationForSupplier> createGlobalUltimateOrganizationForSupplier(GlobalUltimateOrganizationForSupplier value) {
        return new JAXBElement<GlobalUltimateOrganizationForSupplier>(_GlobalUltimateOrganizationForSupplier_QNAME, GlobalUltimateOrganizationForSupplier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LegalEvents")
    public JAXBElement<LegalEvents> createLegalEvents(LegalEvents value) {
        return new JAXBElement<LegalEvents>(_LegalEvents_QNAME, LegalEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProvidedSubjectNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CustomerProvidedSubjectNameType")
    public JAXBElement<CustomerProvidedSubjectNameType> createCustomerProvidedSubjectNameType(CustomerProvidedSubjectNameType value) {
        return new JAXBElement<CustomerProvidedSubjectNameType>(_CustomerProvidedSubjectNameType_QNAME, CustomerProvidedSubjectNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComparedToFinancialStatementHeaderForGrowthRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ComparedToFinancialStatementHeaderForGrowthRate")
    public JAXBElement<ComparedToFinancialStatementHeaderForGrowthRate> createComparedToFinancialStatementHeaderForGrowthRate(ComparedToFinancialStatementHeaderForGrowthRate value) {
        return new JAXBElement<ComparedToFinancialStatementHeaderForGrowthRate>(_ComparedToFinancialStatementHeaderForGrowthRate_QNAME, ComparedToFinancialStatementHeaderForGrowthRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanySanctionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "CompanySanctionDetail")
    public JAXBElement<CompanySanctionDetail> createCompanySanctionDetail(CompanySanctionDetail value) {
        return new JAXBElement<CompanySanctionDetail>(_CompanySanctionDetail_QNAME, CompanySanctionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanAccountSummaryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "LoanAccountSummaryDetailType")
    public JAXBElement<LoanAccountSummaryDetailType> createLoanAccountSummaryDetailType(LoanAccountSummaryDetailType value) {
        return new JAXBElement<LoanAccountSummaryDetailType>(_LoanAccountSummaryDetailType_QNAME, LoanAccountSummaryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenEndedCreditLineAccountPeriodSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "OpenEndedCreditLineAccountPeriodSummaryType")
    public JAXBElement<OpenEndedCreditLineAccountPeriodSummaryType> createOpenEndedCreditLineAccountPeriodSummaryType(OpenEndedCreditLineAccountPeriodSummaryType value) {
        return new JAXBElement<OpenEndedCreditLineAccountPeriodSummaryType>(_OpenEndedCreditLineAccountPeriodSummaryType_QNAME, OpenEndedCreditLineAccountPeriodSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "BaseAddressType")
    public JAXBElement<BaseAddressType> createBaseAddressType(BaseAddressType value) {
        return new JAXBElement<BaseAddressType>(_BaseAddressType_QNAME, BaseAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAccountPeriodSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "FinancialAccountPeriodSummaryType")
    public JAXBElement<FinancialAccountPeriodSummaryType> createFinancialAccountPeriodSummaryType(FinancialAccountPeriodSummaryType value) {
        return new JAXBElement<FinancialAccountPeriodSummaryType>(_FinancialAccountPeriodSummaryType_QNAME, FinancialAccountPeriodSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivitiesAndOperations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dnb.com/CustomProductServiceV2.0", name = "ActivitiesAndOperations")
    public JAXBElement<ActivitiesAndOperations> createActivitiesAndOperations(ActivitiesAndOperations value) {
        return new JAXBElement<ActivitiesAndOperations>(_ActivitiesAndOperations_QNAME, ActivitiesAndOperations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalAvailableCreditAmount", scope = AccountSummaryType.class)
    public JAXBElement<AmountType> createAccountSummaryTypeTotalAvailableCreditAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountSummaryTypeTotalAvailableCreditAmount_QNAME, AmountType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalCurrentCreditLineAmount", scope = AccountSummaryType.class)
    public JAXBElement<AmountType> createAccountSummaryTypeTotalCurrentCreditLineAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountSummaryTypeTotalCurrentCreditLineAmount_QNAME, AmountType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalCurrentBalanceAmount", scope = AccountSummaryType.class)
    public JAXBElement<AmountType> createAccountSummaryTypeTotalCurrentBalanceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountSummaryTypeTotalCurrentBalanceAmount_QNAME, AmountType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalBalloonAmount", scope = AccountSummaryType.class)
    public JAXBElement<AmountType> createAccountSummaryTypeTotalBalloonAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountSummaryTypeTotalBalloonAmount_QNAME, AmountType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PastDuePercentage", scope = PastDuePercentageCycleSummary.class)
    public JAXBElement<BigDecimal> createPastDuePercentageCycleSummaryPastDuePercentage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastDuePercentageCycleSummaryPastDuePercentage_QNAME, BigDecimal.class, PastDuePercentageCycleSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HighBalanceAmount", scope = AccountDetail.class)
    public JAXBElement<AmountType> createAccountDetailHighBalanceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountDetailHighBalanceAmount_QNAME, AmountType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderID", scope = AccountDetail.class)
    public JAXBElement<Integer> createAccountDetailLenderID(Integer value) {
        return new JAXBElement<Integer>(_AccountDetailLenderID_QNAME, Integer.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderName", scope = AccountDetail.class)
    public JAXBElement<String> createAccountDetailLenderName(String value) {
        return new JAXBElement<String>(_AccountDetailLenderName_QNAME, String.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AvailableCreditAmount", scope = AccountDetail.class)
    public JAXBElement<AmountType> createAccountDetailAvailableCreditAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountDetailAvailableCreditAmount_QNAME, AmountType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastPaymentDate", scope = AccountDetail.class)
    public JAXBElement<DNBDateType> createAccountDetailLastPaymentDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailLastPaymentDate_QNAME, DNBDateType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaturityDate", scope = AccountDetail.class)
    public JAXBElement<DNBDateType> createAccountDetailMaturityDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailMaturityDate_QNAME, DNBDateType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentReportedDate", scope = AccountDetail.class)
    public JAXBElement<DNBDateType> createAccountDetailPaymentReportedDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailPaymentReportedDate_QNAME, DNBDateType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OriginalAmount", scope = AccountDetail.class)
    public JAXBElement<AmountType> createAccountDetailOriginalAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountDetailOriginalAmount_QNAME, AmountType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OpenedDate", scope = AccountDetail.class)
    public JAXBElement<DNBDateType> createAccountDetailOpenedDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailOpenedDate_QNAME, DNBDateType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BalloonAmount", scope = AccountDetail.class)
    public JAXBElement<AmountType> createAccountDetailBalloonAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountDetailBalloonAmount_QNAME, AmountType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentTypeText", scope = AccountDetail.class)
    public JAXBElement<DNBDecodedStringType> createAccountDetailPaymentTypeText(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_AccountDetailPaymentTypeText_QNAME, DNBDecodedStringType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AccountRelationshipText", scope = AccountDetail.class)
    public JAXBElement<DNBDecodedStringType> createAccountDetailAccountRelationshipText(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_AccountDetailAccountRelationshipText_QNAME, DNBDecodedStringType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VoluntarilyClosedIndicator", scope = AccountDetail.class)
    public JAXBElement<Boolean> createAccountDetailVoluntarilyClosedIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_AccountDetailVoluntarilyClosedIndicator_QNAME, Boolean.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BalloonPaymentDate", scope = AccountDetail.class)
    public JAXBElement<DNBDateType> createAccountDetailBalloonPaymentDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailBalloonPaymentDate_QNAME, DNBDateType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OpenAccountIndicator", scope = AccountDetail.class)
    public JAXBElement<Boolean> createAccountDetailOpenAccountIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_AccountDetailOpenAccountIndicator_QNAME, Boolean.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CurrentCreditLineAmount", scope = AccountDetail.class)
    public JAXBElement<AmountType> createAccountDetailCurrentCreditLineAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountDetailCurrentCreditLineAmount_QNAME, AmountType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ClosedDate", scope = AccountDetail.class)
    public JAXBElement<DNBDateType> createAccountDetailClosedDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailClosedDate_QNAME, DNBDateType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SecuredAccountIndicator", scope = AccountDetail.class)
    public JAXBElement<Boolean> createAccountDetailSecuredAccountIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_AccountDetailSecuredAccountIndicator_QNAME, Boolean.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CurrentBalanceAmount", scope = AccountDetail.class)
    public JAXBElement<AmountType> createAccountDetailCurrentBalanceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountDetailCurrentBalanceAmount_QNAME, AmountType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CollateralTypeText", scope = AccountDetail.class)
    public JAXBElement<DNBDecodedStringType> createAccountDetailCollateralTypeText(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_AccountDetailCollateralTypeText_QNAME, DNBDecodedStringType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentFrequencyText", scope = AccountDetail.class)
    public JAXBElement<DNBDecodedStringType> createAccountDetailPaymentFrequencyText(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_AccountDetailPaymentFrequencyText_QNAME, DNBDecodedStringType.class, AccountDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPastDueAmount", scope = OverallSummary.class)
    public JAXBElement<AmountType> createOverallSummaryTotalPastDueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OverallSummaryTotalPastDueAmount_QNAME, AmountType.class, OverallSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalMinimumPaymentAmount", scope = OverallSummary.class)
    public JAXBElement<AmountType> createOverallSummaryTotalMinimumPaymentAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OverallSummaryTotalMinimumPaymentAmount_QNAME, AmountType.class, OverallSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalCurrentDueAmount", scope = OverallSummary.class)
    public JAXBElement<AmountType> createOverallSummaryTotalCurrentDueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OverallSummaryTotalCurrentDueAmount_QNAME, AmountType.class, OverallSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalCurrentBalanceAmount", scope = OverallSummary.class)
    public JAXBElement<AmountType> createOverallSummaryTotalCurrentBalanceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountSummaryTypeTotalCurrentBalanceAmount_QNAME, AmountType.class, OverallSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderID", scope = MiscellaneousDetails.class)
    public JAXBElement<Integer> createMiscellaneousDetailsLenderID(Integer value) {
        return new JAXBElement<Integer>(_AccountDetailLenderID_QNAME, Integer.class, MiscellaneousDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderName", scope = MiscellaneousDetails.class)
    public JAXBElement<String> createMiscellaneousDetailsLenderName(String value) {
        return new JAXBElement<String>(_AccountDetailLenderName_QNAME, String.class, MiscellaneousDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CommentText", scope = MiscellaneousDetails.class)
    public JAXBElement<String> createMiscellaneousDetailsCommentText(String value) {
        return new JAXBElement<String>(_MiscellaneousDetailsCommentText_QNAME, String.class, MiscellaneousDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentReportedDate", scope = MiscellaneousDetails.class)
    public JAXBElement<DNBDateType> createMiscellaneousDetailsPaymentReportedDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailPaymentReportedDate_QNAME, DNBDateType.class, MiscellaneousDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderID", scope = GuaranteeDetails.class)
    public JAXBElement<Integer> createGuaranteeDetailsLenderID(Integer value) {
        return new JAXBElement<Integer>(_AccountDetailLenderID_QNAME, Integer.class, GuaranteeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderName", scope = GuaranteeDetails.class)
    public JAXBElement<String> createGuaranteeDetailsLenderName(String value) {
        return new JAXBElement<String>(_AccountDetailLenderName_QNAME, String.class, GuaranteeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GuaranteedPaymentIndicator", scope = GuaranteeDetails.class)
    public JAXBElement<Boolean> createGuaranteeDetailsGuaranteedPaymentIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_GuaranteeDetailsGuaranteedPaymentIndicator_QNAME, Boolean.class, GuaranteeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AccountTypeText", scope = GuaranteeDetails.class)
    public JAXBElement<DNBDecodedStringType> createGuaranteeDetailsAccountTypeText(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_GuaranteeDetailsAccountTypeText_QNAME, DNBDecodedStringType.class, GuaranteeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GuarantorsCount", scope = GuaranteeDetails.class)
    public JAXBElement<Integer> createGuaranteeDetailsGuarantorsCount(Integer value) {
        return new JAXBElement<Integer>(_GuaranteeDetailsGuarantorsCount_QNAME, Integer.class, GuaranteeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentReportedDate", scope = GuaranteeDetails.class)
    public JAXBElement<DNBDateType> createGuaranteeDetailsPaymentReportedDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailPaymentReportedDate_QNAME, DNBDateType.class, GuaranteeDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderID", scope = CurrentPayment.class)
    public JAXBElement<Integer> createCurrentPaymentLenderID(Integer value) {
        return new JAXBElement<Integer>(_AccountDetailLenderID_QNAME, Integer.class, CurrentPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderName", scope = CurrentPayment.class)
    public JAXBElement<String> createCurrentPaymentLenderName(String value) {
        return new JAXBElement<String>(_AccountDetailLenderName_QNAME, String.class, CurrentPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPastDueAmount", scope = CurrentPayment.class)
    public JAXBElement<AmountType> createCurrentPaymentTotalPastDueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OverallSummaryTotalPastDueAmount_QNAME, AmountType.class, CurrentPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CurrentBalanceAmount", scope = CurrentPayment.class)
    public JAXBElement<AmountType> createCurrentPaymentCurrentBalanceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountDetailCurrentBalanceAmount_QNAME, AmountType.class, CurrentPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CurrentDueAmount", scope = CurrentPayment.class)
    public JAXBElement<AmountType> createCurrentPaymentCurrentDueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_CurrentPaymentCurrentDueAmount_QNAME, AmountType.class, CurrentPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentReportedDate", scope = CurrentPayment.class)
    public JAXBElement<DNBDateType> createCurrentPaymentPaymentReportedDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailPaymentReportedDate_QNAME, DNBDateType.class, CurrentPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MinimumPaymentAmount", scope = CurrentPayment.class)
    public JAXBElement<AmountType> createCurrentPaymentMinimumPaymentAmount(AmountType value) {
        return new JAXBElement<AmountType>(_CurrentPaymentMinimumPaymentAmount_QNAME, AmountType.class, CurrentPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalNumberOfPaymentsPeriod", scope = PaymentHistorySummary.class)
    public JAXBElement<Duration> createPaymentHistorySummaryTotalNumberOfPaymentsPeriod(Duration value) {
        return new JAXBElement<Duration>(_PaymentHistorySummaryTotalNumberOfPaymentsPeriod_QNAME, Duration.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ExperiencesTotalCount", scope = PaymentHistorySummary.class)
    public JAXBElement<Integer> createPaymentHistorySummaryExperiencesTotalCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentHistorySummaryExperiencesTotalCount_QNAME, Integer.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPaymentsCount", scope = PaymentHistorySummary.class)
    public JAXBElement<Integer> createPaymentHistorySummaryTotalPaymentsCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentHistorySummaryTotalPaymentsCount_QNAME, Integer.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentPeriod", scope = PaymentHistorySummary.class)
    public JAXBElement<Duration> createPaymentHistorySummaryPaymentPeriod(Duration value) {
        return new JAXBElement<Duration>(_PaymentHistorySummaryPaymentPeriod_QNAME, Duration.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalOnTimePaymentsCount", scope = PaymentHistorySummary.class)
    public JAXBElement<Integer> createPaymentHistorySummaryTotalOnTimePaymentsCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentHistorySummaryTotalOnTimePaymentsCount_QNAME, Integer.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentWithinTermsCount", scope = PaymentHistorySummary.class)
    public JAXBElement<Integer> createPaymentHistorySummaryPaymentWithinTermsCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentHistorySummaryPaymentWithinTermsCount_QNAME, Integer.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalChargeOffAmount", scope = PaymentHistorySummary.class)
    public JAXBElement<AmountType> createPaymentHistorySummaryTotalChargeOffAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PaymentHistorySummaryTotalChargeOffAmount_QNAME, AmountType.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalChargeOffRecoveredAmount", scope = PaymentHistorySummary.class)
    public JAXBElement<AmountType> createPaymentHistorySummaryTotalChargeOffRecoveredAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PaymentHistorySummaryTotalChargeOffRecoveredAmount_QNAME, AmountType.class, PaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PastDuePaymentCount", scope = PaymentsCountCycleSummary.class)
    public JAXBElement<Integer> createPaymentsCountCycleSummaryPastDuePaymentCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentsCountCycleSummaryPastDuePaymentCount_QNAME, Integer.class, PaymentsCountCycleSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GovernmentGuaranteedProgramTypeText", scope = GuarantorDetails.class)
    public JAXBElement<DNBDecodedStringType> createGuarantorDetailsGovernmentGuaranteedProgramTypeText(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_GuarantorDetailsGovernmentGuaranteedProgramTypeText_QNAME, DNBDecodedStringType.class, GuarantorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OwnershipPercentage", scope = GuarantorDetails.class)
    public JAXBElement<BigDecimal> createGuarantorDetailsOwnershipPercentage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GuarantorDetailsOwnershipPercentage_QNAME, BigDecimal.class, GuarantorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GuarantorTypeText", scope = GuarantorDetails.class)
    public JAXBElement<DNBDecodedStringType> createGuarantorDetailsGuarantorTypeText(DNBDecodedStringType value) {
        return new JAXBElement<DNBDecodedStringType>(_GuarantorDetailsGuarantorTypeText_QNAME, DNBDecodedStringType.class, GuarantorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GuaranteePercentage", scope = GuarantorDetails.class)
    public JAXBElement<BigDecimal> createGuarantorDetailsGuaranteePercentage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GuarantorDetailsGuaranteePercentage_QNAME, BigDecimal.class, GuarantorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GuarantorName", scope = GuarantorDetails.class)
    public JAXBElement<String> createGuarantorDetailsGuarantorName(String value) {
        return new JAXBElement<String>(_GuarantorDetailsGuarantorName_QNAME, String.class, GuarantorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OnTimePaymentsPercentage", scope = OverallPaymentHistorySummary.class)
    public JAXBElement<BigDecimal> createOverallPaymentHistorySummaryOnTimePaymentsPercentage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OverallPaymentHistorySummaryOnTimePaymentsPercentage_QNAME, BigDecimal.class, OverallPaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalChargeOffPaymentsCount", scope = OverallPaymentHistorySummary.class)
    public JAXBElement<Integer> createOverallPaymentHistorySummaryTotalChargeOffPaymentsCount(Integer value) {
        return new JAXBElement<Integer>(_OverallPaymentHistorySummaryTotalChargeOffPaymentsCount_QNAME, Integer.class, OverallPaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPaymentsCount", scope = OverallPaymentHistorySummary.class)
    public JAXBElement<Integer> createOverallPaymentHistorySummaryTotalPaymentsCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentHistorySummaryTotalPaymentsCount_QNAME, Integer.class, OverallPaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalChargeOffAmount", scope = OverallPaymentHistorySummary.class)
    public JAXBElement<AmountType> createOverallPaymentHistorySummaryTotalChargeOffAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PaymentHistorySummaryTotalChargeOffAmount_QNAME, AmountType.class, OverallPaymentHistorySummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChargeOffDate", scope = PaymentHistory.class)
    public JAXBElement<DNBDateType> createPaymentHistoryChargeOffDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_PaymentHistoryChargeOffDate_QNAME, DNBDateType.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentHistoryPattern", scope = PaymentHistory.class)
    public JAXBElement<String> createPaymentHistoryPaymentHistoryPattern(String value) {
        return new JAXBElement<String>(_PaymentHistoryPaymentHistoryPattern_QNAME, String.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderID", scope = PaymentHistory.class)
    public JAXBElement<Integer> createPaymentHistoryLenderID(Integer value) {
        return new JAXBElement<Integer>(_AccountDetailLenderID_QNAME, Integer.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OnTimePaymentsCount", scope = PaymentHistory.class)
    public JAXBElement<Integer> createPaymentHistoryOnTimePaymentsCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentHistoryOnTimePaymentsCount_QNAME, Integer.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LenderName", scope = PaymentHistory.class)
    public JAXBElement<String> createPaymentHistoryLenderName(String value) {
        return new JAXBElement<String>(_AccountDetailLenderName_QNAME, String.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChargeOffAmount", scope = PaymentHistory.class)
    public JAXBElement<AmountType> createPaymentHistoryChargeOffAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PaymentHistoryChargeOffAmount_QNAME, AmountType.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfPaymentsPeriod", scope = PaymentHistory.class)
    public JAXBElement<Duration> createPaymentHistoryNumberOfPaymentsPeriod(Duration value) {
        return new JAXBElement<Duration>(_PaymentHistoryNumberOfPaymentsPeriod_QNAME, Duration.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPaymentsCount", scope = PaymentHistory.class)
    public JAXBElement<Integer> createPaymentHistoryTotalPaymentsCount(Integer value) {
        return new JAXBElement<Integer>(_PaymentHistorySummaryTotalPaymentsCount_QNAME, Integer.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChargeOffRecoveredAmount", scope = PaymentHistory.class)
    public JAXBElement<AmountType> createPaymentHistoryChargeOffRecoveredAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PaymentHistoryChargeOffRecoveredAmount_QNAME, AmountType.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentReportedDate", scope = PaymentHistory.class)
    public JAXBElement<DNBDateType> createPaymentHistoryPaymentReportedDate(DNBDateType value) {
        return new JAXBElement<DNBDateType>(_AccountDetailPaymentReportedDate_QNAME, DNBDateType.class, PaymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PastDueAmount", scope = PastDueCycleSummary.class)
    public JAXBElement<AmountType> createPastDueCycleSummaryPastDueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PastDueCycleSummaryPastDueAmount_QNAME, AmountType.class, PastDueCycleSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPastDueAmount", scope = TotalPastDueCycleSummary.class)
    public JAXBElement<AmountType> createTotalPastDueCycleSummaryTotalPastDueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OverallSummaryTotalPastDueAmount_QNAME, AmountType.class, TotalPastDueCycleSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPastDuePaymentCount", scope = TotalPaymentsCountCycleSummary.class)
    public JAXBElement<Integer> createTotalPaymentsCountCycleSummaryTotalPastDuePaymentCount(Integer value) {
        return new JAXBElement<Integer>(_TotalPaymentsCountCycleSummaryTotalPastDuePaymentCount_QNAME, Integer.class, TotalPaymentsCountCycleSummary.class, value);
    }

}
