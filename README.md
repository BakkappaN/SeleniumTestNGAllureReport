# Selenium TestNG Allure Report

Official website - https://docs.qameta.io/allure/#_installing_a_commandline

## Step1: Download "allure-commandline-2.17.3.zip" from below url   
https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/2.17.3/

## Step2: Set system environment variables for bin folder

## Step3: Verify installation using cmd prompt, enter "allure --version" in cmd.
version must be displayed

## Step4: Create Maven project

## Step5: Add below maven dependency
  <!-- https://mvnrepository.com/artifact/io.qameta.allure/allure-testng -->
      <dependency>
        <groupId>io.qameta.allure</groupId>
        <artifactId>allure-testng</artifactId>
        <version>2.17.2</version>
      </dependency>
      
## Step6: Create testng suite file & execute it

## Step7: Refresh project & enter "allure serve allure-reportpathfromproject" in cmd.

## Step8: Your report will be opened in browser after entering above cmd.

Additional -
- https://docs.qameta.io/allure/#_testng to setup maven dependency

# Generate Allure Report adding screenshot when Tests failed

## Step1: Add below build informationa and dependency to pom.xml

    <properties>
        <aspectj.version>1.8.10</aspectj.version>
      </properties>

    <dependencies>
    <dependency>
        <groupId>io.qameta.allure</groupId>
        <artifactId>allure-testng</artifactId>
        <version>2.17.2</version>
      </dependency>
      </dependencies>

    <build>
      <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>3.0.0-M5</version>
          <configuration>
            <argLine>
                      -javaagent:"${settings.localRepository}/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar"
                  </argLine>
            <suiteXmlFiles>
              <suiteXmlFile>testng.xml</suiteXmlFile>
            </suiteXmlFiles>
          </configuration>

          <dependencies>
            <dependency>
              <groupId>org.aspectj</groupId>
              <artifactId>aspectjweaver</artifactId>
              <version>${aspectj.version}</version>
            </dependency>
          </dependencies>
        </plugin>

        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.7.0</version>
          <configuration>
            <source>1.8</source>
            <target>1.8</target>
            <encoding>UTF-8</encoding>
          </configuration>
        </plugin>

      </plugins>
    </build>
    
## Step2: Configure testng suite file, Execute as "maven test".

## Step3: Finally screenshot will be captured for failed tests for under "Test body"
  
## END

# ENJOY...!!!
