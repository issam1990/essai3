package com.essai.managedBean;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.faces.application.NavigationHandler;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.essai.dao.EtudiantDao;
import com.essai.model.Etudiant;

@Component("etudiantBean")
@Scope("session")
public class EtudiantBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private EtudiantDao etudiantDao;

	private List<Etudiant> etudiants;

	private String name;

	private String prenom;

	public String getPrenom() {
		return "Issam";
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getName() {
		return etudiantDao.getAllEtudiants().get(0).getPrenom();
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public String getFirstName() {
		return etudiantDao.getAllEtudiants().get(0).getNom();
	}

	public String accueil() {

		return "index.xhtml?faces-redirect=true";
	}

	public void rediret() {
		String test = getPrenom();
		if (test.equals("Issam2")) {
			// ExternalContext context2 =
			// FacesContext.getCurrentInstance().getExternalContext();
			// try {
			// context2.redirect("essai.xhtml");
			// } catch (IOException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			
			// une redirection propre : càd sans redendance de /faces
			FacesContext fc = FacesContext.getCurrentInstance();
			NavigationHandler nh = fc.getApplication().getNavigationHandler();
			nh.handleNavigation(fc, null, "essai.xhtml?faces-redirect=true");
		}
	}
}
