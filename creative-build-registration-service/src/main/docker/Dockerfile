FROM java
VOLUME /tmp
ADD creative-build-registration-service.jar cbrs.jar
RUN bash -c 'touch /cbrs.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /cbrs.jar" ]