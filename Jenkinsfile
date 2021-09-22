pipeline {
    agent any
    
    tools {
    	maven 'localMAVEN'
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'         
            }
            post {
                success {
                    echo 'Now Archiving...'
                    archiveArtifacts artifacts: '**/target/*.war'
            	}
            }
        }
        
        stage ('Deploy to Staging'){
            steps {
                build job: 'deploy-to-staging-mvnp'
            }
        }
        
        stage ('Deploy to Production'){
            steps {
            	timeout(time:7, unit:'DAYS'){
            		input message:'Approuve PRODUCTION Deployement ?'
            	}
                build job: 'deploy-to-prod-mvnp'
            }
            post {
                success {
                    echo 'Code succefuly Deployed to Production server'
            	}
            	
            	failure {
                    echo 'Deployed failed'
            	}
            }
        }
    }
}