def dependencyCheck(Map stepParams){
  name="${stepParams.name}"
  depCheck additionalArguments: '', odcInstallation: "${name}"
                dependencyCheckPublisher pattern: ''
}
