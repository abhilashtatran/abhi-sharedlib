def depCheck (Map stepParams) {
  name="${stepParams.name}"
//   sh 'mvn org.owasp:dependency-check-maven:7.4.3:check'
  ""dependencyCheck additionalArguments: ''", odcInstallation: ${name}"
  dependencyCheckPublisher pattern: ''
  echo "Doing ${name}"
}
