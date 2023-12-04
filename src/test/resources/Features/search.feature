@sanity
@regression
Feature: Search
Scenario Outline: search with a search data
Given I am in home page
When I search with valid data "<search data>"
Then I should see "<results>"
Examples:
|search data|results|
|pizza|https://dev.xxlhoreca.com/search?search=pizza|
|oven|https://dev.xxlhoreca.com/search?search=oven|
|hendi|https://dev.xxlhoreca.com/search?search=hendi|
|1020876|https://dev.xxlhoreca.com/search?search=1020876|