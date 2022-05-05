package org.cboard;

import java.io.File;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import org.apache.catalina.Context;
import org.apache.catalina.core.AprLifecycleListener;
import org.apache.catalina.core.StandardServer;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zhongjian on 11/17/16.
 */
@SpringBootApplication
@ImportResource({"classpath:spring.xml", "classpath:spring-mvc.xml", "classpath:spring-mybatis.xml", "classpath:spring-security.xml"})
public class DebugTomcat {

    public static void main(String[] args) throws Exception {

        System.out.println(Hashing.md5().newHasher().putString("123456", Charsets.UTF_8).hash().toString());
        SpringApplication.run(DebugTomcat.class, args);
        /*int port = 7090;
        if (args.length >= 1) {
            port = Integer.parseInt(args[0]);
        }

        String webBase = new File("src/main/webapp").getAbsolutePath();
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(port);
        tomcat.setBaseDir(".");

        // Add AprLifecycleListener
        StandardServer server = (StandardServer) tomcat.getServer();
        AprLifecycleListener listener = new AprLifecycleListener();
        server.addLifecycleListener(listener);

        Context webContext = tomcat.addWebapp("/", webBase);
        ErrorPage notFound = new ErrorPage();
        notFound.setErrorCode(404);
        notFound.setLocation("/main.html");
        webContext.addErrorPage(notFound);
        webContext.addWelcomeFile("main.html");

        // tomcat start
        tomcat.start();
        tomcat.getServer().await();*/
    }

}
