package com.springframework.boot.springboot2essentials.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Component Anotação genérica para qualquer componente gerenciado pelo Spring. Esta anotação faz com que o
 * bean registrado no Spring possa ser utilizado em qualquer bean, seja ele um serviço, um DAO,
 * um controller, etc. No nosso exemplo, ele será responsável por um Bean que representa uma entidade.
 * @Repository Anotação que serve para definir uma classe como pertencente à camada de persistência.
 * @Service Anotação que serve para definir uma classe como pertencente à camada de Serviço da aplicação.
 * @Autowired A anotação @ Autowired fornece controle sobre onde e como a ligação entre os beans deve ser
 * realizada. Pode ser usado para em métodos setter, no construtor, em uma propriedade ou métodos com nomes
 * arbitrários e / ou vários argumentos.
 */

@Component //transforma a classe em string bean
public class DateUtil {

    public String formatLocalDateTimeToDatabaseStyle(LocalDateTime localDateTime){
        return DateTimeFormatter.ofPattern("yyyy-MM-dd   HH:mm:ss").format(localDateTime);
    }
}
