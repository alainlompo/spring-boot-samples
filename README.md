# spring-boot-samples
dolphin framework app using spring boot

We are deeply exploring spring - boot here. Spring boot makes it easy to create Spring based applications. For more about spring boot see <a href='http://projects.spring.io/spring-boot/'>here</a><br/>
Our first sample illustrates a client server application based on the dolphin framework.<br/>
<ul>
  <li>Dolphin based client server app with spring boot <a href='https://github.com/alainlompo/spring-boot-samples/tree/master/dolphin-spring-boot'>here</a> (more about dolphin's platform's architecture view <a href='http://www.guigarage.com/2015/10/dolphin-platform-a-sneak-peek/'>here</a>)</li>
  <li><a href="https://github.com/alainlompo/spring-boot-samples/tree/master/spring-boot-actuator-sample">spring boot's actuator's starter sample usage</a></li>
  <li><a href="https://github.com/alainlompo/spring-boot-samples/tree/master/spring-boot-activemq">Spring boot with Apache ActiveMQ</a></li>
  <li><a href="https://github.com/alainlompo/spring-boot-samples/tree/master/grailsWithBootSample">Grails over Spring boot sample</a></li>
</ul><br/>
<h3>The Spring Boot's Actuator</h3>
<p>The Spring boot actuator provides Production quality level monitoring features, metrics and similar features (such as health monitoring informations or request mappings, ...) to Spring Boot Applications: these features can be explored using various approaches namely:
</p>
<ul>
  <li>REST endpoints</li>
  <li>Java Management Extensions (JMX) [Can be viewed with the jconsole tool]</li>
  <li>A remote shell accessible using a SSH client </li>
</ul><br/>
The Spring Boot's actuator is therefore a very usefull and powerful mean of gaining insight into what's going in a Spring Boot's application, along with health and other metrics. And since it is providing REST endpoints for practically all the functionalities it exposes it can be easily plugged into a lot of graphic reporting tool in order to produce a nice dashboard (such tools as ElasticSearch/Kibanah, JasperReports + iReport, DynamicReports, ...). Since we have a JMX access as well we can use jconsole to have a visual representation of the metrics. See <a href="https://spring.io/guides/gs/actuator-service/">here</a>, how to build a RESTful web service using Spring Boot's Actuator
