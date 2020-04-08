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

JavaCalculus is about 12,000 Lines of Lambda Calculus Code which does not use Numeric Analysis Methods (Newton Raphson etc).
This is just High School Mathematics Maths Formulae with Java Lambda Calculus Code.
This has been been tested for:
1. Constant Coefficients (Integer , Double )
2. X Term (Polynomial) (Can be any primary Variable: z, a1, ao, an, a123 , t etc)

Work In Progress (Future Development):
1. Independent Constants: dy/dx(ax+b) where a & b are independent constants with respect to x.
2. Functions
3. Parenthesis

Development and Test Environment: Windows XP and Java 7 & Neteans 8.2

Testing has been rigorous with the TestHarness Testing 216 Types(Formats) of Equations 
This can be checked out by the User by running the Function (method):mainRegresssionDiffTest  and mainRegressionIntegrTest

##### User Intructions:
Run the function mainUser(args) and mainAlgebraUser(args); in File: MathsContxtLAv0_1.java

mainUser(args) does the Differentiation and Integration Interactively.
mainAlgebraUser(args) does the multiplication of 2 equations Algebraicly. It also does the Function Composition (FoG) of the 2 equations.

There are 2 other functions:mainDiff and mainIntegral which do a single differentiation and a single integration.

Even though testing has been rigorous,the User is advised to manually compute his/her equation and verify if the software is as per design. If the User is unable to hand compute the equation, at least a tough portion of the equation should be hand computed and verified in a trial run before use.

The User can also check if his/her equation is part of the Regression Suite formats.

While the answers in the Regression Suite have been hand computed and have been checked, some mistakes are still present.
The User should bear this in mind.


For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).

### Jekyll Themes

Your Pages site will use the layout and styles from the Jekyll theme you have selected in your [repository settings](https://github.com/Rajesh-VPai/JavaCalculus/settings). The name of this theme is saved in the Jekyll `_config.yml` configuration file.

### Support or Contact

Having trouble with Pages? Check out our [documentation](https://help.github.com/categories/github-pages-basics/) or [contact support](https://github.com/contact) and we’ll help you sort it out.
