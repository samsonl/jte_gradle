application_environments{    
dev{
        long_name = "Development"
        ec2{
            ips = [ "1.2.3.4", "1.2.3.5" ]
            credential_id = "ec2_ssh"
        }
        s3{
            url = "https://s3.example.com"
            path = "content/"
            credential_id = "s3_bucket"
        }
    }
}
  
libraries {
        gradle2 {
          config_stuff = "config stuff"
        }
}

   
