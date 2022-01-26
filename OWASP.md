OWASP Vulnerabilities
1. SQL Injection

 SQL injection vulnerabilities occur when data enters an application from an untrusted source and is used to dynamically construct a SQL query.

Fix / Recommendation: Proper server-side input validation must be used for filtering out hazardous characters from user input.
 Additionally, making use of prepared statements / parameterized stored procedures can ensure that input is processed as text.

Sample Code Snippet (Input Validation):

String input = request.getParameter ("SeqNo");
String characterPattern = "[0-9a-zA-Z]";
If (! input. matches (characterPattern))
{
out.println (“Invalid Input”);
}

2. Cross Site (XSS) Scripting
3. Clickjacking

Sensitive Information Passed as Clear Text in GET URL
Description: Web applications using GET requests to pass information via the query string are doing so in clear-text. This makes any sensitive information passed with GET visible in browser history and server logs.

Fix / Recommendation: Using POST instead of GET ensures that confidential information is not visible in the query string parameters.

Session ID Cookies Not Marked Secure

Fix / Recommendation: Make sure that sensitive cookies are set with the "secure" attribute to ensure they are always transmitted over HTTPS.

Sensitive Information Displayed as Clear Text on Screen
Fix / Recommendation: Sensitive information should be masked so that it is not visible to users


How to Build HTML Forms Right: Security
Encrypt Traffic (SSL)



AntiSamy is an HTML, CSS and JavaScript filter for Java that sanitizes user input based on a policy file.
AntiSamy is not an HTML, CSS and JavaScript validator.
It is merely a way to make sure HTML, CSS and JavaScript input strictly follows rules defined by a policy file.

OWASP Links


Top 20 OWASP Vulnerabilities And How To Fix Them Infographic

https://www.upguard.com/blog/top-20-owasp-vulnerabilities-and-how-to-fix-them#toc-1

What is Cross-Site Scripting (XSS)?

https://www.upguard.com/blog/cross-site-scripting-xss

What are the OWASP Top Ten?

https://www.upguard.com/blog/owasp-top-ten

Everything you need to know about OWASP Top 10

https://medium.com/deutsche-telekom-gurgaon/everything-you-need-to-know-about-owasp-top-10-6eb5c83746f8

Content Security Policy (CSP)

https://www.imperva.com/learn/application-security/content-security-policy-csp-header/

