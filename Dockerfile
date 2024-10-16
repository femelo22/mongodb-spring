FROM openjdk:17-ea-17-jdk-slim

# Defina o diretório de trabalho
WORKDIR /app

# Copie o arquivo JAR da aplicação para a imagem
COPY /target/spring-mongodb-1.0.0.jar app.jar

EXPOSE 8080

CMD ["java", "-XX:+UseG1GC", "-XX:MaxGCPauseMillis=100", "-Xms512m", "-Xmx1024m", "-jar", "app.jar"]
# -XX:+UseG1GC: Ativa o G1 Garbage Collector, opção moderna e otimizada para aplicações que precisam de baixa latência. Ele é especialmente útil em ambientes de contêiner.

# -XX:MaxGCPauseMillis=100: Configura o coletor de lixo para tentar manter as pausas de GC abaixo de 100 milissegundos. Isso ajuda a melhorar a responsividade da aplicação.

# -Xms512m: Define a memória inicial da heap da JVM para 512 MB. Isso garante que a aplicação tenha uma quantidade mínima de memória alocada desde o início.

# -Xmx1024m: Define a memória máxima da heap da JVM para 1024 MB. Isso limita a quantidade máxima de memória que a JVM pode usar. Você deve ajustar esses valores com base nas necessidades da sua aplicação e na memória disponível no contêiner.