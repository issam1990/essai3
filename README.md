Ceci est une application web basée sur spring, jsf/primeFaces et hibernate. hébérgée dans un serveur tomcat 7.

Elle contient un mini web service "rest" en utilisant "jersey".

Elle est connectée à une base de donnée livrée par cloudbees. 

L'application est hébérgée sur cloudBees.

RQ1:

<f:event listener="#{etudiantBean.rediret}" type="preRenderView" />

Cette instruction sert à faire un "listener avant d'afficher la page. Dans notre cas, il s'agit de faire une redirection selon la méthode "redirect" qui se trouve dans le managedBean correspondant.

 