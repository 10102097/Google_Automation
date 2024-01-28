# Selenium Java Google Search Automation

This project demonstrates basic automation using Selenium WebDriver with Java for performing Google searches with different scenarios.

## Prerequisites

- Java Development Kit (JDK) installed.
- IntelliJ IDEA installed.
- Chrome browser installed.
- Internet connection.

## Clone the Repository


import the Project into IntelliJ IDEA
Open IntelliJ IDEA.
Click on "File" > "New" > "Project from Existing Sources..."
Navigate to the cloned repository and select the pom.xml file.
Choose "Maven" when prompted for project type.
Set Up WebDriverManager
Ensure that the WebDriverManager dependency is resolved. If not, right-click on the project, select "Maven" > "Reload Project."

Run the Tests
Open SearchingInGoogle.java in src/main/java/org.example package.
Locate the main method inside the GoogleSearchTest class.
Right-click inside the main method and choose "Run GoogleSearchTest.main()".

Test Cases
Test Case 1: Basic Search
This test performs a basic search for the term "chefaa."
Test Case 2: Non-English Language Search
This test performs a search in a non-English language using the term "サッカーワールドカップ."
Test Case 3: Numeric Search
This test performs a numeric search for the term "2024 Olympics."
Test Case 4: Special Characters Search Results
This test performs a search with special characters using the term "@yahoo."
Test Case 5: Public Figure Search Results
This test searches for information about the public figure "Ahmed Zewail."
Notes
Adjust sleep times as needed for your system and network conditions.
Ensure that WebDriverManager downloads the correct ChromeDriver version.
Author
10102097

License
This project is licensed under the MIT License - see the LICENSE.md file for details.
