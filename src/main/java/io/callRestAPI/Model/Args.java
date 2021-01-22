package io.callRestAPI.Model;

import javax.xml.bind.annotation.XmlRootElement;


public class Args {

		private String foo1;
		private String foo2;
		
		
		public Args() {
			
		}
		public Args(String foo1, String foo2) {
			super();
			this.foo1 = foo1;
			this.foo2 = foo2;
		}
		public String getFoo1() {
			return foo1;
		}
		public void setFoo1(String foo1) {
			this.foo1 = foo1;
		}
		public String getFoo2() {
			return foo2;
		}
		public void setFoo2(String foo2) {
			this.foo2 = foo2;
		}
		
		
}
