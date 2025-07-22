def call() {
    echo 'pushing the image to Docker Hub'

    withCredentials([usernamePassword(
        credentialsId: 'docker-hub-creds',
        usernameVariable: 'DOCKER_USER',
        passwordVariable: 'DOCKER_PASS'
    )]) {
        sh 'docker tag nodes_app:latest "$DOCKER_USER"/nodes_app:latest'
        sh 'echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin'
        sh 'docker push "$DOCKER_USER"/nodes_app:latest'
        sh 'docker logout'
    }
} 
