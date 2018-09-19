package zpark.entity;

import java.util.List;
import java.util.Map;

public class CollectionVO {

	private List<String> list;
	private List<User> users;
	private Map<String,Integer> maps;
	private Map<Integer, User> mapss;
	
	



	public Map<Integer, User> getMapss() {
		return mapss;
	}

	public void setMapss(Map<Integer, User> mapss) {
		this.mapss = mapss;
	}

	public Map<String, Integer> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Integer> maps) {
		this.maps = maps;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
		
	
}
