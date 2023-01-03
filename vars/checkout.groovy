def repo_clone(Map stepParams){
  echo 'cloning repo using http url'
  Repo_Url="${stepParams.Repo_Url}"
  Repo_Branch="${stepParams.Repo_Branch}"
  Repo_Credential="${stepParams.Repo_Credential}"
  echo "${Repo_Url}"
  echo "${Repo_Branch}"
  echo "${Repo_Credential}"
  git branch: "${Repo_Branch}", credentialsId: "${Repo_Credential}", url: "${Repo_Url}"
 // git branch: 'main', credentialsId: 'newtoken', url: 'https://github.com/Snatak-Fantastic4/sharedLibrary.git'
}
