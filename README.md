# Guia Spring Framework

## 1. Configuração do Ambiente - Utilizando o Springboot

1. Instale o Java. JDK 8 é recomendado: [Java 8](https://www.oracle.com/java/technologies/downloads/#jdk8-windows). Instalar também o [JRE 8](https://www.oracle.com/java/technologies/downloads/#jre8-windows). O [OpenJDK](https://adoptium.net/index.html?variant=openjdk8) também pode ser utilizado. Você pode testar se o Java foi instalado corretamente executando o seguinte comando no terminal ```java -version```. A saída deve retornar informações do java instalado.
2. Instale a [IDE Eclipse](https://www.eclipse.org/downloads/packages). Baixar e instalar a versão **__Eclipse IDE for Enterprise Java and Web Developers__**.
3. Você também pode usar O **IntelliJ**.
4. Você também pode usar o **VSCode** com o seguinte conjunto de extensão instaladas: A. *Extension Pack for Java* e *Spring Initializr Java Support*.

## 2. Configuração do Ambiente - Sem Springboot.

1. Instale o Java. JDK 8 é recomendado: [Java 8](https://www.oracle.com/java/technologies/downloads/#jdk8-windows). Instalar também o [JRE 8](https://www.oracle.com/java/technologies/downloads/#jre8-windows). O [OpenJDK](https://adoptium.net/index.html?variant=openjdk8) também pode ser utilizado. Você pode testar se o Java foi instalado corretamente executando o seguinte comando no terminal ```java -version```. A saída deve retornar informações do java instalado.
2. Baixe o servidor de aplicação [TOMCAT 9.0](https://tomcat.apache.org/download-90.cgi). Na seção __Core__, baixar o arquivo __ZIP__. Após o download, extrair para algum diretório de sua preferência que será fixo.
3. Instale a [IDE Eclipse](https://www.eclipse.org/downloads/packages). Baixar e instalar a versão **__Eclipse IDE for Enterprise Java and Web Developers__**.
4. Abra o Eclipse, escolha um diretório para salvar seus projetos (__workspace__) e a aba de boas-vindas (__welcome__) do eclipse abrirá. Feche a aba. Você deve estar nessa tela:
![Screen Shot 2022-02-16 at 11 17 44](https://user-images.githubusercontent.com/19152705/154283310-49acf6d4-11a6-4038-bf85-8807002efa05.png)

### 2.1 Configurando o TOMCAT no Eclipse

1. Na tela inicial do Eclipse, vá até a aba **Servers** e clique no link que aparece (*click this link to create a new server*), de acordo com a imagem:
![Screen Shot 2022-02-16 at 11 21 00](https://user-images.githubusercontent.com/19152705/154284382-0c0fab97-938d-407c-a9a3-3e31599f78df.png)
2. Na janela *New Server*, procure por **Tomcat v9.0 Server**, selecione-o e clique em *Next*.
![Tomcat 9.0v](https://user-images.githubusercontent.com/19152705/154284827-418f8500-2d2f-4599-bf45-1adfd81dbda7.png)
3. Agora, defina o diretório do TOMCAT. Clique em _Browser_ e navegue até o diretório para o qual você extraiu o TOMCAT baixado no passo 2 do tópico "Configuração do Ambiene". Selecione o diretório do TOMCAT (_apache-tomcat-9.0.x_). Após isso, clique em _Finish_.
![Diretório TOMCAT](https://user-images.githubusercontent.com/19152705/154286909-66717b6f-9e87-43f6-87ea-9581e2908cd0.png)
4. Após o precesso, você vera uma pasta _Servers_ na aba _Project Explorer_ do Eclipse.


## 3. Build da aplicação (Maven)

1. Na raiz do projeto, executar o seguinte comando

```./mvnw clean package```

2. Acesse o diretório *target*

- 2.1: Caso seu empacotamento (*packaging*) seja JAR, rode o seguinte comando

``` java -jar nome-do-arquivo-versao-SNAPSHOT.jar ```


