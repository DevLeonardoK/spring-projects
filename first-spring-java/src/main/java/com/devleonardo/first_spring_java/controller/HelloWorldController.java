package com.devleonardo.first_spring_java.controller;
import com.devleonardo.first_spring_java.domain.User;
import com.devleonardo.first_spring_java.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Controller é uma classe para receber as requisições HTTP
//Controller recebe a requisicao e passa para 'services' o trabalho


@RestController
//@Controller - Retorna alguma coisa (pagina, json, ...)
//@ResponseBody - Resposta no retorno (json, xml);

//Api_ Stateless - A cada chamada perde os dados, por exemplo login
//Api_ Statefull - O estado é mantido

//rota
@RequestMapping("/hello-world")
public class HelloWorldController {

    //private HelloWorldService helloWorldService;

   //Metodo 1
    // public HelloWorldController(HelloWorldService helloWorldService){
        //this.helloWorldService = helloWorldService;
    //}

    //Metodo 2 - Simples e comum
    @Autowired //Spring detecta e faz a 'auto-injecao'
    private HelloWorldService helloWorldService;


    @GetMapping
    public String getHelloWorld(){
      return helloWorldService.helloWorld("Leonardo");
    };

    //Metodo post

    @PostMapping("/{id}") // receber id
    //Receber pelo body - usar o @RequestBody
    //Enviar um valor na url -- @PathVariable("nomeParametro") tipo do parametro (String....) e o nome da variavel que recebe parametro

    //QueryParameter

    public String helloWorldPost(@PathVariable("id") String id,  @RequestParam(value = "filter", defaultValue = "Nenhum filtro") String filter ,@RequestBody User body){
        String responseComplete = "Hello World Post --- " + body.getNome() + " --- " + " ID: " + id + " Filtro: " + filter;
        return responseComplete;
    }

}
