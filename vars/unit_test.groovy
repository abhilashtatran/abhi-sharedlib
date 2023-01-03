def call(String dir) {
   sh '''
                cd ${dir}
                mvn test
                mvn surefire-report:report
            '''
}
