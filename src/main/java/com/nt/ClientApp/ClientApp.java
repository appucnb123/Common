package com.nt.ClientApp;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AnnotaionJDBC.App;
import com.nt.dao.EmployeeDaoImpl;

public class ClientApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
		EmployeeDaoImpl impl = ctx.getBean("employeeDaoImpl", EmployeeDaoImpl.class);
		List list = impl.findAllEmployee();
		System.out.println(list);
//		Iterator itr = list.iterator();
//		while (itr.hasNext()) {
//			Map map = (Map) itr.next();
//			Set set = map.entrySet();
//			Iterator it = set.iterator();
//			while (it.hasNext()) {
//				Map.Entry entry = (Entry) it.next();
//				System.out.println(entry.getKey() + "  :  " + entry.getValue());
//
//			}
//
//		}
	}
}
