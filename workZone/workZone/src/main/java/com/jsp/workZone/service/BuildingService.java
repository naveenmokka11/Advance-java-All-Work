package com.jsp.workZone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.workZone.dao.AdminDao;
import com.jsp.workZone.dao.BuildingDao;
import com.jsp.workZone.dao.ManagerDao;
import com.jsp.workZone.dto.Admin;
import com.jsp.workZone.dto.Building;
import com.jsp.workZone.dto.Manager;
import com.jsp.workZone.expections.AdminNotFound;
import com.jsp.workZone.expections.BuildingNotfound;
import com.jsp.workZone.expections.ManagerNotfound;
import com.jsp.workZone.util.ResponseStracture;

@Service
public class BuildingService {
	
	@Autowired
	private BuildingDao buildingDao;
	
	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private ManagerDao managerDao;
	
	public ResponseEntity<ResponseStracture<Building>> saveBuilding(Building building,int adminid){
		
		Admin dbadmin = adminDao.findAdminById(adminid);
		
		if(dbadmin!=null) {
		
			Building dbbata = buildingDao.saveBuilding(building);
			dbbata.setAdmin(dbadmin);
			ResponseStracture<Building>	 stracture=new ResponseStracture<>();
			stracture.setMsg("buiding save");
			stracture.setStatus(HttpStatus.CREATED.value());
			stracture.setData(dbbata);
			
			
			return new ResponseEntity<ResponseStracture<Building>>(stracture,HttpStatus.CREATED);
		}
		else {
			return null;
		}
	}
	public ResponseEntity<ResponseStracture<Building>> assignManagerToBuilding(int buildingId, int managerId,int adminId) {

		Admin admin = adminDao.findAdminById(adminId);

		if (admin != null) {

			Manager manager = managerDao.finManagerBYId(managerId);
			if (manager != null) {

				Building building = buildingDao.fetchBuildingById(buildingId);

				if (building != null) {
					building.setManager(manager);
					ResponseStracture<Building> structure = new ResponseStracture<>();
					structure.setMsg("manager assigned to the building");
					structure.setStatus(HttpStatus.ACCEPTED.value());
					structure.setData(building);

					return new ResponseEntity<ResponseStracture<Building>>(structure, HttpStatus.ACCEPTED);
				} else {
					throw new BuildingNotfound("Building is not there to assign manager!");
				}

			}else {
				throw new ManagerNotfound("Manager is not there to assign it to building");
			}

		}else {
			throw new AdminNotFound("Admin not found to assign it to building! ");
		}
	}
		

}
