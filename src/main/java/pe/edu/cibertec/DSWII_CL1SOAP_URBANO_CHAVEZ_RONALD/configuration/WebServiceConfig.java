package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;

@EnableWs
@Configuration
public class WebServiceConfig {
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(context);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "jubilarse")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema jubilarseSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("JubilarsePort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(jubilarseSchema);
        return wsdl11Definition;
    }

    @Bean(name = "calcularMenor")
    public DefaultWsdl11Definition calcularMenorWsdl11Definition(XsdSchema calcularMenorSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CalcularMenorPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(calcularMenorSchema);
        return wsdl11Definition;
    }

    // Definición de la definición WSDL para la matrícula de los alumnos
    @Bean(name = "matricula")
    public DefaultWsdl11Definition matriculaWsdl11Definition(XsdSchema matriculaSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("MatriculaPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(matriculaSchema);
        return wsdl11Definition;
    }



    // Definición de la definición WSDL para el servicio de salario
    @Bean(name = "salario")
    public DefaultWsdl11Definition salarioWsdl11Definition(XsdSchema salarioSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("SalarioPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(salarioSchema);
        return wsdl11Definition;
    }


    @Bean
    public XsdSchema jubilarseSchema() {
        return new SimpleXsdSchema(new org.springframework.core.io.ClassPathResource("xsd/jubilarse.xsd"));
    }

    @Bean
    public XsdSchema calcularMenorSchema() {
        return new SimpleXsdSchema(new org.springframework.core.io.ClassPathResource("xsd/calcularMenor.xsd"));
    }


    // Definición del esquema XSD para la matrícula de los alumnos
    @Bean
    public XsdSchema matriculaSchema() {
        return new SimpleXsdSchema(new org.springframework.core.io.ClassPathResource("xsd/materia.xsd"));
    }


    // Definición del esquema XSD para salario
    @Bean
    public XsdSchema salarioSchema() {
        return new SimpleXsdSchema(new org.springframework.core.io.ClassPathResource("xsd/salario.xsd"));
    }

}
