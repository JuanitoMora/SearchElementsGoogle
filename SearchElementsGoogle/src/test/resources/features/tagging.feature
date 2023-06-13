@funtionalTest
Feature: Free CRM appplication Testing

@SmokeTest @IntegrationTest
  Scenario: Create a username on sing up
    Given This is case singup test
    
@IntegrationTest @End2EndTest
  Scenario: Login with a user and password valid
    Given This is case valid credential test

@SmokeTest
  Scenario: Add new contact 
    Given This is case contact test

@IntegrationTest
  Scenario: Add new company 
    Given This is case company test

@IntegrationTest
  Scenario: Add new deal 
    Given This is case deal test

@SmokeTest @End2End
  Scenario: Add new task 
    Given This is case task test

@IntegrationTest @End2EndTest
  Scenario: Add new case 
    Given This is case case test

@IntegrationTest
  Scenario: Add new call 
    Given This is case call test
    
@End2End
  Scenario: Add new document 
    Given This is case document test

@SmokeTest
  Scenario: Add new form 
    Given This is case form test
    
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
