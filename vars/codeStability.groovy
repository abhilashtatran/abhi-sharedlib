def call () {
  junit checksName: 'Junit test', testResults: 'target/surefire-reports/*.xml'
}
