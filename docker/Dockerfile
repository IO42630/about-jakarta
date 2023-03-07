FROM quay.io/wildfly/wildfly:26.1.2.Final-jdk17 as wf-demo

COPY docker/copy/opt/jboss/wildfly/standalone/configuration/standalone.xml /opt/jboss/wildfly/standalone/configuration/standalone.xml

COPY security/ws-basic/target/ws-basic-0.1.war /opt/jboss/wildfly/standalone/deployments/

#COPY ${PWD}/../security/jwt/target/jwt-0.1.war /opt/jboss/wildfly/standalone/deployments/
