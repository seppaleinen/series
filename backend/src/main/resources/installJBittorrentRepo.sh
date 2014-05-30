function installMavenArtifact(){
    local JBITTORRENT="${PWD}/src/main/resources/jBittorrentAPI.jar"
    mvn install:install-file -Dfile="$JBITTORRENT" -DgroupId=jBittorrent -DartifactId=jBittorrent-api -Dversion=1.0 -Dpackaging=jar
}
installMavenArtifact