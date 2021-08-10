## Welcome to GitHub Pages

You can use the [editor on GitHub](https://github.com/Rajesh-VPai/JavaCalculus/edit/master/README.md) to maintain and preview the content for your website in Markdown files.

Whenever you commit to this repository, GitHub Pages will run [Jekyll](https://jekyllrb.com/) to rebuild the pages in your site, from the content in your Markdown files.

### Markdown

Markdown is a lightweight and easy-to-use syntax for styling your writing. It includes conventions for


**Bold** and _Italic_ and `Code` text

[Link]( https://github.com/Rajesh-VPai/JavaCalculus ) and ![Image](src)

#### About Java Calculus

JavaCalculus is a Maths String Java Package that has the below:
1. Expression Interface:To obtain the value of a String Equation.
    - Taken initially from StackOverflow. Code written by StackOverflow User:Boann  and 
    - Code written by StackOverflow User:Mike Scholtes
    - Boann's code was Free Source
    - But modified by me extensively.
    - input: Java string (function)(f(x) )
    - output: Java double (function value)
2. Differentiation Interface:To obtain the Symbolic Differentiation of an String Equation.
    - input : Java string (f(x) )
    - output : differentiation of f(x): f'(x)
3. Integration Interface:To obtain the Symbolic Integration of an String Equation.
    - input : Java string ( f(x) )
    - output : integral of f(x) 
4. Algebra Interface :To obtain the expansion of an Algebraic multiplication of 2 equations.
    - input : 2 Java strings: f(x) & g(x)
    - output: Java string : f(x) * g(x)
5. Function Composition Interface :To obtain the Function Composition of 2 equations.
    - input: 2 Java strings : f(x) & g(x)
    - output: Java string : f(g(x)): fog(x)
6. Simple Expression Interface: To obtain the simple mathematical Java equivalent string.
    - input: Java string: f(x)
    - output: Java string: s(x) : such that f(x)=s(x) in all respects mathematically.
    - The purpose of this Interface is to simplify the inputs so that the differentiation & integration Interfaces are not complex. It also has the dual function of simplifying the output of the differentiation and integration interfaces by removing the leftover quirks of the mathematical operations to ensure a neat Java string. Hence it is recommended to use this interface at the input and output.

JavaCalculus is about 12,000 Lines of Lambda Calculus Code which does not use Numeric Analysis Methods (Newton Raphson etc).
This is just High School Mathematics Maths Formulae with Java Lambda Calculus Code.
This has been been tested for:
1. Constant Coefficients (Integer , Double )
2. X Term (Polynomial) (Can be any primary Variable: z, a1, ao, an, a123 , t etc)

Work In Progress (Future Development):
1. Independent Constants: dy/dx(ax+b) where a & b are independent constants with respect to x.
2. Functions
3. Parenthesis

Development and Test Environment: Windows XP and Java 7 & Netbeans 8.2

Testing has been rigorous with the TestHarness Testing 216 Types(Formats) of Equations 
This can be checked out by the User by running the Function (method):mainRegresssionDiffTest  and mainRegressionIntegrTest.

The Regression Suite has 216 types of equations with their differentiation and integration computed upto order 4. The User can add his/her additional order answers if required. 
Testing has always been upto 4th order (order=5).

##### User Intructions:
Run the function mainUser(args) and mainAlgebraUser(args); in File: MathsContxtLAv0_1.java

mainUser(args) does the Differentiation and Integration Interactively.
mainAlgebraUser(args) does the multiplication of 2 equations Algebraicly. It also does the Function Composition (FoG) of the 2 equations.

There are 2 other functions:mainDiff and mainIntegral which do a single differentiation and a single integration.

Even though testing has been rigorous,the User is advised to manually compute his/her equation and verify if the software is as per design. If the User is unable to hand compute the equation, at least a tough portion of the equation should be hand computed and verified in a trial run before use.

The User can also check if his/her equation is part of the Regression Suite formats.

While the answers in the Regression Suite have been hand computed and have been checked, some mistakes are still present.
The User should bear this in mind.

# Release 3.0
 Packages
JavaCalculus is divided into 1 package of 9 Files:
    1) MathsContxtLAv
    2) DiffrIntegrSep
    3) FuncInvSep
    4) SimpleAlgebraSep
    5) SubsStrSep
    6) CalculusApplication
    7) MathematicalTestHarness
    8) TestHarnessClass
    9) Usage

