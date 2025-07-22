def call(String url , String branch){
echo "cloning the code from the github"
git url: "${url}", branch: "${branch}"
echo "cloning successful"
}
