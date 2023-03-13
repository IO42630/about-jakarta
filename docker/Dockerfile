FROM quay.io/wildfly/wildfly:26.1.2.Final-jdk17 as wf-demo

ENV BIN_DIR="/opt/jboss/wildfly/bin"
ENV CONFIG_DIR="/opt/jboss/wildfly/standalone/configuration"

# add dummy admin user
USER root
RUN $BIN_DIR/add-user.sh --user admin --password admin --silent

USER 999
# COPY CONFIG
COPY docker/copy$CONFIG_DIR/standalone.xml $CONFIG_DIR/standalone.xml


# COPY DEPLOYMENTS
COPY jee-web-app/target/jee-web-app-0.1.war /opt/jboss/wildfly/standalone/deployments/
COPY security/security-ctx/target/security-ctx-0.1.war /opt/jboss/wildfly/standalone/deployments/
COPY security/ws-basic/target/ws-basic-0.1.war /opt/jboss/wildfly/standalone/deployments/

EXPOSE 8080 8787 9990
