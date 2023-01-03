def java(Map stepParams) {
  //dir_name="${stepParams.dir_name}"
  command="${stepParams.command}"
  sh "mvn ${command}"
  
}
