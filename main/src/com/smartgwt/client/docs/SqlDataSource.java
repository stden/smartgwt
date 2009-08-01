
package com.smartgwt.client.docs;

/**
 * For prototyping purposes, the ISC server supports basic SQL connectivity for DataSources defined in XML.  Because the
 * request processing flow for the built-in SQL engine is identical to the flow used for  {@link
 * com.smartgwt.client.docs.ServerDataIntegration 'integrating with other Java storage engines'}, when your application
 * grows past prototype stage you can switch to a different storage engine without wasted work. <P> To use the built-in SQL
 * engine, declare a {@link com.smartgwt.client.data.DataSource} in XML format with {@link
 * com.smartgwt.client.data.DataSource#getServerType serverType} set to "sql", and place it in the shared dataSources
 * directory ([webroot]/shared/ds by default) in a file called "[dataSourceId].ds.xml". <p> You can then use the {@link
 * com.smartgwt.client.docs.AdminConsole 'Admin Console'} to configure database access, as well as to automatically create
 * and populate a database table based on your DataSource. By default, DataSources will use the "default database" from the
 * admin console, however you can set {@link com.smartgwt.client.data.DataSource#getDbName dbName} to the name of a
 * specific database configuration you have configured via the Admin Console. <P> The list of databases known to work with
 * the the built-in SQL logic is as follows: <p> <table class='normal'> <tr><td width=40></td><td width=200><i>HSQLDB
 * 1.7.x, 1.8.x</i></td><td></td></tr> <tr><td></td><td><i>IBM DB2 8.x, 9.x</i></td><td></td></tr> <tr><td></td><td><i>MS
 * SQL Server 2000</i></td><td></td></tr> <tr><td></td><td><i>MySQL 3.2.x, 4.0.x, 4.1.x, 5.0.x,
 * 5.1.x</i></td><td></td></tr> <tr><td></td><td><i>Oracle 8.0.5, 8i, 9i, 10g</i></td><td></td></tr>
 * <tr><td></td><td><i>PostgreSQL 7.x, 8.x</i></td><td></td></tr> </table> <p>You will also need a JDBC driver for your
 * specific database. Licensing restrictions prevent us including any JDBC driver other than the one for HSQLDB.  However,
 * you can download these drivers for free from the vendors' websites.  If your specific database server or version is not
 * listed above, please go to the <a href="http://forums.smartclient.com">SmartGWT forums</a> for assistance. <P> You can
 * also connect to an existing database table - the ISC SQL engine simply generates a DB table whose columns match the
 * DataSource field names and types, so you can instead declare a DataSource whose fields match an existing table.  To
 * troubleshoot such an integration, you can look at the generated SQL for both table creation and {@link
 * com.smartgwt.client.data.DSRequest} handling in the server-side log. <P> Once you have your SQL DataSource connected to
 * a table, in a default SDK installation, DSRequests for your DataSource will be sent to the default {@link
 * com.smartgwt.client.rpc.RPCManager#actionURL}, and hence handled automatically, without you having to write any Java
 * code, by the {@link com.smartgwt.client.docs.Xml}. IDACall is a very simple servlet that just calls the server-side
 * method dsRequest.execute() for all inbound requests. <P> If you need to customize how DSRequests are handled on the
 * server, you can write your own version of the IDACall servlet to dispatch requests, as described under {@link
 * com.smartgwt.client.rpc.RPCManager} and exemplified by the <a
 * href='/examples/server_integration/#customDataSourceIntegration'
 * onclick="window.open('/examples/server_integration/#customDataSourceIntegration');return false;">Custom DataSource
 * Integration example</a>. This allows you add your own logic either before or after calling dsRequest.execute()  to
 * invoke the normal behavior of the SQL engine.  This means you can implement: <ol> <li> authenticated access (also see
 * {@link com.smartgwt.client.docs.Relogin}) <li> custom validation rules, via inspecting the inbound DSRequest and sending
 * back a      DSResponse with errors set <li> business rules such as user-based data visibility, by eg calling     
 * dsRequest.setCriteria() to set certain fixed criteria on all requests <li> side effects such as sending notifications
 * mails after data is updated <li> server-side formatting or other derived values such as totals, by retrieving the     
 * default returned dataset via dsResponse.getData(), and updating it via      dsResponse.setData() </ol> When your
 * application grows past prototype stage and you switch to a different storage engine, you should be able to reuse any
 * logic that surrounds the dsRequest.execute() call, simply replacing that dsRequest.execute() call with code that
 * performs the dsRequest against your own storage engine.
 * @see com.smartgwt.client.data.DataSourceField#getSequenceName
 */
public interface SqlDataSource {
}
