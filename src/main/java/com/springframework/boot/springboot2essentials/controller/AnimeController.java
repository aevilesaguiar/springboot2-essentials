package com.springframework.boot.springboot2essentials.controller;
import com.springframework.boot.springboot2essentials.domain.Anime;
import com.springframework.boot.springboot2essentials.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
/**
 * @return O Spring 4.3 introduziu cinco anotações novas e mais específicas para cada tipo de solicitação HTTP.
 *Métodos do controlador de mapeamento com anotações mais específicas
 *  @GetMapping
 * @PostMapping
 * @PutMapping
 * @DeleteMapping
 * @PatchMapping
 * A anotação @GetMapping é uma versão especializada de @RequestMappinganotação que atua como um atalho
 * para arquivos @RequestMapping(method = RequestMethod.GET).
 * Os @GetMappingmétodos anotados nas classes anotadas @Controller tratam das solicitações HTTP GETque
 * correspondem a uma determinada expressão de URI.
 */

@RestController//queremos retornar apenas uma string o json
@RequestMapping("anime")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    /**
     * Injeção de dependencia via campo não é recomendado , o recomendado é criar um contrutor
     * @Autowired
     * private DateUtil dateUtil;  (não é recomendado)
     * Para não utilizar o @Autowired que não é recomendado podemos usar o:
     * @AllArgsConstructor
     * @NoArgsConstructor
     * e também o:
     * @RequiredArgsConstructor que cria um construtor com os campos que são final
     *
     */

    //o construtor não foi criado porque utilizei anotação do lombok
    private final DateUtil dateUtil;

    //localhost:8080/anime/list
    @GetMapping(path = "list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("DBZ"), new Anime("Boku No Hero"), new Anime("Aeviles"));
    }

}
