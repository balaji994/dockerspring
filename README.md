## Docker deployment in AWS EC2 instance 

Give the security group as follows 



### Inside AWS Ec2 terminal
##### ssh -i my-ec2-key-pair.pem ec2-user@<EC2-INSTANCE-PUBLIC-IP-ADDRESS>

[ec2-user]$ sudo yum update -y
[ec2-user]$ sudo yum install -y docker
[ec2-user]$ sudo service docker start

[ec2-user]$ sudo usermod -a -G docker ec2-user
[ec2-user]$ exit



[ec2-user]$ docker info



 [ec2-user]$ docker run  -p 80:8080 -t bobby994/dockerspring 

 [ec2-user]$ docker run -d -p 8080:8080 bobby994/dockerspring