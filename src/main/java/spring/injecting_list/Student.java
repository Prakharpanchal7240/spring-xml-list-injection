package spring.injecting_list;

import java.util.List;

public class Student {

	List<String> list;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Student [list=" + list + "]";
	}
	
	
}