TestHarness is divided into 1 package of 13 Files:
    1) TestHarnessAlgebra
    2) TestHarnessCoefficients
    3) TestHarnessExpression
    4) TestHarnessFInverse
    5) TestHarnessFunctions
    6) TestHarnessIndConstant
    7) TestHarnessInfinityNaN
    8) TestHarnessIsolation
    9) TestHarnessNames
    10) TestHarnessParentheses
    11) TestHarnessPredicate
    12) TestHarnessSignedX
    13) TestHarnessUnitTest



3. RUNNING THE PROGRAMS
Using Netbeans 8.2, 
    1) Open i. 
    2) Right Click
    3) Select Run File


5. ENGINEERING

5.a Separation of Interface Code to appropriate files
    1) The Original MathsContxtLAv Code has been decluttered and seperated out to individual files (File Name ending with “Sep”). The Java public & private keywords for variables have been used rationalized.
    2) The parser “state” variables for each interface has been seperated to allow better command and control.
 

5.b Design of Term
A term in JavaCalculus follows the below grammar:
  M*x^Exp * IndConstant * Parenthesis
Where M: is a numerical String ( A constant integer or float)
      X: is the prmary variable (used only by differentiator & Integrator- variable “DiffWithRespTo” in the code- can be alphanumeric as in x123, y256 etc (i.e of any length).)
IndConstant: is any other variable(other than the primary variable (x) ). These are treated as constant string during Integration & Differentiation i.e Algebraic Coefficients.
Parenthesis: This is a String expression of Constants, x and IndConstants with braces at the beginning & closing braces at the end. The Design Intent has been that JavaCalculus Differentiator & Integrator will appropriately differentiate/integrate it if it contains the primary variable.
Infinity /NaN: The String “Infinity” & “NaN” can be used in M. However JavaCalculus uses it appropriately as an IndConstant.

5.c Testing Improvements
    1) “Status=Pass Conformal Map TEST” Or Function ConformalMapTestCaseIntegr has been added to check if the mapping holds true for :
        a. 8 values of x (-3.0 to +4) at the high level followed by a +-DELTA (DELTA = 0.000001) (3 values (-DELTA, 0 , +Delta) )
        b. mapping the primary variable to “y” using StrIntegr.replaceAll(DiffWithRespTo, "y");
        c. High Level Algebraic Conformal Mapping:
The mapping between :
            1) Expression supplied by the user is checked with that of Simple Expression.
            2) Differentiation / Integration Answer supplied by the user is checked with that of DiffExpr/ IntegrExpr
            3) DiffExpr/ IntegrExpr Output is checked with that of Simple Expression (Map2).
            4) This is repeated for (b.)

Only if all pass is the status made GREEN.

    2) PassFailTestCaseValue
This has been improved from just checking Doublevalue to accomodating rounding off. Thus any numerical random values in the last few digits of Double are accomodated.


5.d Test Results Reporting
The Test Report is added at the end of the raw Test Results.(After Test Case 110023 
    a) Summary:
