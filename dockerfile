# Usamos la imagen oficial de OpenJDK 17
FROM eclipse-temurin:17-jdk

# Configuramos el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el código del proyecto al contenedor
COPY . /app

# Damos permisos de ejecución a mvnw
RUN chmod +x mvnw

# Ejecutamos el build usando Maven Wrapper
RUN ./mvnw clean package -DskipTests

# Exponemos el puerto en el que correrá Spring Boot
EXPOSE 8080

# Comando para iniciar la aplicación
CMD ["./mvnw", "spring-boot:run"]
