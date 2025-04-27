package com.aditya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aditya.component.PrototypeBean;
import com.aditya.component.SingletoneBean;

@SpringBootApplication
public class Boot15Application {

	public static void main(String[] args) {
		var iocContainer=SpringApplication.run(Boot15Application.class, args);
		
		//SingletoneBean
		SingletoneBean bean1 = iocContainer.getBean(SingletoneBean.class);
		System.out.println(bean1.hashCode());
		SingletoneBean bean2 = iocContainer.getBean(SingletoneBean.class);
		System.out.println(bean2.hashCode());
        SingletoneBean bean3 = iocContainer.getBean(SingletoneBean.class);
		System.out.println(bean3.hashCode());

		//PrototypeBean
		PrototypeBean bean4 = iocContainer.getBean(PrototypeBean.class);
		System.out.println(bean4.hashCode());
        PrototypeBean bean5 = iocContainer.getBean(PrototypeBean.class);
		System.out.println(bean5.hashCode());
        PrototypeBean bean6 = iocContainer.getBean(PrototypeBean.class);
		System.out.println(bean6.hashCode());

	}

}
