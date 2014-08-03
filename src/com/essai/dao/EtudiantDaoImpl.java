package com.essai.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.essai.model.Etudiant;

@Service("etudiantDao")
@Transactional
public class EtudiantDaoImpl implements EtudiantDao {

	@Autowired
	private SessionFactory sessionFactory;

	
	
	@SuppressWarnings("unchecked")
	public List<Etudiant> getAllEtudiants() {
		return sessionFactory.getCurrentSession().createQuery("from Etudiant")
				.list();
	}
}
