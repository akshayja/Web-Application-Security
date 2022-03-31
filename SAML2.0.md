Following are the defined terms used in the SAML specifications.

### Assertion

A piece of data produced by a SAML authority regarding either an act of authentication performed on a subject, attribute information about the subject, or authorization data applying to the subject with respect to a specified resource.

### Back Channel

Back channel refers to direct communications between two system entities without “redirecting” messages through another system entity such as an HTTP client (e.g. A user agent). 

### Binding, Protocol Binding 

Generically, a specification of the mapping of some given protocol's messages, and perhaps message exchange patterns, onto another protocol, in a concrete fashion.
 For example, the mapping of the SAML <AuthnRequest> message onto HTTP is one example of a binding. The mapping of that same SAML message onto SOAP is another binding. In the SAML context, each binding is given a name in the pattern “SAML xxx binding”.

### Front Channel 

Front channel refers to the “communications channel” that can be effected between two HTTP-speaking servers by employing “HTTP redirect” messages and thus passing messages to each other via a user agent, e.g. a web browser

### Profile 
A set of rules for one of several purposes; each set is given a name in the pattern “xxx profile of SAML” or “xxx SAML profile”.
a) Rules for how to embed assertions into and extract them from a protocol or other context of use.
b) Rules for using SAML protocol messages in a particular context of use.
c) Rules for mapping attributes expressed in SAML to another attribute representation system. Such a set of rules is known as an “attribute profile”.

### SAML Artifact 

A small, fixed-size, structured data object pointing to a typically larger, variably-sized SAML protocol message. 

SAML artifacts are designed to be embedded in URLs and conveyed in HTTP messages, such as HTTP response messages with "3xx Redirection" status codes, and subsequent HTTP GET messages. In this way, a service provider may indirectly, via a user agent, convey a SAML artifact to another provider, who may subsequently dereference the SAML artifact via a direct interaction with the supplying provider, and obtain the SAML protocol message. 

HTTP artifact is a binding in which a SAML request or response (or both) is transmitted by reference by using a unique identifier that is called an artifact.

A separate binding, such as a SOAP binding, is used to exchange the artifact for the actual protocol message.

It enables SAML requestors and responders to communicate by using an HTTP user agent as an intermediary.

This setting is used when it is not preferable to expose the message content to the intermediary.

HTTP artifact is sometimes called browser artifact, particularly when used in single sign-on operations. The HTTP artifact uses a SOAP back channel. 

The SOAP back channel is used to exchange an artifact during the establishment and use of a trusted session between an identity provider, a service provider, and a client (browser).

### Understanding RelayState

RelayState is a very important aspect of SAML standard, technically SAML requester can send a random string value to the SAML responder as RelayState and SAML responder must send back this original RelayState value back to the SAML requester together with SAML response.

Generally this is an opaque reference value and used to keep some application level context during the SAML invocation. 

As an example, assume a user requested a protected video content from an application, after successful authentication the application is supposed to return the requested video, in this case opaque reference for requested video can be kept within RelayState parameter.

Each SAML binding specifically mention whether it support for RelayState or not , if supported binding also specify how to encode the RelayState value using underlying transport protocol and message format.

 Exchange of information(metadata) between IDP and SP.
------------------------------------------------------------------------------------------------------------------------------------------------------------------
Which information does SP need from IDP ?

	- EntityId						  -> For validating whether we received correct assertion issuer or not.
	- Single Sign On Service Endpoint -> Identity provider url where we should 
	- Signing Certificates 			  -> For Validation of signature of SAML Assertion
	
(IDP Metadata)
------------------------------------------------------------------------------------------------------------------------------------------------------------------
Which information does IDP need from SP ?

	- EntityId 							 -> Unique identifier for relying party
	- Attribute Consume Service Endpoint -> Endpoint where assertion should be sent
	- Single Logout Service Endpoint	 -> Endpoint where Logout response should be sent
	- Signing Certificates 				 -> Required for signing assertion
	- Encryption Certificates			 -> Required for encrypting assertion


(SP Metadata)
------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
