# dun-and-bradstreet-component
Dun &amp; Bradstreet component for elastic.io platform

## Description
Component exposes Dun &amp; Bradstreet API.

## Credentials
Access to the D&B Direct web services are secured by a **Username** and **Password** combination. D&B will issue your organization a production username upon completion of the contract establishment process. This username will be sent to the email address designated on the contract, along with instructions for setting up the password. This process will also be followed for production trial requests.
 
## Actions
### Match
On-Demand Entity Identification. Also known as Match. 

Request JSON schema `schemas/json/CompanyService/Match.in.json`

### Find Competitors
Returns all the competitors for a given company. 

Request JSON schema `schemas/json/EntityList/FindCompetitor.in.json`

## Triggers
No triggers.
## Dun &amp; Bradstreet API links
[Dun &amp; Bradstreet documentation](https://docs.dnb.com/direct/2.0/en-US/quick-soap-API)

[Match Request documentation](https://docs.dnb.com/direct/2.0/en-US/company/latest/match/soap-API#FeatureRequest)
