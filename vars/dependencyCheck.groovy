def depCheck(Map stepParams) {
  name="${stepParams.name}"
  "dependencyCheck additionalArguments: '', odcInstallation: ${name}"
  dependencyCheckPublisher pattern: ''
}
