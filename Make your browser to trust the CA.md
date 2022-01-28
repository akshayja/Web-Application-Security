# To make the browser trust the server certificate, browser must be aware of the issuer of the server certificate.

## To do this, perform following steps:

###	Export CA’s X509 certificate from the above Keystore. Save it to .cer file.

###	On client machine (where the browser runs), import (or double click and install) this .cer file into “Trusted Root Certification Authorities Certificate” folder

