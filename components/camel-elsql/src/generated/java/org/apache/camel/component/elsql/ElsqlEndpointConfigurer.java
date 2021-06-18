/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.elsql;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ElsqlEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ElsqlEndpoint target = (ElsqlEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allownamedparameters":
        case "allowNamedParameters": target.setAllowNamedParameters(property(camelContext, boolean.class, value)); return true;
        case "alwayspopulatestatement":
        case "alwaysPopulateStatement": target.setAlwaysPopulateStatement(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "batch": target.setBatch(property(camelContext, boolean.class, value)); return true;
        case "breakbatchonconsumefail":
        case "breakBatchOnConsumeFail": target.setBreakBatchOnConsumeFail(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "datasource":
        case "dataSource": target.setDataSource(property(camelContext, javax.sql.DataSource.class, value)); return true;
        case "databasevendor":
        case "databaseVendor": target.setDatabaseVendor(property(camelContext, org.apache.camel.component.elsql.ElSqlDatabaseVendor.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "elsqlconfig":
        case "elSqlConfig": target.setElSqlConfig(property(camelContext, com.opengamma.elsql.ElSqlConfig.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "expectedupdatecount":
        case "expectedUpdateCount": target.setExpectedUpdateCount(property(camelContext, int.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "noop": target.setNoop(property(camelContext, boolean.class, value)); return true;
        case "onconsume":
        case "onConsume": target.setOnConsume(property(camelContext, java.lang.String.class, value)); return true;
        case "onconsumebatchcomplete":
        case "onConsumeBatchComplete": target.setOnConsumeBatchComplete(property(camelContext, java.lang.String.class, value)); return true;
        case "onconsumefailed":
        case "onConsumeFailed": target.setOnConsumeFailed(property(camelContext, java.lang.String.class, value)); return true;
        case "outputclass":
        case "outputClass": target.setOutputClass(property(camelContext, java.lang.String.class, value)); return true;
        case "outputheader":
        case "outputHeader": target.setOutputHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "outputtype":
        case "outputType": target.setOutputType(property(camelContext, org.apache.camel.component.sql.SqlOutputType.class, value)); return true;
        case "parameterscount":
        case "parametersCount": target.setParametersCount(property(camelContext, int.class, value)); return true;
        case "placeholder": target.setPlaceholder(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "preparestatementstrategy":
        case "prepareStatementStrategy": target.setPrepareStatementStrategy(property(camelContext, org.apache.camel.component.sql.SqlPrepareStatementStrategy.class, value)); return true;
        case "processingstrategy":
        case "processingStrategy": target.setProcessingStrategy(property(camelContext, org.apache.camel.component.sql.SqlProcessingStrategy.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "routeemptyresultset":
        case "routeEmptyResultSet": target.setRouteEmptyResultSet(property(camelContext, boolean.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "separator": target.setSeparator(property(camelContext, char.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "templateoptions":
        case "templateOptions": target.setTemplateOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "transacted": target.setTransacted(property(camelContext, boolean.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "useiterator":
        case "useIterator": target.setUseIterator(property(camelContext, boolean.class, value)); return true;
        case "usemessagebodyforsql":
        case "useMessageBodyForSql": target.setUseMessageBodyForSql(property(camelContext, boolean.class, value)); return true;
        case "useplaceholder":
        case "usePlaceholder": target.setUsePlaceholder(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allownamedparameters":
        case "allowNamedParameters": return boolean.class;
        case "alwayspopulatestatement":
        case "alwaysPopulateStatement": return boolean.class;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return int.class;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return int.class;
        case "backoffmultiplier":
        case "backoffMultiplier": return int.class;
        case "batch": return boolean.class;
        case "breakbatchonconsumefail":
        case "breakBatchOnConsumeFail": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "datasource":
        case "dataSource": return javax.sql.DataSource.class;
        case "databasevendor":
        case "databaseVendor": return org.apache.camel.component.elsql.ElSqlDatabaseVendor.class;
        case "delay": return long.class;
        case "elsqlconfig":
        case "elSqlConfig": return com.opengamma.elsql.ElSqlConfig.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "expectedupdatecount":
        case "expectedUpdateCount": return int.class;
        case "greedy": return boolean.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return int.class;
        case "noop": return boolean.class;
        case "onconsume":
        case "onConsume": return java.lang.String.class;
        case "onconsumebatchcomplete":
        case "onConsumeBatchComplete": return java.lang.String.class;
        case "onconsumefailed":
        case "onConsumeFailed": return java.lang.String.class;
        case "outputclass":
        case "outputClass": return java.lang.String.class;
        case "outputheader":
        case "outputHeader": return java.lang.String.class;
        case "outputtype":
        case "outputType": return org.apache.camel.component.sql.SqlOutputType.class;
        case "parameterscount":
        case "parametersCount": return int.class;
        case "placeholder": return java.lang.String.class;
        case "pollstrategy":
        case "pollStrategy": return org.apache.camel.spi.PollingConsumerPollStrategy.class;
        case "preparestatementstrategy":
        case "prepareStatementStrategy": return org.apache.camel.component.sql.SqlPrepareStatementStrategy.class;
        case "processingstrategy":
        case "processingStrategy": return org.apache.camel.component.sql.SqlProcessingStrategy.class;
        case "repeatcount":
        case "repeatCount": return long.class;
        case "routeemptyresultset":
        case "routeEmptyResultSet": return boolean.class;
        case "runlogginglevel":
        case "runLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return java.util.concurrent.ScheduledExecutorService.class;
        case "scheduler": return java.lang.Object.class;
        case "schedulerproperties":
        case "schedulerProperties": return java.util.Map.class;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return boolean.class;
        case "separator": return char.class;
        case "startscheduler":
        case "startScheduler": return boolean.class;
        case "templateoptions":
        case "templateOptions": return java.util.Map.class;
        case "timeunit":
        case "timeUnit": return java.util.concurrent.TimeUnit.class;
        case "transacted": return boolean.class;
        case "usefixeddelay":
        case "useFixedDelay": return boolean.class;
        case "useiterator":
        case "useIterator": return boolean.class;
        case "usemessagebodyforsql":
        case "useMessageBodyForSql": return boolean.class;
        case "useplaceholder":
        case "usePlaceholder": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ElsqlEndpoint target = (ElsqlEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allownamedparameters":
        case "allowNamedParameters": return target.isAllowNamedParameters();
        case "alwayspopulatestatement":
        case "alwaysPopulateStatement": return target.isAlwaysPopulateStatement();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "batch": return target.isBatch();
        case "breakbatchonconsumefail":
        case "breakBatchOnConsumeFail": return target.isBreakBatchOnConsumeFail();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "datasource":
        case "dataSource": return target.getDataSource();
        case "databasevendor":
        case "databaseVendor": return target.getDatabaseVendor();
        case "delay": return target.getDelay();
        case "elsqlconfig":
        case "elSqlConfig": return target.getElSqlConfig();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "expectedupdatecount":
        case "expectedUpdateCount": return target.getExpectedUpdateCount();
        case "greedy": return target.isGreedy();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return target.getMaxMessagesPerPoll();
        case "noop": return target.isNoop();
        case "onconsume":
        case "onConsume": return target.getOnConsume();
        case "onconsumebatchcomplete":
        case "onConsumeBatchComplete": return target.getOnConsumeBatchComplete();
        case "onconsumefailed":
        case "onConsumeFailed": return target.getOnConsumeFailed();
        case "outputclass":
        case "outputClass": return target.getOutputClass();
        case "outputheader":
        case "outputHeader": return target.getOutputHeader();
        case "outputtype":
        case "outputType": return target.getOutputType();
        case "parameterscount":
        case "parametersCount": return target.getParametersCount();
        case "placeholder": return target.getPlaceholder();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "preparestatementstrategy":
        case "prepareStatementStrategy": return target.getPrepareStatementStrategy();
        case "processingstrategy":
        case "processingStrategy": return target.getProcessingStrategy();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "routeemptyresultset":
        case "routeEmptyResultSet": return target.isRouteEmptyResultSet();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "separator": return target.getSeparator();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "templateoptions":
        case "templateOptions": return target.getTemplateOptions();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "transacted": return target.isTransacted();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "useiterator":
        case "useIterator": return target.isUseIterator();
        case "usemessagebodyforsql":
        case "useMessageBodyForSql": return target.isUseMessageBodyForSql();
        case "useplaceholder":
        case "usePlaceholder": return target.isUsePlaceholder();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "schedulerproperties":
        case "schedulerProperties": return java.lang.Object.class;
        case "templateoptions":
        case "templateOptions": return java.lang.Object.class;
        default: return null;
        }
    }
}

