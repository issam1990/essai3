Ceci est une application web bas�e sur spring, jsf/primeFaces et hibernate. h�b�rg�e dans un serveur tomcat 7.

Elle contient un mini web service "rest" en utilisant "jersey".

Elle est connect�e � une base de donn�e livr�e par cloudbees. 

L'application est h�b�rg�e sur cloudBees.

RQ1:

<f:event listener="#{etudiantBean.rediret}" type="preRenderView" />

Cette instruction sert � faire un "listener avant d'afficher la page. Dans notre cas, il s'agit de faire une redirection selon la m�thode "redirect" qui se trouve dans le managedBean correspondant.

 