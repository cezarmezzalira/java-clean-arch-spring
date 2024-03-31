# PT-BR - Aplicação Java com Arquitetura Limpa

Nesta aplicação de exemplo, fiz o uso da arquitetura limpa para estruturar o projeto, usando como referência o projeto do [Daylan Bueno](https://github.com/daylanbueno), do vídeo sobre o mesmo assunto.
Vídeo original: [Youtube](https://www.youtube.com/watch?v=MsskoOicoQo)

Durante a construção do projeto, fiz algumas alterações que pensei serem pertinentes, como por exemplo, separar as entidades de persistência e os repositórios em pastas distintas.

Também criei os mappers em uma pasta distinta, para fins de organização do projeto.

O arquivo `resources/application.properties` foi movido para `resources/application.yml`. Particularmente o arquivo `.properties` me parece ser muito truncado, já o `.yml` possui uma melhor leitura.

Essa aplicação não conta com uma camada de segurança, porém, mostra como seria a base de um projeto aplicando os conceitos de arquitetura limpa em uma aplicação Java.

---

## EN - Java Application with Clean Architecture

In this sample application, I created a clean architecture structure to the project, using as reference the project implemented by [Daylan Bueno](https://github.com/daylanbueno), in a video about this topic.
Original Video (in Portuguese): [Youtube](https://www.youtube.com/watch?v=MsskoOicoQo)

Through out the project execution, I made some changes that I think will be pertinent, like split the persistence entities and repositories in distinct folders.

Also, I created a folder to mappers, to a better project order.

The file `resources/application.properties` has moved to `resources/application.yml`. Particularly, the `.properties` file seems a little bit truncated to me, likewise `.yml` has a better readability.

This application won't has a security layer, but, shows how it will be a base project applying the concepts of Clean Architecture in a Java application.