mainDiffTest: TestCase Summary : Total Failed=117 Out of Run TestCases-Dups=311 Passed Count=194 DupCount=17
Section IsolationTestCases           Complete # of Failures=6 Out of=22 Test Cases. Dups=0 in Section 
Section InfinityNaNTestCases         Complete # of Failures=0 Out of=20 Test Cases. Dups=0 in Section 
Section SanityTestCases              Complete # of Failures=6 Out of=14 Test Cases. Dups=0 in Section 
Section UnitTestCases                Complete # of Failures=8 Out of=28 Test Cases. Dups=2 in Section 
Section Names                        Complete # of Failures=0 Out of=4 Test Cases. Dups=1 in Section 
Section Coefficients                 Complete # of Failures=5 Out of=61 Test Cases. Dups=6 in Section 
Section Exponent                     Complete # of Failures=2 Out of=11 Test Cases. Dups=0 in Section 
Section SignedX                      Complete # of Failures=10 Out of=30 Test Cases. Dups=2 in Section 
Section IndConstant                  Complete # of Failures=36 Out of=43 Test Cases. Dups=6 in Section 
Section Parentheses                  Complete # of Failures=33 Out of=48 Test Cases. Dups=0 in Section 
Section Function Test Cases          Complete # of Failures=2 Out of=2 Test Cases. Dups=0 in Section 
Section Function Argument Test Cases Complete # of Failures=5 Out of=5 Test Cases. Dups=0 in Section 
Section SoftwareEngg                 Complete # of Failures=4 Out of=23 Test Cases. Dups=0 in Section

mainIntegrTest: j=110023 TestCase=110023
mainIntegrTest: TestCase Summary : Total Failed=135 Out of Run TestCases-Dups=311 Passed Count=176 DupCount=17
Section IsolationTestCases           Complete # of Failures=8 Out of=22 Test Cases. Dups=0 in Section 
Section InfinityNaNTestCases         Complete # of Failures=5 Out of=20 Test Cases. Dups=0 in Section 
Section SanityTestCases              Complete # of Failures=7 Out of=14 Test Cases. Dups=0 in Section 
Section UnitTestCases                Complete # of Failures=5 Out of=28 Test Cases. Dups=2 in Section 
Section Names                        Complete # of Failures=0 Out of=4 Test Cases. Dups=1 in Section 
Section Coefficients                 Complete # of Failures=8 Out of=61 Test Cases. Dups=6 in Section 
Section Exponent                     Complete # of Failures=4 Out of=11 Test Cases. Dups=0 in Section 
Section SignedX                      Complete # of Failures=8 Out of=30 Test Cases. Dups=2 in Section 
Section IndConstant                  Complete # of Failures=34 Out of=43 Test Cases. Dups=6 in Section 
Section Parentheses                  Complete # of Failures=47 Out of=48 Test Cases. Dups=0 in Section 
Section Function Test Cases          Complete # of Failures=2 Out of=2 Test Cases. Dups=0 in Section 
Section Function Argument Test Cases Complete # of Failures=5 Out of=5 Test Cases. Dups=0 in Section 
Section SoftwareEngg                 Complete # of Failures=2 Out of=23 Test Cases. Dups=0 in Section

    b) Sectionwise Breakup:
mainIntegrTest: TestCase Summary :  Failed Test Cases are:
 TestCase=1003:Order=1:Str=false:Val=false:ConfValFlag=false,:Order=2:Str=false:Val=false:ConfValFlag=false,:Order=3:Str=false:Val=false:ConfValFlag=false,:Order=4:Str=false:Val=false:ConfValFlag=false,  TestCase=1004:Order=4:Str=false:Val=false:ConfValFlag=false,  TestCase=1005:Order=1:Str=false:Val=true:ConfValFlag=false,  TestCase=1015:Order=1:Str=false:Val=false:ConfValFlag=false,  TestCase=1016:Order=1:Str=false:Val=false:ConfValFlag=false,  TestCase=1019:Order=1:Str=false:Val=false:ConfValFlag=false, 
 TestCase=1020:Order=1:Str=false:Val=false:ConfValFlag=false,  TestCase=1021:Order=1:Str=false:Val=false:ConfValFlag=false,  null
