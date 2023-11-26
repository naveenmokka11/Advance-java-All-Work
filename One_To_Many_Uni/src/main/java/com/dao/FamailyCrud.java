package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.FamilyMember;
import com.dto.RationCard;

public class FamailyCrud {
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void insertIntoFamily(FamilyMember family, int rid) {

		RationCard ration = cem.find(RationCard.class, rid);

		if (ration != null) {

			List<FamilyMember> li = new ArrayList();
			li.add(family);
			li.addAll(ration.getFamilyMamber());
			ration.setFamilyMamber(li);

			gt.begin();
			cem.persist(family);
			gt.commit();

		}

	}

	public void fetchFamily(int id) {
		FamilyMember val = cem.find(FamilyMember.class, id);
		if (val != null) {
			System.out.println(val);

		} else {
			System.out.println("id not exist");
		}

	}

	public void updateFamily(FamilyMember family) {
		FamilyMember val = cem.find(FamilyMember.class, family.getId());

		if (val != null) {
			val.setPhone(family.getPhone());

			gt.begin();
			cem.merge(val);
			gt.commit();

		}

	}

	public void deletefamilyMember(int rid, int fid) {

		RationCard card = cem.find(RationCard.class, rid);
		FamilyMember member = cem.find(FamilyMember.class, fid);
		List<FamilyMember> refreshli = new ArrayList<>();
		if (card != null) {
			List<FamilyMember> li = card.getFamilyMamber();
			if (member != null) {

				for (FamilyMember f : li) {

					if (f.equals(member)) {
						refreshli.remove(f);

					} else {
						refreshli.add(f);
					}

				}

			}

		}
		card.setFamilyMamber(refreshli);
		gt.begin();
		cem.remove(member);
		gt.commit();

	}

}
