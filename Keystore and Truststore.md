# KeyStore
##	Keystore is used to store private key and identity certificates.

##	Keystore stores your credential. (server or client)

##	Keystore is needed when you are setting up the server side on SSL

##	Server stores its private key and identity certificate(public) on Keystore, the certificate will be shown to the client who wants to establish the SSL connection with this server.

##	Truststore is used to store certificates from Certified Authorities (CA) that verify the certificate presented by the server in SSL connection.

#	Truststore stores 
##	Truststore setup is required for the successful connection at the client side
##	Server will authenticate the client against the certificate stored on the server’s Truststore
