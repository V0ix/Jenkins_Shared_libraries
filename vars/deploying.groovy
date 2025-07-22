def deploy(){
  echo "deploying the container to dev"
  sh "docker pull vishal09taware/nodes_app"
  sh "docker-compose down -d && docker-compose up -d"
}
