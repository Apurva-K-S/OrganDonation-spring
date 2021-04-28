FROM openjdk:8
EXPOSE 9098
WORKDIR /app
COPY target/OrganDonation-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar", "OrganDonation-0.0.1-SNAPSHOT.jar" ]
