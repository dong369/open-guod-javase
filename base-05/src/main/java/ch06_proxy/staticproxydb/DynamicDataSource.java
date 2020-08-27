package ch06_proxy.staticproxydb;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDbType();
    }
}
