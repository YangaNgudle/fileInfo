#Use openjdk image
FROM openjdk

WORKDIR /

EXPOSE 80 

ENV NAME entersekt

CMD ['java', "app.jar"]