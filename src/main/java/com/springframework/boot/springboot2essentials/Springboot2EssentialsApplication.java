package com.springframework.boot.springboot2essentials;

/**
 * Ao desenvolver um aplicativo, precisamos dizer ao framework Spring para procurar componentes gerenciados pelo Spring.
 * @ComponentScan permite que o Spring verifique coisas como configurações, controladores, serviços e outros
 * componentes que definimos.
 *  @EnableAutoConfiguration permite que o Spring Boot configure automaticamente o contexto do aplicativo . Portanto,
 *  ele cria e registra automaticamente beans com base nos arquivos jar incluídos no caminho de classe e nos beans
 *  definidos por nós.
 * Por exemplo, quando definimos a dependência spring-boot-starter-web em nosso classpath, o Spring boot configura
 * automaticamente o Tomcat  e o Spring MVC . No entanto, esta auto-configuração tem menos precedência caso
 * definamos nossas próprias configurações.
 * A principal diferença entre essas anotações é que @ComponentScan verifica os componentes do Spring
 * enquanto @EnableAutoConfiguration é usado para configuração automática de beans presentes no caminho
 * de classe em aplicativos Spring Boot.
 * @SpringBootApplication tem todas as anotações acima
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Springboot2EssentialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2EssentialsApplication.class, args);
	}

}
