FROM airhacks/glassfish
COPY ./target/pw-Dortu.war ${DEPLOYMENT_DIR}
