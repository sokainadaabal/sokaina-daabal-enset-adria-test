# sokaina-daabal-enset-adria-test
## UN POC base sur une architecture micro service 
### Architectures de projets 
Notre projet contient 5 microservices dans le but de gérer des portefeuilles de devises. Nous utilisons Consul comme service de découverte, un service de configuration basé sur Consul Config, et une passerelle (gateway). De plus, nos deux microservices, wallet-service, gèrent les portefeuilles des clients, et transfers-service s'occupe des transactions de fichiers.

![Architecture de projet](img/img_1.PNG)

