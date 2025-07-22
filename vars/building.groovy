def call(String tag){
    echo "building the docker image from the Dockerfile"
    sh "docker build -t '${tag}' ."
    echo "Docker image building was successful"
}
