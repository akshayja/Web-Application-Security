# What is SSL?

## SSL allows web clients and servers to:

1. Verify each other’s identity.
2. Encrypt messages they send to each other.
3. Ensure the integrity of messages sent between them.

It works through a combination of symmetric and asymmetric encryption using cryptographic keys tied to an SSL certificate.
SSL uses these digital signatures to authenticate the identity of web servers.

# What is an SSL certificate?
### An SSL certificate is a digital document tied to a specific subject, such as a server hosted on a web domain.
Its contents consists of:
1. Who the SSL certificate is issued to (aka the subject).
2. The expiration date of the SSL certificate
3. The SSL certificate’s public key, which will be used for encryption.
4. The digital signature of the certificate authority (more on this later) who issued the certificate.

# The SSL protocol uses SSL certificates to
1. Verify the authenticity of the server.
2. Encrypt messages sent between client and server.
3. Check the integrity of the messages sent between client and server.

# References
1. https://user3141592.medium.com/what-is-ssl-and-how-does-it-work-a5465d19b494
2. https://darutk.medium.com/illustrated-x-509-certificate-84aece2c5c2e
3. https://teivah.medium.com/ssl-tls-main-concepts-c368d411c687
4. https://medium.com/swlh/demystifying-ssl-communication-5a8ea2aebcb8
5. https://medium.com/@mehulgala77/ssl-in-a-nutshell-a316de1b1247
6. https://medium.com/@mehulgala77/a-closer-look-at-digital-certificates-9ce5a4c56f75
