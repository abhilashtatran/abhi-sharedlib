def call (Map config = [:]) {
    sh '''
         cd ${config.path}
         license_finder 
         '''
}