,  Section IsolationTestCases           Complete # of Failures=8 Out of=22 Test Cases. Dups=0 in Section 
,  TestCase=2003:Order=1:Str=false:Val=true:ConfValFlag=true, 
 TestCase=2004:Order=1:Str=false:Val=true:ConfValFlag=true,  TestCase=2006:Order=1:Str=false:Val=true:ConfValFlag=true,  TestCase=2008:Order=1:Str=false:Val=true:ConfValFlag=true,  TestCase=2017:Order=1:Str=false:Val=true:ConfValFlag=true,  null
, 
 Section InfinityNaNTestCases         Complete # of Failures=5 Out of=20 Test Cases. Dups=0 in Section
    c) Exception Breakup
mainIntegrTest: Exception TestCase Summary : Total Exceptions=5 Exception Test Cases are:
 TestCase=40046:Order=1:Str=false:Val=false,  TestCase=40047:Order=1:Str=false:Val=false,  TestCase=40048:Order=1:Str=false:Val=false,  TestCase=40049:Order=1:Str=false:Val=false,  TestCase=80035:Order=1:Str=false:Val=false, 
mainIntegrTest: TestCase Duplicate Summary :  EqnDBIndex=328
    d) Dups
TestCase@5038@:Dup with :5036:
TestCase@5042@:Dup with :5037:
TestCase@10001@:Dup with :1000:
TestCase@20001@:Dup with :4026:
TestCase@20020@:Dup with :4030:
TestCase@20022@:Dup with :4031:
TestCase@20023@:Dup with :4032:
TestCase@20031@:Dup with :4027:
TestCase@20093@:Dup with :4026:
TestCase@40005@:Dup with :4026:
TestCase@40006@:Dup with :20002:
TestCase@50003@:Dup with :4019:
TestCase@50004@:Dup with :4020:
TestCase@50012@:Dup with :40020:
TestCase@50013@:Dup with :40021:
TestCase@50048@:Dup with :50047:
TestCase@50050@:Dup with :50049:
    e) Exception Cause Breakup
 40046:For input string: "0.0E+0.010", 
 40047:For input string: "0.0E-0.010", 
 40048:For input string: "0.0E-0.010", 
 40049:For input string: "0.0E-1.010", 
 80035:String index out of range: -1,

5.e Algebraic Conformal Mapping
JavaCalculus 3.0 has been improved to output algebraic conformal strings.
SimpleExpression has been improved to output algebraic conformal.
DiffExpr has been improved to output algebraic conformal.
IntegrExpr has been improved to output algebraic conformal.

Thus (TestCase = 2000)
"1.0/-0/x^8 + 1.0/-0/x^5 + 1.0/-0/x^4 - 1.0/-0/x - 25/-0";
Simple Expression Map1: 
"-Infinity/x^8.0-Infinity/x^5.0-Infinity/x^4.0+Infinity/x+Infinity";
DiffExpr :
"-Infinity*-8.0/x^9.0-Infinity*-5.0/x^6.0-Infinity*-4.0/x^5.0-Infinity/x^2.0+Infinity";
IntegrExpr:
"-Infinity/-7.0/x^7.0-Infinity/-4.0/x^4.0-Infinity/-3.0/x^3.0+Infinity*ln(x)+Infinity*x";
Simple Expression Map2(IntegrExpr): 
"Infinity/7.0/x^7.0+Infinity/4.0/x^4.0+Infinity/3.0/x^3.0+Infinity*ln(x)+Infinity*x";

The Design intent has been to allow extremely small values(Delta x) to be properly algebraicly mapped and Differentiated.It also helps in the debugging of very large Strings Equations  to check which term is causing the error.

For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).

### Jekyll Themes

Your Pages site will use the layout and styles from the Jekyll theme you have selected in your [repository settings](https://github.com/Rajesh-VPai/JavaCalculus/settings). The name of this theme is saved in the Jekyll `_config.yml` configuration file.

### Support or Contact

Having trouble with Pages? Check out our [documentation](https://help.github.com/categories/github-pages-basics/) or [contact support](https://github.com/contact) and we’ll help you sort it out.
