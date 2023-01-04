def depCheck (Map stepParams){
  name="${stepParams.name}"
  sh 'mvn org.owasp:dependency-check-maven:5.2.2:check'
  "dependencyCheck additionalArguments: '', odcInstallation: ${name}"
  dependencyCheckPublisher pattern: ''
  echo "Doing ${name}"
}
