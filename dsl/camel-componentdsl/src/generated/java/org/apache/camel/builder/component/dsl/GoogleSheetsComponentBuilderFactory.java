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
import org.apache.camel.component.google.sheets.GoogleSheetsComponent;

/**
 * Manage spreadsheets in Google Sheets.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface GoogleSheetsComponentBuilderFactory {

    /**
     * Google Sheets (camel-google-sheets)
     * Manage spreadsheets in Google Sheets.
     * 
     * Category: api,cloud,sheets
     * Since: 2.23
     * Maven coordinates: org.apache.camel:camel-google-sheets
     * 
     * @return the dsl builder
     */
    static GoogleSheetsComponentBuilder googleSheets() {
        return new GoogleSheetsComponentBuilderImpl();
    }

    /**
     * Builder for the Google Sheets component.
     */
    interface GoogleSheetsComponentBuilder
            extends
                ComponentBuilder<GoogleSheetsComponent> {
        /**
         * Google Sheets application name. Example would be
         * camel-google-sheets/1.0.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param applicationName the value to set
         * @return the dsl builder
         */
        default GoogleSheetsComponentBuilder applicationName(
                java.lang.String applicationName) {
            doSetProperty("applicationName", applicationName);
            return this;
        }
        /**
         * Client ID of the sheets application.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param clientId the value to set
         * @return the dsl builder
         */
        default GoogleSheetsComponentBuilder clientId(java.lang.String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * To use the shared configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.google.sheets.GoogleSheetsConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default GoogleSheetsComponentBuilder configuration(
                org.apache.camel.component.google.sheets.GoogleSheetsConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Delegate for wide-domain service account.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param delegate the value to set
         * @return the dsl builder
         */
        default GoogleSheetsComponentBuilder delegate(java.lang.String delegate) {
            doSetProperty("delegate", delegate);
            return this;
        }
        /**
         * Sheets scopes.
         * 
         * The option is a:
         * &lt;code&gt;java.util.Collection&amp;lt;java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param scopes the value to set
         * @return the dsl builder
         */
        default GoogleSheetsComponentBuilder scopes(
                java.util.Collection<java.lang.String> scopes) {
            doSetProperty("scopes", scopes);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default GoogleSheetsComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * When consumer return an array or collection this will generate one
         * exchange per element, and their routes will be executed once for each
         * exchange. Set this value to false to use a single exchange for the
         * entire list or array.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param splitResult the value to set
         * @return the dsl builder
         */
        default GoogleSheetsComponentBuilder splitResult(boolean splitResult) {
            doSetProperty("splitResult", splitResult);
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
        default GoogleSheetsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
        default GoogleSheetsComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To use the GoogleSheetsClientFactory as factory for creating the
         * client. Will by default use BatchGoogleSheetsClientFactory.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.google.sheets.GoogleSheetsClientFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param clientFactory the value to set
         * @return the dsl builder
         */
        default GoogleSheetsComponentBuilder clientFactory(
                org.apache.camel.component.google.sheets.GoogleSheetsClientFactory clientFactory) {
            doSetProperty("clientFactory", clientFactory);
            return this;
        }
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessToken the value to set
         * @return the dsl builder
         */
        default GoogleSheetsComponentBuilder accessToken(
                java.lang.String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Client secret of the sheets application.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param clientSecret the value to set
         * @return the dsl builder
         */
        default GoogleSheetsComponentBuilder clientSecret(
                java.lang.String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * OAuth 2 refresh token. Using this, the Google Sheets component can
         * obtain a new accessToken whenever the current one expires - a
         * necessity if the application is long-lived.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param refreshToken the value to set
         * @return the dsl builder
         */
        default GoogleSheetsComponentBuilder refreshToken(
                java.lang.String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
            return this;
        }
        /**
         * Sets .json file with credentials for Service account.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param serviceAccountKey the value to set
         * @return the dsl builder
         */
        default GoogleSheetsComponentBuilder serviceAccountKey(
                java.lang.String serviceAccountKey) {
            doSetProperty("serviceAccountKey", serviceAccountKey);
            return this;
        }
    }

    class GoogleSheetsComponentBuilderImpl
            extends
                AbstractComponentBuilder<GoogleSheetsComponent>
            implements
                GoogleSheetsComponentBuilder {
        @Override
        protected GoogleSheetsComponent buildConcreteComponent() {
            return new GoogleSheetsComponent();
        }
        private org.apache.camel.component.google.sheets.GoogleSheetsConfiguration getOrCreateConfiguration(
                org.apache.camel.component.google.sheets.GoogleSheetsComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.google.sheets.GoogleSheetsConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "applicationName": getOrCreateConfiguration((GoogleSheetsComponent) component).setApplicationName((java.lang.String) value); return true;
            case "clientId": getOrCreateConfiguration((GoogleSheetsComponent) component).setClientId((java.lang.String) value); return true;
            case "configuration": ((GoogleSheetsComponent) component).setConfiguration((org.apache.camel.component.google.sheets.GoogleSheetsConfiguration) value); return true;
            case "delegate": getOrCreateConfiguration((GoogleSheetsComponent) component).setDelegate((java.lang.String) value); return true;
            case "scopes": getOrCreateConfiguration((GoogleSheetsComponent) component).setScopes((java.util.Collection) value); return true;
            case "bridgeErrorHandler": ((GoogleSheetsComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "splitResult": getOrCreateConfiguration((GoogleSheetsComponent) component).setSplitResult((boolean) value); return true;
            case "lazyStartProducer": ((GoogleSheetsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((GoogleSheetsComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "clientFactory": ((GoogleSheetsComponent) component).setClientFactory((org.apache.camel.component.google.sheets.GoogleSheetsClientFactory) value); return true;
            case "accessToken": getOrCreateConfiguration((GoogleSheetsComponent) component).setAccessToken((java.lang.String) value); return true;
            case "clientSecret": getOrCreateConfiguration((GoogleSheetsComponent) component).setClientSecret((java.lang.String) value); return true;
            case "refreshToken": getOrCreateConfiguration((GoogleSheetsComponent) component).setRefreshToken((java.lang.String) value); return true;
            case "serviceAccountKey": getOrCreateConfiguration((GoogleSheetsComponent) component).setServiceAccountKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}