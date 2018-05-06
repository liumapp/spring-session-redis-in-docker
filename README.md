# spring-session-redis-in-docker
Running Spring Session Redis in Docker . 

## install and run redis in docker 

* simply run 

        ./build-image.sh
    
    to install redis image  . 
    
    or you can simply use docker pull to get redis image from docker hub .
    
* run 

        docker-compose up -d
        
    to run redis in docker .
    
    plz pay attention , we use commonds to set redis password in docker-compose.yml .                
    
* run the project , and you can see how Spring Session working with Redis .     