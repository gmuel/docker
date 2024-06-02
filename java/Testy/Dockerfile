FROM ubuntu:20.04 as base

RUN apt-get update && apt-get install -y openjdk-8-jdk

COPY Testy.java /
RUN javac Testy.java

CMD [ "java", "Testy"]

