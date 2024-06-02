FROM icr.io/ibm-messaging/mq:latest as mq

RUN export PATH=/opt/mqm/bin:$PATH
COPY setupmqr.mqsc /
RUN runmqsc -f setupmqr.mqsc QM1
CMD [ "bash" ]
