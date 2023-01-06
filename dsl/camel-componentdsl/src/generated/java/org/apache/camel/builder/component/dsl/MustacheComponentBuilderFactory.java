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
import org.apache.camel.component.mustache.MustacheComponent;

/**
 * Transform messages using a Mustache template.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface MustacheComponentBuilderFactory {

    /**
     * Mustache (camel-mustache)
     * Transform messages using a Mustache template.
     * 
     * Category: transformation
     * Since: 2.12
     * Maven coordinates: org.apache.camel:camel-mustache
     * 
     * @return the dsl builder
     */
    static MustacheComponentBuilder mustache() {
        return new MustacheComponentBuilderImpl();
    }

    /**
     * Builder for the Mustache component.
     */
    interface MustacheComponentBuilder
            extends
                ComponentBuilder<MustacheComponent> {
        /**
         * Sets whether the context map should allow access to all details. By
         * default only the message body and headers can be accessed. This
         * option can be enabled for full access to the current Exchange and
         * CamelContext. Doing so impose a potential security risk as this opens
         * access to the full power of CamelContext API.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowContextMapAll the value to set
         * @return the dsl builder
         */
        default MustacheComponentBuilder allowContextMapAll(
                boolean allowContextMapAll) {
            doSetProperty("allowContextMapAll", allowContextMapAll);
            return this;
        }
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowTemplateFromHeader the value to set
         * @return the dsl builder
         */
        default MustacheComponentBuilder allowTemplateFromHeader(
                boolean allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
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
        default MustacheComponentBuilder lazyStartProducer(
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
        default MustacheComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To use a custom MustacheFactory.
         * 
         * The option is a:
         * &lt;code&gt;com.github.mustachejava.MustacheFactory&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param mustacheFactory the value to set
         * @return the dsl builder
         */
        default MustacheComponentBuilder mustacheFactory(
                com.github.mustachejava.MustacheFactory mustacheFactory) {
            doSetProperty("mustacheFactory", mustacheFactory);
            return this;
        }
    }

    class MustacheComponentBuilderImpl
            extends
                AbstractComponentBuilder<MustacheComponent>
            implements
                MustacheComponentBuilder {
        @Override
        protected MustacheComponent buildConcreteComponent() {
            return new MustacheComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "allowContextMapAll": ((MustacheComponent) component).setAllowContextMapAll((boolean) value); return true;
            case "allowTemplateFromHeader": ((MustacheComponent) component).setAllowTemplateFromHeader((boolean) value); return true;
            case "lazyStartProducer": ((MustacheComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((MustacheComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "mustacheFactory": ((MustacheComponent) component).setMustacheFactory((com.github.mustachejava.MustacheFactory) value); return true;
            default: return false;
            }
        }
    }
}