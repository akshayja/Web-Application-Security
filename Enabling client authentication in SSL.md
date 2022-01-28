 # In two way SSL, server demands the client certificate, and this client cert is authenticated on the server side.
 
# Prerequisites:
##	Client (user) certificate is installed on the client machine. 
## This certificate is like the server certificate that we have seen earlier. 
## It contains the private and public keys for the user.
## It is generally issued by the organization CA, and placed in “Personal” section in the certificate section of OS.
## On the server side, please make sure to configure the truststore along with other settings, as shown below.
## Ensure that the server’s truststore contains public X509 cert of the CA who has issued the private certificate to the user. (Earlier in one way SSL, we saw that the client side truststore contains server’s CA cert)

## For Example:
### CA1 -> Issues Server certificate: Then add CA1 X509 cert in client truststore
### CA2 -> Issues Client certificate: Then add CA2 X509 cert in server truststore

      <Connector
      protocol="org.apache.coyote.http11.Http11NioProtocol"
      port="9443"
      maxThreads="200"
      scheme="https"
      secure="true"
      SSLEnabled="true"
      clientAuth="want"
      URIEncoding="UTF-8" 
      keystoreFile="file:///D:/apache-tomcat-9.0.11/conf/tomcat_key_store.jks"
      keystorePass=""
      keyAlias="server_cert"
      truststoreFile="file:///D:/apache-tomcat-9.0.11/conf/tomcat_trust_store.jks"
      truststorePass="dkpune"
      sslProtocol="TLS" />

Please note that clientAuth=want will enable the client authentication, but it will be optional.

Even if client does not send its SSL certificate, the HTTPS session will still be established.

It will be an application’s responsibility to deny the user the access of the protected resource.

