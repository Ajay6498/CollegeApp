FROM openjdk:11

COPY target/ college-app.war /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["JAVA","-jar","college-app.war"]