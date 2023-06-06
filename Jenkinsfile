pipeline
{
  agent any
  stages
  {
  stage ("Hola mundo")
  {
    steps
    {
      echo "Hola Mundo"
    }
  }
  stage("Muevo el archivo")
    {
      steps
      {
        bat "move "C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\PPL_8\\Jenkinsfile.md" "C:\" "
      }
    }
  }

}
