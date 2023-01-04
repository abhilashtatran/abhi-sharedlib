// def depCheck (Map stepParams) {
//   name="${stepParams.name}"
// //   sh 'mvn org.owasp:dependency-check-maven:7.4.3:check'
  
//   sh "dependencyCheck additionalArguments: '', ${name}"
//   dependencyCheckPublisher pattern: ''
// }
def any () {
  dependencyCheck additionalArguments: '', odcInstallation: 'Dependency-check'
  dependencyCheckPublisher pattern: ''
}
