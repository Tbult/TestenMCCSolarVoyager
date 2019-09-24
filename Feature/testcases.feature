# cucumber feature file written in Gherkin

@tag1
Feature: View website with placeholders

Scenario: Succesful view the website with placeholders
Given User is on web page
When User sees a table and two graphs
Then User close web page