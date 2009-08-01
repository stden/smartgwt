
package com.smartgwt.client.docs;

/**
 * <b>Overview</b>&#010 <P>&#010 The Spring framework has many different parts, from integration with Object
 * Relational&#010 Mapping (ORM) and transaction management systems, to a Model View Controller (MVC)&#010
 * architecture.&#010 <P>&#010 If you are building a new application from scratch and/or you are trying to &#010 modernize
 * the presentation layer of an existing application, most of Spring MVC is&#010 inapplicable in the {@link
 * com.smartgwt.client.docs.SmartArchitecture 'SmartGWT architecture'}.  Specifically,&#010 SmartGWT renders <b>all</b>
 * HTML on the client, and the server is responsible only for&#010 retrieving data and enforcing business rules.  This
 * means that Spring's ModelAndView and all&#010 functionality related to retrieving and rendering Views is unnecessary in
 * SmartGWT.&#010 SmartGWT only needs the Model, and provides methods to deliver that Model to SmartGWT&#010 components
 * (the server side method DSResponse.setData()).&#010 <P>&#010 However, Spring's DispatchServlet, Handler chain, and
 * Controller architecture is applicable&#010 to SmartGWT.  See "Using Spring Controllers" below.&#010 <P>&#010 <b>Existing
 * Spring Application</b>&#010 <P>&#010 As discussed under the general {@link
 * com.smartgwt.client.docs.ClientServerIntegration 'server integration'}&#010 topic, integrating SmartGWT into your
 * application involves finding a way to provide data&#010 that fulfills the {@link com.smartgwt.client.data.DSRequest}
 * sent by SmartGWT components.&#010 <P>&#010 There are 2 approaches for integrating SmartGWT into an existing Spring
 * application:&#010 <ul>&#010 <li> <b>configure Spring to return XML or JSON responses</b>: create variants&#010 on
 * existing Spring workflows that use a different type of View in order to output XML or&#010 JSON data instead of complete
 * HTML pages.  The SmartGWT {@link com.smartgwt.client.data.RestDataSource} provides a&#010 standard "REST" XML or
 * JSON-based protocol you can implement, or you can adapt generic&#010 {@link com.smartgwt.client.data.DataSource} to
 * existing formats.&#010 <P>&#010 In some Spring applications, all existing Spring workflows can be made callable by&#010
 * SmartGWT with a generic View class capable of serializing the Model to XML or JSON,&#010 combined with a Controller that
 * always uses this View.  Consider the following Java&#010 anonymous class, which uses the SmartGWT JSTranslater class to
 * dump the entire &#010 Spring Model as a JSON response.&#010 <pre>&#010  new View() {&#010        public void render(Map
 * model, HttpServletRequest request,&#010                           HttpServletResponse response) throws IOException
 * {&#010                final ServletOutputStream outputStream = response.getOutputStream();&#010               
 * response.setContentType("application/x-javascript");&#010               
 * outputStream.println(JSTranslater.get().toJS(model));&#010                outputStream.close();&#010        }&#010      
 * public String getContentType() {&#010                return "application/x-javascript";&#010        }&#010  }&#010
 * </pre>&#010 <P>&#010 If you use this approach, you do not need to install the SmartGWT server, and can&#010 {@link
 * com.smartgwt.client.docs.IscInstall 'deploy'} SmartGWT as simple web content (JS/media/HTML files).  If you&#010 are
 * already familiar with how to generate XML from objects that typically appear in your&#010 Spring Models, this may be the
 * easiest path.&#010 <P>&#010 <li> <b>call Spring beans via SmartGWT DMI</b>: use SmartGWT Direct Method Invocation&#010
 * (DMI) to map {@link com.smartgwt.client.data.DSRequest} to beans managed by Spring, via&#010 {@link
 * com.smartgwt.client..ServerObject#getLookupStyle lookupStyle}:"spring".   Return data to the browser by either
 * simply&#010 returning it from your method, or via calling DSResponse.setData() (server-side method).  &#010 If, from a
 * bean created by Spring, you can easily create the data you typically use to&#010 populate a Model in a ModelAndView,
 * this may be the easiest path.&#010 </ul>&#010 <P>&#010 <b>Using Spring Controllers with SmartGWT DMI</b>&#010 <P>&#010
 * You can create a Controller that invokes standard SmartGWT server request processing,&#010 including DMI, like so:&#010
 * <pre>&#010 public class SmartGWTRPCController extends AbstractController&#010 {&#010     public ModelAndView
 * handleRequest(HttpServletRequest request, &#010                                       HttpServletResponse response)&#010
 * throws Exception&#010     {&#010         // invoke SmartGWT server standard request processing&#010        
 * com.isomorphic.rpc.RPCManager.processRequest(request, response);&#010         return null; // avoid default
 * rendering&#010     }&#010 }&#010 </pre>&#010 This lets you use Spring's DispatchServlet, Handler chain and Controller
 * architecture as a&#010 pre- and post-processing model wrapped around SmartGWT DMI.
 */
public interface SpringIntegration {
}
