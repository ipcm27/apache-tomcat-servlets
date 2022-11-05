#Sobre o projeto

O projeto consiste num CRUD para gerenciar cursos. Utiliza Java 10 e JTLI. Foi desenvolvido junto com o professor na ALura e serviu apra explicar como funcionam os servlets ( tecnologia que é a base de muitos frameqworks imnportantes como Spring).

#Coisas interessantes que aprendi nesse curso

#Servlet?
Servlet é um objeto que pode ser acionado por meio de uma requisição do protocolo HTTP. Essa interação é possibilitada pelo Tomcat, e precisa seguir algumas regras, como estender, sobrescrever os métodos doGet(), doPost() e service(), e fazer o mapeamento para indicar a URL. 

#Middleware
È o Tomcat, serve para conectar o computador de uma pessoa (rodando JS,html) a um outro computador. 

#JSP (java server pages)
Tecnologia que permite unir Java com HTML

#Dispatcher
Central dispatcher for HTTP request handlers/controllers, e.g. for web UI controllers or HTTP-based remote service exporters. Dispatches to registered handlers for processing a web request, providing convenient mapping and exception handling facilities. 


#JSTL

#Singleton
Não importa o número de requisições, o Tomcat cria apenas uma instância do Servlet, chamando uma única vez o construtor. O objeto sempre fica em memória no Tomcat, e esse objeto é reaproveitado nas próximas requisições. Por isso o Servlet é chamado de Singleton, um escopo, que sobrevive no projeto por tempo indeterminado enquanto o Tomcat estiver no ar, sem nunca recriá-lo.

Esse processo poderia ser diferente, isto é, o Tomcat poderia recriar um Servlet a cada nova requisição. Existem outras bibliotecas ou frameworks que recriam objetos a cada nova requisição recebida pelo servidor. O escopo é aquilo que determina quanto tempo vive um objeto, e por padrão ele é Singleton.

#IOC
Delegamos ao TOmcat a função de criar os objetos Servlets. A esta função damos o nome de Inversio0n of control. 
Inversão de controle significa que não é meu método main que instancia objetos, quem se preocupa com a criação das instâncias é o Tomcat.

#JAR
Em software, JAR (Java ARchive) é um arquivo/ficheiro compactado, usado para distribuir um conjunto de classes Java; um aplicativo Java; ou outros itens, como imagens, XMLs, entre outros. É usado para armazenar classes compiladas e metadados associados que podem constituir um programa.

Arquivos jar podem ser criados e extraídos usando o utilitário "jar" da JDK. Ferramentas de compressão (como o Winzip) também podem criar arquivos .jar. 

#WAR
Mesma coisa só que com JSP e outros e Servlets. È usado para fazer o deploy de uma aplicação que usa servlets.
Se quiser fazer rodar joga dentro da pasta "deploy" ou "webapp".
Pra rodar
cd apache-tomcat-9.0.11-prod
apache-tomcat-9.0.11-prod\bin>startup.sh	