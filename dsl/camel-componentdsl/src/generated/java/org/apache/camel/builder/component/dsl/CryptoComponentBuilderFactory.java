/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.crypto.DigitalSignatureComponent;

/**
 * Sign and verify exchanges using the Signature Service of the Java
 * Cryptographic Extension (JCE).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface CryptoComponentBuilderFactory {

    /**
     * Crypto (JCE) (camel-crypto)
     * Sign and verify exchanges using the Signature Service of the Java
     * Cryptographic Extension (JCE).
     * 
     * Category: security,transformation
     * Since: 2.3
     * Maven coordinates: org.apache.camel:camel-crypto
     * 
     * @return the dsl builder
     */
    static CryptoComponentBuilder crypto() {
        return new CryptoComponentBuilderImpl();
    }

    /**
     * Builder for the Crypto (JCE) component.
     */
    interface CryptoComponentBuilder
            extends
                ComponentBuilder<DigitalSignatureComponent> {
        /**
         * Sets the JCE name of the Algorithm that should be used for the
         * signer.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: SHA256withRSA
         * Group: producer
         * 
         * @param algorithm the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder algorithm(java.lang.String algorithm) {
            doSetProperty("algorithm", algorithm);
            return this;
        }
        /**
         * Sets the alias used to query the KeyStore for keys and {link
         * java.security.cert.Certificate Certificates} to be used in signing
         * and verifying exchanges. This value can be provided at runtime via
         * the message header
         * org.apache.camel.component.crypto.DigitalSignatureConstants#KEYSTORE_ALIAS.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param alias the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder alias(java.lang.String alias) {
            doSetProperty("alias", alias);
            return this;
        }
        /**
         * Sets the reference name for a PrivateKey that can be found in the
         * registry.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param certificateName the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder certificateName(
                java.lang.String certificateName) {
            doSetProperty("certificateName", certificateName);
            return this;
        }
        /**
         * Sets the KeyStore that can contain keys and Certficates for use in
         * signing and verifying exchanges. A KeyStore is typically used with an
         * alias, either one supplied in the Route definition or dynamically via
         * the message header CamelSignatureKeyStoreAlias. If no alias is
         * supplied and there is only a single entry in the Keystore, then this
         * single entry will be used.
         * 
         * The option is a: &lt;code&gt;java.security.KeyStore&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param keystore the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder keystore(java.security.KeyStore keystore) {
            doSetProperty("keystore", keystore);
            return this;
        }
        /**
         * Sets the reference name for a Keystore that can be found in the
         * registry.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keystoreName the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder keystoreName(
                java.lang.String keystoreName) {
            doSetProperty("keystoreName", keystoreName);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Set the PrivateKey that should be used to sign the exchange.
         * 
         * The option is a: &lt;code&gt;java.security.PrivateKey&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param privateKey the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder privateKey(
                java.security.PrivateKey privateKey) {
            doSetProperty("privateKey", privateKey);
            return this;
        }
        /**
         * Sets the reference name for a PrivateKey that can be found in the
         * registry.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param privateKeyName the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder privateKeyName(
                java.lang.String privateKeyName) {
            doSetProperty("privateKeyName", privateKeyName);
            return this;
        }
        /**
         * Set the id of the security provider that provides the configured
         * Signature algorithm.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param provider the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder provider(java.lang.String provider) {
            doSetProperty("provider", provider);
            return this;
        }
        /**
         * references that should be resolved when the context changes.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param publicKeyName the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder publicKeyName(
                java.lang.String publicKeyName) {
            doSetProperty("publicKeyName", publicKeyName);
            return this;
        }
        /**
         * Sets the reference name for a SecureRandom that can be found in the
         * registry.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param secureRandomName the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder secureRandomName(
                java.lang.String secureRandomName) {
            doSetProperty("secureRandomName", secureRandomName);
            return this;
        }
        /**
         * Set the name of the message header that should be used to store the
         * base64 encoded signature. This defaults to 'CamelDigitalSignature'.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param signatureHeaderName the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder signatureHeaderName(
                java.lang.String signatureHeaderName) {
            doSetProperty("signatureHeaderName", signatureHeaderName);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Set the size of the buffer used to read in the Exchange payload data.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 2048
         * Group: advanced
         * 
         * @param bufferSize the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder bufferSize(java.lang.Integer bufferSize) {
            doSetProperty("bufferSize", bufferSize);
            return this;
        }
        /**
         * Set the Certificate that should be used to verify the signature in
         * the exchange based on its payload.
         * 
         * The option is a:
         * &lt;code&gt;java.security.cert.Certificate&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param certificate the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder certificate(
                java.security.cert.Certificate certificate) {
            doSetProperty("certificate", certificate);
            return this;
        }
        /**
         * Determines if the Signature specific headers be cleared after signing
         * and verification. Defaults to true, and should only be made otherwise
         * at your extreme peril as vital private information such as Keys and
         * passwords may escape if unset.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param clearHeaders the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder clearHeaders(boolean clearHeaders) {
            doSetProperty("clearHeaders", clearHeaders);
            return this;
        }
        /**
         * To use the shared DigitalSignatureConfiguration as configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.crypto.DigitalSignatureConfiguration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder configuration(
                org.apache.camel.component.crypto.DigitalSignatureConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Sets the KeyStore that can contain keys and Certficates for use in
         * signing and verifying exchanges based on the given
         * KeyStoreParameters. A KeyStore is typically used with an alias,
         * either one supplied in the Route definition or dynamically via the
         * message header CamelSignatureKeyStoreAlias. If no alias is supplied
         * and there is only a single entry in the Keystore, then this single
         * entry will be used.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.KeyStoreParameters&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param keyStoreParameters the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder keyStoreParameters(
                org.apache.camel.support.jsse.KeyStoreParameters keyStoreParameters) {
            doSetProperty("keyStoreParameters", keyStoreParameters);
            return this;
        }
        /**
         * Set the PublicKey that should be used to verify the signature in the
         * exchange.
         * 
         * The option is a: &lt;code&gt;java.security.PublicKey&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param publicKey the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder publicKey(
                java.security.PublicKey publicKey) {
            doSetProperty("publicKey", publicKey);
            return this;
        }
        /**
         * Set the SecureRandom used to initialize the Signature service.
         * 
         * The option is a: &lt;code&gt;java.security.SecureRandom&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param secureRandom the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder secureRandom(
                java.security.SecureRandom secureRandom) {
            doSetProperty("secureRandom", secureRandom);
            return this;
        }
        /**
         * Sets the password used to access an aliased PrivateKey in the
         * KeyStore.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default CryptoComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
    }

    class CryptoComponentBuilderImpl
            extends
                AbstractComponentBuilder<DigitalSignatureComponent>
            implements
                CryptoComponentBuilder {
        @Override
        protected DigitalSignatureComponent buildConcreteComponent() {
            return new DigitalSignatureComponent();
        }
        private org.apache.camel.component.crypto.DigitalSignatureConfiguration getOrCreateConfiguration(
                org.apache.camel.component.crypto.DigitalSignatureComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.crypto.DigitalSignatureConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "algorithm": getOrCreateConfiguration((DigitalSignatureComponent) component).setAlgorithm((java.lang.String) value); return true;
            case "alias": getOrCreateConfiguration((DigitalSignatureComponent) component).setAlias((java.lang.String) value); return true;
            case "certificateName": getOrCreateConfiguration((DigitalSignatureComponent) component).setCertificateName((java.lang.String) value); return true;
            case "keystore": getOrCreateConfiguration((DigitalSignatureComponent) component).setKeystore((java.security.KeyStore) value); return true;
            case "keystoreName": getOrCreateConfiguration((DigitalSignatureComponent) component).setKeystoreName((java.lang.String) value); return true;
            case "lazyStartProducer": ((DigitalSignatureComponent) component).setLazyStartProducer((boolean) value); return true;
            case "privateKey": getOrCreateConfiguration((DigitalSignatureComponent) component).setPrivateKey((java.security.PrivateKey) value); return true;
            case "privateKeyName": getOrCreateConfiguration((DigitalSignatureComponent) component).setPrivateKeyName((java.lang.String) value); return true;
            case "provider": getOrCreateConfiguration((DigitalSignatureComponent) component).setProvider((java.lang.String) value); return true;
            case "publicKeyName": getOrCreateConfiguration((DigitalSignatureComponent) component).setPublicKeyName((java.lang.String) value); return true;
            case "secureRandomName": getOrCreateConfiguration((DigitalSignatureComponent) component).setSecureRandomName((java.lang.String) value); return true;
            case "signatureHeaderName": getOrCreateConfiguration((DigitalSignatureComponent) component).setSignatureHeaderName((java.lang.String) value); return true;
            case "autowiredEnabled": ((DigitalSignatureComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "bufferSize": getOrCreateConfiguration((DigitalSignatureComponent) component).setBufferSize((java.lang.Integer) value); return true;
            case "certificate": getOrCreateConfiguration((DigitalSignatureComponent) component).setCertificate((java.security.cert.Certificate) value); return true;
            case "clearHeaders": getOrCreateConfiguration((DigitalSignatureComponent) component).setClearHeaders((boolean) value); return true;
            case "configuration": ((DigitalSignatureComponent) component).setConfiguration((org.apache.camel.component.crypto.DigitalSignatureConfiguration) value); return true;
            case "keyStoreParameters": getOrCreateConfiguration((DigitalSignatureComponent) component).setKeyStoreParameters((org.apache.camel.support.jsse.KeyStoreParameters) value); return true;
            case "publicKey": getOrCreateConfiguration((DigitalSignatureComponent) component).setPublicKey((java.security.PublicKey) value); return true;
            case "secureRandom": getOrCreateConfiguration((DigitalSignatureComponent) component).setSecureRandom((java.security.SecureRandom) value); return true;
            case "password": getOrCreateConfiguration((DigitalSignatureComponent) component).setPassword((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}