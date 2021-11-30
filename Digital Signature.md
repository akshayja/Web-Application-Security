
# What is Digital Signature?

Hash value of a message when encrypted with the private key of a person is his digital signature on that e-Document.

As the public key of the signer is known, anybody can verify the message and the digital signature.

# Why Digital Signature?


Digital signature ensures the confidentiality via the following three attributes:

1. Authentication: Authentication means that you know who created and sent the message. Digital signature is used to authenticate the source of messages. It ensures the user of the sender.
2. Integrity: Integrity ensures that when a message is sent over a network, the data that 	arrives is the same as the data that was originally sent. Integrity is the assurance that 	the information is trustworthy and accurate. Digital signature ensures the integrity of message.
3. Non-repudiation: As digital signature ensures the authentication of the message, so the sender can’t repudiate it later. At the same time it also ensures the identity of the 	receiver, so the receiver can’t	repudiate it later.

# Basic Requirements

Private Key
	The private key is one which is accessible only to the signer. It is used to generate the 	digital signature which is then attached to the message.

Public Key
	The public key is made available to all those who receive the signed messages from 	the sender. It is used for verification of the received message.

# Digital Signature Algorithm


There are three algorithms that are suitable for digital signature generation under the Digital Signature standard(DSS).

They are 
Digital Signature Algorithm 
RSA algorithm, 
Elliptic Curve Digital Signature Algorithm (ECDSA).




